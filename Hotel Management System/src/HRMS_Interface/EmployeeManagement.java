package HRMS_Interface;

import HMS_Home.MHome;
import HMS_Database.MyDBConnection;
import HMS_Home.HMS_Methods;
import HRMS_Codes.HR_Methods;
import HRMS_Codes.Hotel;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prabas Gayadeeptha
 */
public class EmployeeManagement extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    java.util.Date date;
    String sql = "";
    Hotel c =new Hotel();
    HR_Methods hrm = new HR_Methods();
    Color blueColor = new Color(0, 174, 239);

    public EmployeeManagement() {
        initComponents();
        pnl_view.setVisible(true);
        conn = (Connection) MyDBConnection.connectDB();
        HMS_Methods hm = new HMS_Methods();
        hm.unmovableInternal(this);
        HR_Methods.LoadTable(tbl_employee, "employee", "Emp_ID");
    }

    public void emptyTable(JTable table) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLayeredPaneEmployee = new javax.swing.JLayeredPane();
        pnl_view = new javax.swing.JPanel();
        btn_empDetails1 = new javax.swing.JButton();
        pnl_viewEmployee = new javax.swing.JPanel();
        txt_empSearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_employee = new javax.swing.JTable();
        btn_empSearch = new javax.swing.JButton();
        btn_viewallemp = new javax.swing.JButton();
        cmb_empSearch = new javax.swing.JComboBox<>();
        lbl_SearchValidate = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btn_remove = new javax.swing.JButton();
        btn_logout3 = new javax.swing.JButton();
        btn_home3 = new javax.swing.JButton();
        lbl_btntblvalidate = new javax.swing.JLabel();
        emp_background1 = new javax.swing.JLabel();
        PnlMenu = new javax.swing.JPanel();
        btn_jobMain = new javax.swing.JButton();
        btn_payrollMain = new javax.swing.JButton();
        btn_attendeceMain = new javax.swing.JButton();
        btn_EmployeeMain = new javax.swing.JButton();
        btn_interviewMain = new javax.swing.JButton();
        btn_UserMain = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Employee Management");
        setMinimumSize(new java.awt.Dimension(1200, 680));
        setPreferredSize(new java.awt.Dimension(1200, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPaneEmployee.setMinimumSize(new java.awt.Dimension(1190, 580));
        jLayeredPaneEmployee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_view.setMinimumSize(new java.awt.Dimension(1190, 580));
        pnl_view.setPreferredSize(new java.awt.Dimension(1190, 580));
        pnl_view.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_empDetails1.setBackground(new java.awt.Color(255, 255, 255));
        btn_empDetails1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_empDetails1.setForeground(new java.awt.Color(0, 174, 239));
        btn_empDetails1.setText("Employee Details");
        btn_empDetails1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_empDetails1.setPreferredSize(new java.awt.Dimension(120, 50));
        btn_empDetails1.setSelected(true);
        btn_empDetails1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empDetails1ActionPerformed(evt);
            }
        });
        pnl_view.add(btn_empDetails1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 50));

        pnl_viewEmployee.setBackground(new java.awt.Color(247, 249, 255));
        pnl_viewEmployee.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnl_viewEmployee.setPreferredSize(new java.awt.Dimension(1150, 410));
        pnl_viewEmployee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        pnl_viewEmployee.add(txt_empSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 130, 30));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(1130, 320));
        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

        tbl_employee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp_ID", "Full_Name", "NamewithInitial", "Gender", "NIC", "Birthday", "Address", "HomeNo", "MobileNo", "Department", "Designation", "StartDate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_employeeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_employee);

        pnl_viewEmployee.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1120, 320));

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
        pnl_viewEmployee.add(btn_empSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 90, 30));

        btn_viewallemp.setBackground(new java.awt.Color(255, 255, 255));
        btn_viewallemp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_viewallemp.setText("View All Employees");
        btn_viewallemp.setBorder(null);
        btn_viewallemp.setPreferredSize(new java.awt.Dimension(130, 40));
        btn_viewallemp.setSelected(true);
        btn_viewallemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewallempActionPerformed(evt);
            }
        });
        pnl_viewEmployee.add(btn_viewallemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, 130, 40));

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
        pnl_viewEmployee.add(cmb_empSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 140, 30));

        lbl_SearchValidate.setForeground(new java.awt.Color(255, 0, 51));
        pnl_viewEmployee.add(lbl_SearchValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 240, 20));

        pnl_view.add(pnl_viewEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 1140, 410));
        pnl_view.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1190, -1));

        btn_remove.setBackground(new java.awt.Color(255, 255, 255));
        btn_remove.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_remove.setText("Remove Employee");
        btn_remove.setBorder(null);
        btn_remove.setPreferredSize(new java.awt.Dimension(120, 40));
        btn_remove.setSelected(true);
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });
        pnl_view.add(btn_remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 490, 140, 40));

        btn_logout3.setBackground(new java.awt.Color(255, 255, 255));
        btn_logout3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_logout3.setForeground(new java.awt.Color(0, 174, 239));
        btn_logout3.setText("Logout");
        btn_logout3.setBorder(null);
        btn_logout3.setOpaque(false);
        btn_logout3.setPreferredSize(new java.awt.Dimension(110, 25));
        btn_logout3.setSelected(true);
        btn_logout3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logout3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logout3MouseExited(evt);
            }
        });
        btn_logout3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logout3ActionPerformed(evt);
            }
        });
        pnl_view.add(btn_logout3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 120, 50));

        btn_home3.setBackground(new java.awt.Color(255, 255, 255));
        btn_home3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_home3.setForeground(new java.awt.Color(0, 174, 239));
        btn_home3.setText("Home");
        btn_home3.setBorder(null);
        btn_home3.setOpaque(false);
        btn_home3.setPreferredSize(new java.awt.Dimension(110, 25));
        btn_home3.setSelected(true);
        btn_home3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_home3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_home3MouseExited(evt);
            }
        });
        btn_home3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home3ActionPerformed(evt);
            }
        });
        pnl_view.add(btn_home3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 120, 50));

        lbl_btntblvalidate.setForeground(new java.awt.Color(255, 0, 51));
        pnl_view.add(lbl_btntblvalidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 540, 20));

        emp_background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MainBackForAll.jpg"))); // NOI18N
        emp_background1.setPreferredSize(new java.awt.Dimension(1190, 570));
        pnl_view.add(emp_background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 580));

        jLayeredPaneEmployee.add(pnl_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jLayeredPaneEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1190, 580));

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
        PnlMenu.add(btn_UserMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MenuBar_Back_Main_HR.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1190, 75));
        jLabel1.setMinimumSize(new java.awt.Dimension(1190, 75));
        jLabel1.setPreferredSize(new java.awt.Dimension(1190, 75));
        PnlMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_empSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empSearchActionPerformed
        // TODO add your handling code here:

        String select = cmb_empSearch.getSelectedItem().toString();
        if (select.equals("Search by ID")) {
            sql = "select * from employee where Emp_ID LIKE '" + txt_empSearch.getText() + "%'";
            hrm.SearchData(tbl_employee, txt_empSearch, lbl_SearchValidate, sql, "", "Emp_ID");
        } else if (select.equals("Search by Name")) {
            sql = "select * from employee where full_name LIKE '" + txt_empSearch.getText() + "%'";
            hrm.SearchData(tbl_employee, txt_empSearch, lbl_SearchValidate, sql, "", "full_name");
        }
    }//GEN-LAST:event_btn_empSearchActionPerformed

    private void btn_viewallempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewallempActionPerformed
        HR_Methods.LoadTable(tbl_employee, "employee", "Emp_ID");
    }//GEN-LAST:event_btn_viewallempActionPerformed

    private void txt_empSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_empSearchMouseClicked
        // TODO add your handling code here:
        txt_empSearch.setText(null);
        txt_empSearch.setForeground(Color.BLACK);
    }//GEN-LAST:event_txt_empSearchMouseClicked

    private void txt_empSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_empSearchMouseExited

    }//GEN-LAST:event_txt_empSearchMouseExited

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked


    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void tbl_employeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_employeeMouseClicked


    }//GEN-LAST:event_tbl_employeeMouseClicked

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        hrm.RemoveData(tbl_employee, lbl_btntblvalidate, "employee", "Emp_ID");
        HR_Methods.LoadTable(tbl_employee, "employee", "Emp_ID");
    }//GEN-LAST:event_btn_removeActionPerformed

    private void cmb_empSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_empSearchActionPerformed

    }//GEN-LAST:event_cmb_empSearchActionPerformed


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

    private void btn_logout3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logout3MouseEntered
        hrm.MouseEnterEvent(btn_logout3);
    }//GEN-LAST:event_btn_logout3MouseEntered

    private void btn_logout3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logout3MouseExited
        hrm.MouseExitEvent(btn_logout3, blueColor);
    }//GEN-LAST:event_btn_logout3MouseExited

    private void btn_logout3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logout3ActionPerformed
        String ObjButtons[] = {"Yes", "No"};
        int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to Logout?", "Logout Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
        if (PromptResult == JOptionPane.YES_OPTION) {
            MainLogin lg = new MainLogin();
            JDesktopPane desktopPane = getDesktopPane();
            desktopPane.add(lg).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_logout3ActionPerformed

    private void btn_home3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_home3MouseEntered
        hrm.MouseEnterEvent(btn_home3);
    }//GEN-LAST:event_btn_home3MouseEntered

    private void btn_home3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_home3MouseExited
        hrm.MouseExitEvent(btn_home3, blueColor);
    }//GEN-LAST:event_btn_home3MouseExited

    private void btn_home3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home3ActionPerformed
        MHome m = new MHome();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(m).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_home3ActionPerformed

    private void btn_empDetails1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empDetails1ActionPerformed

    }//GEN-LAST:event_btn_empDetails1ActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlMenu;
    private javax.swing.JButton btn_EmployeeMain;
    private javax.swing.JButton btn_UserMain;
    private javax.swing.JButton btn_attendeceMain;
    private javax.swing.JButton btn_empDetails1;
    private javax.swing.JButton btn_empSearch;
    private javax.swing.JButton btn_home3;
    private javax.swing.JButton btn_interviewMain;
    private javax.swing.JButton btn_jobMain;
    private javax.swing.JButton btn_logout3;
    private javax.swing.JButton btn_payrollMain;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_viewallemp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_empSearch;
    private javax.swing.JLabel emp_background1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPaneEmployee;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_SearchValidate;
    private javax.swing.JLabel lbl_btntblvalidate;
    private javax.swing.JPanel pnl_view;
    private javax.swing.JPanel pnl_viewEmployee;
    public javax.swing.JTable tbl_employee;
    private javax.swing.JTextField txt_empSearch;
    // End of variables declaration//GEN-END:variables
}
