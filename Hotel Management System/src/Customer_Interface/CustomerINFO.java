/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer_Interface;

import HMS_Database.MyDBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;



/**
 *
 * @author user
 */
public class CustomerINFO extends javax.swing.JInternalFrame {

    /**
     * Creates new form CustomerINFO
     */
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    java.util.Date date;

   
    
    
    
    public CustomerINFO() {
        initComponents();
        conn=MyDBConnection.connectDB();
        loadCustomersToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        BtnAdd = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        BtnRemove = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        BtnSerch = new javax.swing.JButton();
        cmbsearch = new javax.swing.JComboBox<>();
        Txtsearch = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_cus = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer_Images/Cusicon.png"))); // NOI18N
        jLabel1.setText("Customers");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 240, 64));

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnAdd.setText("ADD");
        BtnAdd.setToolTipText("");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });
        jPanel4.add(BtnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 13, 81, -1));

        BtnEdit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnEdit.setText("EDIT");
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });
        jPanel4.add(BtnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 47, 81, -1));

        BtnRemove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnRemove.setText("Remove");
        BtnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemoveActionPerformed(evt);
            }
        });
        jPanel4.add(BtnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 83, -1, -1));

        jLabel7.setText("Remove a selected customer");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 88, -1, -1));

        jLabel6.setText("Edit a selected customer");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 52, -1, -1));

        jLabel5.setText("Add a new customer");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 18, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 250, 120));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton1.setText("customer who booked a room");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 26, -1, -1));

        jRadioButton2.setText("customer who booked a hall");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 52, -1, -1));

        jRadioButton3.setText("All (loding may take a few minutes)");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 78, -1, -1));

        jLabel8.setText("Database View");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 240, 125));

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnSerch.setText("Search");
        BtnSerch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSerchActionPerformed(evt);
            }
        });
        jPanel3.add(BtnSerch, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 80, 30));

        cmbsearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Find a Customer by name", "Find a Customer by address" }));
        jPanel3.add(cmbsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));
        jPanel3.add(Txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 160, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 360, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1190, 160));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Customer Information");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 26, 170, 24));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 1090, 60));

        jTable_cus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name and surname / Company name", "Address", "Phone", "E-mail", "Gender", "NIC/ Passport", "Nationality", "Regular", "Blacklisted", "Comments"
            }
        ));
        jScrollPane1.setViewportView(jTable_cus);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 1150, 216));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer_Images/MenuBar_Back_Main_Customer.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
             // TODO add your handling code here:
             CustomerAdd CA = new CustomerAdd();
             CA.setVisible(true);
            
    }//GEN-LAST:event_BtnAddActionPerformed
    void loadCustomersToTable(){
     
        }
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        // TODO add your handling code here:
        CustomerEdit CE = new CustomerEdit();
        CE.setVisible(true);
     // new CusDBOperations().UserUpdate(cus);
    }//GEN-LAST:event_BtnEditActionPerformed
   public void LoadCustomerTable() {
        try {
            String sql = "Select * from customer";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
           jTable_cus.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cant load Customer Table");
        }
    }
    
    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        LoadCustomerTable();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void BtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoveActionPerformed
        // TODO add your handling code here:

        String message="Sure?";

        int reply = JOptionPane.showConfirmDialog(null, message, "warning", JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.YES_OPTION)
        {
            new CusDBOperations().deleteUser(jTable_cus);
        }
        else
        {

        }

        // clearFields();
        //dispose();
    }//GEN-LAST:event_BtnRemoveActionPerformed

    private void BtnSerchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSerchActionPerformed
        // TODO add your handling code here:
       CusDBOperations ser = new CusDBOperations ();
        String select = cmbsearch.getSelectedItem().toString();
        if (select.equals("Find a Customer by name")) {
            String sql = "Select * from customer where name LIKE '"+Txtsearch.getText()+"%'";
             ser.SearchData(jTable_cus,  Txtsearch, sql, "");

        } else if (select.equals("Find a Customer by address")) {
            String sql = "Select * from customer where address LIKE '"+Txtsearch.getText()+"%'";
             ser.SearchData(jTable_cus,  Txtsearch, sql, "");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        
    }//GEN-LAST:event_BtnSerchActionPerformed
  }
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerINFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerINFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerINFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerINFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerINFO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnRemove;
    private javax.swing.JButton BtnSerch;
    private javax.swing.JTextField Txtsearch;
    private javax.swing.JComboBox<String> cmbsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_cus;
    // End of variables declaration//GEN-END:variables

}