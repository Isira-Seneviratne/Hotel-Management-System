package Customer_Interface;


//import com.toedter.calendar.JDateChooser;
import HMS_Database.MyDBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Upeksha
 */
public class PayDBOperations {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public PayDBOperations()
    {
        con = MyDBConnection.connectDB();
    }
    
    public boolean addRoom(Customer rm){
        try {
            pst = con.prepareStatement("INSERT INTO cus_payment VALUES(?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, rm.getBookingID());
            pst.setString(2, rm.getCustomerName());
            pst.setString(3, rm.getToDate());
            pst.setString(4, rm.getFromDate());
            pst.setInt(5, rm.getSingleBed());
            pst.setInt(6, rm.getDoubleBed());
            pst.setInt(7, rm.getExtraBed());
            pst.setString(8, rm.getDescription());
            pst.setInt(9, rm.getTotalAmount());
            
            pst.executeUpdate();
            return true;
        } catch (SQLException sq) {
            System.out.println(sq);
            return false;
        } finally {
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
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Database problem");
            }
        }
    }
    
    public void updateRoom(Customer rup) {
        Boolean result = false;

        try {
            pst = con.prepareStatement("UPDATE cus_payment SET bookingID=?, name=? ,"
                    + "todate=? ,fromdate=?, singleroom=?,doubleroom=?,extrabed=?, description=?, TotalAmount=?");
//            pst.setInt(1, up.getbId());
            pst.setInt(1, rup.getBookingID());
            pst.setString(2, rup.getCustomerName());
            pst.setString(3, rup.getToDate());
            pst.setString(4, rup.getFromDate());
            pst.setInt(5, rup.getSingleBed());
            pst.setInt(6, rup.getDoubleBed());
            pst.setInt(7, rup.getExtraBed());
            pst.setString(8, rup.getDescription());
            pst.setInt(9, rup.getTotalAmount());
            //add for designation
            pst.executeUpdate();
            result = true;
           
            JOptionPane.showMessageDialog(null, "Data Updated Successfully...!");
        } catch (SQLException sq) {
            JOptionPane.showMessageDialog(null, "Updation Fail...!");
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
    
    void deleteRoom(JTable table) {
        try {
            int rw = table.getSelectedRow();
            if (rw == -1) {
                JOptionPane.showMessageDialog(null, "Select cus_payment from table");
            //validateLable.setText("**Select a raw from table to Remove data**");
            } else {
                String tbl_click = (table.getModel().getValueAt(rw, 0).toString());
                pst = (PreparedStatement) con.prepareStatement("DELETE  FROM cus_payment WHERE name='"+tbl_click+"'");
            // pst.setInt(1,a);
                pst.executeUpdate();
               JOptionPane.showMessageDialog(null, "Room Deleted ! ");
            }
        } catch (SQLException sql) {
            java.lang.System.out.print(sql.toString());
            JOptionPane.showMessageDialog(null, "SQL Exception");
        } finally {
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
    
     public boolean addHall(Customer ad){
        try {
            pst = con.prepareStatement("INSERT INTO hall VALUES(?,?,?,?,?,?)");
            pst.setInt(1, ad.getBookingID());
            pst.setString(2, ad.getCustomerName());
            pst.setString(3, ad.getReservationDate());
            pst.setString(4, ad.getHallType());
            pst.setString(5, ad.getDescription());
            pst.setInt(6, ad.getTotalAmount());
            
           
         
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
    

      public void updateHall(Customer up) {
        Boolean result = false;

        try {
            pst = con.prepareStatement("UPDATE hall SET Booking_ID=?, name=? ,Reserve_date=? , Hall_name=?, description=?, TotalAmount=?");
//            pst.setInt(1, up.getbId());
            pst.setInt(1, up.getBookingID());
            pst.setString(2, up.getCustomerName());
            pst.setString(3, up.getReservationDate());
            pst.setString(4, up.getHallType());
            pst.setString(5, up.getDescription());
            pst.setInt(6, up.getTotalAmount());
           
         
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
     
     
     
           void deleteHall(JTable table){
       
        
          try {
           int rw = table.getSelectedRow();
        if (rw == -1) {
            JOptionPane.showMessageDialog(null, "Select hall from table");
            //validateLable.setText("**Select a raw from table to Remove data**");
        }else{
              String tbl_click = (table.getModel().getValueAt(rw, 0).toString());
            pst = (PreparedStatement) con.prepareStatement("DELETE  FROM hall WHERE name='"+tbl_click+"'");
        
        // pst.setInt(1,a);

            pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "Hall Deleted ! ");

        } 
          }catch (SQLException sql) {
            java.lang.System.out.print(sql.toString());
            JOptionPane.showMessageDialog(null, "SQL Exception");

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
     
    
}

/*public void addbooking(booking bk){
   
     
        try {
            con = (Connection) DriverManager.getConnection(url, user, password);
            pst = (PreparedStatement) con.prepareStatement("INSERT INTO cus_payment VALUES(?,?,?,?,?,?,?,?)");
            pst.setString(1, bk.getCustomerName());
            pst.setInt(2, bk.getExtraBed());
            pst.setInt(3, bk.getDoubleBed());
            pst.setString(4, bk.getDescription());
            pst.setString(5, bk.getToDate());
            pst.setInt(2, bk.getExtraBed());
            pst.setString(6, bk.getFromDate());
         
            //Designationprivate int singlebed;
    private int doulebed;
    private int extrabed;
    private int totalamount;
           
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
    */


   /*public void LoadCustomerTableToForm(JTable canT, JLabel validate, JTextField cid, JTextField fname,
            JTextField iname, JTextField gender, JTextField nic, JTextField dob, JTextArea address, JTextField hno,
            JTextField mno, JTextField mail, JDateChooser applicantdate, JComboBox dptn, JComboBox dsgn, JTextField quli,
            JTextField degr, JTextField exp) {
        try {
            java.util.Date date;
            int rw = canT.getSelectedRow();
            if (rw == -1) {
                validate.setText("Select a Customer from table for Edit.");
            } else {
                validate.setText("");
                String tbl_click = (canT.getModel().getValueAt(rw, 0).toString());
                String sql = "select * from customer where name='" + tbl_click + "'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();

                while (rs.next()) {
                    cid.setText(rs.getString("candidateID"));
                    fname.setText(rs.getString("full_name"));
                    iname.setText(rs.getString("name_with_Initial"));
                    gender.setText(rs.getString("gender"));
                    nic.setText(rs.getString("NIC"));
                    dob.setText(rs.getString("birthday"));
                    address.setText(rs.getString("address"));
                    hno.setText(rs.getString("homenumber"));
                    mno.setText(rs.getString("mobile"));
                    mail.setText(rs.getString("email"));
                    applicantdate.setDate(rs.getDate("aplicantDate"));
                    dptn.setSelectedItem(rs.getString("Department"));
                    dsgn.setSelectedItem(rs.getString("designation"));
                    quli.setText(rs.getString("qualifications"));
                    degr.setText(rs.getString("degree"));
                    exp.setText(rs.getString("experience"));

                }
            }
        } catch (SQLException e) {
        }
    }*/


