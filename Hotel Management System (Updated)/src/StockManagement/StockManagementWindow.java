/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockManagement;

import Main.DatabaseConnectionFunctions;
import Main.Login;
import Main.MainWindow;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Isira
 */
public class StockManagementWindow extends javax.swing.JFrame {

    private static StockManagementWindow instance;
    private String curEID;
    
    /**
     * Creates new form StockManagementWindow
     * @param eID
     */
    public StockManagementWindow(String eID) {
        initComponents();
        curEID = eID;
        
        /* The following code was based on code included in the the following tutorial:
         *
         * Tsagklis, Ilias, Window closing event handling. November 11, 2012.
         * https://examples.javacodegeeks.com/desktop-java/awt/event/window-closing-event-handling/
         * Accessed October 5, 2018.
         */
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                MainWindow.getInstance(curEID).setVisible(true);
            }
        });
        
        jTabbedPane1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                JTabbedPane curPane = (JTabbedPane) ce.getSource();
                int index = curPane.getSelectedIndex();
                switch(index) {
                    case 0:
                        foodItems1.loadTableAndComboBox();
                        break;
                    case 4:
                        vendorDetails1.loadTable();
                        break;
                }
            }
        });
    }

    //Ensures that only one instance of StockManagementWindow can exist at a given time.
    public static StockManagementWindow getInstance(String eID) {
        if(instance == null) {
            instance = new StockManagementWindow(eID);
        }
        return instance;
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
        btnHome = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        foodItems1 = new StockManagement.FoodItems();
        cleaningItems1 = new StockManagement.CleaningItems();
        roomItems1 = new StockManagement.RoomItems();
        pendingOrders1 = new StockManagement.PendingOrders();
        vendorDetails1 = new StockManagement.VendorDetails();
        payments1 = new StockManagement.Payments();
        kitchenItems1 = new StockManagement.KitchenItems();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Stock Management");
        setPreferredSize(new java.awt.Dimension(970, 660));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 20, 60));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Home.png"))); // NOI18N
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setText("Stock Management");

        jTabbedPane1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(746, 623));
        jTabbedPane1.addTab("Food Items", foodItems1);
        jTabbedPane1.addTab("Cleaning Items", cleaningItems1);
        jTabbedPane1.addTab("Room Items", roomItems1);
        jTabbedPane1.addTab("Pending Orders", pendingOrders1);
        jTabbedPane1.addTab("Vendor Details", vendorDetails1);
        jTabbedPane1.addTab("Payments", payments1);
        jTabbedPane1.addTab("Kitchen Items", kitchenItems1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 640, Short.MAX_VALUE)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        try {
            DatabaseConnectionFunctions.logout(curEID);
            JOptionPane.showMessageDialog(this, "Successfully logged out of the system.", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
            new Login().setVisible(true);
            dispose();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(this, "A problem occurred while logging out."
                    + " Make sure you are connected to the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        MainWindow.getInstance(curEID).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHomeMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private StockManagement.CleaningItems cleaningItems1;
    private StockManagement.FoodItems foodItems1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private StockManagement.KitchenItems kitchenItems1;
    private StockManagement.Payments payments1;
    private StockManagement.PendingOrders pendingOrders1;
    private StockManagement.RoomItems roomItems1;
    private StockManagement.VendorDetails vendorDetails1;
    // End of variables declaration//GEN-END:variables
}
