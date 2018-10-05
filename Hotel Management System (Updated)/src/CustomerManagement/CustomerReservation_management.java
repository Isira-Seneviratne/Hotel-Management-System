/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerManagement;

//import HMS_Home.MHome;
import FinanceManagement.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Upeksha
 */
public class CustomerReservation_management extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public CustomerReservation_management() {
        initComponents();
    }
    
    JTabbedPane jtp = new JTabbedPane();
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        BtnSerch = new javax.swing.JButton();
        cmbsearch = new javax.swing.JComboBox<>();
        Txtsearch = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_cus = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnGenReport = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        BtnSerch1 = new javax.swing.JButton();
        Txtsearch1 = new javax.swing.JTextField();
        cmbsearch2 = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jRadioButtonAll = new javax.swing.JRadioButton();
        jRadioButtonRuby = new javax.swing.JRadioButton();
        jRadioButtonPearl = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        btnAdd1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();
        btnGenReport1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableHall = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1200, 680));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(102, 0, 51));
        jTabbedPane1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1200, 680));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(248, 248, 248));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnSerch.setText("Search");
        BtnSerch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSerchActionPerformed(evt);
            }
        });
        jPanel4.add(BtnSerch, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 80, 30));

        cmbsearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Find a Customer by name", "Find a Customer by address" }));
        jPanel4.add(cmbsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));
        jPanel4.add(Txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 160, 30));

        jPanel11.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 450, 60));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("View Only"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton1.setText("Room");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jRadioButton2.setText("Hall");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 52, -1, -1));

        jRadioButton3.setText("All ");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 78, -1, -1));

        jPanel11.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 110, 125));

        jPanel12.setBackground(new java.awt.Color(248, 248, 248));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Details"));

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

        btnAdd.setBackground(new java.awt.Color(102, 153, 255));
        btnAdd.setForeground(new java.awt.Color(238, 238, 238));
        btnAdd.setText("Add");

        btnDelete.setBackground(new java.awt.Color(204, 0, 0));
        btnDelete.setForeground(new java.awt.Color(238, 238, 238));
        btnDelete.setText("Delete");

        btnUpdate.setBackground(new java.awt.Color(51, 102, 0));
        btnUpdate.setForeground(new java.awt.Color(238, 238, 238));
        btnUpdate.setText("Update");

        btnClear.setBackground(new java.awt.Color(153, 153, 153));
        btnClear.setText("Clear");

        btnGenReport.setBackground(new java.awt.Color(255, 255, 0));
        btnGenReport.setText("Generate Report");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnClear)
                .addGap(18, 18, 18)
                .addComponent(btnGenReport)
                .addGap(228, 228, 228))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnClear)
                    .addComponent(btnGenReport))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Customer Management", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(248, 248, 248));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnSerch1.setText("Search");
        BtnSerch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSerch1ActionPerformed(evt);
            }
        });
        jPanel7.add(BtnSerch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 80, 30));
        jPanel7.add(Txtsearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 160, 30));

        cmbsearch2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Find a Hall by name", "Find a Hall by ID" }));
        jPanel7.add(cmbsearch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 30));

        jPanel13.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 440, 60));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("View Only"));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButtonAll.setText("All");
        jRadioButtonAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAllActionPerformed(evt);
            }
        });
        jPanel8.add(jRadioButtonAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jRadioButtonRuby.setText("Hall Ruby");
        jRadioButtonRuby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRubyActionPerformed(evt);
            }
        });
        jPanel8.add(jRadioButtonRuby, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jRadioButtonPearl.setText("Hall Pearl");
        jRadioButtonPearl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPearlActionPerformed(evt);
            }
        });
        jPanel8.add(jRadioButtonPearl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel13.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 110, 110));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Reservation type", "Room", "Hall" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBox1PropertyChange(evt);
            }
        });
        jPanel13.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 30));

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1140, 140));

        jPanel14.setBackground(new java.awt.Color(248, 248, 248));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Details"));

        btnAdd1.setBackground(new java.awt.Color(102, 153, 255));
        btnAdd1.setForeground(new java.awt.Color(238, 238, 238));
        btnAdd1.setText("Add");

        btnDelete1.setBackground(new java.awt.Color(204, 0, 0));
        btnDelete1.setForeground(new java.awt.Color(238, 238, 238));
        btnDelete1.setText("Delete");

        btnUpdate1.setBackground(new java.awt.Color(51, 102, 0));
        btnUpdate1.setForeground(new java.awt.Color(238, 238, 238));
        btnUpdate1.setText("Update");

        btnClear1.setBackground(new java.awt.Color(153, 153, 153));
        btnClear1.setText("Clear");

        btnGenReport1.setBackground(new java.awt.Color(255, 255, 0));
        btnGenReport1.setText("Generate Report");

        jTableHall.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Booking ID", "Customer Name", "Reservation Date", "Hall Name", "Description", "Total Amount"
            }
        ));
        jTableHall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableHallMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableHall);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(487, Short.MAX_VALUE)
                .addComponent(btnAdd1)
                .addGap(18, 18, 18)
                .addComponent(btnDelete1)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate1)
                .addGap(18, 18, 18)
                .addComponent(btnClear1)
                .addGap(18, 18, 18)
                .addComponent(btnGenReport1)
                .addGap(228, 228, 228))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd1)
                    .addComponent(btnDelete1)
                    .addComponent(btnUpdate1)
                    .addComponent(btnClear1)
                    .addComponent(btnGenReport1))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1150, -1));

        jTabbedPane1.addTab("Reservation Information", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1223, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Customer Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DatePickPayTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatePickPayTableActionPerformed
        //Getting Current date
        Date todayDate = new Date();
        DateFormat todayFormat = new SimpleDateFormat("yyyy-MM-dd");
        String todayDateString = todayFormat.format(todayDate);

  
    }//GEN-LAST:event_DatePickPayTableActionPerformed

    private void DatePickPayTable2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatePickPayTable2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatePickPayTable2ActionPerformed

    private void DatePickPayTable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatePickPayTable1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatePickPayTable1ActionPerformed

    private void DatePickPayTable3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatePickPayTable3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatePickPayTable3ActionPerformed

    private void DatePickPayTable4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatePickPayTable4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatePickPayTable4ActionPerformed

    private void DatePickPayTable5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatePickPayTable5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatePickPayTable5ActionPerformed

    private void DatePickPayTable6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatePickPayTable6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatePickPayTable6ActionPerformed

    private void BtnSerchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSerchActionPerformed
        // TODO add your handling code here:
       /* CusDBOperations ser = new CusDBOperations ();
        String select = cmbsearch.getSelectedItem().toString();
        if (select.equals("Find a Customer by name")) {
            String sql = "Select * from customer where name LIKE '"+Txtsearch.getText()+"%'";
            ser.SearchData(jTable_cus,  Txtsearch, sql, "");

        } else if (select.equals("Find a Customer by address")) {
            String sql = "Select * from customer where address LIKE '"+Txtsearch.getText()+"%'";
            ser.SearchData(jTable_cus,  Txtsearch, sql, "");
                 }*/
    }//GEN-LAST:event_BtnSerchActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        //LoadCustomerTable();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void BtnSerch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSerch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSerch1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        /*String type = jComboBox1.getSelectedItem().toString();
        if (type.equals("Select Reservation type")) {
            pnl_Hall.setVisible(false);
            pnl_Room.setVisible(false);
        } else if (type.equals("Room")) {
            pnl_Hall.setVisible(false);
            pnl_Room.setVisible(true);
        } else if (type.equals("Hall")) {
            pnl_Hall.setVisible(true);
            pnl_Room.setVisible(false);
        }*/
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBox1PropertyChange

    }//GEN-LAST:event_jComboBox1PropertyChange

    private void jRadioButtonAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAllActionPerformed
        // TODO add your handling code here:
        //LoadbookingTable();
    }//GEN-LAST:event_jRadioButtonAllActionPerformed

    private void jRadioButtonRubyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonRubyActionPerformed
        // TODO add your handling code here:
        //LoadbookingTableRuby();
    }//GEN-LAST:event_jRadioButtonRubyActionPerformed

    private void jRadioButtonPearlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPearlActionPerformed
        // TODO add your handling code here:
        //LoadbookingTablepearl();
    }//GEN-LAST:event_jRadioButtonPearlActionPerformed

    private void jTableHallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHallMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jTableHallMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSerch;
    private javax.swing.JButton BtnSerch1;
    private javax.swing.JTextField Txtsearch;
    private javax.swing.JTextField Txtsearch1;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnGenReport;
    private javax.swing.JButton btnGenReport1;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JComboBox<String> cmbsearch;
    private javax.swing.JComboBox<String> cmbsearch2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButtonAll;
    private javax.swing.JRadioButton jRadioButtonPearl;
    private javax.swing.JRadioButton jRadioButtonRuby;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableHall;
    private javax.swing.JTable jTable_cus;
    // End of variables declaration//GEN-END:variables

    
}
