package Customer_Interface;


import HMS_Database.MyDBConnection;
//import com.toedter.calendar.JDateChooser;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
//import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Upeksha
 */
public class CusDBOperations {
    Connection con = MyDBConnection.connectDB();
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public boolean addUser(Customer ad) {
        try {
            pst = con.prepareStatement("INSERT INTO customer VALUES(?,?,?,?,?,?,?,?)");
            pst.setString(1, ad.getCustomerName());
            pst.setString(2, ad.getAddress());
            pst.setString(3, ad.getPhone());
            pst.setString(4, ad.getEmail());
            pst.setString(5, ad.getNIC());
            pst.setString(6, ad.getNationality());
            pst.setString(6, ad.getCustomerType());
            pst.setString(7, ad.getGender());
            pst.setString(8, ad.getComment());
           /* pst.setString(9, ad.getTo_date());
            pst.setString(10, ad.getFrom_date());*/
         
            //Designation
           
            pst.executeUpdate();
            return true;

           

        } catch (SQLException sq) {
            System.out.println(sq);
           return false;
        }
          
finally {

            try {
                if (rs != null) {
                    rs.close();

                }
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();

                }
            } catch (SQLException exx) {
                JOptionPane.showMessageDialog(null, "Database problem");

            }

    }

}  
    
    public void UserUpdate(Customer up) {
        Boolean result = false;

        try {
            pst = (PreparedStatement) con.prepareStatement("UPDATE customer SET name=? ,address=? ,phone=? ,email=?, nic=?, gender=?, nationality=?, comment=?");
            pst.setString(1, up.getCustomerName());
            pst.setString(2, up.getAddress());
            pst.setString(3, up.getPhone());
            pst.setString(4, up.getEmail());
            pst.setString(5, up.getNIC());
            pst.setString(6, up.getNationality());
            pst.setString(7, up.getGender());
            pst.setString(8, up.getComment());
//add for designation
            
            

            pst.executeUpdate();
            result = true;
           
            JOptionPane.showMessageDialog(null, "Data Updated Successfully...!");
        } catch (SQLException sq) {
            JOptionPane.showMessageDialog(null, "Updation Fail...!");
        }
            
        finally{
        try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException exx) {
                JOptionPane.showMessageDialog(null, "Database problem");
            }
        }
    }
     
     
     
           void deleteUser(JTable table){
       
        
          try {
              int rw = table.getSelectedRow();
        if (rw == -1) {
            JOptionPane.showMessageDialog(null, "Select customer from table");
            //validateLable.setText("**Select a raw from table to Remove data**");
        }else{
              String tbl_click = (table.getModel().getValueAt(rw, 0).toString());
            pst = con.prepareStatement("DELETE  FROM customer WHERE name='"+tbl_click+"'");
        
        // pst.setInt(1,a);

            pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "Customer Deleted ! ");
        }
            

        } catch (SQLException sql) {
            java.lang.System.out.print(sql.toString());
            JOptionPane.showMessageDialog(null, sql);

        }
   
finally {

            try {
                if (rs != null) {
                    rs.close();

                }
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();

                }
            } catch (SQLException exx) {
                JOptionPane.showMessageDialog(null, "Database problem");

            }

    }

  } 
     public void SearchData(JTable table, JTextField srch, String sql, String value1) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        if (srch.getText().equals(value1)) {
            JOptionPane.showMessageDialog(null, "Field is empty");
            model.setRowCount(0);
        } else {
            try {
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();

                if (!rs.isBeforeFirst()) {
                    JOptionPane.showMessageDialog(null, "no data");
                    model.setRowCount(0);
                } else {
//                    table.setModel(DbUtils.resultSetToTableModel(rs));
                }

            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
}

