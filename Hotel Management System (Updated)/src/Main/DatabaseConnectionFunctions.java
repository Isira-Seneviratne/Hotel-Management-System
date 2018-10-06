/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Isira
 * 
 * This class contains functions related to database operations for the sake of code reusability.
 */
public class DatabaseConnectionFunctions {
    private static Connection con;
    private static Statement stmt;
    
    public static void createConnection() throws ClassNotFoundException, SQLException {
        if(con == null) {
            Class.forName("com.mysql.jdbc.Driver");

            Properties connProps = new Properties();
            connProps.put("user", "user");
            connProps.put("password", "abcd1234");
            connProps.put("useSSL", "false");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_db", connProps);
            stmt = con.createStatement();
        }
    }
    
    //Generates a unique ID for a record in a given table, using the given starting character.
    public static String generateIDForRecord(String startChar, String tableLoadString) throws SQLException {
        String id = startChar;
        ResultSet rows = stmt.executeQuery(tableLoadString);
        int curID;
        if(rows.last())
            curID = rows.getRow() + 1;
        else
            curID = 1;
        for(int i = 0; i < 9 - Integer.toString(rows.getRow()).length(); i++)
            id += "0";
        id += curID;
        return id;
    }
    
    //Inserts a new record and returns whether or not it was successful.
    public static void insertRecord(String tableName, String values) throws SQLException {
        stmt.execute("INSERT INTO" + tableName + " VALUES(" + values + ")");
    }
    
    //Updates a specific record and returns whether or not it was successful.
    public static void updateRecord(String tableName, String values, String recordIDComp) throws SQLException {
        stmt.execute("UPDATE " + tableName + " SET " + values + " WHERE " + recordIDComp);
    }
    
    //Retrieves all records from a table and returns a ResultSet containing said records.
    public static ResultSet getAllRecordsFromTable(String tableName) throws SQLException {
        return stmt.executeQuery("SELECT * FROM " + tableName);
    }
    
    //Retrieves specific records from a table and returns a ResultSet containing said records.
    public static ResultSet getSpecificRecordsFromTable(String tableName, String condition) throws SQLException {
        return stmt.executeQuery("SELECT * FROM " + tableName + " WHERE " + condition);
    }
    
    //Attempts to log in the user and returns whether or not it was not successful.
    public static boolean login(String username, String password) throws SQLException {
        ResultSet user = getSpecificRecordsFromTable("Login", "username = '"+username+"' AND password = '"+password+"'");
        if(user.next()) {
            updateRecord("Login", "`Logged in?` = 'Yes'", "eID = '"+user.getString("eID")+"'");
            return true;
        }
        return false;
    }
    
    //Logs the user out of the system; if an issue occurs, a SQLException is thrown.
    public static void logout(String eID) throws SQLException {
        updateRecord("Login", "`Logged in?` = 'No'", "eID = '"+eID+"'");
        JOptionPane.showMessageDialog(null, "Successfully logged out of the system.", "Logout", JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Returns the employee ID corresponding to the given username and password.
    public static String getEID(String username, String password) throws SQLException {
        ResultSet user = getSpecificRecordsFromTable("Login", "username = '"+username+"' AND password = '"+password+"'");
        user.next();
        return user.getString("eID");
    }
}
