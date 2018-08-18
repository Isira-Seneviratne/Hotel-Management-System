/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transport_Interface;

import HMS_Database.MyDBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Prabas Gayadeeptha
 */
public class Service extends javax.swing.JInternalFrame {

    /**
     * Creates new form Service
     */
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Service() {
        initComponents();

        con = MyDBConnection.connectDB();

        tableload();
    }

    public void tableload() {
        try {

            String query = " SELECT * FROM service ORDER BY SID ";

            pst = (PreparedStatement) con.prepareStatement(query);
            rs = pst.executeQuery();

            service_table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlMenu = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Btn_Exit = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        lbl_sid = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        request_date = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        txt_milage = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_cost = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_aditionalCost = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        service_date = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        service_table = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        txt_searchUser = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(1200, 680));
        setPreferredSize(new java.awt.Dimension(1200, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlMenu.setPreferredSize(new java.awt.Dimension(1200, 100));
        PnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Transport_Images/MenuBar_Back_Main_Transport.jpg"))); // NOI18N
        jLabel14.setMaximumSize(new java.awt.Dimension(1190, 75));
        jLabel14.setMinimumSize(new java.awt.Dimension(1190, 75));
        jLabel14.setPreferredSize(new java.awt.Dimension(1190, 75));
        PnlMenu.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 70));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(1190, 580));
        jPanel1.setPreferredSize(new java.awt.Dimension(1190, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 497, -1));

        btn_search.setBackground(new java.awt.Color(0, 0, 0));
        btn_search.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_search.setForeground(new java.awt.Color(255, 255, 0));
        btn_search.setText("SEARCH");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 500, -1));

        btn_clear.setBackground(new java.awt.Color(0, 0, 0));
        btn_clear.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 0));
        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 495, -1));

        btn_update.setBackground(new java.awt.Color(0, 0, 0));
        btn_update.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 0));
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 495, -1));

        btn_delete.setBackground(new java.awt.Color(0, 0, 0));
        btn_delete.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 0));
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 495, -1));

        jButton4.setBackground(new java.awt.Color(0, 204, 0));
        jButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, 237, -1));

        Btn_Exit.setBackground(new java.awt.Color(255, 51, 51));
        Btn_Exit.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Btn_Exit.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Exit.setText("Exit");
        Btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 540, 248, -1));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 51));
        jLabel15.setText("SEARCH BY USER");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 180, 27));

        lbl_sid.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        lbl_sid.setForeground(new java.awt.Color(255, 0, 0));
        lbl_sid.setText("ID");
        jPanel1.add(lbl_sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 290, 351, 27));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("REQUEST DATE");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 328, 149, 27));

        request_date.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(request_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 335, 360, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("REQUEST USER");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 149, 27));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MILAGE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 395, 149, 27));

        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        jPanel1.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 365, 360, -1));
        jPanel1.add(txt_milage, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 400, 357, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("SERVIC COST");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 465, 149, 27));

        txt_cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_costActionPerformed(evt);
            }
        });
        jPanel1.add(txt_cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 470, 357, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ADITIONAL COST");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 498, 149, 27));
        jPanel1.add(txt_aditionalCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 503, 357, -1));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("SERVICE DATE");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 432, 149, 27));

        service_date.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(service_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 432, 357, -1));

        service_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        service_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                service_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(service_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 1160, 265));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("SERVICE ID");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 149, 27));
        jPanel1.add(txt_searchUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, 340, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ////String location = ComboBox_Location.getSelectedItem().toString();//joinedDate
        if (((JTextField) request_date.getDateEditor().getUiComponent()).getText().isEmpty() || txt_user.getText().isEmpty()
                || txt_milage.getText().isEmpty() || ((JTextField) request_date.getDateEditor().getUiComponent()).getText().isEmpty()
                || txt_cost.getText().isEmpty() || txt_aditionalCost.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "CAN'T EXIT EMPTY VALUES ");

        } else {

            try {

                String sql = "INSERT INTO service (Request_Date,Request_User,Milage,Service_Date,Service_Cost,Aditional_Cost)VALUES (?,?,?,?,?,?) ";
                pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);

                pst.setString(1, ((JTextField) request_date.getDateEditor().getUiComponent()).getText());
                pst.setString(2, txt_user.getText());
                pst.setString(3, txt_milage.getText());
                pst.setString(4, ((JTextField) service_date.getDateEditor().getUiComponent()).getText());
                pst.setString(5, txt_cost.getText());
                pst.setString(6, txt_aditionalCost.getText());

                pst.execute();

                JOptionPane.showMessageDialog(null, "DATA INSERTED");

                tableload();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
            txt_user.setText("");
            txt_milage.setText("");
            txt_cost.setText("");
            txt_aditionalCost.setText("");
            txt_searchUser.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
     
        String searchUser = txt_searchUser.getText();
        String sql ="SELECT * FROM service WHERE Request_User like '%"+searchUser+"%'";
        
        try {
            pst = (PreparedStatement) con.prepareStatement(sql);
            rs = pst.executeQuery();
            service_table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed

        txt_user.setText("");
        txt_milage.setText("");
        txt_cost.setText("");
        txt_aditionalCost.setText("");
        txt_searchUser.setText("");

    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        int resultTest = JOptionPane.showConfirmDialog(rootPane, "DO YOU WANT TO UPDATE THIS RECOED !");

        if (resultTest == 0) {
            String sid = lbl_sid.getText();
            String requestDate = ((JTextField) request_date.getDateEditor().getUiComponent()).getText();
            String user = txt_user.getText();
            String milage = txt_milage.getText();
            String serviceDate = ((JTextField) service_date.getDateEditor().getUiComponent()).getText();
            String serviceCost = txt_cost.getText();
            String aditionalCost = txt_aditionalCost.getText();

            String sqlUpdate = "UPDATE service SET Request_Date='" + requestDate + "',Request_User='" + user + "' , Milage='" + milage + "',"
                    + " Service_Date='" + serviceDate + "' ,Service_Cost='" + serviceCost + "' , Aditional_Cost='" + aditionalCost + "' WHERE SID = '" + sid + "'";

            try {

                pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sqlUpdate);

                pst.executeUpdate();

                tableload();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());

            }

        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "DO YOU REALLY WANT TO DELETE THIS RECORD?");

        if (result == 0) {
            String idVehicle = lbl_sid.getText();

            String queryForReject = "DELETE FROM service WHERE SID = '" + idVehicle + "' ";
            try {

                pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(queryForReject);
                pst.execute();
                //jTable2.setModel(DbUtils.resultSetToTableModel(rs));

                lbl_sid.setText("");
                txt_user.setText("");
                //jDateChooser1.setText("");
                //jDateChooser2.setText("");
                txt_milage.setText("");
                txt_cost.setText("");
                txt_aditionalCost.setText("");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            tableload();

        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        TransportMain tm = new TransportMain();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(tm).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Btn_ExitActionPerformed

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    private void txt_costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_costActionPerformed

    private void service_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_service_tableMouseClicked
        int row = service_table.getSelectedRow();

        String sid = service_table.getValueAt(row, 0).toString();
        Date requestDate1 = (Date) service_table.getValueAt(row, 1);
        String user = service_table.getValueAt(row, 2).toString();
        String milage = service_table.getValueAt(row, 3).toString();
        Date serviceDate = (Date) service_table.getValueAt(row, 4);
        String cost = service_table.getValueAt(row, 5).toString();
        String aditionalCost = service_table.getValueAt(row, 6).toString();

        try {

            DefaultTableModel model = (DefaultTableModel) service_table.getModel();

        } catch (Exception e) {
            System.out.println(e);
        }

        lbl_sid.setText(sid);

        request_date.setDate(requestDate1);
        txt_user.setText(user);
        txt_milage.setText(milage);
        service_date.setDate(serviceDate);
        txt_cost.setText(cost);
        txt_aditionalCost.setText(aditionalCost);

    }//GEN-LAST:event_service_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Exit;
    private javax.swing.JPanel PnlMenu;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_sid;
    private com.toedter.calendar.JDateChooser request_date;
    private com.toedter.calendar.JDateChooser service_date;
    private javax.swing.JTable service_table;
    private javax.swing.JTextField txt_aditionalCost;
    private javax.swing.JTextField txt_cost;
    private javax.swing.JTextField txt_milage;
    private javax.swing.JTextField txt_searchUser;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
