/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockManagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author isira
 */
public class DatabaseConnectionFunctions {
    
    private static Connection con;
    private static Statement stmt;
    
    public static void createConnectionAndStatement() throws SQLException {
        con = Main.DatabaseBasicOps.createConnection();
        stmt = con.createStatement();
    }

    //Generates a unique ID for a record in a given table, using the given starting character.
    public static String generateIDForRecord(String startChar, String tableName) throws SQLException {
        String id = startChar;
        ResultSet rows = stmt.executeQuery("SELECT * FROM " + tableName);
        int curID;
        if (rows.last()) {
            curID = rows.getRow() + 1;
        } else {
            curID = 1;
        }
        for (int i = 0; i < 9 - Integer.toString(rows.getRow()).length(); i++) {
            id += "0";
        }
        id += curID;
        return id;
    }

    //Inserts a new record. If something goes wrong, a SQLException will be thrown.
    public static void insertRecord(String tableName, String values) throws SQLException {
        stmt.execute("INSERT INTO " + tableName + " VALUES(" + values + ")");
    }

    //Updates a specific record or set of records.
    public static void updateRecord(String tableName, String values, String cond) throws SQLException {
        stmt.execute("UPDATE " + tableName + " SET " + values + " WHERE " + cond);
    }

    //Deletes a specific record or set of records..
    public static void deleteRecord(String tableName, String cond) throws SQLException {
        stmt.execute("DELETE FROM " + tableName + " WHERE " + cond);
    }

    //Returns the employee ID corresponding to the given username and password.
    public static String getEID(String username, String password) throws SQLException {
        ResultSet user = getSpecificRecordsFromTable("Login", "username = '" + username + "' AND password = '" + password + "'");
        user.next();
        return user.getString("eID");
    }

    //Retrieves the ResultSet from a union operation between two tables.
    public static ResultSet getResultsFromUnionQuery(String table1, String table2, String table1Fields, String table2Fields) throws SQLException {
        return stmt.executeQuery("SELECT " + table1Fields + " FROM " + table1 + " UNION " + "SELECT " + table2Fields + " FROM " + table2);
    }

    //Attempts to log in the user and returns whether or not it was not successful.
    public static boolean login(String username, String password) throws SQLException {
        ResultSet user = getSpecificRecordsFromTable("Login", "username = '" + username + "' AND password = '" + password + "'");
        //If the condition below is true, the user is present.
        if (user.next()) {
            updateRecord("Login", "`Logged in?` = 'Yes'", "eID = '" + user.getString("eID") + "'");
            return true;
        }
        return false;
    }

    //Returns a DefaultTableModel object containing the data of the specified tableName.
    public static DefaultTableModel getTableRecords(String tableName) throws SQLException {
        ResultSet tableRecs = stmt.executeQuery("SELECT * FROM " + tableName);
        ResultSetMetaData tableRecsMeta = tableRecs.getMetaData();
        int colCount = tableRecsMeta.getColumnCount();
        /* Retrieves the number of rows present in the ResultSet object.
         *
         * The following three lines of code use code from the following source:
         *
         * Unspecified author. Java get number of rows in ResultSet.
         * https://www.roseindia.net/java/java-get-example/number-rows-resul.shtml
         * Accessed October 8, 2018.
         */
        tableRecs.last();
        int rowCount = tableRecs.getRow();
        tableRecs.beforeFirst();
        String[] colNames = new String[colCount];
        Object[][] data = new Object[rowCount][colCount];
        for (int i = 0; i < colCount; i++) {
            colNames[i] = tableRecsMeta.getColumnName(i + 1);
        }
        int curRow = 0;
        while (tableRecs.next()) {
            for (int j = 0; j < colCount; j++) {
                data[curRow][j] = tableRecs.getObject(j + 1);
            }
            curRow++;
        }
        return new DefaultTableModel(data, colNames);
    }

    //Retrieves data stored in specific fields from a table and returns a ResultSet containing said data.
    public static ResultSet getSpecificFieldsFromTable(String tableName, String fields) throws SQLException {
        return stmt.executeQuery("SELECT " + fields + " FROM " + tableName);
    }

    //Logs the user out of the system; if an issue occurs, a SQLException is thrown.
    public static void logout(String eID) throws SQLException {
        updateRecord("Login", "`Logged in?` = 'No'", "eID = '" + eID + "'");
    }

    //Retrieves specific records from a table and returns a ResultSet containing said records.
    public static ResultSet getSpecificRecordsFromTable(String tableName, String condition) throws SQLException {
        return stmt.executeQuery("SELECT * FROM " + tableName + " WHERE " + condition);
    }
}