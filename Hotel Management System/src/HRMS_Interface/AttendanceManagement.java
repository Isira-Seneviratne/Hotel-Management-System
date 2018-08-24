/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRMS_Interface;

import HMS_Database.MyDBConnection;
import HMS_Home.HMS_Methods;
import HRMS_Codes.HR_Methods;
import HRMS_Codes.Hotel;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Prabas Gayadeeptha
 */
public class AttendanceManagement extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
Hotel c = new Hotel();
    java.util.Date date;
    HR_Methods hrm = new HR_Methods();
    String sql = "";

    @SuppressWarnings("LeakingThisInConstructor")
    public AttendanceManagement() {
        initComponents();
        conn = (Connection) MyDBConnection.connectDB();

        HMS_Methods hm = new HMS_Methods();
        hm.unmovableInternal(this);
        HR_Methods.GetTodayAttendance(tbl_attendence, "attendence");
        HR_Methods.GetEmployeeName(tbl_empname);
    }

    public void ButtonEnable(boolean attend, boolean leave, boolean cancel) {
        btn_attend.setEnabled(attend);
        btn_leave.setEnabled(leave);
        btn_cancel.setEnabled(cancel);
    }

    @SuppressWarnings("DeadBranch")
    public void AddAttendence() {
        try {
            boolean status = HR_Methods.InsertAttendanceToDB(txt_atteid.getText(), txt_atteName.getText());
            if (status = true) {
                JOptionPane.showMessageDialog(null, "Attendence Record Seved Successfully");
                HR_Methods.GetTodayAttendance(tbl_attendence, "attendence");
                HR_Methods.GetEmployeeName(tbl_empname);
                txt_atteid.setText(null);
                txt_atteName.setText(null);
                this.ButtonEnable(false, false, false);
            } else {
                JOptionPane.showMessageDialog(null, "Attendence Record cant save");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Can't save record..Check fields and try again");
        }
    }

    public void AddLeave() throws ParseException {
        try {
            boolean status = HR_Methods.InsertLeaveToDB(txt_atteid.getText(), txt_atteName.getText());
            if (status = true) {
                JOptionPane.showMessageDialog(null, "Leave Record Seved Successfully");
                HR_Methods.GetTodayAttendance(tbl_attendence, "attendence");
                HR_Methods.GetEmployeeName(tbl_empname);
                txt_atteid.setText(null);
                txt_atteName.setText(null);
                this.ButtonEnable(false, false, false);
            } else {
                JOptionPane.showMessageDialog(null, "Leave Record cant save");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Can't save record..Check fields and try again");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_attndManagement = new javax.swing.JPanel();
        pnl_viewattnd = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_attendence = new javax.swing.JTable();
        btn_viewallAtt1 = new javax.swing.JButton();
        txt_emp_attsearch = new javax.swing.JTextField();
        btn_attndsearch = new javax.swing.JButton();
        btn_viewallAtt = new javax.swing.JButton();
        lbl_emp_dateValid = new javax.swing.JLabel();
        cmb_attndSearch = new javax.swing.JComboBox<>();
        pnl_addattnd = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_atteid = new javax.swing.JTextField();
        txt_atteName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblattid = new javax.swing.JLabel();
        btn_AttendenceReport = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btn_editattnd1 = new javax.swing.JButton();
        btn_removeattnd = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn_attend = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_empname = new javax.swing.JTable();
        cmb_empSearch = new javax.swing.JComboBox<>();
        txt_empSearch = new javax.swing.JTextField();
        btn_empSearch = new javax.swing.JButton();
        btn_leave = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        lbl_validEmpSearch = new javax.swing.JLabel();
        lbl_attEditRemove = new javax.swing.JLabel();
        emp_background = new javax.swing.JLabel();
        PnlMenu = new javax.swing.JPanel();
        btn_jobMain = new javax.swing.JButton();
        btn_payrollMain = new javax.swing.JButton();
        btn_attendeceMain = new javax.swing.JButton();
        btn_EmployeeMain = new javax.swing.JButton();
        btn_interviewMain = new javax.swing.JButton();
        btn_UserMain = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1200, 680));
        setPreferredSize(new java.awt.Dimension(1200, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_attndManagement.setBackground(new java.awt.Color(255, 255, 255));
        pnl_attndManagement.setMinimumSize(new java.awt.Dimension(1190, 580));
        pnl_attndManagement.setPreferredSize(new java.awt.Dimension(1190, 580));
        pnl_attndManagement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_viewattnd.setBackground(new java.awt.Color(247, 249, 255));
        pnl_viewattnd.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "View Attendence", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        pnl_viewattnd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_attendence.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee_ID", "Employee_Name", "Date", "AttendTime", "LeaveTime", "Type", "WorkingHours", "OThours"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_attendence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_attendenceMouseClicked(evt);
            }
        });
        tbl_attendence.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_attendenceKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_attendence);

        pnl_viewattnd.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 670, 320));

        btn_viewallAtt1.setBackground(new java.awt.Color(255, 255, 255));
        btn_viewallAtt1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_viewallAtt1.setText("Today Attendence");
        btn_viewallAtt1.setBorder(null);
        btn_viewallAtt1.setSelected(true);
        btn_viewallAtt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewallAtt1ActionPerformed(evt);
            }
        });
        pnl_viewattnd.add(btn_viewallAtt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 130, 40));

        txt_emp_attsearch.setForeground(new java.awt.Color(153, 153, 153));
        txt_emp_attsearch.setText("Employee Name");
        txt_emp_attsearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_emp_attsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_emp_attsearchMouseClicked(evt);
            }
        });
        pnl_viewattnd.add(txt_emp_attsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 150, 30));

        btn_attndsearch.setBackground(new java.awt.Color(255, 255, 255));
        btn_attndsearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_attndsearch.setText("Search");
        btn_attndsearch.setBorder(null);
        btn_attndsearch.setSelected(true);
        btn_attndsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_attndsearchActionPerformed(evt);
            }
        });
        pnl_viewattnd.add(btn_attndsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 80, 30));

        btn_viewallAtt.setBackground(new java.awt.Color(255, 255, 255));
        btn_viewallAtt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_viewallAtt.setText("All Attendence");
        btn_viewallAtt.setBorder(null);
        btn_viewallAtt.setSelected(true);
        btn_viewallAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewallAttActionPerformed(evt);
            }
        });
        pnl_viewattnd.add(btn_viewallAtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 130, 40));

        lbl_emp_dateValid.setForeground(new java.awt.Color(255, 0, 0));
        lbl_emp_dateValid.setPreferredSize(new java.awt.Dimension(0, 20));
        pnl_viewattnd.add(lbl_emp_dateValid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 250, -1));

        cmb_attndSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Today", "All" }));
        pnl_viewattnd.add(cmb_attndSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 70, 30));

        pnl_attndManagement.add(pnl_viewattnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 690, 440));

        pnl_addattnd.setBackground(new java.awt.Color(247, 249, 255));
        pnl_addattnd.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Set Attendence", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        pnl_addattnd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Employee Name :");
        pnl_addattnd.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 100, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Employee ID       :");
        pnl_addattnd.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 100, 30));

        txt_atteid.setEditable(false);
        txt_atteid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_atteid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_atteidActionPerformed(evt);
            }
        });
        pnl_addattnd.add(txt_atteid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 210, 30));

        txt_atteName.setEditable(false);
        txt_atteName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_atteName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_atteNameActionPerformed(evt);
            }
        });
        pnl_addattnd.add(txt_atteName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 210, 30));

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_addattnd.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 380, 140));
        pnl_addattnd.add(lblattid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        pnl_attndManagement.add(pnl_addattnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 440, 190));

        btn_AttendenceReport.setBackground(new java.awt.Color(255, 255, 255));
        btn_AttendenceReport.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_AttendenceReport.setText("Attendence Report");
        btn_AttendenceReport.setBorder(null);
        btn_AttendenceReport.setSelected(true);
        btn_AttendenceReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AttendenceReportActionPerformed(evt);
            }
        });
        pnl_attndManagement.add(btn_AttendenceReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 510, 130, 40));
        pnl_attndManagement.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1190, -1));

        btn_editattnd1.setBackground(new java.awt.Color(255, 255, 255));
        btn_editattnd1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_editattnd1.setText("Refresh");
        btn_editattnd1.setBorder(null);
        btn_editattnd1.setSelected(true);
        btn_editattnd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editattnd1ActionPerformed(evt);
            }
        });
        pnl_attndManagement.add(btn_editattnd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 100, 30));

        btn_removeattnd.setBackground(new java.awt.Color(255, 255, 255));
        btn_removeattnd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_removeattnd.setText("Remove Attendence");
        btn_removeattnd.setBorder(null);
        btn_removeattnd.setSelected(true);
        btn_removeattnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeattndActionPerformed(evt);
            }
        });
        pnl_attndManagement.add(btn_removeattnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 510, 130, 40));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 174, 239));
        jButton4.setText("Logout");
        jButton4.setBorder(null);
        jButton4.setOpaque(false);
        jButton4.setPreferredSize(new java.awt.Dimension(110, 25));
        jButton4.setSelected(true);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pnl_attndManagement.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, -1, 50));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 174, 239));
        jButton5.setText("Home");
        jButton5.setBorder(null);
        jButton5.setPreferredSize(new java.awt.Dimension(110, 25));
        jButton5.setSelected(true);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        pnl_attndManagement.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, -1, 50));

        btn_attend.setBackground(new java.awt.Color(255, 255, 255));
        btn_attend.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_attend.setText("Attend");
        btn_attend.setBorder(null);
        btn_attend.setEnabled(false);
        btn_attend.setSelected(true);
        btn_attend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_attendActionPerformed(evt);
            }
        });
        pnl_attndManagement.add(btn_attend, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 90, 30));

        jPanel1.setBackground(new java.awt.Color(247, 249, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Employee", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_empname.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "employeeID", "employeeName"
            }
        ));
        tbl_empname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_empnameMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_empname);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 440, 130));

        cmb_empSearch.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        cmb_empSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by ID", "Search by Name" }));
        cmb_empSearch.setPreferredSize(new java.awt.Dimension(140, 30));
        cmb_empSearch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_empSearchItemStateChanged(evt);
            }
        });
        cmb_empSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_empSearchActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_empSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, 30));

        txt_empSearch.setForeground(new java.awt.Color(153, 153, 153));
        txt_empSearch.setText("Employee ID");
        txt_empSearch.setPreferredSize(new java.awt.Dimension(130, 30));
        txt_empSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_empSearchMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_empSearchMouseExited(evt);
            }
        });
        jPanel1.add(txt_empSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 130, 30));

        btn_empSearch.setBackground(new java.awt.Color(255, 255, 255));
        btn_empSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_empSearch.setText("Search");
        btn_empSearch.setBorder(null);
        btn_empSearch.setPreferredSize(new java.awt.Dimension(90, 30));
        btn_empSearch.setSelected(true);
        btn_empSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_empSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 90, 30));

        pnl_attndManagement.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 460, 200));

        btn_leave.setBackground(new java.awt.Color(255, 255, 255));
        btn_leave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_leave.setText("Leave");
        btn_leave.setBorder(null);
        btn_leave.setEnabled(false);
        btn_leave.setSelected(true);
        btn_leave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_leaveActionPerformed(evt);
            }
        });
        pnl_attndManagement.add(btn_leave, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 90, 30));

        btn_cancel.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.setBorder(null);
        btn_cancel.setEnabled(false);
        btn_cancel.setSelected(true);
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        pnl_attndManagement.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 90, 30));

        lbl_validEmpSearch.setForeground(new java.awt.Color(255, 0, 0));
        pnl_attndManagement.add(lbl_validEmpSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 514, 300, 20));

        lbl_attEditRemove.setForeground(new java.awt.Color(255, 0, 0));
        lbl_attEditRemove.setPreferredSize(new java.awt.Dimension(0, 20));
        pnl_attndManagement.add(lbl_attEditRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 430, -1));

        emp_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MainBackForAll.jpg"))); // NOI18N
        emp_background.setPreferredSize(new java.awt.Dimension(1190, 570));
        pnl_attndManagement.add(emp_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 580));

        getContentPane().add(pnl_attndManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        PnlMenu.setPreferredSize(new java.awt.Dimension(1200, 100));
        PnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_jobMain.setBackground(new java.awt.Color(255, 255, 255));
        btn_jobMain.setForeground(new java.awt.Color(0, 174, 239));
        btn_jobMain.setText("Job Analysis");
        btn_jobMain.setBorder(null);
        btn_jobMain.setContentAreaFilled(false);
        btn_jobMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_jobMain.setOpaque(true);
        btn_jobMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_jobMainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_jobMainMouseExited(evt);
            }
        });
        btn_jobMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jobMainActionPerformed(evt);
            }
        });
        PnlMenu.add(btn_jobMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, 190, 30));

        btn_payrollMain.setBackground(new java.awt.Color(255, 255, 255));
        btn_payrollMain.setForeground(new java.awt.Color(0, 174, 239));
        btn_payrollMain.setText("Payroll");
        btn_payrollMain.setBorder(null);
        btn_payrollMain.setContentAreaFilled(false);
        btn_payrollMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_payrollMain.setOpaque(true);
        btn_payrollMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_payrollMainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_payrollMainMouseExited(evt);
            }
        });
        btn_payrollMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payrollMainActionPerformed(evt);
            }
        });
        PnlMenu.add(btn_payrollMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 200, 30));

        btn_attendeceMain.setBackground(new java.awt.Color(255, 255, 255));
        btn_attendeceMain.setForeground(new java.awt.Color(0, 174, 239));
        btn_attendeceMain.setText("Attendence");
        btn_attendeceMain.setBorder(null);
        btn_attendeceMain.setContentAreaFilled(false);
        btn_attendeceMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_attendeceMain.setOpaque(true);
        btn_attendeceMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_attendeceMainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_attendeceMainMouseExited(evt);
            }
        });
        btn_attendeceMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_attendeceMainActionPerformed(evt);
            }
        });
        PnlMenu.add(btn_attendeceMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 200, 30));

        btn_EmployeeMain.setBackground(new java.awt.Color(255, 255, 255));
        btn_EmployeeMain.setForeground(new java.awt.Color(0, 174, 239));
        btn_EmployeeMain.setText("Employee");
        btn_EmployeeMain.setBorder(null);
        btn_EmployeeMain.setContentAreaFilled(false);
        btn_EmployeeMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_EmployeeMain.setOpaque(true);
        btn_EmployeeMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_EmployeeMainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_EmployeeMainMouseExited(evt);
            }
        });
        btn_EmployeeMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EmployeeMainActionPerformed(evt);
            }
        });
        PnlMenu.add(btn_EmployeeMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 200, 30));

        btn_interviewMain.setBackground(new java.awt.Color(255, 255, 255));
        btn_interviewMain.setForeground(new java.awt.Color(0, 174, 239));
        btn_interviewMain.setText("Interview & Candidate");
        btn_interviewMain.setBorder(null);
        btn_interviewMain.setContentAreaFilled(false);
        btn_interviewMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_interviewMain.setOpaque(true);
        btn_interviewMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_interviewMainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_interviewMainMouseExited(evt);
            }
        });
        btn_interviewMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_interviewMainActionPerformed(evt);
            }
        });
        PnlMenu.add(btn_interviewMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 200, 30));

        btn_UserMain.setBackground(new java.awt.Color(255, 255, 255));
        btn_UserMain.setForeground(new java.awt.Color(0, 174, 239));
        btn_UserMain.setText("User");
        btn_UserMain.setBorder(null);
        btn_UserMain.setContentAreaFilled(false);
        btn_UserMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_UserMain.setOpaque(true);
        btn_UserMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UserMainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UserMainMouseExited(evt);
            }
        });
        btn_UserMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UserMainActionPerformed(evt);
            }
        });
        PnlMenu.add(btn_UserMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 200, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MenuBar_Back_Main_HR.jpg"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(1190, 75));
        jLabel7.setMinimumSize(new java.awt.Dimension(1190, 75));
        jLabel7.setPreferredSize(new java.awt.Dimension(1190, 75));
        PnlMenu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_viewallAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewallAttActionPerformed
        HR_Methods.LoadTable(tbl_attendence, "attendence", "Date");
    }//GEN-LAST:event_btn_viewallAttActionPerformed

    private void txt_atteidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_atteidActionPerformed
    }//GEN-LAST:event_txt_atteidActionPerformed

    private void txt_atteNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_atteNameActionPerformed
    }//GEN-LAST:event_txt_atteNameActionPerformed

    private void btn_attendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_attendActionPerformed
        this.AddAttendence();
    }//GEN-LAST:event_btn_attendActionPerformed

    private void btn_leaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_leaveActionPerformed
        try {
            this.AddLeave();
        } catch (ParseException ex) {
            Logger.getLogger(AttendanceManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_leaveActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        txt_atteid.setText(null);
        txt_atteName.setText(null);
        this.ButtonEnable(false, false, false);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_removeattndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeattndActionPerformed
        hrm.RemoveData(tbl_attendence, lbl_attEditRemove, "attendence", "attID");
        HR_Methods.GetTodayAttendance(tbl_attendence, "attendence");
        HR_Methods.GetEmployeeName(tbl_empname);
    }//GEN-LAST:event_btn_removeattndActionPerformed

    private void txt_emp_attsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_emp_attsearchMouseClicked
        // TODO add your handling code here:
        txt_emp_attsearch.setText(null);
        txt_emp_attsearch.setForeground(Color.BLACK);
    }//GEN-LAST:event_txt_emp_attsearchMouseClicked

    private void btn_attndsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_attndsearchActionPerformed
        // TODO add your handling code here:
        String method = cmb_attndSearch.getSelectedItem().toString();
        if (method.equals("Today")) {
            sql = "SELECT * FROM attendence where eName LIKE '" + txt_emp_attsearch.getText() + "%' and Date=CURDATE()";
            hrm.SearchData(tbl_attendence, txt_emp_attsearch, lbl_emp_dateValid, sql, "", "Employee Name");
        } else if (method.equals("All")) {
            sql = "select * from attendence where eName LIKE '" + txt_emp_attsearch.getText() + "%'";
            hrm.SearchData(tbl_attendence, txt_emp_attsearch, lbl_emp_dateValid, sql, "", "Employee Name");
        }
    }//GEN-LAST:event_btn_attndsearchActionPerformed

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        Color blueColor = new Color(0, 174, 239);
        jButton4.setBackground(blueColor);
        jButton4.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        Color grColor = new Color(240, 240, 240);
        Color blueColor = new Color(0, 174, 239);
        jButton4.setBackground(grColor);
        jButton4.setForeground(blueColor);
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String ObjButtons[] = {"Yes", "No"};
        int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to Logout?", "Logout Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
        if (PromptResult == JOptionPane.YES_OPTION) {
            MainLogin lg = new MainLogin();
            JDesktopPane desktopPane = getDesktopPane();
            desktopPane.add(lg).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseEntered

    private void cmb_empSearchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_empSearchItemStateChanged

        String select = cmb_empSearch.getSelectedItem().toString();
        if (select.equals("Search by ID")) {
            txt_empSearch.setText("Employee ID");
            Color grayColor = new Color(153, 153, 153);
            txt_empSearch.setForeground(grayColor);
        } else if (select.equals("Search by Name")) {
            txt_empSearch.setText("Employee Name");
            Color grayColor = new Color(153, 153, 153);
            txt_empSearch.setForeground(grayColor);
        }
    }//GEN-LAST:event_cmb_empSearchItemStateChanged

    private void cmb_empSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_empSearchActionPerformed

    }//GEN-LAST:event_cmb_empSearchActionPerformed

    private void txt_empSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_empSearchMouseClicked
        // TODO add your handling code here:
        txt_empSearch.setText(null);
        txt_empSearch.setForeground(Color.BLACK);
    }//GEN-LAST:event_txt_empSearchMouseClicked

    private void txt_empSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_empSearchMouseExited

    }//GEN-LAST:event_txt_empSearchMouseExited

    private void btn_empSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empSearchActionPerformed
        String select = cmb_empSearch.getSelectedItem().toString();
        if (select.equals("Search by ID")) {
            sql = "select Emp_ID, full_name from employee where Emp_ID LIKE '" + txt_empSearch.getText() + "%'";
            hrm.SearchData(tbl_empname, txt_empSearch, lbl_validEmpSearch, sql, "", "Employee ID");
        } else if (select.equals("Search by Name")) {
            sql = "select Emp_ID, full_name from employee where full_name LIKE '" + txt_empSearch.getText() + "%'";
            hrm.SearchData(tbl_empname, txt_empSearch, lbl_validEmpSearch, sql, "", "Employee Name");
        }
    }//GEN-LAST:event_btn_empSearchActionPerformed

    private void btn_editattnd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editattnd1ActionPerformed
        HR_Methods.GetEmployeeName(tbl_empname);
    }//GEN-LAST:event_btn_editattnd1ActionPerformed

    private void btn_jobMainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jobMainMouseEntered
        // TODO add your handling code here:
        Color blueColor = new Color(0, 174, 239);
        btn_jobMain.setBackground(blueColor);
        btn_jobMain.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_jobMainMouseEntered

    private void btn_jobMainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jobMainMouseExited
        // TODO add your handling code here:
        Color whColor = new Color(255, 255, 255);
        Color blueColor = new Color(0, 174, 239);
        btn_jobMain.setBackground(whColor);
        btn_jobMain.setForeground(blueColor);
    }//GEN-LAST:event_btn_jobMainMouseExited

    private void btn_jobMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jobMainActionPerformed
        // TODO add your handling code here:
        JobAnalysis ja = new JobAnalysis();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(ja).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_jobMainActionPerformed

    private void btn_payrollMainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_payrollMainMouseEntered
        // TODO add your handling code here:
        Color blueColor = new Color(0, 174, 239);
        btn_payrollMain.setBackground(blueColor);
        btn_payrollMain.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_payrollMainMouseEntered

    private void btn_payrollMainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_payrollMainMouseExited
        // TODO add your handling code here:
        Color whColor = new Color(255, 255, 255);
        Color blueColor = new Color(0, 174, 239);
        btn_payrollMain.setBackground(whColor);
        btn_payrollMain.setForeground(blueColor);
    }//GEN-LAST:event_btn_payrollMainMouseExited

    private void btn_payrollMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payrollMainActionPerformed
        // TODO add your handling code here:
        Payroll pr = new Payroll();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(pr).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_payrollMainActionPerformed

    private void btn_attendeceMainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_attendeceMainMouseEntered
        // TODO add your handling code here:
        Color blueColor = new Color(0, 174, 239);
        btn_attendeceMain.setBackground(blueColor);
        btn_attendeceMain.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_attendeceMainMouseEntered

    private void btn_attendeceMainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_attendeceMainMouseExited
        // TODO add your handling code here:
        Color whColor = new Color(255, 255, 255);
        Color blueColor = new Color(0, 174, 239);
        btn_attendeceMain.setBackground(whColor);
        btn_attendeceMain.setForeground(blueColor);
    }//GEN-LAST:event_btn_attendeceMainMouseExited

    private void btn_attendeceMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_attendeceMainActionPerformed
        // TODO add your handling code here:
        AttendanceManagement am = new AttendanceManagement();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(am).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_attendeceMainActionPerformed

    private void btn_EmployeeMainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EmployeeMainMouseEntered
        // TODO add your handling code here:
        Color blueColor = new Color(0, 174, 239);
        btn_EmployeeMain.setBackground(blueColor);
        btn_EmployeeMain.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_EmployeeMainMouseEntered

    private void btn_EmployeeMainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EmployeeMainMouseExited
        // TODO add your handling code here:
        Color whColor = new Color(255, 255, 255);
        Color blueColor = new Color(0, 174, 239);
        btn_EmployeeMain.setBackground(whColor);
        btn_EmployeeMain.setForeground(blueColor);
    }//GEN-LAST:event_btn_EmployeeMainMouseExited

    private void btn_EmployeeMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EmployeeMainActionPerformed
        // TODO add your handling code here:
        EmployeeManagement em = new EmployeeManagement();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(em).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_EmployeeMainActionPerformed

    private void btn_interviewMainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_interviewMainMouseEntered
        // TODO add your handling code here:
        Color blueColor = new Color(0, 174, 239);
        btn_interviewMain.setBackground(blueColor);
        btn_interviewMain.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_interviewMainMouseEntered

    private void btn_interviewMainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_interviewMainMouseExited
        // TODO add your handling code here:
        Color whColor = new Color(255, 255, 255);
        Color blueColor = new Color(0, 174, 239);
        btn_interviewMain.setBackground(whColor);
        btn_interviewMain.setForeground(blueColor);
    }//GEN-LAST:event_btn_interviewMainMouseExited

    private void btn_interviewMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_interviewMainActionPerformed
        // TODO add your handling code here:
        InterviewManagement im = new InterviewManagement();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(im).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_interviewMainActionPerformed

    private void btn_UserMainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserMainMouseEntered
        // TODO add your handling code here:
        Color blueColor = new Color(0, 174, 239);
        btn_UserMain.setBackground(blueColor);
        btn_UserMain.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_UserMainMouseEntered

    private void btn_UserMainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserMainMouseExited
        // TODO add your handling code here:
        Color whColor = new Color(255, 255, 255);
        Color blueColor = new Color(0, 174, 239);
        btn_UserMain.setBackground(whColor);
        btn_UserMain.setForeground(blueColor);
    }//GEN-LAST:event_btn_UserMainMouseExited

    private void btn_UserMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UserMainActionPerformed
        // TODO add your handling code here:
        UserManagement um = new UserManagement();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(um).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_UserMainActionPerformed

    private void tbl_empnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_empnameMouseClicked
        hrm.LoadEmployeeNameToAttendance(tbl_empname, txt_atteid, txt_atteName);
        this.ButtonEnable(true, false, true);
    }//GEN-LAST:event_tbl_empnameMouseClicked

    private void btn_viewallAtt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewallAtt1ActionPerformed
        HR_Methods.GetTodayAttendance(tbl_attendence, "attendence");
    }//GEN-LAST:event_btn_viewallAtt1ActionPerformed

    private void tbl_attendenceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_attendenceKeyPressed
    }//GEN-LAST:event_tbl_attendenceKeyPressed

    private void tbl_attendenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_attendenceMouseClicked
        txt_atteid.setText(null);
        txt_atteName.setText(null);
        hrm.LoadEmployeeNameToLeave(tbl_attendence, txt_atteid, txt_atteName);
        if(txt_atteid.getText().isEmpty() || txt_atteName.getText().isEmpty()){
            this.ButtonEnable(false, false, false);
        }
        else{
            this.ButtonEnable(false, true, true);
        }
    }//GEN-LAST:event_tbl_attendenceMouseClicked

    private void btn_AttendenceReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AttendenceReportActionPerformed
        // TODO add your handling code here:
        try {
            String report = "D:\\SLIIT\\2nd Year\\2nd Semester\\ITP - Information Technology Project\\Project\\Hotel_Management_System(Selsan)\\attendence.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(report);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            JasperViewer.viewReport(jp, false);
        } catch (JRException e) {
        }
    }//GEN-LAST:event_btn_AttendenceReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlMenu;
    private javax.swing.JButton btn_AttendenceReport;
    private javax.swing.JButton btn_EmployeeMain;
    private javax.swing.JButton btn_UserMain;
    private javax.swing.JButton btn_attend;
    private javax.swing.JButton btn_attendeceMain;
    private javax.swing.JButton btn_attndsearch;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_editattnd1;
    private javax.swing.JButton btn_empSearch;
    private javax.swing.JButton btn_interviewMain;
    private javax.swing.JButton btn_jobMain;
    private javax.swing.JButton btn_leave;
    private javax.swing.JButton btn_payrollMain;
    private javax.swing.JButton btn_removeattnd;
    private javax.swing.JButton btn_viewallAtt;
    private javax.swing.JButton btn_viewallAtt1;
    private javax.swing.JComboBox<String> cmb_attndSearch;
    private javax.swing.JComboBox<String> cmb_empSearch;
    private javax.swing.JLabel emp_background;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_attEditRemove;
    private javax.swing.JLabel lbl_emp_dateValid;
    private javax.swing.JLabel lbl_validEmpSearch;
    private javax.swing.JLabel lblattid;
    private javax.swing.JPanel pnl_addattnd;
    private javax.swing.JPanel pnl_attndManagement;
    private javax.swing.JPanel pnl_viewattnd;
    private javax.swing.JTable tbl_attendence;
    private javax.swing.JTable tbl_empname;
    private javax.swing.JTextField txt_atteName;
    private javax.swing.JTextField txt_atteid;
    private javax.swing.JTextField txt_empSearch;
    private javax.swing.JTextField txt_emp_attsearch;
    // End of variables declaration//GEN-END:variables
}
