/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockManagement;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Isira
 */
public class RoomItems extends javax.swing.JPanel implements ListSelectionListener {

    /**
     * Creates new form RoomItems
     */
    public RoomItems() {
        initComponents();
        
        loadTable();
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
            
            int curRow = jTable1.getSelectedRow();
            txtItemName.setText(jTable1.getValueAt(curRow, 1).toString());
            txtRoomNum.setText(jTable1.getValueAt(curRow, 2).toString());
            txtQty.setText(jTable1.getValueAt(curRow, 3).toString());
        }
    }
    
    public void loadTable() {
        //Loads the up-to-date table corresponding to this particular panel.
        try {
            jTable1.setModel(StockManagement.DatabaseConnectionFunctions.getTableRecords("Room_Items"));
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while loading the table:\n"+e.getMessage()
                    , "Error", JOptionPane.ERROR_MESSAGE);
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
        btnGenReport = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtRoomNum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(28, 48, 90));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Room Items");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 870, -1));

        jPanel1.setBackground(new java.awt.Color(28, 48, 90));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Room Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(238, 238, 238))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGenReport.setBackground(new java.awt.Color(255, 255, 0));
        btnGenReport.setText("Generate Report");
        btnGenReport.setToolTipText("Select a record from the table to enable the button.");
        btnGenReport.setEnabled(false);
        btnGenReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenReportMouseClicked(evt);
            }
        });
        jPanel1.add(btnGenReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, -1, -1));

        btnDelete.setBackground(new java.awt.Color(204, 0, 0));
        btnDelete.setForeground(new java.awt.Color(238, 238, 238));
        btnDelete.setText("Delete");
        btnDelete.setToolTipText("Select a record from the table to enable the button.");
        btnDelete.setEnabled(false);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(51, 102, 0));
        btnUpdate.setForeground(new java.awt.Color(238, 238, 238));
        btnUpdate.setText("Update");
        btnUpdate.setToolTipText("Select a record from the table to enable the button.");
        btnUpdate.setEnabled(false);
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        btnClear.setBackground(new java.awt.Color(153, 153, 153));
        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));

        btnAdd.setBackground(new java.awt.Color(102, 153, 255));
        btnAdd.setForeground(new java.awt.Color(238, 238, 238));
        btnAdd.setText("Add");
        btnAdd.setToolTipText("");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("Room number");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));
        jPanel1.add(txtRoomNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 130, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 238, 238));
        jLabel4.setText("Item name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));
        jPanel1.add(txtItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 193, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 238, 238));
        jLabel5.setText("Quantity");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, -1, -1));
        jPanel1.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 70, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 53, 870, 260));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item name", "Room number", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        jTable1.getSelectionModel().addListSelectionListener(this);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 870, 220));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        String itemName;
        int qty, roomNum;
        
        if(txtItemName.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "An item name cannot be blank or consist of only whitespace characters.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            itemName = txtItemName.getText();
        }
        
        try {
            roomNum = Integer.parseInt(txtRoomNum.getText());
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "You have entered an invalid integer value for the room number.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            qty = Integer.parseInt(txtQty.getText());
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "You have entered an invalid integer value for the quantity.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String itemID = StockManagement.DatabaseConnectionFunctions.generateIDForRecord("R", "Room_Items");
            StockManagement.DatabaseConnectionFunctions.insertRecord("Room_Items", "'"+itemID+"','"+itemName+"',"+roomNum+","+qty);
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while inserting the record:\n"+e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        try {
            StockManagement.DatabaseConnectionFunctions.deleteRecord("`Room Items`", "");
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while deleting the selected record:\n\n"+e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        String itemName;
        int qty, roomNum;
        
        if(txtItemName.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "An item name cannot be blank or consist of only whitespace characters.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            itemName = txtItemName.getText();
        }
        
        try {
            roomNum = Integer.parseInt(txtRoomNum.getText());
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "You have entered an invalid integer value for the room number.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            qty = Integer.parseInt(txtQty.getText());
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "You have entered an invalid integer value for the quantity.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            StockManagement.DatabaseConnectionFunctions.updateRecord("", "",
                    "`Room ID`='"+jTable1.getValueAt(jTable1.getSelectedRow(), 0));
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while updating the selected record:\n"+e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        txtItemName.setText("");
        txtRoomNum.setText("");
        txtQty.setText("");
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtRoomNum;
    // End of variables declaration//GEN-END:variables
}
