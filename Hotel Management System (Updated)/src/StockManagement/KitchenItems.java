/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockManagement;

import Main.DatabaseConnectionFunctions;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Isira
 */
public class KitchenItems extends javax.swing.JPanel implements ListSelectionListener {

    /**
     * Creates new form KitchenItems
     */
    public KitchenItems() {
        initComponents();
        
        //Loads the up-to-date table corresponding to this particular panel.
        try {
            jTable1.setModel(DatabaseConnectionFunctions.getTableRecords("Kitchen_Items"));
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while loading the table."
                    , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /* Checks to see if a table record is selected or not.
     *
     * The following code is based on code from the following tutorial (this is the case for the other
     * panels under the StockManagement package as well):
     *
     * Oracle. How to Write a List Selection Listener.
     * https://docs.oracle.com/javase/tutorial/uiswing/events/listselectionlistener.html
     * Accessed October 7, 2018.
     */
    @Override
    public void valueChanged(ListSelectionEvent lse) {
        String tooltip = "Select a record from the table to enable the button.";
        if(jTable1.getSelectionModel().isSelectionEmpty()) {
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            btnGenReport.setEnabled(false);
            btnUpdate.setToolTipText(tooltip);
            btnDelete.setToolTipText(tooltip);
            btnGenReport.setToolTipText(tooltip);
        } else {
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
            btnGenReport.setEnabled(true);
            btnUpdate.setToolTipText(null);
            btnDelete.setToolTipText(null);
            btnGenReport.setToolTipText(null);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnGenReport = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(28, 48, 90));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(748, 623));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kitchen Items");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 880, -1));

        jPanel1.setBackground(new java.awt.Color(28, 48, 90));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kitchen Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(238, 238, 238))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUpdate.setBackground(new java.awt.Color(51, 102, 0));
        btnUpdate.setForeground(new java.awt.Color(238, 238, 238));
        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        btnDelete.setBackground(new java.awt.Color(204, 0, 0));
        btnDelete.setForeground(new java.awt.Color(238, 238, 238));
        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        btnAdd.setBackground(new java.awt.Color(102, 153, 255));
        btnAdd.setForeground(new java.awt.Color(238, 238, 238));
        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        btnClear.setBackground(new java.awt.Color(153, 153, 153));
        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        btnGenReport.setBackground(new java.awt.Color(255, 255, 0));
        btnGenReport.setText("Generate Report");
        btnGenReport.setEnabled(false);
        btnGenReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenReportMouseClicked(evt);
            }
        });
        jPanel1.add(btnGenReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("Item name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 67, -1, -1));
        jPanel1.add(txtItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 64, 198, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 238, 238));
        jLabel4.setText("Quantity");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));
        jPanel1.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 80, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 47, 880, 200));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item name", "Quantity"
            }
        ));
        jTable2.setPreferredSize(new java.awt.Dimension(450, 0));
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 880, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearMouseClicked

    private void btnGenReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenReportMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenReportMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGenReport;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables
}
