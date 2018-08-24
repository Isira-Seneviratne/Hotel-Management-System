/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRMS_Codes;

import HMS_Database.MyDBConnection;
import HRMS_Interface.AddEmployee;
import HRMS_Interface.AttendenceManagement;
import HRMS_Interface.EmployeeManagement;
import HRMS_Interface.JobAnalysis;
import HRMS_Interface.MainLogin;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.JDesktopPane;
import lu.tudor.santec.jtimechooser.JTimeChooser;

/**
 *
 * @author Prabas Gayadeeptha
 */
public class HR_Methods {

    static ResultSet rs = null;
    static PreparedStatement pst = null;
    static Connection conn = MyDBConnection.Myconnect();
     Hotel c = new Hotel();

    public static boolean status = false;

    public HR_Methods() {
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

    public static boolean InsertCandidateToDB(String cid, String fname, String iname, String gender, String nic, String dob, String address, String hno, String mno, String mail,
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

    public static boolean UpdateCandidateInDB(String cid, String fname, String iname, String gender, String nic, String dob, String address, String hno, String mno, String mail,
            String applicantdate, String dptn, String dsgn, String quli, String degr, String exp) {

        status = false;
        try {
            String sql = "update candidate set full_name='" + fname + "',name_with_Initial='" + iname + "',gender='" + gender + "',"
                    + "NIC='" + nic + "',birthday='" + dob + "',address='" + address + "',homenumber='" + hno + "',"
                    + "mobile='" + mno + "',email='" + mail + "',aplicantDate='" + applicantdate + "',Department='" + dptn + "',"
                    + "designation='" + dsgn + "',qualifications='" + quli + "',degree='" + degr + "',experience='" + exp + "'"
                    + " where candidateID='" + cid + "'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            status = true;
        } catch (SQLException ex) {
            Logger.getLogger(HR_Methods.class.getName()).log(Level.SEVERE, null, ex);
            status = false;
        }
        return status;
    }

    public static boolean InsertInterviewScheduleToDB(String iid, String cid, String fname, String jname, String itype, String idate, String istime) {

        status = false;
        String sql = "INSERT INTO interview_schedule (interID,cid,can_name,job_name,type,date,time)"
                + "VALUES ('" + iid + "','" + cid + "','" + fname + "','" + jname + "','" + itype + "','" + idate + "','" + istime + "')";
        try {
            pst = conn.prepareStatement(sql);
            pst.execute();
            status = true;
        } catch (SQLException e) {
            status = false;
        }
        return status;
    }

    public static boolean UpdateInterviewScheduleInDB(String iid, String cid, String fname, String jname, String itype, String idate, String istime) {

        status = false;
        String sql = "update interview_schedule set can_name='" + fname + "',job_name='" + jname + "',"
                + "type='" + itype + "',date='" + idate + "',time='" + istime + "' where interID='" + iid + "'";
        try {
            pst = conn.prepareStatement(sql);
            pst.execute();
            status = true;
        } catch (SQLException e) {
            status = false;
        }
        return status;
    }

    public static boolean UpdateJOBInDB(String jid, String max, String avabl, String basic, String otime, String hday) {

        status = false;
        String sql = "update job set Max='" + max + "',availble='" + avabl + "',"
                + "BasicSalary='" + basic + "',OverTimeRatePerHoure='" + otime + "',HalfDay='" + hday + "' where jobid='" + jid + "'";
        try {
            pst = conn.prepareStatement(sql);
            pst.execute();
            status = true;
        } catch (SQLException e) {
            status = false;
        }
        return status;
    }

    public static boolean UpdateEmployeeInDB(String eid, String fname, String iname, String add, String hno, String mno, String mail,  String user,  String pwd) {
        status = false;
        String sql = "update employee set full_name='" + fname + "',name_with_Initial='" + iname + "',"
                + "address='" + add + "',homenumber='" + hno + "',mobile='" + mno + "',email='" + mail + "',userName='" + user + "',Password='" + pwd + "' where Emp_ID='" + eid + "'";
        try {
            pst = conn.prepareStatement(sql);
            pst.execute();
            status = true;
        } catch (SQLException e) {
            status = false;
        }
        return status;
    }
    
    public static boolean InsertAttandenceToDB(String empID, String fname) {

        status = false;
        String sql = "INSERT INTO attendence (empid,eName,Date,att_time)"
                + "VALUES ('" + empID + "','" + fname + "',CURDATE(),CURTIME())";
        try {
            pst = conn.prepareStatement(sql);
            pst.execute();
            status = true;
        } catch (SQLException e) {
            status = false;
        }
        return status;
    }

    public static boolean InsertSalaryPaymentToDB(String empID, String fname, String month, String total) {

        status = false;
        String sql = "INSERT INTO sal_payment (employeeID,employeeName,Month,TotalSal)"
                + "VALUES ('" + empID + "','" + fname + "','" + month + "','" + total + "')";
        try {
            pst = conn.prepareStatement(sql);
            pst.execute();
            status = true;
        } catch (SQLException e) {
            status = false;
        }
        return status;
    }

    public static boolean UpdateSalaryPaymentInDB(String empID, String total) {

        status = false;
        String sql = "Update sal_payment set TotalSal='" + total + "' where employeeID='" + empID + "'";
        try {
            pst = conn.prepareStatement(sql);
            pst.execute();
            status = true;
        } catch (SQLException e) {
            status = false;
        }
        return status;
    }

    public static boolean InsertLeaveToDB(String empID, String fname) throws ParseException {
        status = false;
        String atime = "";
        String ltime = "";
        String type = "-";
        int ot = 0;
        int workHours_hrs = 0;
        try {
            //save leave time to db
            String leave_Sql = "update attendence set leave_Time=CURTIME() where empid='" + empID + "' and Date=CURDATE()";
            pst = conn.prepareStatement(leave_Sql);
            pst.execute();
            //get data from table to calculate ot and working hours
            String calculate_sql = "select * from attendence where empid='" + empID + "' and Date=CURDATE()";
            pst = conn.prepareStatement(calculate_sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                atime = rs.getString("att_time");
                ltime = rs.getString("leave_Time");
            }
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            Date StartTime = format.parse(atime);
            Date EndTime = format.parse(ltime);
            int workHours_miliS = (int) (EndTime.getTime() - StartTime.getTime());
            workHours_hrs = workHours_miliS / (1000 * 60 * 60);
            if (workHours_hrs > 6) {
                type = "Full Day";
            } else if (workHours_hrs == 6 && workHours_hrs >= 3) {
                type = "Half Day";
            } else {
                type = "notCount";
            }
            if (workHours_hrs > 8) {
                ot = workHours_hrs - 8;
            }
            String final_sql = "update attendence set leave_Time=CURTIME(),att_type='" + type + "',workingHours='" + workHours_hrs + "',otHours='" + ot + "' where empid='" + empID + "' and Date=CURDATE()";
            pst = conn.prepareStatement(final_sql);
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

    public static ResultSet getEmployeeName(JTable table) {
        try {
            String sql = "Select employee.Emp_ID, employee.full_name from employee "
                    + "where Emp_ID NOT IN(Select empid from attendence "
                    + "where attendence.empid=employee.Emp_ID and attendence.Date=CURDATE())";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    public static ResultSet getTodayAttendence(JTable table, String DBTable) {
        try {
            String sql = "SELECT * FROM " + DBTable + " where Date=CURDATE()";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    public static ResultSet getThisMonthPayments(JTable table, String DBTable) {
        try {
            String sql = "SELECT * FROM " + DBTable + " where Month=EXTRACT(MONTH FROM CURDATE())";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    public static ResultSet getAttendenceDetatils(JTable table) {
        try {
            String sql = "SELECT attendence.empid, attendence.eName, EXTRACT(MONTH FROM CURDATE()) 'Month', SUM(attendence.att_type='Full Day') 'aCount',"
                    + " SUM(attendence.att_type='Half Day') 'hCount', SUM(attendence.otHours) 'ot' from attendence "
                    + "where EXTRACT(MONTH FROM attendence.Date)=EXTRACT(MONTH FROM CURDATE()) and eName NOT IN(Select sal_payment.employeeName from sal_payment "
                    + "where attendence.eName=sal_payment.employeeName) group by attendence.eName,attendence.empid";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    public void LoadCandidateTableToForm(JTable canT, JLabel validate, JTextField cid, JTextField fname,
            JTextField iname, JTextField gender, JTextField nic, JTextField dob, JTextArea address, JTextField hno,
            JTextField mno, JTextField mail, JDateChooser applicantdate, JComboBox dptn, JComboBox dsgn, JTextField quli,
            JTextField degr, JTextField exp) {
        try {
            java.util.Date date;
            int rw = canT.getSelectedRow();
            if (rw == -1) {
                validate.setText("**Select a Candidate from table for Edit**");
            } else {
                validate.setText("");
                String tbl_click = (canT.getModel().getValueAt(rw, 0).toString());
                String sql = "select * from candidate where candidateID='" + tbl_click + "'";
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
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void LoadEmployeeNametoAttendence(JTable table, JTextField eid, JTextField fname) {
        try {
            int rw = table.getSelectedRow();
            String tbl_click = (table.getModel().getValueAt(rw, 0).toString());
            String sql = "select * from employee where Emp_ID='" + tbl_click + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                eid.setText(rs.getString("Emp_ID"));
                fname.setText(rs.getString("full_name"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void LoadJobTableToForm(JTable table, JLabel validate, JTextField jid, JTextField did,
            JTextField jname, JTextField max, JTextField availble, JTextField basicSal, JTextField ot, JTextField halfDay) {
        try {
            int rw = table.getSelectedRow();
            if (rw == -1) {
                validate.setText("**Select a Candidate from table for Edit**");
            } else {
                validate.setText("");
                String tbl_click = (table.getModel().getValueAt(rw, 0).toString());
                String sql = "select * from job where jobid='" + tbl_click + "'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();

                while (rs.next()) {
                    jid.setText(rs.getString("jobid"));
                    did.setText(rs.getString("depID"));
                    jname.setText(rs.getString("jName"));
                    max.setText(rs.getString("Max"));
                    availble.setText(rs.getString("availble"));
                    basicSal.setText(rs.getString("BasicSalary"));
                    ot.setText(rs.getString("OverTimeRatePerHoure"));
                    halfDay.setText(rs.getString("HalfDay"));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void LoadSalaryDetailsToForm(JTable table, JLabel validate, JTextField eid, JTextField jname,
            JTextField month, JTextField basicSal, JTextField ot, JTextField halfDay) {

        String otHRS = "";
        String empID = "";
        String hDay = "";
        String attCount = "";
        String BasicSalary = "";
        String otRate = "";
        String halfDayRate = "";
        try {
            int rw = table.getSelectedRow();
            if (rw == -1) {
                validate.setText("**Select a Candidate from table for Edit**");
            } else {
                validate.setText("");
                String tbl_click = (table.getModel().getValueAt(rw, 0).toString());
                String sql = "SELECT attendence.empid, attendence.eName, EXTRACT(MONTH FROM CURDATE()) 'Month', SUM(attendence.att_type='Full Day') 'aCount',"
                        + " SUM(attendence.att_type='Half Day') 'hCount', SUM(attendence.otHours) 'ot' from attendence "
                        + "where empid='" + tbl_click + "'and EXTRACT(MONTH FROM attendence.Date)=EXTRACT(MONTH FROM CURDATE()) and eName NOT IN(Select sal_payment.employeeName from sal_payment "
                        + "where attendence.eName=sal_payment.employeeName) group by attendence.eName,attendence.empid";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();

                while (rs.next()) {
                    empID = rs.getString("attendence.empid");
                    eid.setText(empID);
                    jname.setText(rs.getString("attendence.eName"));
                    month.setText(rs.getString("Month"));
                    attCount = rs.getString("aCount");
                    hDay = rs.getString("hCount");
                    otHRS = rs.getString("ot");
                }
                String sql1 = "SELECT * FROM job,employee where employee.designation=job.jName and employee.Emp_ID='" + empID + "'";
                pst = conn.prepareStatement(sql1);
                rs = pst.executeQuery();
                while (rs.next()) {
                    BasicSalary = rs.getString("BasicSalary");
                    otRate = rs.getString("OverTimeRatePerHoure");
                    halfDayRate = rs.getString("HalfDay");
                }
                if (Integer.parseInt(attCount) < 15) {
                    int b = Integer.parseInt(BasicSalary) / 2;
                    basicSal.setText(String.valueOf(b));
                } else {
                    basicSal.setText(BasicSalary);
                }
                int otAmount = Integer.parseInt(otRate) * Integer.parseInt(otHRS);
                ot.setText(String.valueOf(otAmount));

                if (Integer.parseInt(hDay) > 8) {
                    int HalfDayAmount = (Integer.parseInt(hDay) - 8) * Integer.parseInt(halfDayRate);
                    halfDay.setText(String.valueOf(HalfDayAmount));
                } else {
                    halfDay.setText("0");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void LoadEmployeeNametoLeave(JTable table, JTextField eid, JTextField fname) {
        try {
            int rw = table.getSelectedRow();
            String tbl_click = (table.getModel().getValueAt(rw, 0).toString());
            String sql = "select * from attendence where attID='" + tbl_click + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                String type = rs.getString("att_type");
                if (type.equals("-")) {
                    eid.setText(rs.getString("empid"));
                    fname.setText(rs.getString("eName"));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void LoadCandidateTableToEmployeeForm(JTable canT, JLabel validate) {
        AddEmployee ae = new AddEmployee();
        try {
            Date date = new Date();
            int rw = canT.getSelectedRow();
            if (rw == -1) {
                validate.setText("**Select a raw from table**");
            } else {
                validate.setText("");
                String tbl_click = (canT.getModel().getValueAt(rw, 0).toString());
                String sql = "select c.full_name,c.name_with_Initial,c.NIC,c.gender,c.birthday,c.address,c.homenumber,c.mobile,c.email,c.Department,c.designation"
                        + " from candidate c, interview_schedule i where c.candidateID=i.cid and i.interID='" + tbl_click + "'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();

                while (rs.next()) {
                    String fname = rs.getString("c.full_name");
                    ae.txt_fname.setText(fname);
                    ae.txt_initialName.setText(rs.getString("name_with_Initial"));
                    ae.txt_nic.setText(rs.getString("NIC"));
                    ae.txt_gender.setText(rs.getString("gender"));
                    ae.dc_birth.setDate(rs.getDate("birthday"));
                    ae.txtA_address.setText(rs.getString("address"));
                    ae.txt_hno.setText(rs.getString("homenumber"));
                    ae.txt_mno.setText(rs.getString("mobile"));
                    ae.txt_mail.setText(rs.getString("email"));
                    ae.txt_dptn.setText(rs.getString("Department"));
                    ae.txt_dsgn.setText(rs.getString("designation"));
                    ae.dc_startdate.setDate(date);
                    ae.txt_usrnme.setText(rs.getString("NIC"));
                    ae.pwd_password.setText(rs.getString("NIC"));
                }
                ae.setVisible(true);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static boolean InsertEmployeeToDB(String eid, String fname, String iname, String gender, String nic, String dob, String address, String hno, String mno, String mail,
            String dptn, String dsgn, String sDate, String usr, String pwd) {

        AddEmployee ae = new AddEmployee();
        status = false;
        String sql = "INSERT INTO employee (Emp_ID,full_name,name_with_Initial,gender,NIC,birthday,address,homenumber,mobile,"
                + "email,Department,designation,startdate,userName,Password)"
                + " VALUES ('" + eid + "', '" + fname + "', '" + iname + "',"
                + " '" + gender + "', '" + nic + "', '" + dob + "',"
                + " '" + address + "', '" + hno + "', '" + mno + "',"
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

    public void LoadCandidateTableToSetInterview(JTable table, JLabel validate, JLabel cid, JTextField fname, JTextField dsgn) {
        try {
            java.util.Date date;
            int rw = table.getSelectedRow();
            if (rw == -1) {
                validate.setText("**Select a Candidate from table for Edit**");
            } else {
                validate.setText("");
                String tbl_click = (table.getModel().getValueAt(rw, 0).toString());
                String sql = "select * from candidate where candidateID='" + tbl_click + "'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();

                while (rs.next()) {
                    cid.setText(rs.getString("candidateID"));
                    fname.setText(rs.getString("full_name"));
                    dsgn.setText(rs.getString("designation"));
                }
            }
        } catch (SQLException e) {
        }
    }

    public void LoadScheduleTableToSetInterview(JTable table, JLabel validate, JTextField iID, JLabel cid, JTextField fname,
            JTextField jname, JComboBox itype, JDateChooser idate, JTimeChooser itime) {
        try {
            java.util.Date date;
            int rw = table.getSelectedRow();
            if (rw == -1) {
                validate.setText("**Select a Schedule from table for Edit**");
            } else {
                validate.setText("");
                String tbl_click = (table.getModel().getValueAt(rw, 0).toString());
                String sql = "select * from interview_schedule where interID='" + tbl_click + "'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();

                while (rs.next()) {
                    iID.setText(rs.getString("interID"));
                    cid.setText(rs.getString("cid"));
                    fname.setText(rs.getString("can_name"));
                    jname.setText(rs.getString("job_name"));
                    itype.setSelectedItem(rs.getString("type"));
                    idate.setDate(rs.getDate("date"));
                    itime.setTime(rs.getTime("time"));
                }
            }
        } catch (SQLException e) {
        }
    }

    public void LoadEmployeeTableToForm(JTextField eid, JTextField fname,
            JTextField iname, JTextField gender, JTextField nic, JTextField dob, JTextArea address, JTextField hno,
            JTextField mno, JTextField mail, JDateChooser stDate, JTextField dptn, JTextField dsgn, JTextField usr,
            JPasswordField pwd) {
        try {
            MainLogin ml =  new MainLogin();
            
            java.util.Date date;

            String sql = "select * from employee where Emp_ID='"+c.getFullNamefromDB()+"'and designation='" +c.getJob()+ "'";
            System.out.println(c.getJob());
            System.out.println(sql);
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                eid.setText(rs.getString("Emp_ID"));
                fname.setText(rs.getString("full_name"));
                iname.setText(rs.getString("name_with_Initial"));
                gender.setText(rs.getString("gender"));
                nic.setText(rs.getString("NIC"));
                dob.setText(rs.getString("birthday"));
                address.setText(rs.getString("address"));
                hno.setText(rs.getString("homenumber"));
                mno.setText(rs.getString("mobile"));
                mail.setText(rs.getString("email"));
                dptn.setText(rs.getString("Department"));
                dsgn.setText(rs.getString("designation"));
                stDate.setDate(rs.getDate("startdate"));
                usr.setText(rs.getString("userName"));
                pwd.setText(rs.getString("Password"));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void LoadScheduleTableToStatusUpdate(JTable table, JLabel validate, JTextField fname, JComboBox interBy, JComboBox status, JButton button) {
        try {
            java.util.Date date;
            int rw = table.getSelectedRow();
            if (rw == -1) {
                validate.setText("**Select a Schedule from table for update Status**");
            } else {
                validate.setText("");
                String tbl_click = (table.getModel().getValueAt(rw, 0).toString());
                String sql = "select * from interview_schedule where interID='" + tbl_click + "'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();

                while (rs.next()) {
                    fname.setText(rs.getString("can_name"));
                    interBy.setEnabled(true);
                    status.setEnabled(true);
                    button.setEnabled(true);
                }
            }
        } catch (SQLException e) {
        }
    }

    public static boolean UpdateInterviewScheduleStatus(String fname, String interviewBy, String cstat) {

        status = false;
        String sql = "update interview_schedule set InterviewBy='" + interviewBy + "',status='" + cstat + "' where can_name='" + fname + "'";
        try {
            pst = conn.prepareStatement(sql);
            pst.execute();
            status = true;
        } catch (SQLException e) {
            status = false;
        }
        return status;
    }

    public void RemoveData(JTable table, JLabel validateLable, String DBtable, String primaryKey) {
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
                    Logger.getLogger(EmployeeManagement.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
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

    public void SearchData(JTable table, JTextField srch, JLabel validate, String sql, String value1, String value2) {
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

    public void CompareDate(JTable table, JButton button) {
        try {
            int rw = table.getSelectedRow();
            String tbl_click = (table.getModel().getValueAt(rw, 0).toString());
            String sql = "select * from interview_schedule where interID='" + tbl_click + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Date RecDate = rs.getDate("date");
                Date todayDate = new Date();
                if (RecDate.before(todayDate)) {
                    button.setEnabled(true);
                } else {
                    button.setEnabled(false);
                }
            }
        } catch (HeadlessException | SQLException e) {
        }
    }

    public void CheckVecancie(JTable table, JButton open, JButton close) {
        try {
            int rw = table.getSelectedRow();
            String tbl_click = (table.getModel().getValueAt(rw, 0).toString());
            String sql = "select * from job where jobid='" + tbl_click + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String availability = rs.getString("Vacancies");
                if (availability.equals("Closed")) {
                    open.setEnabled(true);
                    close.setEnabled(false);
                } else if (availability.equals("Open")) {
                    close.setEnabled(true);
                    open.setEnabled(false);
                }
            }
        } catch (HeadlessException | SQLException e) {
        }
    }

    public void InterScheduleCheckStatus(JTable table, JButton button) {
        try {
            int rw = table.getSelectedRow();
            String tbl_click = (table.getModel().getValueAt(rw, 0).toString());
            String sql = "select * from interview_schedule where interID='" + tbl_click + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String interviewer = rs.getString("InterviewBy");
                String stat = rs.getString("status");
                if (!interviewer.equals("Pending") && stat.equals("Qualified")) {
                    button.setEnabled(true);
                } else {
                    button.setEnabled(false);
                }
            }
        } catch (HeadlessException | SQLException e) {
        }
    }

    public int SalaryCalculater(JTextField basicSal, JTextField ot, JTextField halfDay, JTextField add, JTextField deduct) {
        int total = Integer.parseInt(basicSal.getText()) + Integer.parseInt(ot.getText()) + Integer.parseInt(add.getText()) - Integer.parseInt(halfDay.getText()) - Integer.parseInt(deduct.getText());
        return total;
    }
}
