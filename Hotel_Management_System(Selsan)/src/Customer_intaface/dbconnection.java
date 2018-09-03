/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer_intaface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Oshitha
 */
public class dbconnection {
    
    
    public static Connection Myconnect() throws SQLException{
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.println(e);
        
        }
        return conn;
    }
    
}
