/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beverage_Interface;

import HMS_Database.MyDBConnection;
import HMS_Home.MHome;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Prabas Gayadeeptha
 */
public class BarStock_Management extends javax.swing.JInternalFrame {
    
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rst=null;

    /**
     
     */
    public BarStock_Management() {
        initComponents();
        
        conn=MyDBConnection.connectDB();
         tableLoad();
     update_table();
    }
     private void update_table() {

        try {
            String sql = "SELECT Stock_id,product_name,Brand,Volume,Quantity,Pay_by,Price,Amount from Bar_Stock ";
            //String sql = "SELECT id,f_name,l_name,category from trainers ";
            pst = conn.prepareStatement(sql);
            rst = pst.executeQuery();

            tab2.setModel(DbUtils.resultSetToTableModel(rst));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }

    }
    
    
    
      //table load
    public void tableLoad() {

       
        try {

            String q = "SELECT * FROM Bar_Stock ";
            pst = conn.prepareStatement(q);
            rst = pst.executeQuery();

            tab2.setModel(DbUtils.resultSetToTableModel(rst));

        } catch (Exception e) {
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
        jLabel5 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t6 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        searbo2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        REPORT = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        emp_background = new javax.swing.JLabel();
        PnlMenu = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1200, 680));
        setPreferredSize(new java.awt.Dimension(1200, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1190, 580));
        jPanel1.setPreferredSize(new java.awt.Dimension(1190, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 51, 204)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Stock ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 49, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Product Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 97, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Brand");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 142, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Volume");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 237, -1, -1));

        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 120, -1));
        jPanel2.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 120, -1));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));
        jPanel2.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 120, -1));
        jPanel2.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 120, -1));
        jPanel2.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 120, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 330, 300));

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 0, 204)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Pay By");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 31, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Price of one");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 76, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Amount");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 121, -1, -1));
        jPanel3.add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 118, -1));
        jPanel3.add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 115, 118, -1));

        t6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit Card", "Cheque", "" }));
        jPanel3.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 23, 118, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 330, 170));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(51, 51, 255)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Stock ID", "Product name", "Brand", "Volume", "Quantity", "Pay By", "Price", "Amount"
            }
        ));
        tab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab2);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 820, 180));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 820, 190));

        jPanel4.setBackground(new java.awt.Color(0, 183, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Add");
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Beverage_Images/Update-icon.png"))); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 140, 47));

        jButton5.setBackground(new java.awt.Color(255, 51, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Beverage_Images/disaprrove-icon.png"))); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, 47));
        jPanel4.add(searbo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 140, 30));

        jButton6.setBackground(new java.awt.Color(0, 102, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Beverage_Images/View-Tender-icon.png"))); // NOI18N
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 44));

        jButton7.setBackground(new java.awt.Color(0, 204, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Beverage_Images/Accept-icon.png"))); // NOI18N
        jButton7.setText("Add");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 50));

        jButton9.setText("Home");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, -1, -1));

        jButton10.setText("Beverage Home");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, -1));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Beverage_Images/calculate-icon.png"))); // NOI18N
        jButton11.setText("Calculation");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, 50));

        REPORT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        REPORT.setForeground(new java.awt.Color(204, 0, 0));
        REPORT.setText("REPORT");
        REPORT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPORTActionPerformed(evt);
            }
        });
        jPanel4.add(REPORT, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 280, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 820, 160));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Beverage_Images/cheap-specialty-wine.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 890, 210));

        jLabel11.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Bar Stock");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 290, -1));

        emp_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MainBackForAll.jpg"))); // NOI18N
        emp_background.setPreferredSize(new java.awt.Dimension(1190, 570));
        jPanel1.add(emp_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        PnlMenu.setPreferredSize(new java.awt.Dimension(1200, 100));
        PnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Beverage_Images/MenuBar_Back_Beverage.jpg"))); // NOI18N
        jLabel13.setMaximumSize(new java.awt.Dimension(1190, 75));
        jLabel13.setMinimumSize(new java.awt.Dimension(1190, 75));
        jLabel13.setPreferredSize(new java.awt.Dimension(1190, 75));
        PnlMenu.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         try {
            String q = "select * from invoice01 where inId=?";
            pst = conn.prepareStatement(q);
            pst.setString(1, searbo2.getText());//Stock_id,product_name,Brand,Volume,Quantity,Pay_by,Price,Amount
            rst = pst.executeQuery();                           
            if (rst.next()) {
                String add1 = rst.getString("Stock_id");//((JTextField)date_search().getUiComponent()).getText();
                t1.setText(add1);
                // ((JTextField).getUiComponent()).getText();
                // String add2 = rst.JDateChooser("Bname");
                //hh.JDateChooser(add2);
                String add2 = rst.getString("product_name");
                t2.setText(add2);
                String add3 = rst.getString("Brand");
                t3.setText(add3);  

                String add4 = rst.getString("Volume");
                t4.setText(add4);

                String add5 = rst.getString("Quantity");
                t5.setText(add5);
                
                  String add6 = rst.getString("Pay_by");
                t6.setSelectedItem(add6);
                
                 String add7 = rst.getString("Price");
                t7.setText(add7);
                
                 String add8 = rst.getString("Amount");
                t8.setText(add8);
                
            }
            
            
            

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
         try{
            if(t1.getText().isEmpty()||t2.getText().isEmpty()||t3.getText().isEmpty()||t4.getText().isEmpty()||t5.getText().isEmpty()||t7.getText().isEmpty()||t8.getText().isEmpty())              
    {
        JOptionPane.showMessageDialog(null, "Please Enter All");
    }
            else{   
             String q= "INSERT INTO bar_stock (Stock_id,product_name,Brand,Volume,Quantity,Pay_by,Price,Amount ) values (?,?,?,?,?,?,?,?)";
            
                                
                pst = conn.prepareStatement(q);

                pst.setString(1, t1.getText());
               
                pst.setString(2, t2.getText());
                 pst.setString(3, t3.getText());
                pst.setString(4, t4.getText());
                 pst.setString(5, t5.getText());
              // pst.setString(6, t6.getText());
               String value = t6.getSelectedItem().toString();
               pst.setString (6,value);
                 //pst.setString(6, t6.getSelectedItems().toString()); 
                 pst.setString(7, t7.getText());
                  pst.setString(8, t8.getText());
        
                pst.execute();
                JOptionPane.showMessageDialog(null, "Successfully Saved");

                tableLoad();
        }

            }catch(SQLException e){

                JOptionPane.showMessageDialog(null ,e);
            }
         //   Invo.setText(null);
         //   hh.setDate(null);
          //  ss.setText(null);
           // hj.setText(null);
           // as.setText(null);
           // zx.setText(null);
          }

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
            //ubdate button here
           /* 
            try{
                String value1 = t1.getText();
               
                String value2 = t2.getText();                                             ////Stock_id,product_name,Brand,Volume,Quantity,Pay_by,Price,Amount
                String value3 = t3.getText();
                String value4 = t4.getText();
                String value5 = t5.getText();
                  // String value6 = t6.getSelectedItem().toString();
              // pst.setString (6,value);
               String value7 = t7.getText();
                String value8 = t8.getText();
                 
               
                //inId,Bname,tibrand,qphone,bpay,brprice
                String sql = "update bar_stock set product_name='"+value2+"',Brand='"+value3+"',Volume='"+value4+"',Quantity='"+value5+"',Pay_by='"+value6+"',Price='"+value7+"',Amount='"+value8+"' where Stock_id = '"+value1+"'";
                pst=conn .prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Record Updated");

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }}


*/
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
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
         //ubdate button here
          
            
            try{
                String value1 = t1.getText();
               
                String value2 = t2.getText();                                             
                String value3 = t3.getText();
                String value4 = t4.getText();
                String value5 = t5.getText();
                   String value6 = t6.getSelectedItem().toString();
              // pst.setString (6,value);
               String value7 = t7.getText();
                String value8 = t8.getText();
                 
               
                //inId,Bname,tibrand,qphone,bpay,brprice
                String q = "update bar_stock set product_name='"+value2+"',Brand='"+value3+"',Volume='"+value4+"',Quantity='"+value5+"',Pay_by='"+value6+"',Price='"+value7+"',Amount='"+value8+"' where Stock_id = '"+value1+"'";
                pst=conn .prepareStatement(q);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Record Updated");

}
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
         update_table();


    }//GEN-LAST:event_jButton4ActionPerformed

    private void tab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab2MouseClicked
         try {
            int row = tab2.getSelectedRow();//Stock_id,product_name,Brand,Volume,Quantity,Pay_by,Price,Amount
            String Table_click = (tab2.getModel().getValueAt(row, 0).toString());
            String q = "select * from bar_stock  where Stock_id='" + Table_click + "'";
            pst = conn.prepareStatement(q);
            rst = (ResultSet) pst.executeQuery(q);  
            while (rst.next()) {

                String add1 = rst.getString("Stock_id");
                t1.setText(add1);

                //--------------------------------------------
               /* String add2 = rst.getString("Bname");
                //date_dob.setDate(add4);
                //get selected date
                java.util.Date date;
                try {
                    date = new SimpleDateFormat("yyyy-MM-dd").parse(add2);

                    hh.setDate(date);
                } catch (ParseException ex) {

                }*/
                //-------------------------------------------
                String add2 = rst.getString("product_name");
                t2.setText(add2);                          

                String add3 = rst.getString("Brand");
                t3.setText(add3);

                String add4 = rst.getString("Volume");
                t4.setText(add4);

                String add5 = rst.getString("Quantity");
                t5.setText(add5);
                
                 String add6 = rst.getString("Pay_by");
                t6.setSelectedItem(add6);
                
                 String add7 = rst.getString("Price");
                t7.setText(add7);
                String add8 = rst.getString("Amount");
                t8.setText(add8);
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
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }

                                  
    }//GEN-LAST:event_tab2MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
           // delete record
        String q = "delete from bar_stock where Stock_id= ?";
        try {

            pst = conn.prepareStatement(q);

            pst.setString(1, t1.getText());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Record Deleted");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
        update_table();

                 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped
          char c =evt.getKeyChar();
        if(!(Character.isDigit(c)|| (c==KeyEvent.VK_BACK_SPACE)|| c==KeyEvent.VK_DELETE)){
           evt.consume(); 
        }
    }//GEN-LAST:event_t1KeyTyped

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
             double a=Double.parseDouble(t5.getText());
         double b=Double.parseDouble(t7.getText());
         double am=a*b;
            t8.setText(""+am);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void REPORTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPORTActionPerformed

        try {
            JasperDesign jd = JRXmlLoader.load("D:\\SLIIT\\2nd Year\\2nd Semester\\ITP - Information Technology Project\\Project\\Hotel_Management_System(Selsan)\\BarStock.jrxml");// Path for the Report
            String sql = "SELECT * FROM bar_stock";// USer input of SQL
            JRDesignQuery newquery = new JRDesignQuery();
            newquery.setText(sql);
            jd.setQuery(newquery);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null,conn);
            JasperViewer.viewReport(jp);

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_REPORTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlMenu;
    private javax.swing.JButton REPORT;
    private javax.swing.JLabel emp_background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField searbo2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JComboBox<String> t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTable tab2;
    // End of variables declaration//GEN-END:variables
}
