

package Customer_Interface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Upeksha
 */

public class Customer {
    private int BookingID;
    private int CID;
    private String CustomerName;
    private String Address;
    private String NIC;
    private String Email;
    private String Phone;
    private String Nationality;
    private String Gender;
    private String BirthDate;
    private String Comment;
    private String Description;
    private String ToDate, FromDate;
    private int SingleBed, DoubleBed, ExtraBed;
    private int TotalAmount;
    private String ReservationDate;
    private String CustomerType;
    private String HallType;    

    public int getCID() {
        return CID;
    }

    public void setCID(int CID) {
        this.CID = CID;
    }

    public int getBookingID() {
        return BookingID;
    }

    public void setBookingID(int BookingID) {
        this.BookingID = BookingID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getToDate() {
        return ToDate;
    }

    public void setToDate(String ToDate) {
        this.ToDate = ToDate;
    }

    public String getFromDate() {
        return FromDate;
    }

    public void setFromDate(String FromDate) {
        this.FromDate = FromDate;
    }

    public int getSingleBed() {
        return SingleBed;
    }

    public void setSingleBed(int SingleBed) {
        this.SingleBed = SingleBed;
    }

    public int getDoubleBed() {
        return DoubleBed;
    }

    public void setDoubleBed(int DoubleBed) {
        this.DoubleBed = DoubleBed;
    }

    public int getExtraBed() {
        return ExtraBed;
    }

    public void setExtraBed(int ExtraBed) {
        this.ExtraBed = ExtraBed;
    }

    public int getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(int TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    public String getReservationDate() {
        return ReservationDate;
    }

    public void setReservationDate(String ReservationDate) {
        this.ReservationDate = ReservationDate;
    }

    public String getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(String CustomerType) {
        this.CustomerType = CustomerType;
    }

    public String getHallType() {
        return HallType;
    }

    public void setHallType(String HallType) {
        this.HallType = HallType;
    }
}
