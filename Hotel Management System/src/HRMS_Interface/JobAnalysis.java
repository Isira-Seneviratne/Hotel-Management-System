package HRMS_Interface;

import HMS_Database.MyDBConnection;
import HMS_Home.HMS_Methods;
import HMS_Home.MHome;
import HRMS_Codes.HR_Methods;
import HRMS_Codes.Hotel;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Prabas Gayadeeptha
 */
public class JobAnalysis extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Hotel c = new Hotel();
    HR_Methods hrm = new HR_Methods();
    Color blueColor = new Color(0, 174, 239);

    public JobAnalysis() {
        initComponents();
        conn = (Connection) MyDBConnection.connectDB();

        HMS_Methods hm = new HMS_Methods();
        hm.unmovableInternal(this);
        pnl_jobDetails.setVisible(true);
        HR_Methods.loadTable(tbl_Job, "job", "jName");
    }

    public void EmptyJobForm() {
        txt_availble.setText(null);
        txt_basicSal.setText(null);
        txt_did.setText(null);
        txt_halfDay.setText(null);
        txt_jid.setText(null);
        txt_jname.setText(null);
        txt_max.setText(null);
        txt_overTime.setText(null);
    }

    public void UpdateJob() {
        try {
            //insert data to database
            boolean status = HR_Methods.UpdateJOBInDB(txt_jid.getText(), txt_max.getText(), txt_availble.getText(), txt_basicSal.getText(),
                    txt_overTime.getText(), txt_halfDay.getText());
            if (status = true) {
                JOptionPane.showMessageDialog(null, "Job Details updated Successfully");
                HR_Methods.loadTable(tbl_Job, "job", "jName");
                this.EmptyJobForm();
                btn_update.setEnabled(false);
                btn_reset.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Job Details cant update");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Can't save record..Check fields and try again");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_jobDetails = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Job = new javax.swing.JTable();
        btn_jobSearch = new javax.swing.JButton();
        txt_jobSearch = new javax.swing.JTextField();
        btn_view = new javax.swing.JButton();
        lbl_SearchVal = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_jid = new javax.swing.JTextField();
        txt_did = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_basicSal = new javax.swing.JTextField();
        txt_max = new javax.swing.JTextField();
        txt_availble = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_overTime = new javax.swing.JTextField();
        txt_halfDay = new javax.swing.JTextField();
        txt_jname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbl_brd = new javax.swing.JLabel();
        btn_home2 = new javax.swing.JButton();
        btn_logout2 = new javax.swing.JButton();
        btn_editJob = new javax.swing.JButton();
        btn_open = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        lbl_validTable = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        emp_background1 = new javax.swing.JLabel();
        lbl_error = new javax.swing.JLabel();
        PnlMenu = new javax.swing.JPanel();
        btn_EmployeeMain = new javax.swing.JButton();
        btn_jobMain = new javax.swing.JButton();
        btn_UserMain = new javax.swing.JButton();
        btn_attendeceMain = new javax.swing.JButton();
        btn_payrollMain = new javax.swing.JButton();
        btn_interviewMain = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setTitle("Job Analysis");
        setMinimumSize(new java.awt.Dimension(1200, 680));
        setPreferredSize(new java.awt.Dimension(1200, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_jobDetails.setMinimumSize(new java.awt.Dimension(1190, 580));
        pnl_jobDetails.setPreferredSize(new java.awt.Dimension(1190, 580));
        pnl_jobDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(247, 249, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Job Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_Job.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "jobID", "dID", "JobName", "Max", "Available", "Vacancie", "basicSalary", "O/T", "HalfDay"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Job.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_JobMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_Job);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 680, 320));

        btn_jobSearch.setBackground(new java.awt.Color(255, 255, 255));
        btn_jobSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_jobSearch.setText("Search");
        btn_jobSearch.setBorder(null);
        btn_jobSearch.setSelected(true);
        btn_jobSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jobSearchActionPerformed(evt);
            }
        });
        jPanel6.add(btn_jobSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 80, 30));

        txt_jobSearch.setForeground(new java.awt.Color(204, 204, 204));
        txt_jobSearch.setText("Job Name");
        txt_jobSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel6.add(txt_jobSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 140, 30));

        btn_view.setBackground(new java.awt.Color(255, 255, 255));
        btn_view.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_view.setText("View All Jobs");
        btn_view.setBorder(null);
        btn_view.setSelected(true);
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });
        jPanel6.add(btn_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 120, 40));

        lbl_SearchVal.setForeground(new java.awt.Color(250, 0, 1));
        jPanel6.add(lbl_SearchVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 220, 20));

        pnl_jobDetails.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 700, 450));

        jPanel7.setBackground(new java.awt.Color(247, 249, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Add/Update Job Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Job ID");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 100, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Available");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 80, 30));

        txt_jid.setEditable(false);
        txt_jid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel7.add(txt_jid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 230, 30));

        txt_did.setEditable(false);
        txt_did.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel7.add(txt_did, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 230, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Department ID");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 100, 30));

        txt_basicSal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel7.add(txt_basicSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 230, 30));

        txt_max.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel7.add(txt_max, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 70, 30));

        txt_availble.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel7.add(txt_availble, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 70, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Job Name");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 100, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("HalfDay(Rs.)");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 100, 30));

        txt_overTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel7.add(txt_overTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 230, 30));

        txt_halfDay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel7.add(txt_halfDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 230, 30));

        txt_jname.setEditable(false);
        txt_jname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel7.add(txt_jname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 230, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Max No.of Jobs");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 100, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Basic Salary(Rs.)");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 100, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Over Time/h(Rs.)");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 100, 30));

        lbl_brd.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel7.add(lbl_brd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 390, 390));

        pnl_jobDetails.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 440, 450));

        btn_home2.setBackground(new java.awt.Color(255, 255, 255));
        btn_home2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_home2.setForeground(new java.awt.Color(0, 174, 239));
        btn_home2.setText("Home");
        btn_home2.setBorder(null);
        btn_home2.setOpaque(false);
        btn_home2.setPreferredSize(new java.awt.Dimension(110, 25));
        btn_home2.setSelected(true);
        btn_home2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_home2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_home2MouseExited(evt);
            }
        });
        btn_home2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home2ActionPerformed(evt);
            }
        });
        pnl_jobDetails.add(btn_home2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 120, 50));

        btn_logout2.setBackground(new java.awt.Color(255, 255, 255));
        btn_logout2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_logout2.setForeground(new java.awt.Color(0, 174, 239));
        btn_logout2.setText("Logout");
        btn_logout2.setBorder(null);
        btn_logout2.setOpaque(false);
        btn_logout2.setPreferredSize(new java.awt.Dimension(110, 25));
        btn_logout2.setSelected(true);
        btn_logout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logout2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logout2MouseExited(evt);
            }
        });
        btn_logout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logout2ActionPerformed(evt);
            }
        });
        pnl_jobDetails.add(btn_logout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 120, 50));

        btn_editJob.setBackground(new java.awt.Color(255, 255, 255));
        btn_editJob.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_editJob.setText("Edit Job");
        btn_editJob.setBorder(null);
        btn_editJob.setSelected(true);
        btn_editJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editJobActionPerformed(evt);
            }
        });
        pnl_jobDetails.add(btn_editJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 520, 130, 40));

        btn_open.setBackground(new java.awt.Color(255, 255, 255));
        btn_open.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_open.setText("Open Vacancie");
        btn_open.setBorder(null);
        btn_open.setEnabled(false);
        btn_open.setSelected(true);
        btn_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_openActionPerformed(evt);
            }
        });
        pnl_jobDetails.add(btn_open, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 520, 130, 40));

        btn_update.setBackground(new java.awt.Color(255, 255, 255));
        btn_update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_update.setText("Update");
        btn_update.setBorder(null);
        btn_update.setEnabled(false);
        btn_update.setSelected(true);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        pnl_jobDetails.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 80, 30));

        btn_reset.setBackground(new java.awt.Color(255, 255, 255));
        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.setBorder(null);
        btn_reset.setEnabled(false);
        btn_reset.setSelected(true);
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        pnl_jobDetails.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 80, 30));

        btn_close.setBackground(new java.awt.Color(255, 255, 255));
        btn_close.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_close.setText("Close Vacancie");
        btn_close.setBorder(null);
        btn_close.setEnabled(false);
        btn_close.setSelected(true);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        pnl_jobDetails.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, 130, 40));

        lbl_validTable.setForeground(new java.awt.Color(250, 0, 1));
        pnl_jobDetails.add(lbl_validTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 310, 30));
        pnl_jobDetails.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1190, -1));

        emp_background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MainBackForAll.jpg"))); // NOI18N
        emp_background1.setPreferredSize(new java.awt.Dimension(1190, 570));
        pnl_jobDetails.add(emp_background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 580));

        lbl_error.setText("jLabel2");
        pnl_jobDetails.add(lbl_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, 30));

        getContentPane().add(pnl_jobDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        PnlMenu.setPreferredSize(new java.awt.Dimension(1200, 100));
        PnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MenuBar_Back_Main_HR.jpg"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(1190, 75));
        jLabel8.setMinimumSize(new java.awt.Dimension(1190, 75));
        jLabel8.setPreferredSize(new java.awt.Dimension(1190, 75));
        PnlMenu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btn_home2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_home2MouseEntered
        hrm.MouseEnterEvent(btn_home2);
    }//GEN-LAST:event_btn_home2MouseEntered

    private void btn_home2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_home2MouseExited
        hrm.MouseExitEvent(btn_home2, blueColor);
    }//GEN-LAST:event_btn_home2MouseExited

    private void btn_home2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home2ActionPerformed
        MHome m = new MHome();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(m).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_home2ActionPerformed

    private void btn_logout2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logout2MouseEntered
        hrm.MouseEnterEvent(btn_logout2);
    }//GEN-LAST:event_btn_logout2MouseEntered

    private void btn_logout2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logout2MouseExited
        hrm.MouseExitEvent(btn_logout2, blueColor);
    }//GEN-LAST:event_btn_logout2MouseExited

    private void btn_logout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logout2ActionPerformed
        String ObjButtons[] = {"Yes", "No"};
        int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to Logout?", "Logout Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
        if (PromptResult == JOptionPane.YES_OPTION) {
            MainLogin lg = new MainLogin();
            JDesktopPane desktopPane = getDesktopPane();
            desktopPane.add(lg).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_logout2ActionPerformed

    private void tbl_JobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_JobMouseClicked
        hrm.CheckVecancie(tbl_Job, btn_open, btn_close);
    }//GEN-LAST:event_tbl_JobMouseClicked

    private void btn_editJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editJobActionPerformed
        hrm.LoadJobTableToForm(tbl_Job, lbl_validTable, txt_jid, txt_did, txt_jname, txt_max, txt_availble, txt_basicSal, txt_overTime, txt_halfDay);
        btn_update.setEnabled(true);
        btn_reset.setEnabled(true);
    }//GEN-LAST:event_btn_editJobActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        this.UpdateJob();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        this.EmptyJobForm();
        btn_update.setEnabled(false);
        btn_reset.setEnabled(false);
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        try {
            int rw = tbl_Job.getSelectedRow();
            String tbl_click = (tbl_Job.getModel().getValueAt(rw, 0).toString());
            String sql = "update job set Vacancies='Closed' where jobid='" + tbl_click + "'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Vacancie closed");
            btn_close.setEnabled(false);
            HR_Methods.loadTable(tbl_Job, "job", "jName");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_openActionPerformed
        try {
            int rw = tbl_Job.getSelectedRow();
            String tbl_click = (tbl_Job.getModel().getValueAt(rw, 0).toString());
            String sql = "update job set Vacancies='Open' where jobid='" + tbl_click + "'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Vacancie Opened");
            btn_close.setEnabled(false);
            HR_Methods.loadTable(tbl_Job, "job", "jName");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_openActionPerformed

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        HR_Methods.loadTable(tbl_Job, "job", "jName");
    }//GEN-LAST:event_btn_viewActionPerformed

    private void btn_jobSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jobSearchActionPerformed
        String sql = "select * from job where jName LIKE '"+txt_jobSearch.getText()+"%'";
        hrm.SearchData(tbl_Job, txt_jobSearch, lbl_SearchVal, sql, "", "Job Name");
    }//GEN-LAST:event_btn_jobSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlMenu;
    private javax.swing.JButton btn_EmployeeMain;
    private javax.swing.JButton btn_UserMain;
    private javax.swing.JButton btn_attendeceMain;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_editJob;
    private javax.swing.JButton btn_home2;
    private javax.swing.JButton btn_interviewMain;
    private javax.swing.JButton btn_jobMain;
    private javax.swing.JButton btn_jobSearch;
    private javax.swing.JButton btn_logout2;
    private javax.swing.JButton btn_open;
    private javax.swing.JButton btn_payrollMain;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_view;
    private javax.swing.JLabel emp_background1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_SearchVal;
    private javax.swing.JLabel lbl_brd;
    private javax.swing.JLabel lbl_error;
    private javax.swing.JLabel lbl_validTable;
    private javax.swing.JPanel pnl_jobDetails;
    private javax.swing.JTable tbl_Job;
    private javax.swing.JTextField txt_availble;
    private javax.swing.JTextField txt_basicSal;
    private javax.swing.JTextField txt_did;
    private javax.swing.JTextField txt_halfDay;
    private javax.swing.JTextField txt_jid;
    private javax.swing.JTextField txt_jname;
    private javax.swing.JTextField txt_jobSearch;
    private javax.swing.JTextField txt_max;
    private javax.swing.JTextField txt_overTime;
    // End of variables declaration//GEN-END:variables
}
