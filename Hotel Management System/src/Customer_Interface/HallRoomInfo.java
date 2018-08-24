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
import java.sql.Statement;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
//import net.proteanit.sql.DbUtils;

/**
 *
 * @author Prabas Gayadeeptha
 */
public class HallRoomInfo extends javax.swing.JInternalFrame {

    /**
     * Creates new form HallINFO
     */
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    java.util.Date date;

    public HallRoomInfo() {
        initComponents();
        conn = MyDBConnection.connectDB();
        pnl_Hall.setVisible(false);
        pnl_Room.setVisible(false);
    }

    public void LoadbookingTableRuby() {
        try {
            String sql = "SELECT * FROM `hall` WHERE Hall_name= \"Ruby\"";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
//            jTableHall.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cant load Booking Table");
        }
    }

    public void LoadbookingTablepearl() {
        try {
            String sql = "SELECT * FROM `hall` WHERE Hall_name= \"pearl\"";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            //jTableHall.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cant load Booking Table");
        }
    }

    public void LoadbookingTable() {
        try {
            String sql = "Select * from hall";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
//            jTableHall.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cant load Booking Table");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlMenu = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnl_Hall = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        BtnSerch2 = new javax.swing.JButton();
        cmbsearch = new javax.swing.JComboBox<>();
        Txtsearch = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jRadioButtonPearl = new javax.swing.JRadioButton();
        jRadioButtonRuby = new javax.swing.JRadioButton();
        jRadioButtonAll = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        BtnAdd = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        BtnRemove = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BtnBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHall = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        emp_background = new javax.swing.JLabel();
        pnl_Room = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        BtnSerch4 = new javax.swing.JButton();
        cmbsearch2 = new javax.swing.JComboBox<>();
        Txtsearch2 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        Btn_Add = new javax.swing.JButton();
        Btn_Edit = new javax.swing.JButton();
        Btn_Remove = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        BtnBack2 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableRoom = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        emp_background1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1200, 680));
        setPreferredSize(new java.awt.Dimension(1200, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlMenu.setPreferredSize(new java.awt.Dimension(1200, 100));
        PnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        PnlMenu.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer_Images/MenuBar_Back_Main_Customer.jpg"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(1190, 75));
        jLabel7.setMinimumSize(new java.awt.Dimension(1190, 75));
        jLabel7.setPreferredSize(new java.awt.Dimension(1190, 75));
        PnlMenu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 70));

        jLayeredPane1.setMinimumSize(new java.awt.Dimension(1190, 580));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_Hall.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer_Images/bedroom1.png"))); // NOI18N
        jLabel1.setText("Hall Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 301, -1));

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnSerch2.setText("Search");
        BtnSerch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSerch2ActionPerformed(evt);
            }
        });
        jPanel7.add(BtnSerch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 80, 30));

        cmbsearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Find a Hall by name", "Find a Hall by ID" }));
        jPanel7.add(cmbsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 30));
        jPanel7.add(Txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 160, 30));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 340, 90));

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButtonPearl.setText("Hall Pearl");
        jRadioButtonPearl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPearlActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButtonPearl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jRadioButtonRuby.setText("Hall Ruby");
        jRadioButtonRuby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRubyActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButtonRuby, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jRadioButtonAll.setText("All");
        jRadioButtonAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAllActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButtonAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel8.setText("Advanced View");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 11, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 110, 100));

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
        jPanel4.add(BtnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, -1));

        BtnEdit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnEdit.setText("EDIT");
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });
        jPanel4.add(BtnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, -1));

        BtnRemove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnRemove.setText("Remove");
        BtnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemoveActionPerformed(evt);
            }
        });
        jPanel4.add(BtnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, -1));

        jLabel9.setText("Remove a selected hal");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel6.setText("Edit a selected hall");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel5.setText("Add a new hall");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 250, 120));

        BtnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnBack.setText("Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 30));

        pnl_Hall.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 160));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(jTableHall);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1150, 170));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Hall Details");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 26, 130, 24));

        pnl_Hall.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1190, 250));

        emp_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MainBackForAll.jpg"))); // NOI18N
        emp_background.setPreferredSize(new java.awt.Dimension(1190, 570));
        pnl_Hall.add(emp_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 580));

        jLayeredPane1.add(pnl_Hall, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 580));

        pnl_Room.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer_Images/bedroom1.png"))); // NOI18N
        jLabel14.setText("Room information");
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 301, -1));

        jPanel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnSerch4.setText("Search");
        BtnSerch4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSerch4ActionPerformed(evt);
            }
        });
        jPanel12.add(BtnSerch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 80, 30));

        cmbsearch2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Find a Room by Customer Name", "Find a Room by Booking ID" }));
        jPanel12.add(cmbsearch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));
        jPanel12.add(Txtsearch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 210, 30));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 420, 90));

        jPanel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton1.setText("Rooms ");
        jPanel13.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jRadioButton2.setText("Halls");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel13.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jRadioButton3.setText("All");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel13.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel15.setText("Advanced View");
        jPanel13.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 11, -1, -1));

        jPanel11.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 100, 100));

        jPanel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Add.setText("ADD");
        Btn_Add.setToolTipText("");
        Btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AddActionPerformed(evt);
            }
        });
        jPanel14.add(Btn_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, -1));

        Btn_Edit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Edit.setText("EDIT");
        Btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EditActionPerformed(evt);
            }
        });
        jPanel14.add(Btn_Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, -1));

        Btn_Remove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Remove.setText("Remove");
        Btn_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RemoveActionPerformed(evt);
            }
        });
        jPanel14.add(Btn_Remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, -1));

        jLabel16.setText("Remove a selected room");
        jPanel14.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel17.setText("Edit a selected room");
        jPanel14.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel18.setText("Add a new room");
        jPanel14.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jPanel11.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 250, 120));

        BtnBack2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnBack2.setText("Back");
        BtnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBack2ActionPerformed(evt);
            }
        });
        jPanel11.add(BtnBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 30));

        pnl_Room.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 160));

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Booking ID", "Customer Name", "Description", "Single Bed", "Double Bed", "Extra Bed", "Total Amount"
            }
        ));
        jTableRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRoomMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableRoom);

        jPanel15.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 72, 1170, 170));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Room Details");
        jPanel15.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 26, 130, 24));

        pnl_Room.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, 250));

        emp_background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MainBackForAll.jpg"))); // NOI18N
        emp_background1.setPreferredSize(new java.awt.Dimension(1190, 570));
        pnl_Room.add(emp_background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 580));

        jLayeredPane1.add(pnl_Room, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 580));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSerch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSerch2ActionPerformed
        // TODO add your handling code here:
        CusDBOperations ser = new CusDBOperations();
        String select = cmbsearch.getSelectedItem().toString();

        if (select.equals("Find a Customer by name")) {
            //  ser.SearchData(Txtsearch, "candidate", "candidateID", "", "Candidate ID");

        } else if (select.equals("Find a Customer by address")) {
            //    ser.SearchData(tbl_candidate, txt_csearch, lbl_SearchValidate, "candidate                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "full_name", "", "Candidate Name");
        }
    }//GEN-LAST:event_BtnSerch2ActionPerformed

    private void jRadioButtonPearlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPearlActionPerformed
        // TODO add your handling code here:
        LoadbookingTablepearl();
    }//GEN-LAST:event_jRadioButtonPearlActionPerformed

    private void jRadioButtonRubyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonRubyActionPerformed
        // TODO add your handling code here:
        LoadbookingTableRuby();
    }//GEN-LAST:event_jRadioButtonRubyActionPerformed

    private void jRadioButtonAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAllActionPerformed
        // TODO add your handling code here:
        LoadbookingTable();
    }//GEN-LAST:event_jRadioButtonAllActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        PaymentAddHall CA = new PaymentAddHall();
        CA.setVisible(true);
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        // TODO add your handling code here:
        PaymentEditRoom ER = new PaymentEditRoom();
        ER.setVisible(true);
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_BtnBackActionPerformed

    private void jTableHallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHallMouseClicked
        // TODO add your handling code here:
        CustomerInfo cs = new CustomerInfo();
        cs.setVisible(true);
    }//GEN-LAST:event_jTableHallMouseClicked

    private void BtnSerch4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSerch4ActionPerformed
        // TODO add your handling code here:
        CusDBOperations ser = new CusDBOperations();
        String select = cmbsearch.getSelectedItem().toString();

        if (select.equals("Find a Customer by name")) {
            //  ser.SearchData(Txtsearch, "candidate", "candidateID", "", "Candidate ID");

        } else if (select.equals("Find a Customer by address")) {
            //    ser.SearchData(tbl_candidate, txt_csearch, lbl_SearchValidate, "candidate                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "full_name", "", "Candidate Name");
        }
    }//GEN-LAST:event_BtnSerch4ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        LoadbookingTable();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void Btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AddActionPerformed
        PaymentAddRoom CA = new PaymentAddRoom();
        CA.setVisible(true);
    }//GEN-LAST:event_Btn_AddActionPerformed

    private void Btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EditActionPerformed
        // TODO add your handling code here:
        PaymentEditRoom Er = new PaymentEditRoom();
        Er.setVisible(true);
    }//GEN-LAST:event_Btn_EditActionPerformed

    private void BtnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBack2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_BtnBack2ActionPerformed

    private void jTableRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRoomMouseClicked
        // TODO add your handling code here:
        CustomerInfo cs = new CustomerInfo();
        cs.setVisible(true);
    }//GEN-LAST:event_jTableRoomMouseClicked

    private void jComboBox1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBox1PropertyChange
      
    }//GEN-LAST:event_jComboBox1PropertyChange

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        String type = jComboBox1.getSelectedItem().toString();
        if (type.equals("Select Reservation type")) {
            pnl_Hall.setVisible(false);
            pnl_Room.setVisible(false);
        } else if (type.equals("Room")) {
            pnl_Hall.setVisible(false);
            pnl_Room.setVisible(true);
        } else if (type.equals("Hall")) {
            pnl_Hall.setVisible(true);
            pnl_Room.setVisible(false);
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void BtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoveActionPerformed
        // TODO add your handling code here:
         String message="Sure?";

        int reply = JOptionPane.showConfirmDialog(null, message, "warning", JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.YES_OPTION)
        {
            new PayDBOperations().deleteHall(jTableHall);
        }
        else
        {

        }

        // clearFields();
        //dispose();
    }//GEN-LAST:event_BtnRemoveActionPerformed

    private void Btn_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RemoveActionPerformed
        // TODO add your handling code here:
        String message="Sure?";

        int reply = JOptionPane.showConfirmDialog(null, message, "warning", JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.YES_OPTION)
        {
            new PayDBOperations().deleteRoom(jTableRoom);
        }
        else
        {

        }
    }//GEN-LAST:event_Btn_RemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnBack2;
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnRemove;
    private javax.swing.JButton BtnSerch2;
    private javax.swing.JButton BtnSerch4;
    private javax.swing.JButton Btn_Add;
    private javax.swing.JButton Btn_Edit;
    private javax.swing.JButton Btn_Remove;
    private javax.swing.JPanel PnlMenu;
    private javax.swing.JTextField Txtsearch;
    private javax.swing.JTextField Txtsearch2;
    private javax.swing.JComboBox<String> cmbsearch;
    private javax.swing.JComboBox<String> cmbsearch2;
    private javax.swing.JLabel emp_background;
    private javax.swing.JLabel emp_background1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButtonAll;
    private javax.swing.JRadioButton jRadioButtonPearl;
    private javax.swing.JRadioButton jRadioButtonRuby;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableHall;
    private javax.swing.JTable jTableRoom;
    private javax.swing.JPanel pnl_Hall;
    private javax.swing.JPanel pnl_Room;
    // End of variables declaration//GEN-END:variables
}
