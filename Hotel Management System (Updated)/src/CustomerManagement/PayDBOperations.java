package CustomerManagement;


//import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.DriverManager;
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

    String url =  "jdbc:mysql://localhost:3306/hotel_management_system";
    String user = "root";
    String password = "";
    
    public boolean addroom(Customer rm){
    try{
     con = (Connection) DriverManager.getConnection(url, user, password);
            pst = (PreparedStatement) con.prepareStatement("INSERT INTO cus_payment VALUES(?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, rm.getbookingID());
            pst.setString(2, rm.getcustomerName());
            pst.setString(3, rm.getTo_date());
            pst.setString(4, rm.getFrom_date());
            pst.setInt(5, rm.getsinglebed());
            pst.setInt(6, rm.getdoulebed());
            pst.setInt(7, rm.getextrabed());
            pst.setString(8, rm.getdescription());
            pst.setInt(9, rm.gettotalamount());
            
             pst.executeUpdate();
            return true;
    }catch (SQLException sq) {
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
    
     public void RoomUpdate(Customer rup) {
        Boolean result = false;

        try {
            con = (Connection) DriverManager.getConnection(url, user, password);
            pst = (PreparedStatement) con.prepareStatement("UPDATE cus_payment SET bookingID=?, name=? ,"
                    + "todate=? ,fromdate=?, singleroom=?,doubleroom=?,extrabed=?, description=?, TotalAmount=?");
//            pst.setInt(1, up.getbId());
            pst.setInt(1, rup.getbookingID());
            pst.setString(2, rup.getcustomerName());
            pst.setString(3, rup.getTo_date());
            pst.setString(4, rup.getFrom_date());
            pst.setInt(5, rup.getsinglebed());
            pst.setInt(6, rup.getdoulebed());
            pst.setInt(7, rup.getextrabed());
            pst.setString(8, rup.getdescription());
            pst.setInt(9, rup.gettotalamount());
           
         
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
      void deleteroom(JTable table){
       
        
          try {
            int rw = table.getSelectedRow();
        if (rw == -1) {
            JOptionPane.showMessageDialog(null, "Select cus_payment from table");
            //validateLable.setText("**Select a raw from table to Remove data**");
        }else{
              String tbl_click = (table.getModel().getValueAt(rw, 0).toString());
            con = (Connection) DriverManager.getConnection(url, user, password);
            pst = (PreparedStatement) con.prepareStatement("DELETE  FROM cus_payment WHERE name='"+tbl_click+"'");
        
        // pst.setInt(1,a);

            pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "Room Deleted ! ");

            
        }
        } catch (SQLException sql) {
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
     
    
    
     public boolean addHall(Customer ad){
   
     
        try {
            con = (Connection) DriverManager.getConnection(url, user, password);
            pst = (PreparedStatement) con.prepareStatement("INSERT INTO hall VALUES(?,?,?,?,?,?)");
            pst.setInt(1, ad.getbookingID());
            pst.setString(2, ad.getcustomerName());
            pst.setString(3, ad.getReservationdate());
            pst.setString(4, ad.getHallType());
            pst.setString(5, ad.getdescription());
            pst.setInt(6, ad.gettotalamount());
            
           
         
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
    

      public void HallUpdate(Customer up) {
        Boolean result = false;

        try {
            con = (Connection) DriverManager.getConnection(url, user, password);
            pst = (PreparedStatement) con.prepareStatement("UPDATE hall SET Booking_ID=?, name=? ,Reserve_date=? , Hall_name=?, description=?, TotalAmount=?");
//            pst.setInt(1, up.getbId());
            pst.setInt(1, up.getbookingID());
            pst.setString(2, up.getcustomerName());
            pst.setString(3, up.getReservationdate());
            pst.setString(4, up.getHallType());
            pst.setString(5, up.getdescription());
            pst.setInt(6, up.gettotalamount());
           
         
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
            con = (Connection) DriverManager.getConnection(url, user, password);
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
            pst.setString(1, bk.getcustomerName());
            pst.setInt(2, bk.getextrabed());
            pst.setInt(3, bk.getdoulebed());
            pst.setString(4, bk.getdescription());
            pst.setString(5, bk.getTo_date());
            pst.setInt(2, bk.getextrabed());
            pst.setString(6, bk.getFrom_date());
         
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


