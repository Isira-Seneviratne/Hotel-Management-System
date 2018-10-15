/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRManagement;


import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Irushi salwathura
 */
public class HRController {
        
    static ResultSet rs = null;
    static PreparedStatement pst = null;
    static Connection conn = Main.MyDBConnection.Myconnect();
    HRModel c = new HRModel();

    public static boolean status = false;
    
    public HRController() {
    }
    

    public void MouseEnterEvent(JButton button) {
        Color blueColor = new Color(0, 174, 239);
        button.setBackground(blueColor);
        button.setForeground(Color.white);
    }

    public void MouseExitEvent(JButton button, Color textcolor) {
        Color whColor = new Color(255, 255, 255);
        button.setBackground(whColor);
        button.setForeground(textcolor);
    }


        public String AutoGeneratePrimaryKey(JLabel lbl_ID, JTextField txt_ID, char character, String DBtable, String primaryKey) {
        String id = null;
        try {

            lbl_ID.setText(null);
            String sql = "Select " + primaryKey + " from " + DBtable + "";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            String last_id = null;
            String new_id = null;
            while (rs.next()) {
                rs.last();
                last_id = rs.getString(primaryKey);
            }
            new_id = last_id.substring(1);
            int intCid = Integer.parseInt(new_id);
            intCid = intCid + 0001;
            new_id = Integer.toString(intCid);
            txt_ID.setText(character + new_id);
            id = character + new_id;

        } catch (NumberFormatException | SQLException e) {
            lbl_ID.setText("Cant genarate Candidate ID");
        }
        return id;
    }
        //public static boolean InsertEmployee(String eid, String fname, String gender, String nic, String dob, String address, String mno, String mail,
           // String dptn, String dsgn, String sDate, String usr, String pwd)
   public static boolean InsertEmployee(String eid, String fname, String gender, String nic, String dob, String address, String mno, String mail,
            String dptn, String dsgn, String sDate, String usr, String pwd) {

        HRManagementWindow ae = new HRManagementWindow("");
        status = false;
        String sql = "INSERT INTO employee (Emp_ID,full_name,name_with_Initial,gender,NIC,birthday,address,homenumber,mobile,"
                + "email,Department,designation,startdate,userName,Password)"
                + " VALUES ('" + eid + "', '" + fname + "',"
                + " '" + gender + "', '" + nic + "', '" + dob + "',"
                + " '" + address + "', '" + mno + "',"
                + "'" + mail + "', '" + dptn + "', '" + dsgn + "',"
                + " '" + sDate + "', '" + usr + "', '" + pwd + "')";
        try {
            pst = conn.prepareStatement(sql);
            pst.execute();
            status = true;
        } catch (SQLException e) {
            status = false;
        }
        return status;
    }
   public static ResultSet loadTable(JTable table, String DBTable, String order) {
        try {
            String sql = "Select * from " + DBTable + " ORDER BY " + order + "";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
   public void Remove(JTable table, JLabel validateLable, String DBtable, String primaryKey) {
        int rw = table.getSelectedRow();
        if (rw == -1) {
            validateLable.setText("**Select a raw from table to Remove data**");
        } else {
            validateLable.setText("");
            String ObjButtons[] = {"Yes", "No"};
            int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to Remove data?", "Delete Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
            if (PromptResult == JOptionPane.YES_OPTION) {

                try {
                    String tbl_click = (table.getModel().getValueAt(rw, 0).toString());
                    String sql = "delete from " + DBtable + " where " + primaryKey + "='" + tbl_click + "'";
                    pst = conn.prepareStatement(sql);
                    pst.execute();
                } catch (SQLException ex) {
                    Logger.getLogger(HRManagementWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
       public void Search(JTable table, JTextField srch, JLabel validate, String sql, String value1, String value2) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        if (srch.getText().equals(value1) || srch.getText().equals(value2)) {
            validate.setText("**Field is Empty**");
            model.setRowCount(0);
        } else {
            try {
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();

                if (!rs.isBeforeFirst()) {
                    validate.setText("**Enter valid Entry**");
                    model.setRowCount(0);
                } else {
                    validate.setText("");
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                }

            } catch (HeadlessException | SQLException e) {
                showMessageDialog(null, e);
            }
        }
    }
        public static boolean InsertCandidate(String cid, String fname, String iname, String gender, String nic, String dob, String address, String hno, String mno, String mail,
            String applicantdate, String dptn, String dsgn, String quli, String degr, String exp) {

        status = false;
        String sql = "INSERT INTO candidate (candidateID,full_name,name_with_Initial,gender,NIC,birthday,"
                + "address,homenumber,mobile,email,aplicantDate,Department,designation,qualifications,degree,experience) "
                + "VALUES ('" + cid + "','" + fname + "','" + iname + "','" + gender + "','" + nic + "','" + dob + "','" + address + "','" + hno + "','" + mno + "',"
                + "'" + mail + "','" + applicantdate + "','" + dptn + "','" + dsgn + "','" + quli + "','" + degr + "','" + exp + "')";
        try {
            pst = conn.prepareStatement(sql);
            pst.execute();
            status = true;
        } catch (SQLException e) {
            status = false;
        }
        return status;
    }
        public static boolean UpdateEmployee(String eid, String fname, String gender, String nic, String dob, String address, String mno, String mail,
            String dptn, String dsgn, String sDate, String usr, String pwd) {

        status = false;
        String sql = "update employee set Emp_ID = '" + eid + "',full_name= '" + fname + "',gender='" + gender + "',NIC='" + nic + "',birthday= '" + dob + "',address='" + address + "',mobile='" + mno + "',"
                + "email='" + mail + "',Department='" + dptn + "',designation='" + dsgn + "',startdate='" + sDate + "',userName='" + usr + "',Password='" + pwd + "'";
        try {
            pst = conn.prepareStatement(sql);
            pst.execute();
            status = true;
        } catch (SQLException e) {
            status = false;
        }
        return status;
    }
     
}
