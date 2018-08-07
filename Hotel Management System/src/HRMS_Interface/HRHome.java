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
public class HRHome extends javax.swing.JInternalFrame {

    /**
     * Creates new form HRHome
     */
    public HRHome() {
        initComponents();
        
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
        lbl_homeMenulogout = new javax.swing.JLabel();
        lbl_homeMenulogout2 = new javax.swing.JLabel();
        lbl_homeMenulogout1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PnlMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1200, 680));
        setPreferredSize(new java.awt.Dimension(1200, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1190, 580));
        jPanel1.setPreferredSize(new java.awt.Dimension(1190, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_homeMenulogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_homeMenulogout.setText("Home");
        lbl_homeMenulogout.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), null));
        lbl_homeMenulogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_homeMenulogoutMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_homeMenulogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 60, 30));

        lbl_homeMenulogout2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_homeMenulogout2.setText("Setting");
        lbl_homeMenulogout2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), null));
        lbl_homeMenulogout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_homeMenulogout2MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_homeMenulogout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 60, 30));

        lbl_homeMenulogout1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_homeMenulogout1.setText("Logout");
        lbl_homeMenulogout1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), null));
        lbl_homeMenulogout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_homeMenulogout1MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_homeMenulogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, 60, 30));

        jSeparator1.setPreferredSize(new java.awt.Dimension(1190, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1190, 10));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/userbtn.png"))); // NOI18N
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, 50, 40));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/jobbtn.png"))); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 280, 50, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/interviewbtn.png"))); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 50, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/salarybtn.png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, 50, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/attendencebtn.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 50, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/employeebtn.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 50, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/trainingbtn.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 50, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MainHRHome.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(1200, 600));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        PnlMenu.setPreferredSize(new java.awt.Dimension(1200, 100));
        PnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MenuBar_Back_Main_HR.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1190, 75));
        jLabel1.setMinimumSize(new java.awt.Dimension(1190, 75));
        jLabel1.setPreferredSize(new java.awt.Dimension(1190, 75));
        PnlMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        // TODO add your handling code here:
        this.jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/userbtnGo.png")));
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        // TODO add your handling code here:
        this.jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/userbtn.png")));
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        UserManagement um = new UserManagement();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(um).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        // TODO add your handling code here:
        this.jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/jobbtnGo.png")));
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        // TODO add your handling code here:
        this.jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/jobbtn.png")));
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        JobAnalysis ja = new JobAnalysis();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(ja).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
        this.jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/interviewbtnGo.png")));
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
        this.jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/interviewbtn.png")));
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        this.jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/salarybtnGo.png")));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        this.jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/salarybtn.png")));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        this.jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/attendencebtnGo.png")));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        this.jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/attendencebtn.png")));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        this.jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/employeebtnGo.png")));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        this.jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/employeebtn.png")));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        this.jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/trainingbtnGo.png")));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        this.jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/trainingbtn.png")));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        EmployeeManagement em = new EmployeeManagement();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(em).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TrainingManagement tm = new TrainingManagement();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(tm).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        AttendenceManagement am = new AttendenceManagement();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(am).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        InterviewManagement im = new InterviewManagement();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(im).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        PayRoll pr = new PayRoll();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(pr).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void lbl_homeMenulogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_homeMenulogoutMouseClicked
        // TODO add your handling code here:
        MHome m = new MHome();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(m).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_homeMenulogoutMouseClicked

    private void lbl_homeMenulogout2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_homeMenulogout2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_homeMenulogout2MouseClicked

    private void lbl_homeMenulogout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_homeMenulogout1MouseClicked
        // TODO add your handling code here:
        String ObjButtons[] = {"Yes","No"};
        int PromptResult = JOptionPane.showOptionDialog(null,"Are you sure you want to Logout?","Exit Confirmation",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,ObjButtons,ObjButtons[1]);
        if(PromptResult==JOptionPane.YES_OPTION)
        {
            MainLogin lg = new MainLogin();
            JDesktopPane desktopPane = getDesktopPane();
            desktopPane.add(lg).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lbl_homeMenulogout1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_homeMenulogout;
    private javax.swing.JLabel lbl_homeMenulogout1;
    private javax.swing.JLabel lbl_homeMenulogout2;
    // End of variables declaration//GEN-END:variables
}
