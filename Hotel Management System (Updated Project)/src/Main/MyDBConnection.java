
package Main;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Prabas Gayadeeptha
 */
public class MyDBConnection {
    
    public static Connection Myconnect(){
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_db", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            
            JOptionPane.showConfirmDialog(null, "Database Connection is faild" +e);
        }
        
        return conn;
    }
    
}
