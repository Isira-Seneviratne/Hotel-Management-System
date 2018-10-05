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

/**
 *
 * @author Isira
 */
public class DatabaseConnectionFunctions {
    private static Connection con;
    private static Object monitor = new Object();
    
    public static Connection getConnection() throws SQLException {
        synchronized(monitor) {
            if(con == null) {
                con = DriverManager.getConnection("jdbc://localhost:3306/hotel_db", "", "");
            }
        }
        return con;
    }
    
    //Generates a unique ID for a record in a given table, using the given starting character
    public static String generateIDForRecord(String startChar, String tableLoadString) throws SQLException {
        String id = startChar;
        ResultSet rows = con.prepareStatement(tableLoadString).executeQuery();
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
    public boolean insertRecord(String values, String tableName) throws SQLException {
        return con.prepareStatement("INSERT INTO" + tableName + " VALUES(" + values + ")").execute();
    }
    
    //Updates a specific record and returns whether or not it was successful.
    public boolean updateRecord(String values, String tableName, String recordIDComp) throws SQLException {
        return con.prepareStatement("UPDATE " + tableName + " SET " + values + " WHERE " + recordIDComp).execute();
    }
    
    //Retrieves all records from a table and returns a ResultSet containing said records.
    public ResultSet getAllRecordsFromTable(String tableName) throws SQLException {
        return con.prepareStatement("SELECT * FROM " + tableName).executeQuery();
    }
    
    //Retrieves specific records from a table and returns a ResultSet containing said records.
    public ResultSet getSpecificRecordsFromTable(String condition, String tableName) throws SQLException {
        return con.prepareStatement("SELECT * FROM " + tableName + "WHERE " + condition).executeQuery();
    }
}
