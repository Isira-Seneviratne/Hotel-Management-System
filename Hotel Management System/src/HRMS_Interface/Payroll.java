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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
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
public class Payroll extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Hotel c = new Hotel();
    HR_Methods hrm = new HR_Methods();
    java.util.Date date;

    public Payroll() {
        initComponents();
        conn = (Connection) MyDBConnection.connectDB();

        HMS_Methods hm = new HMS_Methods();
        hm.unmovableInternal(this);
        HR_Methods.getAttendenceDetatils(tbt_empDetails);
        HR_Methods.getThisMonthPayments(tbl_payments, "sal_payment");
    }

    public void AddPayment() {
        boolean status = HR_Methods.InsertSalaryPaymentToDB(txt_eid.getText(), txt_ename.getText(), txt_month.getText(), txt_total.getText());
        if (status = true) {
            JOptionPane.showMessageDialog(null, "Payment record saved succesfully");
            btn_cancel.setEnabled(false);
            btn_pay.setEnabled(false);
            this.emptyPaymentForm();
            HR_Methods.getAttendenceDetatils(tbt_empDetails);
            HR_Methods.getThisMonthPayments(tbl_payments, "sal_payment");
        } else {
            JOptionPane.showMessageDialog(null, "Cant save");
        }
    }

    public void emptyPaymentForm() {
        txt_eid.setText(null);
        txt_ename.setText(null);
        txt_month.setText(null);
        txt_bSal.setText(null);
        txt_ot.setText(null);
        txt_add.setText(null);
        txt_total.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_payments = new javax.swing.JTable();
        txt_paySearch = new javax.swing.JTextField();
        btn_paySearch = new javax.swing.JButton();
        btn_thisMonth = new javax.swing.JButton();
        lbl_SearchpayrttblVal = new javax.swing.JLabel();
        btn_viewAll = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbt_empDetails = new javax.swing.JTable();
        txt_empSearch = new javax.swing.JTextField();
        btn_empSearch = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        lbl_SearchEmpVal = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        txt_eid = new javax.swing.JTextField();
        txt_deduction = new javax.swing.JTextField();
        txt_add = new javax.swing.JTextField();
        txt_ename = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_ot = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_bSal = new javax.swing.JTextField();
        lbl_att = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_hDay = new javax.swing.JTextField();
        txt_month = new javax.swing.JTextField();
        btn_calTotal = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_reportPay = new javax.swing.JButton();
        btn_remove = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_pay = new javax.swing.JButton();
        lbl_payrttblVal = new javax.swing.JLabel();
        emp_background4 = new javax.swing.JLabel();
        PnlMenu = new javax.swing.JPanel();
        btn_jobMain = new javax.swing.JButton();
        btn_payrollMain = new javax.swing.JButton();
        btn_attendeceMain = new javax.swing.JButton();
        btn_EmployeeMain = new javax.swing.JButton();
        btn_interviewMain = new javax.swing.JButton();
        btn_UserMain = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1200, 680));
        setPreferredSize(new java.awt.Dimension(1200, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setMinimumSize(new java.awt.Dimension(1190, 580));
        jPanel2.setPreferredSize(new java.awt.Dimension(1190, 580));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(247, 249, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Employee Salary Payments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_payments.setBackground(new java.awt.Color(245, 249, 252));
        tbl_payments.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_payments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmployeeID", "EmployeeName", "Month", "TotalSalary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_payments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_paymentsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_payments);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 690, 170));

        txt_paySearch.setForeground(new java.awt.Color(109, 109, 109));
        txt_paySearch.setText("Employee Name");
        txt_paySearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_paySearchMouseClicked(evt);
            }
        });
        txt_paySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_paySearchActionPerformed(evt);
            }
        });
        jPanel3.add(txt_paySearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 130, 30));

        btn_paySearch.setBackground(new java.awt.Color(255, 255, 255));
        btn_paySearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_paySearch.setText("Search");
        btn_paySearch.setBorder(null);
        btn_paySearch.setSelected(true);
        btn_paySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paySearchActionPerformed(evt);
            }
        });
        jPanel3.add(btn_paySearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 70, 30));

        btn_thisMonth.setBackground(new java.awt.Color(255, 255, 255));
        btn_thisMonth.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_thisMonth.setText("This Month");
        btn_thisMonth.setBorder(null);
        btn_thisMonth.setSelected(true);
        btn_thisMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thisMonthActionPerformed(evt);
            }
        });
        jPanel3.add(btn_thisMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 120, 40));

        lbl_SearchpayrttblVal.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(lbl_SearchpayrttblVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 200, 20));

        btn_viewAll.setBackground(new java.awt.Color(255, 255, 255));
        btn_viewAll.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_viewAll.setText("View All Payments");
        btn_viewAll.setBorder(null);
        btn_viewAll.setSelected(true);
        btn_viewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewAllActionPerformed(evt);
            }
        });
        jPanel3.add(btn_viewAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 120, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 730, 260));

        jPanel1.setBackground(new java.awt.Color(247, 249, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Employee Salary Payments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbt_empDetails.setBackground(new java.awt.Color(245, 249, 252));
        tbt_empDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbt_empDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmployeeID", "EmployeeName", "Month", "ot hrs", "AttendCount", "No Of Half Day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbt_empDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbt_empDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbt_empDetails);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 690, 110));

        txt_empSearch.setForeground(new java.awt.Color(109, 109, 109));
        txt_empSearch.setText("Employee Name");
        txt_empSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_empSearchMouseClicked(evt);
            }
        });
        txt_empSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_empSearchActionPerformed(evt);
            }
        });
        jPanel1.add(txt_empSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 130, 30));

        btn_empSearch.setBackground(new java.awt.Color(255, 255, 255));
        btn_empSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_empSearch.setText("Search");
        btn_empSearch.setBorder(null);
        btn_empSearch.setSelected(true);
        btn_empSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_empSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 70, 30));

        btn_refresh.setBackground(new java.awt.Color(255, 255, 255));
        btn_refresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_refresh.setText("Refresh");
        btn_refresh.setBorder(null);
        btn_refresh.setSelected(true);
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        jPanel1.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 110, 40));

        lbl_SearchEmpVal.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lbl_SearchEmpVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 200, 20));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 730, 200));

        jPanel4.setBackground(new java.awt.Color(247, 249, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Payment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Employee ID");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 120, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Additional(+Bonus)");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 120, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText(" Deduction(-)");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 80, 30));
        jPanel4.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 130, 30));

        txt_eid.setEditable(false);
        txt_eid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_eidActionPerformed(evt);
            }
        });
        jPanel4.add(txt_eid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 200, 30));

        txt_deduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_deductionActionPerformed(evt);
            }
        });
        jPanel4.add(txt_deduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 60, 30));

        txt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addActionPerformed(evt);
            }
        });
        jPanel4.add(txt_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 60, 30));

        txt_ename.setEditable(false);
        jPanel4.add(txt_ename, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 200, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Employee Name");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, 30));

        txt_ot.setEditable(false);
        jPanel4.add(txt_ot, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 200, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("O/T Amount(+)");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Basic Salary");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 120, 30));

        txt_bSal.setEditable(false);
        jPanel4.add(txt_bSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 200, 30));

        lbl_att.setForeground(new java.awt.Color(255, 0, 0));
        lbl_att.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel4.add(lbl_att, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 270, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Half Day Amont(-)");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 120, 30));

        txt_hDay.setEditable(false);
        jPanel4.add(txt_hDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 200, 30));

        txt_month.setEditable(false);
        txt_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_monthActionPerformed(evt);
            }
        });
        jPanel4.add(txt_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 200, 30));

        btn_calTotal.setText("Calculate Total");
        btn_calTotal.setEnabled(false);
        btn_calTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calTotalActionPerformed(evt);
            }
        });
        jPanel4.add(btn_calTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 120, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Month");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 120, 30));

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 430));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 400, 470));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 1190, 10));

        btn_reportPay.setBackground(new java.awt.Color(255, 255, 255));
        btn_reportPay.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_reportPay.setText("Pay Report");
        btn_reportPay.setBorder(null);
        btn_reportPay.setSelected(true);
        btn_reportPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportPayActionPerformed(evt);
            }
        });
        jPanel2.add(btn_reportPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 530, 110, 40));

        btn_remove.setBackground(new java.awt.Color(255, 255, 255));
        btn_remove.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_remove.setText("Remove");
        btn_remove.setBorder(null);
        btn_remove.setSelected(true);
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 530, 110, 40));

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
        jPanel2.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, 110, 40));

        btn_pay.setBackground(new java.awt.Color(255, 255, 255));
        btn_pay.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_pay.setText("Pay");
        btn_pay.setBorder(null);
        btn_pay.setEnabled(false);
        btn_pay.setSelected(true);
        btn_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payActionPerformed(evt);
            }
        });
        jPanel2.add(btn_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 110, 40));

        lbl_payrttblVal.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(lbl_payrttblVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 620, 20));

        emp_background4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MainBackForAll.jpg"))); // NOI18N
        emp_background4.setPreferredSize(new java.awt.Dimension(1190, 570));
        jPanel2.add(emp_background4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 580));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

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
        PnlMenu.add(btn_jobMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 40, 190, 30));

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
        PnlMenu.add(btn_payrollMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 190, 30));

        btn_attendeceMain.setBackground(new java.awt.Color(255, 255, 255));
        btn_attendeceMain.setForeground(new java.awt.Color(0, 174, 239));
        btn_attendeceMain.setText("Attendance");
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
        PnlMenu.add(btn_attendeceMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 190, 30));

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
        PnlMenu.add(btn_EmployeeMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 190, 30));

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
        PnlMenu.add(btn_interviewMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 190, 30));

        btn_UserMain.setBackground(new java.awt.Color(255, 255, 255));
        btn_UserMain.setForeground(new java.awt.Color(0, 174, 239));
        btn_UserMain.setText("User");
        btn_UserMain.setBorder(null);
        btn_UserMain.setContentAreaFilled(false);
        btn_UserMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_UserMain.setOpaque(true);
        btn_UserMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UserMainMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UserMainMouseEntered(evt);
            }
        });
        btn_UserMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UserMainActionPerformed(evt);
            }
        });
        PnlMenu.add(btn_UserMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MenuBar_Back_Main_HR.jpg"))); // NOI18N
        jLabel17.setMaximumSize(new java.awt.Dimension(1190, 75));
        jLabel17.setMinimumSize(new java.awt.Dimension(1190, 75));
        jLabel17.setPreferredSize(new java.awt.Dimension(1190, 75));
        PnlMenu.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payActionPerformed
        this.AddPayment();
    }//GEN-LAST:event_btn_payActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        this.emptyPaymentForm();
        btn_cancel.setEnabled(false);
        btn_pay.setEnabled(false);

    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        HR_Methods.getAttendenceDetatils(tbt_empDetails);
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void tbt_empDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbt_empDetailsMouseClicked
        hrm.LoadSalaryDetailsToForm(tbt_empDetails, lbl_payrttblVal, txt_eid, txt_ename, txt_month, txt_bSal, txt_ot, txt_hDay);
        txt_add.setText("0");
        txt_deduction.setText("0");
        btn_calTotal.setEnabled(true);
    }//GEN-LAST:event_tbt_empDetailsMouseClicked

    private void txt_eidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_eidActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:

            String search = txt_eid.getText();

            String sql = "Select e.full_name,j.jobid from employee e,job j where e.designation=j.jName AND e.Emp_ID LIKE '" + search + "' AND j.jobid LIKE '";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (!rs.isBeforeFirst()) {
                lbl_att.setText("**Enter valid Employee ID**");
            } else {
                lbl_att.setText(null);

                while (rs.next()) {

                    String ename = rs.getString("full_name");
                    txt_ename.setText(ename);

                }

            }

        } catch (SQLException e) {

        }
    }//GEN-LAST:event_txt_eidActionPerformed

    private void txt_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_monthActionPerformed
        // TODO add your handling code here:
        String mnth = txt_month.getText();

        try {
            String sql = "select e.full_name, SUM(a.otHours) as OTr, sum(a.att_type='Half Day') as Hr\n"
                    + "from attendence a join employee e on a.empid=e.Emp_ID\n"
                    + "where MONTH(a.Date)='" + mnth + "'\n"
                    + "Group by e.full_name ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (!rs.isBeforeFirst()) {
//                lbl_att1.setText("**Enter valid Month**");
            } else {
                //     lbl_att1.setText(null);

                while (rs.next()) {

                    //       String hdhr = jTextField8.getText();
                    //      String othr = jTextField7.getText();
                    //     String hday = rs.getString("Hr");
                    //      String othrs = rs.getString("OTr");
//
                    //     int hdhour = Integer.parseInt(hdhr);
                    //    int othour = Integer.parseInt(othr);
                    //  int hd = Integer.parseInt(hday);
                    //   int o_t = Integer.parseInt(othrs);
                    //  int finHalfDAy = hdhour * hd;
                    //  int finotR = othour * o_t;
                    //  jTextField9.setText(Integer.toString(finHalfDAy));
                    // jTextField10.setText(Integer.toString(finotR));
                }

            }
        } catch (SQLException e) {
        }


    }//GEN-LAST:event_txt_monthActionPerformed

    private void txt_deductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_deductionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_deductionActionPerformed

    private void txt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addActionPerformed
        // TODO add your handling code here:
        String deduc = txt_add.getText();
        // String bsal = jTextField6.getText();
        String ot = txt_ot.getText();
        String hday = txt_bSal.getText();
        String addi = txt_deduction.getText();

        int deduction = Integer.parseInt(deduc);
        //  int basicsalary = Integer.parseInt(bsal);
        int overtime = Integer.parseInt(ot);
        int halfday = Integer.parseInt(hday);
        int addition = Integer.parseInt(addi);

        //  int total = basicsalary + overtime + addition - deduction;
        //  jTextField11.setText(Integer.toString(total));

    }//GEN-LAST:event_txt_addActionPerformed

    private void btn_empSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empSearchActionPerformed
        String sql = "SELECT attendence.empid, attendence.eName, EXTRACT(MONTH FROM CURDATE()) 'Month', SUM(attendence.att_type='Full Day') 'aCount',"
                + " SUM(attendence.att_type='Half Day') 'hCount', SUM(attendence.otHours) 'ot' from attendence "
                + "where eName LIKE '" + txt_empSearch.getText() + "%'and EXTRACT(MONTH FROM attendence.Date)=EXTRACT(MONTH FROM CURDATE()) and eName NOT IN(Select sal_payment.employeeName from sal_payment "
                + "where attendence.eName=sal_payment.employeeName) group by attendence.eName,attendence.empid";
        hrm.SearchData(tbt_empDetails, txt_empSearch, lbl_SearchEmpVal, sql, "", "Employee Name");
    }//GEN-LAST:event_btn_empSearchActionPerformed

    private void txt_empSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_empSearchMouseClicked
        // TODO add your handling code here:
        txt_empSearch.setText(null);
        txt_empSearch.setForeground(Color.BLACK);
    }//GEN-LAST:event_txt_empSearchMouseClicked

    private void txt_empSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_empSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_empSearchActionPerformed

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

    private void tbl_paymentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_paymentsMouseClicked

    }//GEN-LAST:event_tbl_paymentsMouseClicked

    private void txt_paySearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_paySearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_paySearchMouseClicked

    private void txt_paySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_paySearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_paySearchActionPerformed

    private void btn_paySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paySearchActionPerformed
        String sql = "Select * from sal_payment where employeeName LIKE '" + txt_paySearch.getText() + "%'";
        hrm.SearchData(tbl_payments, txt_paySearch, lbl_SearchpayrttblVal, sql, "", "Employee Name");
    }//GEN-LAST:event_btn_paySearchActionPerformed

    private void btn_thisMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thisMonthActionPerformed
        HR_Methods.getThisMonthPayments(tbl_payments, "sal_payment");
    }//GEN-LAST:event_btn_thisMonthActionPerformed

    private void btn_viewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewAllActionPerformed
        HR_Methods.loadTable(tbl_payments, "sal_payment", "Month");
    }//GEN-LAST:event_btn_viewAllActionPerformed

    private void btn_calTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calTotalActionPerformed
        int total = hrm.SalaryCalculater(txt_bSal, txt_ot, txt_hDay, txt_add, txt_deduction);
        txt_total.setText(String.valueOf(total));
        btn_cancel.setEnabled(true);
        btn_pay.setEnabled(true);
    }//GEN-LAST:event_btn_calTotalActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        hrm.RemoveData(tbl_payments, lbl_payrttblVal, "sal_payment", "paymentID");
        HR_Methods.getAttendenceDetatils(tbt_empDetails);
        HR_Methods.getThisMonthPayments(tbl_payments, "sal_payment");
    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_reportPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportPayActionPerformed
         try {
            String report = "D:\\SLIIT\\2nd Year\\2nd Semester\\ITP - Information Technology Project\\Project\\Hotel_Management_System(Selsan)\\PaymentSalary.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(report);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            JasperViewer.viewReport(jp, false);
        } catch (JRException e) {
        }
    
    }//GEN-LAST:event_btn_reportPayActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlMenu;
    private javax.swing.JButton btn_EmployeeMain;
    private javax.swing.JButton btn_UserMain;
    private javax.swing.JButton btn_attendeceMain;
    private javax.swing.JButton btn_calTotal;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_empSearch;
    private javax.swing.JButton btn_interviewMain;
    private javax.swing.JButton btn_jobMain;
    private javax.swing.JButton btn_pay;
    private javax.swing.JButton btn_paySearch;
    private javax.swing.JButton btn_payrollMain;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_reportPay;
    private javax.swing.JButton btn_thisMonth;
    private javax.swing.JButton btn_viewAll;
    private javax.swing.JLabel emp_background4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_SearchEmpVal;
    private javax.swing.JLabel lbl_SearchpayrttblVal;
    private javax.swing.JLabel lbl_att;
    private javax.swing.JLabel lbl_payrttblVal;
    private javax.swing.JTable tbl_payments;
    private javax.swing.JTable tbt_empDetails;
    private javax.swing.JTextField txt_add;
    private javax.swing.JTextField txt_bSal;
    private javax.swing.JTextField txt_deduction;
    private javax.swing.JTextField txt_eid;
    private javax.swing.JTextField txt_empSearch;
    private javax.swing.JTextField txt_ename;
    private javax.swing.JTextField txt_hDay;
    private javax.swing.JTextField txt_month;
    private javax.swing.JTextField txt_ot;
    private javax.swing.JTextField txt_paySearch;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
