/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockManagement;

import Main.DatabaseConnectionFunctions;
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
public class PendingOrders extends javax.swing.JPanel implements ListSelectionListener {

    private ResultSet itemIDsAndNames;
    private DefaultComboBoxModel<String> cmbVendorIDModel = new DefaultComboBoxModel<>();
    private DefaultComboBoxModel<String> cmbItemIDModel = new DefaultComboBoxModel<>();
    /**
     * Creates new form PendingOrders
     */
    public PendingOrders() {
        initComponents();
        
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
            cmbItemID.setSelectedIndex(cmbItemIDModel.getIndexOf(jTable1.getValueAt(curRow, 1)));
        }
    }
    
    public void loadTableAndComboBoxes() {
        //Loads the up-to-date table corresponding to this particular panel.
        try {
            jTable1.setModel(DatabaseConnectionFunctions.getTableRecords("Pending_Orders"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while loading the table:\n"+e.getMessage()
                    , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        //Loads the stored item IDs and adds them to the Item ID combo box.
        try {
            itemIDsAndNames = DatabaseConnectionFunctions.getResultsFromUnionQuery("Food_Items", "Cleaning_Items",
                    "`Food ID` as `Item ID`, `Food Name` as `Item Name`", "`Item ID`, `Item Name`");
            cmbItemIDModel.removeAllElements();
            while(itemIDsAndNames.next())
                cmbItemIDModel.addElement(itemIDsAndNames.getString(1));
            cmbItemID.setModel(cmbItemIDModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while retrieving all purchasable items:\n"
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
        btnGenReport = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblItemName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbVendorID = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        datOrderDate = new com.toedter.calendar.JDateChooser();
        cmbItemID = new javax.swing.JComboBox<>();
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
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        btnGenReport.setBackground(new java.awt.Color(255, 255, 0));
        btnGenReport.setText("Generate Report");
        btnGenReport.setToolTipText("Select a record from the table to enable the button.");
        btnGenReport.setEnabled(false);
        btnGenReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenReportMouseClicked(evt);
            }
        });
        jPanel1.add(btnGenReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, -1));

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
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        btnClear.setBackground(new java.awt.Color(153, 153, 153));
        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setText("Item ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("Item name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        lblItemName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 200, 20));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 238, 238));
        jLabel4.setText("Quantity");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));
        jPanel1.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 70, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 238, 238));
        jLabel5.setText("Unit");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilograms (kg)", "Grams (g)" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 150, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 238, 238));
        jLabel6.setText("Vendor ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        jPanel1.add(cmbVendorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 151, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 238, 238));
        jLabel7.setText("Date of order");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));
        jPanel1.add(datOrderDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 150, 30));

        jPanel1.add(cmbItemID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 130, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 59, 870, 270));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Item ID", "Item name", "Quantity", "Unit", "Company", "Date of Order"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        jTable1.getSelectionModel().addListSelectionListener(this);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 341, 870, 208));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        try {
            DatabaseConnectionFunctions.deleteRecord("Pending_Orders",
                    "='"+jTable1.getValueAt(jTable1.getSelectedRow(), 0)+"'");
            loadTableAndComboBoxes();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while deleting the selected record:\n"+e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        cmbItemID.setSelectedIndex(-1);
        cmbVendorID.setSelectedIndex(-1);
        lblItemName.setText("");
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
    private javax.swing.JComboBox<String> cmbItemID;
    private javax.swing.JComboBox<String> cmbVendorID;
    private com.toedter.calendar.JDateChooser datOrderDate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables
}
