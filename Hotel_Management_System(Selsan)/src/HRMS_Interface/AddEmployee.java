/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRMS_Interface;

import HRMS_Codes.Hotel;
import HRMS_Codes.HR_Methods;
import java.awt.HeadlessException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Prabas Gayadeeptha
 */
public class AddEmployee extends javax.swing.JFrame {

   
    Hotel c = new Hotel();
     HR_Methods hrm = new HR_Methods();

    public AddEmployee() {
        initComponents();
        this.setLocationRelativeTo(null);
        hrm.AutoGeneratePrimaryKey(lbl_eid, txt_empID, 'E', "employee", "Emp_ID");
    }

       public void setEmployee() {
        c.setEmpID(txt_empID.getText());
        c.setFname(txt_fname.getText());
        c.setIname(txt_initialName.getText());
        c.setEmpgender(txt_gender.getText());
        c.setEmpnic(txt_nic.getText());
        c.setEmpdob(((JTextField) dc_birth.getDateEditor().getUiComponent()).getText());
        c.setEmpaddress(txtA_address.getText());
        c.setHno(txt_hno.getText());
        c.setMno(txt_mno.getText());
        c.setEmpmail(txt_mail.getText());
        c.setSdate(((JTextField) dc_startdate.getDateEditor().getUiComponent()).getText());
        c.setEmpdepartment(txt_dptn.getText());
        c.setEmpdesignation(txt_dsgn.getText());
        c.setUserName(txt_usrnme.getText());
        c.setPassword(pwd_password.getPassword());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_addEmp = new javax.swing.JPanel();
        lbl_mno1 = new javax.swing.JLabel();
        txt_usrnme = new javax.swing.JTextField();
        lbl_hno1 = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        lbl_employeeID = new javax.swing.JLabel();
        lbl_fname = new javax.swing.JLabel();
        txt_empID = new javax.swing.JTextField();
        txt_fname = new javax.swing.JTextField();
        lbl_initialName = new javax.swing.JLabel();
        lbl_nic = new javax.swing.JLabel();
        txt_initialName = new javax.swing.JTextField();
        lbl_dob = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        jScrollPaneAddress = new javax.swing.JScrollPane();
        txtA_address = new javax.swing.JTextArea();
        lbl_hno = new javax.swing.JLabel();
        txt_dptn = new javax.swing.JTextField();
        txt_dsgn = new javax.swing.JTextField();
        lbl_mno = new javax.swing.JLabel();
        lbl_mail = new javax.swing.JLabel();
        txt_nic = new javax.swing.JTextField();
        txt_mno = new javax.swing.JTextField();
        lbl_designation = new javax.swing.JLabel();
        lbl_startdate = new javax.swing.JLabel();
        lbl_department = new javax.swing.JLabel();
        txt_hno = new javax.swing.JTextField();
        pwd_password = new javax.swing.JPasswordField();
        txt_gender = new javax.swing.JTextField();
        dc_startdate = new com.toedter.calendar.JDateChooser();
        dc_birth = new com.toedter.calendar.JDateChooser();
        lbl_eid = new javax.swing.JLabel();
        lbl_gender = new javax.swing.JLabel();
        btn_register = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbl_border = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_border1 = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_addEmp.setBackground(new java.awt.Color(247, 249, 255));
        pnl_addEmp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Employee Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        pnl_addEmp.setForeground(new java.awt.Color(240, 240, 240));
        pnl_addEmp.setPreferredSize(new java.awt.Dimension(1140, 460));
        pnl_addEmp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_mno1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_mno1.setText("Password            :");
        lbl_mno1.setPreferredSize(new java.awt.Dimension(100, 30));
        pnl_addEmp.add(lbl_mno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 100, 30));

        txt_usrnme.setEditable(false);
        txt_usrnme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_usrnme.setPreferredSize(new java.awt.Dimension(210, 30));
        pnl_addEmp.add(txt_usrnme, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 300, -1, -1));

        lbl_hno1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_hno1.setText("User Name         :");
        lbl_hno1.setPreferredSize(new java.awt.Dimension(100, 30));
        pnl_addEmp.add(lbl_hno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, 100, 30));

        txt_mail.setEditable(false);
        txt_mail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_mail.setPreferredSize(new java.awt.Dimension(210, 30));
        pnl_addEmp.add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, -1));

        lbl_employeeID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_employeeID.setText("Employee ID          :");
        lbl_employeeID.setPreferredSize(new java.awt.Dimension(110, 30));
        pnl_addEmp.add(lbl_employeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 110, 30));

        lbl_fname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_fname.setText("Full Name               :");
        lbl_fname.setPreferredSize(new java.awt.Dimension(110, 30));
        pnl_addEmp.add(lbl_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 110, 30));

        txt_empID.setEditable(false);
        txt_empID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_empID.setPreferredSize(new java.awt.Dimension(210, 30));
        txt_empID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_empIDActionPerformed(evt);
            }
        });
        pnl_addEmp.add(txt_empID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 210, 30));

        txt_fname.setEditable(false);
        txt_fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_fname.setPreferredSize(new java.awt.Dimension(210, 30));
        pnl_addEmp.add(txt_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 210, 30));

        lbl_initialName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_initialName.setText("Name with Initial  :");
        lbl_initialName.setPreferredSize(new java.awt.Dimension(110, 30));
        pnl_addEmp.add(lbl_initialName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 110, 30));

        lbl_nic.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_nic.setText("NIC                           :");
        lbl_nic.setPreferredSize(new java.awt.Dimension(110, 30));
        pnl_addEmp.add(lbl_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 110, 30));

        txt_initialName.setEditable(false);
        txt_initialName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_initialName.setPreferredSize(new java.awt.Dimension(210, 30));
        pnl_addEmp.add(txt_initialName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 210, 30));

        lbl_dob.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_dob.setText("Birth Day                :");
        lbl_dob.setPreferredSize(new java.awt.Dimension(110, 30));
        pnl_addEmp.add(lbl_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 110, 30));

        lbl_address.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_address.setText("Address               :");
        lbl_address.setPreferredSize(new java.awt.Dimension(100, 140));
        pnl_addEmp.add(lbl_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 100, 140));

        jScrollPaneAddress.setPreferredSize(new java.awt.Dimension(210, 140));

        txtA_address.setEditable(false);
        txtA_address.setColumns(20);
        txtA_address.setRows(5);
        txtA_address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txtA_address.setPreferredSize(new java.awt.Dimension(210, 140));
        jScrollPaneAddress.setViewportView(txtA_address);

        pnl_addEmp.add(jScrollPaneAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        lbl_hno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_hno.setText("Home Number    :");
        lbl_hno.setPreferredSize(new java.awt.Dimension(100, 30));
        pnl_addEmp.add(lbl_hno, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 100, 30));

        txt_dptn.setEditable(false);
        txt_dptn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_dptn.setPreferredSize(new java.awt.Dimension(210, 30));
        pnl_addEmp.add(txt_dptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, -1, -1));

        txt_dsgn.setEditable(false);
        txt_dsgn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_dsgn.setPreferredSize(new java.awt.Dimension(210, 30));
        pnl_addEmp.add(txt_dsgn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 120, -1, -1));

        lbl_mno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_mno.setText("Mobile Number   :");
        lbl_mno.setPreferredSize(new java.awt.Dimension(100, 30));
        pnl_addEmp.add(lbl_mno, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 100, 30));

        lbl_mail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_mail.setText("Email                     :");
        lbl_mail.setPreferredSize(new java.awt.Dimension(100, 30));
        pnl_addEmp.add(lbl_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 100, 30));

        txt_nic.setEditable(false);
        txt_nic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_nic.setPreferredSize(new java.awt.Dimension(210, 30));
        pnl_addEmp.add(txt_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 210, 30));

        txt_mno.setEditable(false);
        txt_mno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_mno.setPreferredSize(new java.awt.Dimension(210, 30));
        pnl_addEmp.add(txt_mno, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        lbl_designation.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_designation.setText("Designation        :");
        lbl_designation.setPreferredSize(new java.awt.Dimension(100, 30));
        pnl_addEmp.add(lbl_designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 100, 30));

        lbl_startdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_startdate.setText("Strat Date          :");
        lbl_startdate.setPreferredSize(new java.awt.Dimension(100, 30));
        pnl_addEmp.add(lbl_startdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 100, 30));

        lbl_department.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_department.setText("Department        :");
        lbl_department.setToolTipText("");
        lbl_department.setPreferredSize(new java.awt.Dimension(100, 30));
        pnl_addEmp.add(lbl_department, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 100, 30));

        txt_hno.setEditable(false);
        txt_hno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_hno.setPreferredSize(new java.awt.Dimension(210, 30));
        pnl_addEmp.add(txt_hno, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        pwd_password.setEditable(false);
        pwd_password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        pnl_addEmp.add(pwd_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, 210, 30));

        txt_gender.setEditable(false);
        txt_gender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        pnl_addEmp.add(txt_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 210, 30));

        dc_startdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        dc_startdate.setDateFormatString("yyyy-MM-dd");
        dc_startdate.setPreferredSize(new java.awt.Dimension(210, 30));
        dc_startdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dc_startdateKeyTyped(evt);
            }
        });
        pnl_addEmp.add(dc_startdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, -1, -1));

        dc_birth.setDateFormatString("yyyy-MM-dd");
        pnl_addEmp.add(dc_birth, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 210, 30));
        pnl_addEmp.add(lbl_eid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 210, 20));

        lbl_gender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_gender.setText("Gender                   :");
        lbl_gender.setPreferredSize(new java.awt.Dimension(110, 30));
        pnl_addEmp.add(lbl_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 110, 30));

        btn_register.setBackground(new java.awt.Color(255, 255, 255));
        btn_register.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_register.setText("Register");
        btn_register.setBorder(null);
        btn_register.setSelected(true);
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        pnl_addEmp.add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 420, 100, 30));

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder("User Login Details"));
        pnl_addEmp.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, 340, 140));

        lbl_border.setBorder(javax.swing.BorderFactory.createTitledBorder("Contact Details"));
        lbl_border.setPreferredSize(new java.awt.Dimension(1120, 370));
        pnl_addEmp.add(lbl_border, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 360, 380));

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Employment Details"));
        pnl_addEmp.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 340, 210));

        lbl_border1.setBorder(javax.swing.BorderFactory.createTitledBorder("Personal Details"));
        lbl_border1.setPreferredSize(new java.awt.Dimension(1120, 370));
        pnl_addEmp.add(lbl_border1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 380, 380));

        btn_cancel.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.setBorder(null);
        btn_cancel.setSelected(true);
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        pnl_addEmp.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 420, 100, 30));

        getContentPane().add(pnl_addEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_empIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_empIDActionPerformed

    }//GEN-LAST:event_txt_empIDActionPerformed

    private void dc_startdateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dc_startdateKeyTyped

    }//GEN-LAST:event_dc_startdateKeyTyped

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
       this.setEmployee();
        try {
            //insert data to database
            boolean status = HR_Methods.InsertEmployeeToDB(c.getEmpID(),c.getFname(),c.getIname(),c.getEmpgender(),c.getEmpnic(),
                    c.getEmpdob(),c.getEmpaddress(),c.getHno(),c.getMno(),c.getEmpmail(),c.getEmpdepartment(),c.getEmpdesignation(),c.getSdate(),
                    c.getUserName(),c.getPassword().toString());
            if (status = true) {
                JOptionPane.showMessageDialog(null, "Employee Record Seved Successfully");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "employee Record cant save");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Can't save record..Check fields and try again");
        }
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_register;
    public com.toedter.calendar.JDateChooser dc_birth;
    public com.toedter.calendar.JDateChooser dc_startdate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPaneAddress;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_border;
    private javax.swing.JLabel lbl_border1;
    private javax.swing.JLabel lbl_department;
    private javax.swing.JLabel lbl_designation;
    private javax.swing.JLabel lbl_dob;
    private javax.swing.JLabel lbl_eid;
    private javax.swing.JLabel lbl_employeeID;
    private javax.swing.JLabel lbl_fname;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_hno;
    private javax.swing.JLabel lbl_hno1;
    private javax.swing.JLabel lbl_initialName;
    private javax.swing.JLabel lbl_mail;
    private javax.swing.JLabel lbl_mno;
    private javax.swing.JLabel lbl_mno1;
    private javax.swing.JLabel lbl_nic;
    private javax.swing.JLabel lbl_startdate;
    private javax.swing.JPanel pnl_addEmp;
    public javax.swing.JPasswordField pwd_password;
    public javax.swing.JTextArea txtA_address;
    public javax.swing.JTextField txt_dptn;
    public javax.swing.JTextField txt_dsgn;
    public javax.swing.JTextField txt_empID;
    public javax.swing.JTextField txt_fname;
    public javax.swing.JTextField txt_gender;
    public javax.swing.JTextField txt_hno;
    public javax.swing.JTextField txt_initialName;
    public javax.swing.JTextField txt_mail;
    public javax.swing.JTextField txt_mno;
    public javax.swing.JTextField txt_nic;
    public javax.swing.JTextField txt_usrnme;
    // End of variables declaration//GEN-END:variables
}
