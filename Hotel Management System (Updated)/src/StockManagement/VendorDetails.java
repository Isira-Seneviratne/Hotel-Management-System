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
public class VendorDetails extends javax.swing.JPanel implements ListSelectionListener {

    /**
     * Creates new form VendorDetails
     */
    public VendorDetails() {
        initComponents();
        
        //Loads the up-to-date table corresponding to this particular panel.
        try {
            jTable1.setModel(DatabaseConnectionFunctions.getTableRecords("Vendor_Details"));
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while loading the table."
                    , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Checks to see if a table record is selected or not.
    @Override
    public void valueChanged(ListSelectionEvent lse) {
        String tooltip = "A table record must be selected to use this button.";
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnGenReport = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtVendName = new javax.swing.JTextField();
        txtTelNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(28, 48, 90));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Vendor Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 697, -1));

        jPanel1.setBackground(new java.awt.Color(28, 48, 90));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vendor Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(238, 238, 238))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGenReport.setBackground(new java.awt.Color(255, 255, 0));
        btnGenReport.setText("Generate Report");
        btnGenReport.setEnabled(false);
        jPanel1.add(btnGenReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, -1, -1));

        btnAdd.setBackground(new java.awt.Color(102, 153, 255));
        btnAdd.setForeground(new java.awt.Color(238, 238, 238));
        btnAdd.setText("Add");
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 198, -1, -1));

        btnDelete.setBackground(new java.awt.Color(204, 0, 0));
        btnDelete.setForeground(new java.awt.Color(238, 238, 238));
        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        btnClear.setBackground(new java.awt.Color(153, 153, 153));
        btnClear.setText("Clear");
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(51, 102, 0));
        btnUpdate.setForeground(new java.awt.Color(238, 238, 238));
        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 30, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 30, -1, 141));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 238, 238));
        jLabel4.setText("Vendor name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 238, 238));
        jLabel5.setText("Telephone number");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));
        jPanel1.add(txtVendName, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 189, -1));
        jPanel1.add(txtTelNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 189, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 238, 238));
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 189, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 53, 870, 240));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vendor ID", "Vendor name", "Address", "Telephone number", "Email"
            }
        ));
        jTable1.setPreferredSize(new java.awt.Dimension(450, 0));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 300, 860, 231));
    }// </editor-fold>//GEN-END:initComponents


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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtTelNumber;
    private javax.swing.JTextField txtVendName;
    // End of variables declaration//GEN-END:variables
}
