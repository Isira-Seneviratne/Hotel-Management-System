/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beverage_Interface;

import HMS_Database.MyDBConnection;
import HMS_Home.MHome;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Prabas Gayadeeptha
 * 
 * @author Isira Seneviratne
 */
public class Invoice extends javax.swing.JInternalFrame {

    /**
     * Creates new form Invoice
     */
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rst = null;
    String passCID;

    public Invoice() {
        initComponents();
        conn =  MyDBConnection.connectDB();
        tableLoad();
        update_table();
    }

    private void update_table() {
        try {
            String sql = "SELECT inId,Bname,tibrand,qphone,bpay,brprice from invoice01 ";
            //String sql = "SELECT id,f_name,l_name,category from trainers ";
            pst = conn.prepareStatement(sql);
            rst = pst.executeQuery();
            tab1.setModel(DbUtils.resultSetToTableModel(rst));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //table load
    public void tableLoad() {
        // Bname,tibrand,qphone,bpay,brprice
        try {
            String q = "SELECT * FROM invoice01 ";
            pst = conn.prepareStatement(q);
            rst = pst.executeQuery();
            tab1.setModel(DbUtils.resultSetToTableModel(rst));
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
        aa = new javax.swing.JLabel();
        ab = new javax.swing.JLabel();
        ac = new javax.swing.JLabel();
        ad = new javax.swing.JLabel();
        ae = new javax.swing.JLabel();
        af = new javax.swing.JLabel();
        Invo = new javax.swing.JTextField();
        ss = new javax.swing.JTextField();
        hj = new javax.swing.JTextField();
        as = new javax.swing.JTextField();
        zx = new javax.swing.JTextField();
        hh = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        Ad2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        searchbo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        cal_table = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        emp_background = new javax.swing.JLabel();
        PnlMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblBarStock = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblBeverageOrders = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1200, 680));
        setPreferredSize(new java.awt.Dimension(1200, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1190, 580));
        jPanel1.setPreferredSize(new java.awt.Dimension(1190, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 0, 204)));
        jPanel2.setForeground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aa.setText("Invoice No");
        jPanel2.add(aa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        ab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ab.setText("Date");
        jPanel2.add(ab, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        ac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ac.setText("Time");
        jPanel2.add(ac, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        ad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ad.setText("Quantity");
        jPanel2.add(ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        ae.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ae.setText("Brand");
        jPanel2.add(ae, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        af.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        af.setText("Price");
        jPanel2.add(af, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 50, 20));

        Invo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoActionPerformed(evt);
            }
        });
        Invo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InvoKeyTyped(evt);
            }
        });
        jPanel2.add(Invo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 160, 30));

        ss.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ssKeyTyped(evt);
            }
        });
        jPanel2.add(ss, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 163, 30));

        hj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hjKeyTyped(evt);
            }
        });
        jPanel2.add(hj, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 163, 30));
        jPanel2.add(as, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 163, 30));

        zx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                zxKeyTyped(evt);
            }
        });
        jPanel2.add(zx, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 163, 30));

        hh.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(hh, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 160, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 374, 520));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 148, 139), 3));

        tab1.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
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
                "Invoice No.", "Date", "Time", "Quantity", "Brand", "Price", "Amount"
            }
        ));
        tab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 790, 180));

        jPanel4.setBackground(new java.awt.Color(0, 183, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(51, 153, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 11, 133, 52));

        Ad2.setBackground(new java.awt.Color(0, 153, 0));
        Ad2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Ad2.setForeground(new java.awt.Color(255, 255, 255));
        Ad2.setText("Add");
        Ad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ad2ActionPerformed(evt);
            }
        });
        jPanel4.add(Ad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 133, 52));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 11, 127, 52));

        searchbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchboActionPerformed(evt);
            }
        });
        jPanel4.add(searchbo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 180, 30));

        jButton1.setForeground(new java.awt.Color(51, 51, 0));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 133, 30));

        jButton5.setBackground(new java.awt.Color(255, 153, 153));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 11, 123, 52));

        jButton9.setText("Home");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, -1, -1));

        jButton10.setText("Beverage Home");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, -1, -1));
        jPanel4.add(cal_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 180, 30));

        jButton4.setText("Calculation");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 123, 130, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 790, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Beverage_Images/cheap-specialty-wine.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 980, 200));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText("Invoice");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        emp_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MainBackForAll.jpg"))); // NOI18N
        emp_background.setPreferredSize(new java.awt.Dimension(1190, 570));
        jPanel1.add(emp_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        PnlMenu.setPreferredSize(new java.awt.Dimension(1200, 100));
        PnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 174, 238));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Invoice");
        jLabel2.setOpaque(true);
        PnlMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 210, 30));

        lblBarStock.setBackground(new java.awt.Color(153, 204, 255));
        lblBarStock.setForeground(new java.awt.Color(255, 255, 255));
        lblBarStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBarStock.setText("Bar Stock");
        lblBarStock.setOpaque(true);
        PnlMenu.add(lblBarStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 210, 30));

        jLabel4.setBackground(new java.awt.Color(153, 204, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Main Stock Management");
        jLabel4.setOpaque(true);
        PnlMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 210, 30));

        lblBeverageOrders.setBackground(new java.awt.Color(153, 204, 255));
        lblBeverageOrders.setForeground(new java.awt.Color(255, 255, 255));
        lblBeverageOrders.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBeverageOrders.setText("Beverage Orders");
        lblBeverageOrders.setOpaque(true);
        PnlMenu.add(lblBeverageOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 210, 30));

        jLabel6.setBackground(new java.awt.Color(153, 204, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Soft Drink Stock");
        jLabel6.setOpaque(true);
        PnlMenu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 210, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Beverage_Images/MenuBar_Back_Beverage.jpg"))); // NOI18N
        jLabel13.setMaximumSize(new java.awt.Dimension(1190, 75));
        jLabel13.setMinimumSize(new java.awt.Dimension(1190, 75));
        jLabel13.setPreferredSize(new java.awt.Dimension(1190, 75));
        PnlMenu.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InvoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //update button here
        try {
            String value1 = Invo.getText();
            String value2 = ((JTextField) hh.getDateEditor().getUiComponent()).getText();
            String value3 = ss.getText();
            String value4 = hj.getText();
            String value5 = as.getText();
            String value6 = zx.getText();
            //inId,Bname,tibrand,qphone,bpay,brprice
            String sql = "update invoice01 set Bname='" + value2 + "',tibrand='" + value3 + "',qphone='" + value4 + "',bpay='" + value5 + "',brprice='" + value6 + "' where inId = '" + value1 + "'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Record Updated");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        update_table();
        /*

        try{

            String value1= Invo.getText();
            String value2= hh.getText();
            String value3= ss.getText();
            String value4= ((JTextField)hj.getDateEditor().getUiComponent()).getText();
            String value5= as.getText();
            String value6= zx.getText();

            String q= "update invoice01 set inId='"+value1+"',Bname='"+value2+"',tibrand='"+value3+"',qphone='"+value4+"',bpay='"+value5+"',brprice='"+value6+,"'";
            pst= conn .prepareStatement(q);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Record Updated");
        }
        catch (Exception e){

            JOptionPane.showMessageDialog(null,e);

        }
        update_table();

        }

         */
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Ad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ad2ActionPerformed
        try {
            if (Invo.getText().isEmpty()
                    || ((JTextField)hh.getDateEditor().getUiComponent()).getText().isEmpty()
                    || ss.getText().isEmpty()
                    || hj.getText().isEmpty()
                    || as.getText().isEmpty()
                    || zx.getText().isEmpty())              
            {
                JOptionPane.showMessageDialog(null, "Please Enter All");
            }
            else {
                // String q = "INSERT INTO invoice01 (inId,Bname,tibrand,qphone,bpay,brprice) values (?,?,?,?,?,?)";
                String q = "INSERT INTO invoice01 (inId,Bname,tibrand,qphone,bpay,brprice) values (?,?,?,?,?,?)";
                pst = conn.prepareStatement(q);

                pst.setString(1, Invo.getText());
                pst.setString(2, ((JTextField) hh.getDateEditor().getUiComponent()).getText());
                pst.setString(3, ss.getText());
                pst.setString(4, hj.getText());
                pst.setString(5, as.getText());
                pst.setString(6, zx.getText());

                pst.execute();
                JOptionPane.showMessageDialog(null, "Successfully Saved");

                tableLoad();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //Invo.setText(null);
       // hh.setDate(null);
       // ss.setText(null);
       // hj.setText(null);
       // as.setText(null);
       // zx.setText(null);
    }//GEN-LAST:event_Ad2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.hide();
        BeverageHome e1 = new BeverageHome();
        e1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void searchboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        //Search button in here
        /*   String inId = searchbo.getText();
        String q = "SELECT inId,Bname,tibrand,qphone,bpay,brprice from invoice1 where ename LIKE '%"+inId+"%'";

        try{
            pst = conn.prepareStatement(q);
            rst = pst.executeQuery();
            tab1.setModel(DbUtils.resultSetToTableModel(rst));
        }

        catch(Exception e){

            System.out.println(e);

        }        //Search button in here
         */
        try {
            String q = "select * from invoice01 where inId=?";
            pst = conn.prepareStatement(q);
            pst.setString(1, searchbo.getText());
            rst = pst.executeQuery();                            // inId,Bname,tibrand,qphone,bpay,brprice
            if (rst.next()) {
                String add1 = rst.getString("inId");//((JTextField)date_search().getUiComponent()).getText();
                Invo.setText(add1);
                // ((JTextField).getUiComponent()).getText();
                // String add2 = rst.JDateChooser("Bname");
                //hh.JDateChooser(add2);
                String add3 = rst.getString("tibrand");
                ss.setText(add3);
                String add4 = rst.getString("qphone");
                hj.setText(add4);

                String add5 = rst.getString("bpay");
                as.setText(add5);

                String add6 = rst.getString("brprice");
                zx.setText(add6);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while retrieving the desired invoice.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // delete record
        String q = "delete from invoice01 where inId= ?";
        try {
            pst = conn.prepareStatement(q);
            pst.setString(1, Invo.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Record successfully deleted.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while deleting the record.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        update_table();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        MHome m = new MHome();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(m).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        BeverageHome m = new BeverageHome();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(m).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        double a=Double.parseDouble(hj.getText());
        double b=Double.parseDouble(zx.getText());
        double am=a*b;
        cal_table.setText(""+am);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void InvoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InvoKeyTyped
        char c =evt.getKeyChar();
        if(!(Character.isDigit(c)|| (c==KeyEvent.VK_BACK_SPACE)|| c==KeyEvent.VK_DELETE)){
           evt.consume(); 
        }
    }//GEN-LAST:event_InvoKeyTyped

    private void ssKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ssKeyTyped
         
    }//GEN-LAST:event_ssKeyTyped

    private void hjKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hjKeyTyped
        char c =evt.getKeyChar();
        if(!(Character.isDigit(c)|| (c==KeyEvent.VK_BACK_SPACE)|| c==KeyEvent.VK_DELETE)){
           evt.consume(); 
        }
    }//GEN-LAST:event_hjKeyTyped

    private void zxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zxKeyTyped
        char c =evt.getKeyChar();
        if(!(Character.isDigit(c)|| (c==KeyEvent.VK_BACK_SPACE)|| c==KeyEvent.VK_DELETE)){
           evt.consume(); 
        }
    }//GEN-LAST:event_zxKeyTyped

    private void tab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseClicked
        try {
            int row = tab1.getSelectedRow();
            String Table_click = (tab1.getModel().getValueAt(row, 0).toString());
            String q = "select * from invoice01 where inId='" + Table_click + "'";
            pst = conn.prepareStatement(q);
            rst = pst.executeQuery(q);   //inId,Bname,tibrand,qphone,bpay,brprice
            while (rst.next()) {
                String add1 = rst.getString("inId");
                Invo.setText(add1);

                //--------------------------------------------
                String add2 = rst.getString("Bname");
                //date_dob.setDate(add4);
                //get selected date
                Date date;
                try {
                    date = new SimpleDateFormat("yyyy-MM-dd").parse(add2);
                    hh.setDate(date);
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Unable to parse date.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                //-------------------------------------------
                String add3 = rst.getString("tibrand");
                ss.setText(add3);

                String add4 = rst.getString("qphone");
                hj.setText(add4);

                String add5 = rst.getString("bpay");
                as.setText(add5);

                String add6 = rst.getString("brprice");
                zx.setText(add6);
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
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tab1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ad2;
    private javax.swing.JTextField Invo;
    private javax.swing.JPanel PnlMenu;
    private javax.swing.JLabel aa;
    private javax.swing.JLabel ab;
    private javax.swing.JLabel ac;
    private javax.swing.JLabel ad;
    private javax.swing.JLabel ae;
    private javax.swing.JLabel af;
    private javax.swing.JTextField as;
    private javax.swing.JTextField cal_table;
    private javax.swing.JLabel emp_background;
    private com.toedter.calendar.JDateChooser hh;
    private javax.swing.JTextField hj;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBarStock;
    private javax.swing.JLabel lblBeverageOrders;
    private javax.swing.JTextField searchbo;
    private javax.swing.JTextField ss;
    private javax.swing.JTable tab1;
    private javax.swing.JTextField zx;
    // End of variables declaration//GEN-END:variables
}
