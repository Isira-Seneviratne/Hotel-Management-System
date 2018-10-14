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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Isira
 */
public class Payments extends javax.swing.JPanel implements ListSelectionListener, DocumentListener, ItemListener {

    private DefaultComboBoxModel<String> cmbVendorIDModel = new DefaultComboBoxModel<>();
    private DefaultComboBoxModel<String> cmbItemIDModel = new DefaultComboBoxModel<>();
    
    /* This field is required to prevent the combo box and text field listener
     * events firing when a table cell is clicked on.
     */
    private boolean loadingFromTable = false;
    
    // Stores all purchasable item IDs and prices for fast access.
    private HashMap<String, Float> purchasableItemIDPrice_Map = new HashMap<>();
    
    /**
     * Creates new form Payments
     */
    public Payments() {
        initComponents();
        
        loadTableAndComboBoxes();
    }

    /* Checks to see if a table record is selected or not.
     *
     * The following code is based on code from the following tutorial (this is
     * the case for the other panels under the StockManagement package as well):
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
            btnUpdate.setToolTipText(tooltip);
            btnDelete.setToolTipText(tooltip);
        } else {
            loadingFromTable = true;
            
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
            btnUpdate.setToolTipText(null);
            btnDelete.setToolTipText(null);
            
            int curRow = jTable1.getSelectedRow();
            cmbVendorID.setSelectedIndex(cmbVendorIDModel.getIndexOf(jTable1.getValueAt(curRow, 1)));
            
            cmbItemID.removeItemListener(this);
            cmbItemID.setSelectedIndex(cmbItemIDModel.getIndexOf(jTable1.getValueAt(curRow, 2)));
            cmbItemID.addItemListener(this);
            
            txtQuantity.setText(jTable1.getValueAt(curRow, 3).toString());
            datPaymentDate.setDate((java.sql.Date) jTable1.getValueAt(curRow, 4));
            txtTotalPrice.setText(jTable1.getValueAt(curRow, 5).toString());
            
            loadingFromTable = false;
        }
    }
    
    /* The following three methods are implementations of the methods in the DocumentListener interface,
     * which allows an event to be fired when the Document object in the JTextField is changed, i.e. by
     * changing the text in the text field.
     *
     * This was done with the help of the following Java documentation pages:
     *
     * JTextComponent:
     * https://docs.oracle.com/javase/10/docs/api/javax/swing/text/JTextComponent.html#getDocument()
     * (JTextComponent is the parent class of the JTextField class)
     *
     * Document:
     * https://docs.oracle.com/javase/10/docs/api/javax/swing/text/Document.html#addDocumentListener(javax.swing.event.DocumentListener)
     */
    @Override
    public void insertUpdate(DocumentEvent de) {
        calculateTotalPrice();
    }

    @Override
    public void removeUpdate(DocumentEvent de) {
        calculateTotalPrice();
    }

    @Override
    public void changedUpdate(DocumentEvent de) {
        calculateTotalPrice();
    }
    
    @Override
    public void itemStateChanged(ItemEvent ie) {
        calculateTotalPrice();
    }
    
    public void loadTableAndComboBoxes() {
        //Loads the up-to-date table corresponding to this particular panel.
        try {
            jTable1.setModel(DBFunctions.getTableRecords("Stock_Payments"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while"
                    + " loading the table:\n\n"+e.getMessage()
                    , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        // Loads the vendor IDs from the Vendor_Details table.
        try {
            ResultSet vendorIDs = DBFunctions.getSpecificFieldsFromTable("Stock_Vendor_Details",
                    "`Vendor ID`");
            cmbVendorIDModel.removeAllElements();
            while (vendorIDs.next()) {
                cmbVendorIDModel.addElement(vendorIDs.getString(1));
            }
            cmbVendorID.setModel(cmbVendorIDModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while loading"
                    + " the vendor IDs:\n\n"+e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        // Loads the IDs of cleaning and food items from their respective tables.
        try {
            ResultSet purchasableItemIDsAndPrices = DBFunctions.getResultsFromUnionQuery("Stock_Cleaning_Items",
                    "Stock_Food_Items", "`Item ID`, Price", "`Food ID` AS `Item ID`, Price");
            
            /* If the listener is not removed, it will cause the combo box to not load properly
             * and throw a NullPointerException when attempting to select an item.
             */
            cmbItemID.removeItemListener(this);
            
            cmbItemIDModel.removeAllElements();
            purchasableItemIDPrice_Map.clear();
            
            while (purchasableItemIDsAndPrices.next()) {
                String itemID = purchasableItemIDsAndPrices.getString(1);
                cmbItemIDModel.addElement(itemID);
                purchasableItemIDPrice_Map.put(itemID, purchasableItemIDsAndPrices.getFloat(2));
            }
            
            cmbItemID.setModel(cmbItemIDModel);
            
            /* The listener can be safely re-added to the combo box at this point,
             * to detect any changes in the currently-selected item when the user
             * makes a selection.
             */
            cmbItemID.addItemListener(this);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while loading the item IDs:\n\n"+e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Calculates the total price based on the price of the selected item and the quantity.
    public void calculateTotalPrice() {
        /* The first condition below prevents issues occurring with the quantity text field
         * when data is loaded into it from the table when a record is selected.
         *
         * The second condition was added to prevent an error popping up the moment the user
         * selects an item ID, so that they can enter the quantity.
         */
        if (!loadingFromTable && !txtQuantity.getText().equals("")) {
            try {
                float totalPrice = purchasableItemIDPrice_Map.get(cmbItemID.getSelectedItem().toString())
                        * Integer.parseInt(txtQuantity.getText());
                txtTotalPrice.setText("" + totalPrice);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "You have entered an invalid integer value for the quantity.",
                        "Invalid quantity", JOptionPane.ERROR_MESSAGE);
            }
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
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        datPaymentDate = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        cmbVendorID = new javax.swing.JComboBox<>();
        cmbItemID = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(28, 48, 90));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payments");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 880, -1));

        jPanel1.setBackground(new java.awt.Color(28, 48, 90));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(238, 238, 238))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setBackground(new java.awt.Color(102, 153, 255));
        btnAdd.setForeground(new java.awt.Color(238, 238, 238));
        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

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
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        btnClear.setBackground(new java.awt.Color(153, 153, 153));
        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, -1, -1));

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
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("Vendor ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 238, 238));
        jLabel4.setText("Item ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 238, 238));
        jLabel5.setText("Quantity");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));
        jPanel1.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 77, 30));
        // Listens for any changes in the contents of the text field.
        txtQuantity.getDocument().addDocumentListener(this);

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 238, 238));
        jLabel6.setText("Payment Date");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));
        jPanel1.add(datPaymentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 130, 30));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 238, 238));
        jLabel7.setText("Total Price (Rs.)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        txtTotalPrice.setToolTipText("<html>\nSelecting a new item ID and/or changing the quantity<br>\nwill automatically recalculate the total price.\n</html>");
        jPanel1.add(txtTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 90, -1));

        jPanel1.add(cmbVendorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 130, -1));

        jPanel1.add(cmbItemID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 130, -1));
        // Listens for any changes in the item selection.
        cmbItemID.addItemListener(this);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 47, 880, 270));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Payment ID", "Vendor ID", "Item ID", "Quantity", "Date", "Price"
            }
        ));
        jTable1.setToolTipText("Select a table row to have its values displayed in the above controls.");
        jScrollPane1.setViewportView(jTable1);
        jTable1.getSelectionModel().addListSelectionListener(this);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 880, 220));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        String vendorID, itemID;
        java.util.Date payDate;
        int qty;
        float price;
        
        if (cmbVendorID.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Select the vendor ID this item belongs to.",
                    "Vendor ID not selected", JOptionPane.WARNING_MESSAGE);
            cmbVendorID.requestFocus();
            return;
        } else {
            vendorID = cmbVendorID.getSelectedItem().toString();
        }
        
        if (cmbItemID.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Select an item ID.", "Item ID not selected",
                    JOptionPane.WARNING_MESSAGE);
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
        
        try {
            payDate = datPaymentDate.getDate();
            payDate.getTime();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "You have entered an invalid date.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            price = Float.parseFloat(txtTotalPrice.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "You have not entered a valid floating point number for the price"
                    + ", or it has too many decimal points.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            txtTotalPrice.requestFocus();
            return;
        }
        
        try {
            String paymentID = DBFunctions.generateIDForRecord("P", "Stock_Payments");
            String insert = "'"+paymentID+"', '"+vendorID+"', '"+itemID+"', "+qty+", '"
                    +new java.sql.Date(payDate.getTime())+"', "+price;
            
            DBFunctions.insertRecord("Stock_Payments", insert);
            loadTableAndComboBoxes();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while inserting the record:\n\n"+e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        NonDBFunctions.deleteConfirmation(this, "Stock_Payments", 
                    "`Payment ID`='"+jTable1.getValueAt(jTable1.getSelectedRow(), 0)+"'");
        loadTableAndComboBoxes();
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        String vendorID, itemID;
        java.util.Date payDate;
        int qty;
        float price;
        
        if (cmbVendorID.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Select the vendor ID this item"
                    + " belongs to.",
                    "Vendor ID not selected", JOptionPane.WARNING_MESSAGE);
            cmbVendorID.requestFocus();
            return;
        } else {
            vendorID = cmbVendorID.getSelectedItem().toString();
        }
        
        if (cmbItemID.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Select an item ID.",
                    "Item ID not selected", JOptionPane.WARNING_MESSAGE);
            cmbItemID.requestFocus();
            return;
        } else {
            itemID = cmbItemID.getSelectedItem().toString();
        }
        
        try {
            qty = Integer.parseInt(txtQuantity.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "You have not entered a valid"
                    + " integer for the quantity.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            txtQuantity.requestFocus();
            return;
        }
        
        try {
            payDate = datPaymentDate.getDate();
            payDate.getTime();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "You have entered an invalid date.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            price = Float.parseFloat(txtTotalPrice.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "You have not entered a valid"
                    + " floating point number for the price"
                    + ", or it has too many decimal points.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            txtTotalPrice.requestFocus();
            return;
        }
        
        try {
            String update = "`Vendor ID`='"+vendorID+"', `Item ID`='"+itemID
                    +"', `Payment Date`='"+new java.sql.Date(payDate.getTime())
                    +"', Quantity="+qty+", Price="+price;
            
            DBFunctions.updateRecord("Stock_Payments", update,
                    "`Payment ID`='"+jTable1.getValueAt(jTable1.getSelectedRow(), 0)+"'");
            
            loadTableAndComboBoxes();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while updating the selected record:\n\n"+e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        cmbVendorID.setSelectedIndex(-1);
        
        /* Prevents a NullPointerException being thrown after the current selected
         * item is set to -1, which causes the listener to execute and throw a
         * NullPointerException as a result. After the selected index is set to -1,
         * the listener can be added again.
         */
        cmbItemID.removeItemListener(this);
        cmbItemID.setSelectedIndex(-1);
        cmbItemID.addItemListener(this);
        
        txtQuantity.setText("");
        datPaymentDate.setDate(null);
        txtTotalPrice.setText("");
    }//GEN-LAST:event_btnClearMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbItemID;
    private javax.swing.JComboBox<String> cmbVendorID;
    private com.toedter.calendar.JDateChooser datPaymentDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables
}
