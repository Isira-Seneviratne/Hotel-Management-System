/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Isira
 * 
 * This class contains functions related to database operations for the sake of code reusability.
 */
public class DatabaseBasicOps {
    private static Connection con;
    
    /* Initializes the database connection, as well as the Statement object used to execute SQL queries.
     * This only happens if these values have not been already initialized.
     */
    public static Connection createConnection() throws SQLException {
        if(con == null) {
            Properties connProps = new Properties();
            connProps.put("user", "root");
            connProps.put("password", "");
            connProps.put("useSSL", "false");
            connProps.put("allowPublicKeyRetrieval", "true");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_db", connProps);
        }
        return con;
    }
    
    public static void closeConnection() throws SQLException {
        con.close();
    }
}
