/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockManagement;

import Main.Login;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Isira
 */
public class NonDBFunctions {
    
    // The functions in this section relate to validations or retrieving specific values.
    public static String getUnitFromCmb(JComboBox cmb) {
        switch (cmb.getSelectedIndex()) {
            case 0:
                return "kg";
            case 1:
                return "g";
            case 2:
                return "None";
            default:
                return "";
        }
    }
    
    public static boolean isTextBlankOrWhitespace(JTextField txtFld) {
        return txtFld.getText().trim().equals("");
    }
    
    public static boolean isTextBlankOrWhitespace(JTextArea txtArea) {
        return txtArea.getText().trim().equals("");
    }
    // End of section.
    
    // The functions in this section relate to confirmations for various actions, such as deleting records.
    public static void deleteConfirmation(String tableName, String cond) {
        if(JOptionPane.showConfirmDialog(null, "Do you wish to delete this record?", "Delete record",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                DBFunctions.deleteRecord(tableName, cond);
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "An error occurred while deleting the selected record:\n\n"+e.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void logoutConfirmation(String eID) {
        if (JOptionPane.showConfirmDialog(null, "You will be logged out of the system.\n\n"
                + "Do you wish to continue?",
                "Exit", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                StockManagement.DBFunctions.logout(eID);
                JOptionPane.showMessageDialog(null, "Successfully logged out of the system.", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
                new Login().setVisible(true);
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "A problem occurred while logging out."
                        + " Make sure you are connected to the database.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    // End of section.
}
