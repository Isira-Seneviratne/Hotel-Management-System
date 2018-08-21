
package HMS_Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Prabas Gayadeeptha
 */
public class MyDBConnection {
    private static final Object monitor = new Object();
    private static Connection conn = null;
    
    public static Connection connectDB()
    {
        synchronized(monitor)
        {
            try {
                if(conn == null) {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system", "root", "");
                }
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Unable to establish database connection.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return conn;
    }
}
