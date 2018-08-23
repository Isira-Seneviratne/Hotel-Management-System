/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRMS_Interface;

import HMS_Home.MHome;
import java.sql.Connection;
import HMS_Database.MyDBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Prabas Gayadeeptha
 * 
 * @author Isira Seneviratne (19440268)
 */
public class MainLogin extends javax.swing.JInternalFrame {

    /**
     * Creates new form MainLogin
     */
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    private Connection conn = null;

    public MainLogin() {
        initComponents();
        
        conn = MyDBConnection.connectDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_login = new javax.swing.JPanel();
        btn_login = new javax.swing.JButton();
        btn_loginReset = new javax.swing.JButton();
        btn_loginClose = new javax.swing.JButton();
        lbl_password = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_hotelselsan = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        emp_background4 = new javax.swing.JLabel();
        PnlMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Login Form");
        setMinimumSize(new java.awt.Dimension(1200, 680));
        setPreferredSize(new java.awt.Dimension(1200, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_login.setText("Login");
        btn_login.setSelected(true);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        pnl_login.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 90, 40));

        btn_loginReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_loginReset.setText("Reset");
        btn_loginReset.setSelected(true);
        btn_loginReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginResetActionPerformed(evt);
            }
        });
        pnl_login.add(btn_loginReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 90, 40));

        btn_loginClose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_loginClose.setText("Close");
        btn_loginClose.setOpaque(false);
        btn_loginClose.setSelected(true);
        btn_loginClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginCloseActionPerformed(evt);
            }
        });
        pnl_login.add(btn_loginClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 90, 40));

        lbl_password.setBackground(new java.awt.Color(255, 255, 255));
        lbl_password.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(60, 148, 139));
        lbl_password.setText("Password");
        pnl_login.add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 110, 30));

        lbl_username.setBackground(new java.awt.Color(255, 255, 255));
        lbl_username.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(60, 148, 139));
        lbl_username.setText("User Name");
        pnl_login.add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 110, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(":");
        pnl_login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 20, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(":");
        pnl_login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 20, 30));

        lbl_hotelselsan.setBackground(new java.awt.Color(255, 255, 255));
        lbl_hotelselsan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_hotelselsan.setForeground(new java.awt.Color(60, 148, 139));
        lbl_hotelselsan.setText("Hotel Selsan");
        lbl_hotelselsan.setToolTipText("");
        pnl_login.add(lbl_hotelselsan, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 170, -1));

        txtUserName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnl_login.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 190, 30));

        txtPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnl_login.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 190, 30));

        emp_background4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MainBackForAll.jpg"))); // NOI18N
        emp_background4.setPreferredSize(new java.awt.Dimension(1190, 570));
        pnl_login.add(emp_background4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 580));

        getContentPane().add(pnl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1190, 580));

        PnlMenu.setPreferredSize(new java.awt.Dimension(1200, 100));
        PnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MenuBar_Back_Main_Hotel.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1190, 75));
        jLabel1.setMinimumSize(new java.awt.Dimension(1190, 75));
        jLabel1.setPreferredSize(new java.awt.Dimension(1190, 75));
        PnlMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        String eID = "", adminID = "", user = "", pwd = "", fname = "", job = "", iname = "";
        String gender = "", nic = "", birthday = "", address = "", hno = "", mno = "", email = "", dpt = "";
        Date stdat = new Date();
        UserManagement m1 = new UserManagement();
        MHome h = new MHome();
        
        try {
            pst = conn.prepareStatement("SELECT Admin_id, Password FROM login WHERE UserName='"
                    + txtUserName.getText() + "'");
            rs = pst.executeQuery();
            while(rs.next()) {
                adminID = rs.getString("Admin_id");
                pwd = rs.getString("Password");
            }
            if (new String(txtPassword.getPassword()).equals(pwd)) {
                pst = conn.prepareStatement("SELECT * FROM employee WHERE Emp_id='"+adminID+"'");
                rs = pst.executeQuery();
                while(rs.next()) {
                    eID = rs.getString("Emp_id");
                    fname = rs.getString("full_name");
                    iname = rs.getString("name_with_Initial");
                    gender = rs.getString("gender");
                    nic = rs.getString("NIC");
                    birthday = rs.getString("birthday");
                    address = rs.getString("address");
                    hno = rs.getString("homenumber");
                    mno = rs.getString("mobile");
                    email = rs.getString("email");
                    dpt = rs.getString("Department");
                    stdat = rs.getDate("startdate");
                    job = rs.getString("designation");
                }
                
                JDesktopPane desktopPane = getDesktopPane();
                m1.btn_jobMain.setEnabled(false);
                m1.btn_UserMain.setEnabled(false);
                m1.btn_attendeceMain.setEnabled(false);
                m1.btn_interviewMain.setEnabled(false);
                m1.btn_payrollMain.setEnabled(false);
                m1.btn_EmployeeMain.setEnabled(false);
                m1.jButton5.setEnabled(false);
                m1.txt_empID.setText(eID);
                m1.txtA_address.setText(address);
                m1.txt_dob.setText(birthday);
                m1.txt_dptn.setText(dpt);
                m1.txt_dsgn.setText(job);
                m1.txt_fname.setText(fname);
                m1.txt_gender.setText(gender);
                m1.txt_hno.setText(hno);
                m1.txt_initialName.setText(iname);
                m1.txt_mail.setText(email);
                m1.txt_mno.setText(mno);
                m1.txt_nic.setText(nic);
                m1.txt_usrnme.setText(user);
                m1.pwd_password.setText(pwd);
                m1.dc_startdate.setDate(stdat);
                
                switch (job) {
                   case "Admin":
                        {
                            h.btn_beverage.setEnabled(true);
                            h.btn_custBooking.setEnabled(true);
                            h.btn_event.setEnabled(true);
                            h.btn_finance.setEnabled(true);
                            h.btn_hr.setEnabled(true);
                            h.btn_stock.setEnabled(true);
                            h.btn_transport.setEnabled(true);
                            
                            desktopPane.add(h).setVisible(true);
                            break;
                        }
                   case "HR Manager":
                        {
                            h.btn_hr.setEnabled(true);
                            desktopPane.add(h).setVisible(true);
                            break;
                        }
                   case "Stock Manager":
                        {
                            h.btn_stock.setEnabled(true);
                            desktopPane.add(h).setVisible(true);
                            break;
                        }
                   case "Finance Manager":
                        {
                            h.btn_finance.setEnabled(true);
                            desktopPane.add(h).setVisible(true);
                            break;
                        }
                   case "Transport Manager":
                        {
                            h.btn_transport.setEnabled(true);
                            desktopPane.add(h).setVisible(true);
                            break;
                        }
                   case "Bar Manager":
                        {
                            h.btn_beverage.setEnabled(true);
                            desktopPane.add(h).setVisible(true);
                            break;
                        }
                   case "Front Office Manager":
                        {
                            h.btn_custBooking.setEnabled(true);
                            desktopPane.add(h).setVisible(true);
                            break;
                        }
                   case "Event Manager":
                        {
                            h.btn_event.setEnabled(true);
                            desktopPane.add(h).setVisible(true);
                            break;
                        }
                   default:
                        {
                            desktopPane.add(m1).setVisible(true);
                            break;
                        }
                }
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Enter a valid user name and password.", "Invalid login",
                        JOptionPane.ERROR_MESSAGE);
                txtUserName.setText(null);
                txtPassword.setText(null);
            }
        } catch (NullPointerException e)
        {
            JOptionPane.showMessageDialog(null, "A database connection was not established.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while logging in.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_loginResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginResetActionPerformed
        txtUserName.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btn_loginResetActionPerformed

    private void btn_loginCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginCloseActionPerformed
        String ObjButtons[] = {"Yes", "No"};
        int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to exit?",
                "Exit Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null,
                ObjButtons, ObjButtons[1]);
        if (PromptResult == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btn_loginCloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlMenu;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_loginClose;
    private javax.swing.JButton btn_loginReset;
    private javax.swing.JLabel emp_background4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_hotelselsan;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPanel pnl_login;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
