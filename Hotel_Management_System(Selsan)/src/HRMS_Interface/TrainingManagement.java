/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRMS_Interface;

import HMS_Home.MHome;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Prabas Gayadeeptha
 */
public class TrainingManagement extends javax.swing.JInternalFrame {

    /**
     * Creates new form TrainingManagement
     */
    public TrainingManagement() {
        initComponents();
        jPanel5.setVisible(true);
        jPanel5.setVisible(false);
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        lbl_logout = new javax.swing.JLabel();
        lbl_settings = new javax.swing.JLabel();
        lbl_HRhome = new javax.swing.JLabel();
        lbl_home = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        emp_background = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton8 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        lbl_home1 = new javax.swing.JLabel();
        lbl_HRhome1 = new javax.swing.JLabel();
        lbl_settings1 = new javax.swing.JLabel();
        lbl_logout1 = new javax.swing.JLabel();
        emp_background2 = new javax.swing.JLabel();
        PnlMenu = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();

        setTitle("Training Management");
        setMinimumSize(new java.awt.Dimension(1200, 680));
        setPreferredSize(new java.awt.Dimension(1200, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMinimumSize(new java.awt.Dimension(1190, 580));
        jPanel1.setPreferredSize(new java.awt.Dimension(1190, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 174, 239));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Training Program Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(1200, 600));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 670, 250));

        jButton1.setText("Search");
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 90, 30));

        jTextField1.setText("Training Program");
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 100, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Yes", "No" }));
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 70, 30));

        jButton4.setText("View All Training Programs");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 140, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 690, 380));

        jPanel4.setBackground(new java.awt.Color(0, 174, 239));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Training Programs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Program ID");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel2.setText("Program Name");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel3.setText("Duration");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel4.setText("Max. No of Trainers");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jButton2.setText("Add");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 50, 30));

        jButton3.setText("Clear");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 50, 30));
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 210, 30));
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 210, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "3 Months", "4 Months", "5 Months", "6 Months", "8 Months", "12 Months" }));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 210, 30));
        jPanel4.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 210, 30));

        jLabel5.setText("Description");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 210, -1));

        jLabel6.setText("Start Date");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 60, -1));
        jPanel4.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 210, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 440, 440));

        jButton5.setText("Remove Training Program");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 500, 160, 40));

        jButton6.setText("Training Programs");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 120, 50));

        jButton7.setText("Trainers");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 50));

        lbl_logout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_logout.setText("Logout");
        lbl_logout.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl_logout.setOpaque(true);
        lbl_logout.setPreferredSize(new java.awt.Dimension(60, 30));
        lbl_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_logoutMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 60, 30));

        lbl_settings.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_settings.setText("Setting");
        lbl_settings.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl_settings.setOpaque(true);
        lbl_settings.setPreferredSize(new java.awt.Dimension(60, 30));
        lbl_settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_settingsMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 60, 30));

        lbl_HRhome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_HRhome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_HRhome.setText("HRHome");
        lbl_HRhome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl_HRhome.setOpaque(true);
        lbl_HRhome.setPreferredSize(new java.awt.Dimension(60, 30));
        lbl_HRhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_HRhomeMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_HRhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 60, 30));

        lbl_home.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_home.setText("Home");
        lbl_home.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl_home.setOpaque(true);
        lbl_home.setPreferredSize(new java.awt.Dimension(60, 30));
        lbl_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_homeMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 60, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 1190, -1));

        emp_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MainBackForAll.jpg"))); // NOI18N
        emp_background.setPreferredSize(new java.awt.Dimension(1190, 570));
        jPanel1.add(emp_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setMinimumSize(new java.awt.Dimension(1190, 580));
        jPanel5.setPreferredSize(new java.awt.Dimension(1190, 580));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 174, 239));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Trainer Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 680, 260));

        jTextField5.setText("Trainer ID");
        jPanel6.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 110, 30));

        jButton9.setText("Search");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 80, 30));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 700, 400));

        jPanel7.setBackground(new java.awt.Color(0, 174, 239));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add/Update Trainers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Employee ID");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, 20));

        jTextField6.setText("Employee ID");
        jPanel7.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 100, 30));

        jButton13.setText("Search");
        jButton13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton13.setContentAreaFilled(false);
        jPanel7.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 90, 30));

        jLabel11.setText("Trainer ID");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel12.setText("Training Program");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel13.setText("Start Date");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, 30));
        jPanel7.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 150, 30));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel7.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 150, 30));
        jPanel7.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 150, 30));

        jButton14.setText("Add");
        jButton14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 60, 30));

        jButton15.setText("Reset");
        jButton15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 50, 30));

        jLabel15.setText("Program ID");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));
        jPanel7.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 150, 30));
        jPanel7.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 150, 30));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 430, 440));

        jButton16.setText("View All Employees");
        jButton16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 520, 140, 40));

        jButton12.setText("Remove Trainer");
        jButton12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 520, 120, 40));

        jButton11.setText("Edit Trainer");
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, 100, 40));

        jButton10.setText("View All Trainers");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 120, 40));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 1190, -1));

        jButton8.setText("Training Programs");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 120, 50));

        jButton17.setText("Trainers");
        jButton17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton17.setContentAreaFilled(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 50));

        lbl_home1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_home1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_home1.setText("Home");
        lbl_home1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl_home1.setOpaque(true);
        lbl_home1.setPreferredSize(new java.awt.Dimension(60, 30));
        lbl_home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_home1MouseClicked(evt);
            }
        });
        jPanel5.add(lbl_home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 60, 30));

        lbl_HRhome1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_HRhome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_HRhome1.setText("HRHome");
        lbl_HRhome1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl_HRhome1.setOpaque(true);
        lbl_HRhome1.setPreferredSize(new java.awt.Dimension(60, 30));
        lbl_HRhome1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_HRhome1MouseClicked(evt);
            }
        });
        jPanel5.add(lbl_HRhome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 60, 30));

        lbl_settings1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_settings1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_settings1.setText("Setting");
        lbl_settings1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl_settings1.setOpaque(true);
        lbl_settings1.setPreferredSize(new java.awt.Dimension(60, 30));
        lbl_settings1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_settings1MouseClicked(evt);
            }
        });
        jPanel5.add(lbl_settings1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 60, 30));

        lbl_logout1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_logout1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_logout1.setText("Logout");
        lbl_logout1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl_logout1.setOpaque(true);
        lbl_logout1.setPreferredSize(new java.awt.Dimension(60, 30));
        lbl_logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_logout1MouseClicked(evt);
            }
        });
        jPanel5.add(lbl_logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 60, 30));

        emp_background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MainBackForAll.jpg"))); // NOI18N
        emp_background2.setPreferredSize(new java.awt.Dimension(1190, 570));
        jPanel5.add(emp_background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 580));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        PnlMenu.setPreferredSize(new java.awt.Dimension(1200, 100));
        PnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MenuBar_Back_Main_HR.jpg"))); // NOI18N
        jLabel17.setMaximumSize(new java.awt.Dimension(1190, 75));
        jLabel17.setMinimumSize(new java.awt.Dimension(1190, 75));
        jLabel17.setPreferredSize(new java.awt.Dimension(1190, 75));
        PnlMenu.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(true);
        jPanel5.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(false);
        jPanel5.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void lbl_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logoutMouseClicked
        // TODO add your handling code here:
        String ObjButtons[] = {"Yes", "No"};
        int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to Logout?", "Logout Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
        if (PromptResult == JOptionPane.YES_OPTION) {
            MainLogin lg = new MainLogin();
            JDesktopPane desktopPane = getDesktopPane();
            desktopPane.add(lg).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lbl_logoutMouseClicked

    private void lbl_settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_settingsMouseClicked
        // TODO add your handling code here:
        Settings st = new Settings();
        st.setVisible(true);
    }//GEN-LAST:event_lbl_settingsMouseClicked

    private void lbl_HRhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_HRhomeMouseClicked
        // TODO add your handling code here:
        HRHome hr = new HRHome();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(hr).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_HRhomeMouseClicked

    private void lbl_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_homeMouseClicked
        // TODO add your handling code here:
        MHome m = new MHome();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(m).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_homeMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void lbl_home1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_home1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_home1MouseClicked

    private void lbl_HRhome1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_HRhome1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_HRhome1MouseClicked

    private void lbl_settings1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_settings1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_settings1MouseClicked

    private void lbl_logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logout1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_logout1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlMenu;
    private javax.swing.JLabel emp_background;
    private javax.swing.JLabel emp_background2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lbl_HRhome;
    private javax.swing.JLabel lbl_HRhome1;
    private javax.swing.JLabel lbl_home;
    private javax.swing.JLabel lbl_home1;
    private javax.swing.JLabel lbl_logout;
    private javax.swing.JLabel lbl_logout1;
    private javax.swing.JLabel lbl_settings;
    private javax.swing.JLabel lbl_settings1;
    // End of variables declaration//GEN-END:variables
}
