/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beverage_Interface;

import HMS_Database.MyDBConnection;
import HMS_Home.MHome;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Prabas Gayadeeptha
 * 
 * @author Isira Seneviratne (19440268)
 */
public class BeverageOrder extends javax.swing.JInternalFrame {
    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rst = null;
    
    private final Color entered = new Color(104,109,213), exited = new Color(153,204,255);

    public BeverageOrder() {
        initComponents();
        conn =  MyDBConnection.connectDB();
        tableLoad();
        tableLoad1();
        // tableLoad3();
        tableLoad4();
    }
    
    public void tableLoad() {
        // Bname,tibrand,qphone,bpay,brprice
        try {
            String q = "SELECT * FROM order_table ";
            pst = conn.prepareStatement(q);
            rst = pst.executeQuery();
            tav.setModel(DbUtils.resultSetToTableModel(rst));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to load records.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void tableLoad1() {
       // Bname,tibrand,qphone,bpay,brprice
        try {
            String r = "SELECT * FROM main22 ";
            pst = conn.prepareStatement(r);   
            rst = pst.executeQuery();
            tab4.setModel(DbUtils.resultSetToTableModel(rst));
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to load records.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
       
    public void tableLoad3() {
        try {
            Date todatDate = new Date();
            DateFormat todayFormat= new SimpleDateFormat("yyyy-MM-dd");
            String todayDateString = todayFormat.format(todatDate);    
            String sql = "SELECT company,brand,quantity,date from order_table WHERE ExpiryDate  <= '"+todayDateString+"'";
            pst = conn.prepareStatement(sql);   
            rst = pst.executeQuery();
            das.setModel(DbUtils.resultSetToTableModel(rst)); 
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while loading expiry records.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void tableLoad4() {
        // Bname,tibrand,qphone,bpay,brprice
        try {
            String q = "SELECT * FROM order_table ";
            pst = conn.prepareStatement(q);
            rst = pst.executeQuery();

            das.setModel(DbUtils.resultSetToTableModel(rst));
        } catch (SQLException e) {
            System.out.println(e);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namebox = new javax.swing.JTextField();
        quan = new javax.swing.JTextField();
        dat = new com.toedter.calendar.JDateChooser();
        bra = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab4 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tav = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        searcha = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        das = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        emp_background = new javax.swing.JLabel();
        PnlMenu = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblMainStock = new javax.swing.JLabel();
        lblBarStock = new javax.swing.JLabel();
        lblInvoice = new javax.swing.JLabel();
        lblSoftDrinkStock = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1200, 680));
        setPreferredSize(new java.awt.Dimension(1200, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1190, 580));
        jPanel1.setPreferredSize(new java.awt.Dimension(1190, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 255), new java.awt.Color(0, 102, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Company");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Brand");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Quantity");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Date");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        namebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameboxActionPerformed(evt);
            }
        });
        jPanel2.add(namebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 158, 30));
        jPanel2.add(quan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 160, 30));

        dat.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(dat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 160, 30));
        jPanel2.add(bra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 160, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 403, 460));

        tab4.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
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
                "Stock ID", "Product name", "Brand", "Volume", "Quantity", "Total Count"
            }
        ));
        jScrollPane2.setViewportView(tab4);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 660, 130));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 148, 139), 3));

        tav.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Company", "Brand", "Quantity", "Date"
            }
        ));
        tav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tavMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tav);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 660, 150));

        jPanel4.setBackground(new java.awt.Color(0, 183, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(770, 160));

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 51, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton9.setText("Home");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Beverage Home");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searcha, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addGap(26, 26, 26)
                .addComponent(jButton10)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9)
                            .addComponent(jButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 770, 80));

        jLabel5.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("<html>Beverage<br>Orders</html>");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 100));

        das.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Company", "Brand", "Quantity", "Date"
            }
        ));
        jScrollPane3.setViewportView(das);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 660, 120));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Choose the Expired Drinks");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 330, -1));

        emp_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MainBackForAll.jpg"))); // NOI18N
        emp_background.setPreferredSize(new java.awt.Dimension(1190, 570));
        jPanel1.add(emp_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        PnlMenu.setPreferredSize(new java.awt.Dimension(1200, 100));
        PnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 174, 238));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Beverage Orders");
        jLabel6.setOpaque(true);
        PnlMenu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 210, 30));

        lblMainStock.setBackground(new java.awt.Color(153, 204, 255));
        lblMainStock.setForeground(new java.awt.Color(255, 255, 255));
        lblMainStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainStock.setText("Main Stock Management");
        lblMainStock.setOpaque(true);
        lblMainStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMainStockMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMainStockMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMainStockMouseEntered(evt);
            }
        });
        PnlMenu.add(lblMainStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 210, 30));

        lblBarStock.setBackground(new java.awt.Color(153, 204, 255));
        lblBarStock.setForeground(new java.awt.Color(255, 255, 255));
        lblBarStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBarStock.setText("Bar Stock");
        lblBarStock.setOpaque(true);
        lblBarStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBarStockMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBarStockMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBarStockMouseEntered(evt);
            }
        });
        PnlMenu.add(lblBarStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 210, 30));

        lblInvoice.setBackground(new java.awt.Color(153, 204, 255));
        lblInvoice.setForeground(new java.awt.Color(255, 255, 255));
        lblInvoice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInvoice.setText("Invoice");
        lblInvoice.setOpaque(true);
        lblInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInvoiceMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInvoiceMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInvoiceMouseEntered(evt);
            }
        });
        PnlMenu.add(lblInvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 210, 30));

        lblSoftDrinkStock.setBackground(new java.awt.Color(153, 204, 255));
        lblSoftDrinkStock.setForeground(new java.awt.Color(255, 255, 255));
        lblSoftDrinkStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoftDrinkStock.setText("Soft Drink Stock");
        lblSoftDrinkStock.setOpaque(true);
        lblSoftDrinkStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSoftDrinkStockMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSoftDrinkStockMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSoftDrinkStockMouseEntered(evt);
            }
        });
        PnlMenu.add(lblSoftDrinkStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 210, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Beverage_Images/MenuBar_Back_Beverage.jpg"))); // NOI18N
        jLabel13.setMaximumSize(new java.awt.Dimension(1190, 75));
        jLabel13.setMinimumSize(new java.awt.Dimension(1190, 75));
        jLabel13.setPreferredSize(new java.awt.Dimension(1190, 75));
        PnlMenu.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String q = "INSERT INTO order_table (company,brand,quantity,date) values (?,?,?,?)";
            pst = conn.prepareStatement(q);

            String name = namebox.getText();
            pst.setString(1, namebox.getText());
            pst.setString(2, bra.getText());
            pst.setString(3, quan.getText());
            pst.setString(4, ((JTextField) dat.getDateEditor().getUiComponent()).getText());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Inserted record successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while inserting the record.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          // delete record
        String q = "delete from order_table  where company= ?";
        try {
            pst = conn.prepareStatement(q);

            pst.setString(1, namebox.getText());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Record deleted.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while deleting the record.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
       // update_table();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //search button here
        /* String search = searcha.getText();

        M          //  String q = "SELECT company,brand,quantity,date from order_table where ename LIKE '%"+namebox+"%'";

        //  pst.conn.prepareStatement(q);
        //   rst = pst.executeQuery();

        //    etable.setModel(DbUtils.resultSetToTableModel(rst));
        }
        //   catch(Exception e)
        //   {
            //   System.out.println(e);
        }
         */ DefaultTableModel model = (DefaultTableModel) tav.getModel();
        String company = searcha.getText();
        String q = "SELECT company,brand,quantity,date from order_table where ename LIKE '%" + company + "%'";

        try {
            pst = conn.prepareStatement(q);
            rst = pst.executeQuery();
            tav.setModel(DbUtils.resultSetToTableModel(rst));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while retrieving company details.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        MHome m = new MHome();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(m).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        BeverageHome m = new BeverageHome();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(m).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void tavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tavMouseClicked
         try {
            int row = tav.getSelectedRow();
            String Table_click = (tav.getModel().getValueAt(row, 0).toString());
            String q = "select * from order_table where company='" + Table_click + "'";
            pst = conn.prepareStatement(q);
            rst = (ResultSet) pst.executeQuery(q);  
            while (rst.next()) {                        // order_table (company,brand,quantity,date) 
                String add1 = rst.getString("company");
                namebox.setText(add1);
                //--------------------------------------------
                String add2 = rst.getString("date");
                //date_dob.setDate(add4);
                //get selected date
                java.util.Date date;
                try {
                    date = new SimpleDateFormat("yyyy-MM-dd").parse(add2);
                    dat.setDate(date);
                } catch (ParseException ex) {

                }
                //-------------------------------------------
                String add3 = rst.getString("quantity");
                bra.setText(add3);
                
                String add4 = rst.getString("brand");
                quan.setText(add4);

                //-------------------------------------------
                // String add12=rs.getString("joined_date");
                //date_joined.setText(add9);

                //get selected date
                //  try {
                    //date = new SimpleDateFormat("yyyy-MM-dd").parse(add12);
                    //date_joined.setDate(date);
                    //  } catch (ParseException ex) {
                    //    }
                //-------------------------------------------
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while retrieving the desired records.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tavMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       tableLoad3();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void lblBarStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarStockMouseClicked
        getDesktopPane().add(new BarStockManagement()).setVisible(true);
        dispose();
    }//GEN-LAST:event_lblBarStockMouseClicked

    private void lblInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInvoiceMouseClicked
        getDesktopPane().add(new Invoice()).setVisible(true);
        dispose();
    }//GEN-LAST:event_lblInvoiceMouseClicked

    private void lblSoftDrinkStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSoftDrinkStockMouseClicked
        getDesktopPane().add(new SoftDrinkStock()).setVisible(true);
        dispose();
    }//GEN-LAST:event_lblSoftDrinkStockMouseClicked

    private void lblMainStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMainStockMouseClicked
        getDesktopPane().add(new MainStockManagement()).setVisible(true);
        dispose();
    }//GEN-LAST:event_lblMainStockMouseClicked

    private void lblBarStockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarStockMouseEntered
        lblBarStock.setBackground(entered);
    }//GEN-LAST:event_lblBarStockMouseEntered

    private void lblBarStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarStockMouseExited
        lblBarStock.setBackground(exited);
    }//GEN-LAST:event_lblBarStockMouseExited

    private void lblInvoiceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInvoiceMouseEntered
        lblInvoice.setBackground(entered);
    }//GEN-LAST:event_lblInvoiceMouseEntered

    private void lblInvoiceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInvoiceMouseExited
        lblInvoice.setBackground(exited);
    }//GEN-LAST:event_lblInvoiceMouseExited

    private void lblSoftDrinkStockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSoftDrinkStockMouseEntered
        lblSoftDrinkStock.setBackground(entered);
    }//GEN-LAST:event_lblSoftDrinkStockMouseEntered

    private void lblSoftDrinkStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSoftDrinkStockMouseExited
        lblSoftDrinkStock.setBackground(exited);
    }//GEN-LAST:event_lblSoftDrinkStockMouseExited

    private void lblMainStockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMainStockMouseEntered
        lblMainStock.setBackground(entered);
    }//GEN-LAST:event_lblMainStockMouseEntered

    private void lblMainStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMainStockMouseExited
        lblMainStock.setBackground(exited);
    }//GEN-LAST:event_lblMainStockMouseExited
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlMenu;
    private javax.swing.JTextField bra;
    private javax.swing.JTable das;
    private com.toedter.calendar.JDateChooser dat;
    private javax.swing.JLabel emp_background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBarStock;
    private javax.swing.JLabel lblInvoice;
    private javax.swing.JLabel lblMainStock;
    private javax.swing.JLabel lblSoftDrinkStock;
    private javax.swing.JTextField namebox;
    private javax.swing.JTextField quan;
    private javax.swing.JTextField searcha;
    private javax.swing.JTable tab4;
    private javax.swing.JTable tav;
    // End of variables declaration//GEN-END:variables
}