/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockManagement;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Isira
 */
public class FoodItems extends javax.swing.JPanel implements ListSelectionListener {

    private DefaultComboBoxModel<String> cmbVendorIDModel = new DefaultComboBoxModel<>();
    /**
     * Creates new form FoodItems
     */
    public FoodItems() {
        initComponents();
        
        loadTableAndComboBox();
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
            txtFoodName.setText(jTable1.getValueAt(curRow, 1).toString());
            txtQty.setText(jTable1.getValueAt(curRow, 2).toString());
            String unit = jTable1.getValueAt(curRow, 3).toString();
            switch (unit) {
                case "kg":
                    cmbUnit.setSelectedIndex(0);
                    break;
                case "g":
                    cmbUnit.setSelectedIndex(1);
                    break;
                case "None":
                    cmbUnit.setSelectedIndex(2);
                    break;
                default:
                    cmbUnit.setSelectedIndex(-1);
                    break;
            }
            txtPrice.setText(jTable1.getValueAt(curRow, 4).toString());
            cmbVendorID.setSelectedIndex(cmbVendorIDModel.getIndexOf(jTable1.getValueAt(curRow, 5)));
            datPurchaseDate.setDate((Date) jTable1.getValueAt(curRow, 6));
        }
    }
    
    public void loadTableAndComboBox() {
        //Loads the up-to-date table corresponding to this particular panel.
        try {
            jTable1.setModel(StockManagement.DatabaseConnectionFunctions.getTableRecords("Food_Items"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while loading the table:\n"+e.getMessage()
            , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        //Loads the vendor IDs from the Vendor Details table into the Vendor ID combo box.
        try {
            ResultSet vendorIDs = StockManagement.DatabaseConnectionFunctions.getSpecificFieldsFromTable("Vendor_Details", "`Vendor ID`");
            cmbVendorIDModel.removeAllElements();
            while (vendorIDs.next())
                cmbVendorIDModel.addElement(vendorIDs.getString(1));
            cmbVendorID.setModel(cmbVendorIDModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while loading the stored vendor IDs:\n"+e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        datPurchaseDate = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        datExpiryDate = new com.toedter.calendar.JDateChooser();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnGenReport = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbUnit = new javax.swing.JComboBox<>();
        cmbVendorID = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtFoodName = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(28, 48, 90));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(748, 623));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(28, 48, 90));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Food Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(238, 238, 238))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(710, 270));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("Food name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 238, 238));
        jLabel4.setText("Quantity");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));
        jPanel1.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 75, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 238, 238));
        jLabel5.setText("Price (Rs.)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 80, -1));
        jPanel1.add(datPurchaseDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 150, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 238, 238));
        jLabel6.setText("Purchase date");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 238, 238));
        jLabel7.setText("Expiry date");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));
        jPanel1.add(datExpiryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 150, -1));

        btnAdd.setBackground(new java.awt.Color(102, 153, 255));
        btnAdd.setForeground(new java.awt.Color(238, 238, 238));
        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

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
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

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
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        btnClear.setBackground(new java.awt.Color(153, 153, 153));
        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, -1));

        btnGenReport.setBackground(new java.awt.Color(255, 255, 0));
        btnGenReport.setText("Generate Report");
        btnGenReport.setToolTipText("Select a record from the table to enable the button.");
        btnGenReport.setEnabled(false);
        btnGenReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenReportMouseClicked(evt);
            }
        });
        jPanel1.add(btnGenReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Unit");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        cmbUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilograms (kg)", "Grams (g)", "None" }));
        jPanel1.add(cmbUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 130, -1));

        jPanel1.add(cmbVendorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 130, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Vendor ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        txtFoodName.setColumns(20);
        txtFoodName.setRows(5);
        jScrollPane2.setViewportView(txtFoodName);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 240, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 50, 870, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food ID", "Food name", "Quantity", "Unit", "Price", "Vendor ID", "Purchase Date", "Expiry Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        jTable1.getSelectionModel().addListSelectionListener(this);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 870, 200));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Food Items");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 870, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        String foodName, unit, vendorID;
        int qty;
        float price;
        java.util.Date purDate, expDate;
        
        foodName = txtFoodName.getText();
        if(foodName.trim().equals("")) {
            JOptionPane.showMessageDialog(this, "An item name cannot be blank"
                    + " or consist of only whitespace characters.", "Invalid item name",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(cmbUnit.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Select a unit.", "No unit selected", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            unit = cmbUnit.getSelectedItem().toString();
        }
        
        if(cmbVendorID.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Select a vendor ID.", "No vendor selected", JOptionPane.ERROR_MESSAGE);
        } else {
            vendorID = cmbVendorID.getSelectedItem().toString();
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        try {
            StockManagement.DatabaseConnectionFunctions.deleteRecord("Food_Items", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while deleting the selected record:\n\n"+e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        try {
            StockManagement.DatabaseConnectionFunctions.updateRecord("Food_Items", "", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while updating the selected record:\n\n"+e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        txtFoodName.setText("");
        cmbUnit.setSelectedIndex(-1);
        cmbVendorID.setSelectedIndex(-1);
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
    private javax.swing.JComboBox<String> cmbUnit;
    private javax.swing.JComboBox<String> cmbVendorID;
    private com.toedter.calendar.JDateChooser datExpiryDate;
    private com.toedter.calendar.JDateChooser datPurchaseDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtFoodName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables
}
