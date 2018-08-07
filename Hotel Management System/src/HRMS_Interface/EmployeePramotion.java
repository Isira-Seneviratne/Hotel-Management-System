/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRMS_Interface;

/**
 *
 * @author Prabas Gayadeeptha
 */
public class EmployeePramotion extends javax.swing.JFrame {

    /**
     * Creates new form EmployeePramotion
     */
    public EmployeePramotion() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        dc_prmtdate = new com.toedter.calendar.JDateChooser();
        cmb_prmtdesignation = new javax.swing.JComboBox<>();
        btn_promote = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txt_currdesignation = new javax.swing.JTextField();
        txt_empname = new javax.swing.JTextField();
        txt_department = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_reset1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 174, 239));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Promotion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(490, 380));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Employee Name              :");
        jLabel25.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 140, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Current Designation      :");
        jLabel20.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 140, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Promoted Designation  :");
        jLabel21.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 140, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Promoted Date               :");
        jLabel24.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 140, -1));

        dc_prmtdate.setDateFormatString("yyyy-MM-dd");
        dc_prmtdate.setPreferredSize(new java.awt.Dimension(190, 30));
        jPanel2.add(dc_prmtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        cmb_prmtdesignation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Manager", "Assistent Manager" }));
        cmb_prmtdesignation.setPreferredSize(new java.awt.Dimension(190, 30));
        cmb_prmtdesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_prmtdesignationActionPerformed(evt);
            }
        });
        jPanel2.add(cmb_prmtdesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        btn_promote.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_promote.setText("Promote");
        btn_promote.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_promote.setPreferredSize(new java.awt.Dimension(60, 30));
        jPanel2.add(btn_promote, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 60, 30));

        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_reset.setText("Cancle");
        btn_reset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_reset.setPreferredSize(new java.awt.Dimension(60, 30));
        jPanel2.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 60, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Department                     :");
        jLabel22.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 140, -1));

        txt_currdesignation.setEditable(false);
        txt_currdesignation.setPreferredSize(new java.awt.Dimension(190, 30));
        jPanel2.add(txt_currdesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 190, 30));

        txt_empname.setEditable(false);
        txt_empname.setPreferredSize(new java.awt.Dimension(190, 30));
        jPanel2.add(txt_empname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 190, 30));

        txt_department.setEditable(false);
        txt_department.setPreferredSize(new java.awt.Dimension(190, 30));
        jPanel2.add(txt_department, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 190, 30));

        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 390, 290));

        btn_reset1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_reset1.setText("Reset");
        btn_reset1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_reset1.setPreferredSize(new java.awt.Dimension(60, 30));
        jPanel2.add(btn_reset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 60, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_prmtdesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_prmtdesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_prmtdesignationActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeePramotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeePramotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeePramotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeePramotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeePramotion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_promote;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_reset1;
    private javax.swing.JComboBox<String> cmb_prmtdesignation;
    private com.toedter.calendar.JDateChooser dc_prmtdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txt_currdesignation;
    public javax.swing.JTextField txt_department;
    public javax.swing.JTextField txt_empname;
    // End of variables declaration//GEN-END:variables
}
