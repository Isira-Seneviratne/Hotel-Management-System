/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockManagement;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Isira
 */
public class PendingOrders extends javax.swing.JPanel implements ListSelectionListener, ItemListener {

    private ResultSet vendorIDs;
    private DefaultComboBoxModel<String> cmbVendorIDModel = new DefaultComboBoxModel<>();
    private DefaultComboBoxModel<String> cmbItemIDModel = new DefaultComboBoxModel<>();
    
    private HashMap<String, String> itemIDsAndNames_Map = new HashMap<>();
    /**
     * Creates new form PendingOrders
     */
    public PendingOrders() {
        initComponents();
        txtItemName.setEditable(false);
        
        loadTableAndComboBoxes();
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
        if (jTable1.getSelectionModel().isSelectionEmpty()) {
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            btnUpdate.setToolTipText(tooltip);
            btnDelete.setToolTipText(tooltip);
        } else {
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
            btnUpdate.setToolTipText(null);
            btnDelete.setToolTipText(null);
            
            int curRow = jTable1.getSelectedRow();
            String itemID = jTable1.getValueAt(curRow, 1).toString();
            
            cmbItemID.removeItemListener(this);
            cmbItemID.setSelectedIndex(cmbItemIDModel.getIndexOf(itemID));
            cmbItemID.addItemListener(this);
            
            txtItemName.setText(itemIDsAndNames_Map.get(itemID));
            
            cmbVendorID.setSelectedIndex(cmbVendorIDModel.getIndexOf(jTable1.getValueAt(curRow, 2)));
            txtQuantity.setText(jTable1.getValueAt(curRow, 3).toString());
            NonDBFunctions.setCmbToUnit(cmbUnit, jTable1, 4);
            datOrderDate.setDate((java.sql.Date) jTable1.getValueAt(curRow, 5));
        }
    }
    
    @Override
    public void itemStateChanged(ItemEvent ie) {
        txtItemName.setText(itemIDsAndNames_Map.get(cmbItemID.getSelectedItem().toString()));
    }
    
    public void loadTableAndComboBoxes() {
        //Loads the up-to-date table corresponding to this particular panel.
        try {
            jTable1.setModel(DBFunctions.getTableRecords("Stock_Pending_Orders"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while loading the table:\n\n"+e.getMessage()
                    , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        //Loads the stored item IDs and adds them to the Item ID combo box.
        try {
            ResultSet purchasableItemIDsAndNames = DBFunctions.getResultsFromUnionQuery("Stock_Food_Items",
                    "Stock_Cleaning_Items", "`Food ID` AS `Item ID`, `Food Name` AS `Item Name`",
                    "`Item ID`, `Item Name`");
            
            cmbItemID.removeItemListener(this);
            
            cmbItemIDModel.removeAllElements();
            while (purchasableItemIDsAndNames.next()) {
                String itemID = purchasableItemIDsAndNames.getString(1);
                
                cmbItemIDModel.addElement(itemID);
                
                itemIDsAndNames_Map.put(itemID, purchasableItemIDsAndNames.getString(2));
            }
            
            cmbItemID.setModel(cmbItemIDModel);
            cmbItemID.setSelectedIndex(-1);
            
            cmbItemID.addItemListener(this);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while retrieving all purchasable items:\n\n"
                    +e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        //Loads stored vendor IDs.
        try {
            vendorIDs = DBFunctions.getSpecificFieldsFromTable("Stock_Vendor_Details",
                    "`Vendor ID`");
            cmbVendorIDModel.removeAllElements();
            while(vendorIDs.next())
                cmbVendorIDModel.addElement(vendorIDs.getString(1));
            cmbVendorID.setModel(cmbVendorIDModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while retrieving the vendor IDs:\n\n"
                    +e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbUnit = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbVendorID = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        datOrderDate = new com.toedter.calendar.JDateChooser();
        cmbItemID = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtItemName = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(28, 48, 90));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pending Orders");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 18, 870, -1));

        jPanel1.setBackground(new java.awt.Color(28, 48, 90));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Orders", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(238, 238, 238))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        btnAdd.setBackground(new java.awt.Color(102, 153, 255));
        btnAdd.setForeground(new java.awt.Color(238, 238, 238));
        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

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
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        btnClear.setBackground(new java.awt.Color(153, 153, 153));
        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setText("Item ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("Item name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 238, 238));
        jLabel4.setText("Quantity");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));
        jPanel1.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 70, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 238, 238));
        jLabel5.setText("Unit");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, -1));

        cmbUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilograms (kg)", "Grams (g)", "None" }));
        jPanel1.add(cmbUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 150, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 238, 238));
        jLabel6.setText("Vendor ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        jPanel1.add(cmbVendorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 151, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 238, 238));
        jLabel7.setText("Date of order");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));
        jPanel1.add(datOrderDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 150, 30));

        jPanel1.add(cmbItemID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 130, -1));

        jScrollPane3.setPreferredSize(new java.awt.Dimension(250, 50));
        jScrollPane3.setRequestFocusEnabled(false);

        txtItemName.setBackground(new java.awt.Color(28, 48, 90));
        txtItemName.setColumns(20);
        txtItemName.setForeground(new java.awt.Color(238, 238, 238));
        txtItemName.setRows(5);
        jScrollPane3.setViewportView(txtItemName);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 170, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 59, 870, 270));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Vendor ID", "Item ID", "Item name", "Quantity", "Unit", "Company", "Date of Order"
            }
        ));
        jTable1.setToolTipText("Select a table row to have its values displayed in the above controls.");
        jScrollPane1.setViewportView(jTable1);
        jTable1.getSelectionModel().addListSelectionListener(this);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 341, 870, 208));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        String itemID, vendorID, unit;
        java.util.Date orderDate;
        int qty;
        
        if (cmbItemID.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Select an item ID.", "Item ID not selected", JOptionPane.WARNING_MESSAGE);
            cmbItemID.requestFocus();
            return;
        } else {
            itemID = cmbItemID.getSelectedItem().toString();
        }
        
        try {
            qty = Integer.parseInt(txtQuantity.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "You have not entered a valid integer for the quantity.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            txtQuantity.requestFocus();
            return;
        }
        
        if (cmbVendorID.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Select a vendor ID.", "Vendor ID not selected", JOptionPane.WARNING_MESSAGE);
            cmbVendorID.requestFocus();
            return;
        } else {
            vendorID = cmbVendorID.getSelectedItem().toString();
        }
        
        if (cmbUnit.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Select a unit.", "No unit selected", JOptionPane.WARNING_MESSAGE);
            cmbUnit.requestFocus();
            return;
        } else {
            unit = NonDBFunctions.getUnitFromCmb(cmbUnit);
        }
        
        try {
            orderDate = datOrderDate.getDate();
            orderDate.getTime();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "You have entered an invalid date.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String orderID = DBFunctions.generateIDForRecord("O", "Stock_Pending_Orders");
            String insert = "'"+orderID+"', '"+itemID+"', '"+vendorID+"', "+qty+", '"+unit+"', '"
                    +new java.sql.Date(orderDate.getTime())+"'";
            
            DBFunctions.insertRecord("Stock_Pending_Orders", insert);
            loadTableAndComboBoxes();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while inserting the record:\n\n"+e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        NonDBFunctions.deleteConfirmation(this, "Stock_Pending_Orders",
                "`Order ID`='"+jTable1.getValueAt(jTable1.getSelectedRow(), 0)+"'");
        loadTableAndComboBoxes();
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        String itemID, vendorID, unit;
        java.util.Date orderDate;
        int qty;
        
        if (cmbItemID.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Select an item ID.", "Item ID not selected", JOptionPane.WARNING_MESSAGE);
            cmbItemID.requestFocus();
            return;
        } else {
            itemID = cmbItemID.getSelectedItem().toString();
        }
        
        try {
            qty = Integer.parseInt(txtQuantity.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "You have not entered a valid integer for the quantity.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            txtQuantity.requestFocus();
            return;
        }
        
        if (cmbVendorID.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Select a vendor ID.", "Vendor ID not selected", JOptionPane.WARNING_MESSAGE);
            cmbVendorID.requestFocus();
            return;
        } else {
            vendorID = cmbVendorID.getSelectedItem().toString();
        }
        
        if (cmbUnit.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Select a unit.", "No unit selected", JOptionPane.WARNING_MESSAGE);
            cmbUnit.requestFocus();
            return;
        } else {
            unit = NonDBFunctions.getUnitFromCmb(cmbUnit);
        }
        
        try {
            orderDate = datOrderDate.getDate();
            orderDate.getTime();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "You have entered an invalid date.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String update = "`Item ID`='"+itemID+"', `Vendor ID`='"+vendorID+"', Quantity="+qty+", Unit='"+unit+"', "
                    + "`Date of order`='"+new java.sql.Date(orderDate.getTime())+"'";
            DBFunctions.updateRecord("Stock_Pending_Orders", update,
                    "`Order ID`='"+jTable1.getValueAt(jTable1.getSelectedRow(), 0)+"'");
            loadTableAndComboBoxes();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while updating the selected record:\n\n"+e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        cmbItemID.setSelectedIndex(-1);
        cmbVendorID.setSelectedIndex(-1);
        cmbUnit.setSelectedIndex(-1);
        txtItemName.setText("");
        txtQuantity.setText("");
        datOrderDate.setDate(null);
    }//GEN-LAST:event_btnClearMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbItemID;
    private javax.swing.JComboBox<String> cmbUnit;
    private javax.swing.JComboBox<String> cmbVendorID;
    private com.toedter.calendar.JDateChooser datOrderDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtItemName;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
