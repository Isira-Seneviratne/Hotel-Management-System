/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockManagement;

import Main.Login;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
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
    
    public static void setCmbToUnit(JComboBox cmb, JTable table, int unitInd) {
        String unit = table.getValueAt(table.getSelectedRow(), unitInd).toString();
            switch (unit) {
                case "kg":
                    cmb.setSelectedIndex(0);
                    break;
                case "g":
                    cmb.setSelectedIndex(1);
                    break;
                case "None":
                    cmb.setSelectedIndex(2);
                    break;
                default:
                    cmb.setSelectedIndex(-1);
                    break;
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
    public static void deleteConfirmation(JPanel panel, String tableName, String cond) {
        if (JOptionPane.showConfirmDialog(panel, "Do you wish to delete this record?", "Delete record",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                DBFunctions.deleteRecord(tableName, cond);
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "An error occurred while deleting the selected record:\n\n"+e.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Without this, the entire application closes.
        }
    }
    
    public static void logoutConfirmation(JFrame frame, String eID) {
        if (JOptionPane.showConfirmDialog(frame, "You will be logged out of the system.\n\n"
                + "Do you wish to continue?",
                "Exit", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                StockManagement.DBFunctions.logout(eID);
                JOptionPane.showMessageDialog(null, "Successfully logged out of the system.", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
                new Login().setVisible(true);
                frame.dispose();
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "A problem occurred while logging out."
                        + "\n\nError: "+e.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Without this, the entire application closes.
        }
    }
    // End of section.
}
