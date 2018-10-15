

package CustomerManagement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Upeksha
 */


import java.util.Date;

public class Customer {
 
    private String bookingID;
    private int cid;
    private String customerName;
    private String address;
    private String nic;
    private String email;
    private String phone;
    private String nationality;
    private String gender;
    private String birthdate;
    private String comment;
    private String description;
    private String To_date;
    private int singlebed;
    private int doulebed;
    private int extrabed;
    private int totalamount;
    private String From_date;
    private String Reservationdate;
    private String CustomerType;
    private String HallType;
    
    
    public String getReservationdate() {
        return Reservationdate;
    }

    public void setReservationdate(String x) {
        Reservationdate = x;
    }
    
    public String getTo_date() {
        return To_date;
    }

    public void setTo_date(String x) {
        To_date = x;
    }

    public String getFrom_date() {
        return From_date;
    }

    public void setFrom_date(String x) {
        From_date = x;
    }
    public void setbookingID(String x) {
        bookingID = x;
    }
    public String getbookingID() {
        return bookingID;
    }

    public int getCustomercId() {
        return cid;
    }
   
   public void setsinglebed(int x) {
        singlebed = x;
    }

    public int getsinglebed() {
        return singlebed;
    }
    
     public void setdoulebed(int x) {
        doulebed = x;
    }

    public int getdoulebed() {
        return doulebed;
    }
    
     public void setextrabed(int x) {
        extrabed = x;
    }

    public int getextrabed() {
        return extrabed;
    }
    
    public void setCustomercId(int x) {
        cid = x;
    }

    public void setcustomerName(String x) {
        customerName = x;
    }

    public String getcustomerName() {
        return customerName;
    }
                        
    public void setaddress(String x) {
        address = x;
    }

    public String getaddress() {
        return address;
    }
    
     public void setnic(String x) {
        nic = x;
    }

    public String getnic() {
        return nic;
    }
    
     public void setnationality(String x) {
        nationality = x;
    }

    public String getnationality() {
        return nationality;
    }
    
    public void setemail(String x) {
        email = x;
    }

    public String getemail() {
        return email;
    }
    
     public void setphone(String x) {
        phone = x;
    }

    public String getphone() {
        return phone;
    }
    
    public void setbirthdate(String x) {
        birthdate = x;
    }

    public String getbirthdate() {
        return birthdate;
    }
    
    public void setcomment(String x) {
        comment = x;
    }

    public String getcomment() {
        return comment;
    }
    
    public void setdescription(String x) {
        description = x;
    }

    public String getdescription() {
        return description;
    }
    
    public void setCustomerType(String x) {
        CustomerType = x;
    }

    public String getCustomerType() {
        return CustomerType;
    }
    
     public void setHallType(String x) {
        HallType = x;
    }

    public String getHallType() {
        return HallType;
    }
    
    
    public void setgender(String x) {
        gender = x;
    }

    public String getgender() {
        return gender;
    }
    
   public void settotalamount(int x) {
        totalamount = x;
    }

    public int gettotalamount() {
        return totalamount;
    }
    
}
