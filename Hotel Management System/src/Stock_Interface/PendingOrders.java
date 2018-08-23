/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stock_Interface;

import HMS_Database.MyDBConnection;
import HMS_Home.MHome;
import HRMS_Codes.ValidationHRMS;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Thishakya
 * 
 * @author Isira Seneviratne (19440268)
 */
public class PendingOrders extends javax.swing.JInternalFrame {

    /**
     * Creates new form PendingOrders
     */
    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    
    private final Color entered = new Color(104,109,213), exited = new Color(153,204,255);
    
    public PendingOrders() {
        initComponents();
        
        con = MyDBConnection.connectDB();
        
        loadTable();
    }
    
    private void loadTable() {
        try {
            pst = con.prepareStatement("SELECT Order_Id, Item_Name, Quantity, Unit, Company, Order_Date FROM pending_orders");
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while loading the table.", "Error",
                    JOptionPane.ERROR_MESSAGE);
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

        jButton11 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        PnlMenu = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(247, 249, 255));
        setMinimumSize(new java.awt.Dimension(1200, 680));
        setPreferredSize(new java.awt.Dimension(1200, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setText("Home");
        jButton11.setPreferredSize(new java.awt.Dimension(110, 25));
        jButton11.setSelected(true);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, 120, 30));

        jPanel1.setBackground(new java.awt.Color(247, 249, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Make an Order"));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Company");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 184, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Date Of Order");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 90, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 100, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 90, 40));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 100, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Item Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 62, -1, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 59, 155, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Quantity");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 97, -1, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 97, 155, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Company", "Edinborough", "Bairaha", "Ruhunu Foods" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 178, 155, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Unit");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 138, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Unit", "Kilograms", "Grams", "Liter" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 138, 155, -1));

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 160, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Item ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Item ID Number");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 27, -1, -1));

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton13.setText("Generate Report");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 260, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 710, 270));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setText("Pending Orders");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Item ID", "Item Name", "Quantity", "Unit", "Company", "Date of Order"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1184, 170));

        PnlMenu.setPreferredSize(new java.awt.Dimension(1200, 100));
        PnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(153, 204, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Food Items");
        jButton5.setToolTipText("Click to switch to the food items section.");
        jButton5.setBorder(null);
        jButton5.setPreferredSize(new java.awt.Dimension(110, 25));
        jButton5.setSelected(true);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        PnlMenu.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 120, 30));

        jButton6.setBackground(new java.awt.Color(153, 204, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Cleaning Items");
        jButton6.setToolTipText("Click to switch to the cleaning items section.");
        jButton6.setBorder(null);
        jButton6.setPreferredSize(new java.awt.Dimension(110, 25));
        jButton6.setSelected(true);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        PnlMenu.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 120, 30));

        jButton7.setBackground(new java.awt.Color(153, 204, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Room Items");
        jButton7.setToolTipText("Click to switch to the room items section.");
        jButton7.setBorder(null);
        jButton7.setPreferredSize(new java.awt.Dimension(110, 25));
        jButton7.setSelected(true);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        PnlMenu.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 120, 30));

        jButton8.setBackground(new java.awt.Color(0, 174, 238));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Pending Orders");
        jButton8.setBorder(null);
        jButton8.setPreferredSize(new java.awt.Dimension(110, 25));
        jButton8.setSelected(true);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        PnlMenu.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 120, 30));

        jButton9.setBackground(new java.awt.Color(153, 204, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Vendors");
        jButton9.setToolTipText("Click to switch to the vendors section.");
        jButton9.setBorder(null);
        jButton9.setPreferredSize(new java.awt.Dimension(110, 25));
        jButton9.setSelected(true);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton9MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton9MouseEntered(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        PnlMenu.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 120, 30));

        jButton10.setBackground(new java.awt.Color(153, 204, 255));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Payments");
        jButton10.setToolTipText("Click to switch to the payments section.");
        jButton10.setBorder(null);
        jButton10.setPreferredSize(new java.awt.Dimension(110, 25));
        jButton10.setSelected(true);
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton10MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton10MouseEntered(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        PnlMenu.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 120, 30));

        jButton12.setBackground(new java.awt.Color(153, 204, 255));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Kitchen Items");
        jButton12.setToolTipText("Click to switch to the kitchen items section.");
        jButton12.setBorder(null);
        jButton12.setPreferredSize(new java.awt.Dimension(110, 25));
        jButton12.setSelected(true);
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton12MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton12MouseEntered(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        PnlMenu.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, 120, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Stock_Images/MenuBar_Back_Main_Stock.jpg"))); // NOI18N
        jLabel12.setMaximumSize(new java.awt.Dimension(1190, 75));
        jLabel12.setMinimumSize(new java.awt.Dimension(1190, 75));
        jLabel12.setPreferredSize(new java.awt.Dimension(1190, 75));
        PnlMenu.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 70));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Stock_Images/MainBackForAll.jpg"))); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(1190, 570));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int d = JOptionPane.showConfirmDialog(null, "Do you want to delete the record?", "Delete record",
                    JOptionPane.YES_NO_OPTION);
        
        if(d == 0) {
            String item_id = jLabel8.getText();
            try {
                pst = con.prepareStatement("DELETE FROM pending_orders where Order_Id='"+item_id+"'");
                pst.execute();
                loadTable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "An error occurred while deleting the record.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextField2.getText().isEmpty()
                || jTextField3.getText().isEmpty()
                || jComboBox2.getSelectedItem().toString().isEmpty()
                || jComboBox1.getSelectedItem().toString().isEmpty()
                || ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Some data has not been entered. Enter missing data.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String item_name = jTextField2.getText();
            boolean item_name_validation = ValidationHRMS.isLetter(item_name);
            String qty = jTextField3.getText();
            boolean qty_validation = ValidationHRMS.isNumeric(qty);
            String unit = jComboBox2.getSelectedItem().toString();
            String company = jComboBox1.getSelectedItem().toString();
            String date_of_order = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();

            if(item_name_validation) {
                if(qty_validation) {
                    try {
                        String w = "INSERT INTO pending_orders(Item_Name, Quantity, Unit, Company, Order_Date) values ('"+item_name+"', '"+qty+"', '"+unit+"', '"+company+"', '"+date_of_order+"')";
                        pst = con.prepareStatement(w);
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "Details  Saved Successfully");
                        loadTable();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "An error occurred while saving.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Enter a number");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Item Name");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Do you want to update the record?", "Update record",
                    JOptionPane.YES_NO_OPTION);
        
        if(x == 0) {
            String item_id = jLabel8.getText();
            String item_name = jTextField2.getText();
            String qty = jTextField3.getText();
            String unit = jComboBox2.getSelectedItem().toString();
            String company = jComboBox1.getSelectedItem().toString();
            String date_of_order = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
        
            try {
                pst = con.prepareStatement("UPDATE pending_orders SET Order_Id ='"+item_id+"', Item_Name='"+item_name+"'"
                        + ", Quantity='"+qty+"', Unit='"+unit+"', Company='"+company+"', Order_Date='"+date_of_order+"'"
                        + " where  Order_Id='"+item_id+"'  ");
                pst.execute();
                loadTable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "An error occurred while updating.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            int row = jTable1.getSelectedRow();
            String Table_click = jTable1.getModel().getValueAt(row, 0).toString();
            pst = con.prepareStatement("select * from pending_orders where Order_Id='"+Table_click+"'");
            rs = pst.executeQuery();
            while (rs.next()) {
                String add1 = rs.getString("Order_Id");
                jLabel8.setText(add1);

                String add2 = rs.getString("Item_Name");
                jTextField2.setText(add2);

                String add3 = rs.getString("Quantity");
                jTextField3.setText(add3);

                String add4 = rs.getString("Unit");
                jComboBox2.setSelectedItem(add4);

                String add5 = rs.getString("Company");
                jComboBox1.setSelectedItem(add5);

                String add6 = rs.getString("Order_Date");
                try {
                    java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(add6);
                    jDateChooser1.setDate(date);
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(this, "Unable to parse date.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                //String add7=rs.getString("Price");
                //jTextField4.setText(add7);
            }
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null,"An error occurred while loading the row.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        try {
            String report = "D:\\SLIIT\\2nd Year\\2nd Semester\\ITP - Information Technology Project\\Project\\Hotel_Management_System(Selsan)\\Reports\\Pending Orders.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(report);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
            JasperViewer.viewReport(jp, false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while generating the report.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jLabel8.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jComboBox2.setSelectedItem("Select Unit");
        jComboBox1.setSelectedItem("Select Company");
        jDateChooser1.setDate(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Food food1 = new Food();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(food1).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        CleaningItems ci1 = new CleaningItems();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(ci1).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        RoomItems ri1 = new RoomItems();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(ri1).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        PendingOrders odr1 = new PendingOrders();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(odr1).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        VendorDetails vnd1 = new VendorDetails();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(vnd1).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Payments pay1 = new Payments();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(pay1).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        KitchenItems ki = new KitchenItems();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(ki).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        MHome mh = new MHome();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(mh).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        jButton5.setBackground(entered);
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        jButton5.setBackground(exited);
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        jButton6.setBackground(entered);
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        jButton6.setBackground(exited);
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        jButton7.setBackground(entered);
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        jButton7.setBackground(exited);
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseEntered
        jButton9.setBackground(entered);
    }//GEN-LAST:event_jButton9MouseEntered

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        jButton9.setBackground(exited);
    }//GEN-LAST:event_jButton9MouseExited

    private void jButton10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseEntered
        jButton10.setBackground(entered);
    }//GEN-LAST:event_jButton10MouseEntered

    private void jButton10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseExited
        jButton10.setBackground(exited);
    }//GEN-LAST:event_jButton10MouseExited

    private void jButton12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseEntered
        jButton12.setBackground(entered);
    }//GEN-LAST:event_jButton12MouseEntered

    private void jButton12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseExited
        jButton12.setBackground(exited);
    }//GEN-LAST:event_jButton12MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}