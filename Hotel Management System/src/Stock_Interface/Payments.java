/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stock_Interface;

import HMS_Home.MHome;
import javax.swing.JDesktopPane;
import HMS_Database.MyDBConnection;
import HRMS_Codes.ValidationHRMS;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
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
 */
public class Payments extends javax.swing.JInternalFrame {

    /**
     * Creates new form Payments
     */
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Payments() {
        initComponents();
        
        con = MyDBConnection.Myconnect();
        
        
        tableload();
    }
    public void tableload()
    {
        try {
            
        String sql = "SELECT Payment_Id, Company, Item_Name, Quantity, Unit, Payment_Date, Price FROM payment";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        } catch (SQLException e) {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton13 = new javax.swing.JButton();
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
        jButton11 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1200, 680));
        setPreferredSize(new java.awt.Dimension(1200, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setText("Payments");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, -1));

        jPanel1.setBackground(new java.awt.Color(247, 249, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Payment"));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Company");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 59, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Item");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 104, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Quantity");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 152, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 59, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Price");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 96, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 140, 211, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 101, 211, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 56, 211, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 93, 211, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("ADD");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 123, 65, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 123, 80, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("CLEAR");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, 40));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("DELETE");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 80, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Unit");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 199, 42, -1));

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 56, 211, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Payment ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Payment ID Number");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 27, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Unit", "Kilograms", "Grams", "liter" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 196, 211, -1));

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton13.setText("Generate Report");
        jButton13.setBorder(null);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 223, 210, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 720, 260));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Payment ID", "Company", "Item", "Quantity", "Unit", "Date", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 1184, 220));

        PnlMenu.setPreferredSize(new java.awt.Dimension(1200, 100));
        PnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Food Items");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton5.setPreferredSize(new java.awt.Dimension(110, 25));
        jButton5.setSelected(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        PnlMenu.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 120, -1));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("Cleaning Items");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton6.setPreferredSize(new java.awt.Dimension(110, 25));
        jButton6.setSelected(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        PnlMenu.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 120, -1));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setText("Room Items");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton7.setPreferredSize(new java.awt.Dimension(110, 25));
        jButton7.setSelected(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        PnlMenu.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 120, -1));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setText("Pending Orders");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton8.setPreferredSize(new java.awt.Dimension(110, 25));
        jButton8.setSelected(true);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        PnlMenu.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 120, -1));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setText("Venders");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton9.setPreferredSize(new java.awt.Dimension(110, 25));
        jButton9.setSelected(true);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        PnlMenu.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 120, -1));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton10.setText("Payments");
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton10.setPreferredSize(new java.awt.Dimension(110, 25));
        jButton10.setSelected(true);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        PnlMenu.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 120, -1));

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton12.setText("Kitchen Items");
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton12.setPreferredSize(new java.awt.Dimension(110, 25));
        jButton12.setSelected(true);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        PnlMenu.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 120, 25));

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton11.setText("Home");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton11.setPreferredSize(new java.awt.Dimension(110, 25));
        jButton11.setSelected(true);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        PnlMenu.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, 120, 25));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Stock_Images/MenuBar_Back_Main_Stock.jpg"))); // NOI18N
        jLabel12.setMaximumSize(new java.awt.Dimension(1190, 75));
        jLabel12.setMinimumSize(new java.awt.Dimension(1190, 75));
        jLabel12.setPreferredSize(new java.awt.Dimension(1190, 75));
        PnlMenu.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 70));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Stock_Images/MainBackForAll.jpg"))); // NOI18N
        jLabel11.setPreferredSize(new java.awt.Dimension(1190, 570));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jTextField3.getText().isEmpty()||jTextField2.getText().isEmpty()||jTextField1.getText().isEmpty()||jComboBox2.getSelectedItem().toString().isEmpty()||((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()||jTextField4.getText().isEmpty())
        {
                     JOptionPane.showMessageDialog(null,"Enter Data");
        }
        else{
        String company = jTextField3.getText();
        boolean company_validation = ValidationHRMS.isLetter(company);
        String item = jTextField2.getText();
        boolean item_validation = ValidationHRMS.isLetter(item);
        String qty = jTextField1.getText();
        boolean qty_validation = ValidationHRMS.isNumeric(qty);
        String unit = jComboBox2.getSelectedItem().toString();
        String date = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
        String price = jTextField4.getText();
        boolean price_validation = ValidationHRMS.isNumeric(price);
        
        float prs = Float.parseFloat(price);
        int qt = Integer.parseInt(qty);
        float totvalue = prs*qt;
        
        if(company_validation){
            if(item_validation){
                if(qty_validation){
                    if(price_validation){
        try {
                String w = "INSERT INTO payment(Company, Item_Name, Quantity, Unit, Payment_Date, Price) values ('"+company+"', '"+item+"', '"+qty+"', '"+unit+"', '"+date+"', '"+totvalue+"')";
            pst = con.prepareStatement(w);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Details  Saved Successfully");
            
            tableload();
        } catch (SQLException e) {
        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Enter a Number");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Enter a Number");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Invalid item name");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Invalid company name");
        }
        
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null, "Do you really want to Updare ?");
        
        if(x==0)
        {
            String Payment_Id = jLabel9.getText();
            String Company = jTextField3.getText();
            String Item_Name = jTextField3.getText();
            String Quantity = jTextField1.getText();
            String Unit = jComboBox2.getSelectedItem().toString();
            String Payment_Date = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
            String Price = jTextField4.getText();
            
            
            String sql = "UPDATE payment SET Payment_Id ='"+Payment_Id+"', Company='"+Company+"', Item_Name='"+Item_Name+"', Quantity='"+Quantity+"', Unit='"+Unit+"', Payment_Date='"+Payment_Date+"', Price='"+Price+"' where  Payment_Id='"+Payment_Id+"'  ";
        
            try {
                pst = con.prepareStatement(sql);
                pst.execute();
                
                //load table
                tableload();
            } catch (SQLException e) {
            }
        
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jLabel9.setText(null);
        jTextField3.setText(null);
        jTextField2.setText(null);
        jTextField1.setText(null);
        jComboBox2.setSelectedItem("Select Unit");
        jDateChooser1.setDate(null);
        jTextField4.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try{
            int row=jTable1.getSelectedRow();
            String Table_click=(jTable1.getModel().getValueAt(row, 0).toString());
            String sql="select * from payment where Payment_Id='"+Table_click+"'";
            pst=con.prepareStatement(sql);
            rs= (ResultSet) pst.executeQuery(sql);
            while (rs.next()){

                String add1=rs.getString("Payment_Id");
                jLabel9.setText(add1);

                String add2=rs.getString("Company");
                jTextField3.setText(add2);

                String add3=rs.getString("Item_Name");
                jTextField2.setText(add3);

                String add4=rs.getString("Quantity");
                jTextField1.setText(add4);

                String add5=rs.getString("Unit");
                jComboBox2.setSelectedItem(add5);

                String add6=rs.getString("Payment_Date");
                
        try {
                    java.util.Date date =  new SimpleDateFormat("yyyy-MM-dd").parse(add6);
                    jDateChooser1.setDate(date);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "cant get date");
        }
                

                String add7=rs.getString("Price");
                jTextField4.setText(add7);

                

            }

        }catch(Exception e){

            JOptionPane.showMessageDialog(null,e);
        }
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int d = JOptionPane.showConfirmDialog(null, "Do you want to delete ?");

        if(d==0)
        {
            String Payment_Id = jLabel9.getText();

            String sql = "DELETE FROM payment where Payment_Id='"+Payment_Id+"' ";

            try {
                pst = con.prepareStatement(sql);
                pst.execute();

                //load table
                tableload();

            } catch (SQLException e) {
            }

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        try {
            String report = "D:\\SLIIT\\2nd Year\\2nd Semester\\ITP - Information Technology Project\\Project\\Hotel_Management_System(Selsan)\\Reports\\Payments.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(report);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
            JasperViewer.viewReport(jp, false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Food food1 = new Food();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(food1).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        CleaningItems ci1 = new CleaningItems();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(ci1).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        RoomItems ri1 = new RoomItems();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(ri1).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Orders odr1 = new Orders();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(odr1).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        VenderDetails vnd1 = new VenderDetails();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(vnd1).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:

        Payments pay1 = new Payments();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(pay1).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        KitchenItems ki = new KitchenItems();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(ki).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        MHome mh = new MHome();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(mh).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed


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
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
