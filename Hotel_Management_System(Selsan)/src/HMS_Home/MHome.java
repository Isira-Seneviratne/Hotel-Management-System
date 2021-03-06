package HMS_Home;

import Customer_intaface.frmHome;

import FMS_Interface.FMS_Home1;
import HRMS_Codes.Hotel;
import HRMS_Codes.HR_Methods;
import HRMS_Interface.MainLogin;
import HRMS_Interface.UserManagement;
import Stock_Interface.Food;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Prabas Gayadeeptha
 */
public class MHome extends javax.swing.JInternalFrame {
Hotel c= new Hotel();
    HR_Methods hrm = new HR_Methods();
    Color blueColor = new Color(0, 174, 239);

    public MHome() {
        initComponents();

        HMS_Methods md = new HMS_Methods();
        md.unmovableInternal(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_hmsHome = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_custBooking = new javax.swing.JButton();
        btn_finance = new javax.swing.JButton();
        btn_stock = new javax.swing.JButton();
        btn_hr = new javax.swing.JButton();
        btn_home2 = new javax.swing.JButton();
        btn_logout2 = new javax.swing.JButton();
        emp_background = new javax.swing.JLabel();
        PnlMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1200, 680));
        setPreferredSize(new java.awt.Dimension(1200, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_hmsHome.setBackground(new java.awt.Color(255, 255, 255));
        pnl_hmsHome.setMinimumSize(new java.awt.Dimension(1190, 580));
        pnl_hmsHome.setPreferredSize(new java.awt.Dimension(1190, 580));
        pnl_hmsHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnl_hmsHome.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1190, 10));

        btn_custBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/Customers_Small.png"))); // NOI18N
        btn_custBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_custBookingMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_custBookingMouseEntered(evt);
            }
        });
        btn_custBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_custBookingActionPerformed(evt);
            }
        });
        pnl_hmsHome.add(btn_custBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, 250, 200));

        btn_finance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/Finance_Small.png"))); // NOI18N
        btn_finance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_financeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_financeMouseEntered(evt);
            }
        });
        btn_finance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_financeActionPerformed(evt);
            }
        });
        pnl_hmsHome.add(btn_finance, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 250, 200));

        btn_stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/Stock_Small.png"))); // NOI18N
        btn_stock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_stockMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_stockMouseEntered(evt);
            }
        });
        btn_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stockActionPerformed(evt);
            }
        });
        pnl_hmsHome.add(btn_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 250, 200));

        btn_hr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/HR_Small(low).png"))); // NOI18N
        btn_hr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_hrMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_hrMouseEntered(evt);
            }
        });
        btn_hr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hrActionPerformed(evt);
            }
        });
        pnl_hmsHome.add(btn_hr, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 250, 200));

        btn_home2.setBackground(new java.awt.Color(255, 255, 255));
        btn_home2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_home2.setForeground(new java.awt.Color(0, 174, 239));
        btn_home2.setText("Home");
        btn_home2.setBorder(null);
        btn_home2.setOpaque(false);
        btn_home2.setPreferredSize(new java.awt.Dimension(110, 25));
        btn_home2.setSelected(true);
        btn_home2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_home2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_home2MouseExited(evt);
            }
        });
        btn_home2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home2ActionPerformed(evt);
            }
        });
        pnl_hmsHome.add(btn_home2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 120, 50));

        btn_logout2.setBackground(new java.awt.Color(255, 255, 255));
        btn_logout2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_logout2.setForeground(new java.awt.Color(0, 174, 239));
        btn_logout2.setText("Logout");
        btn_logout2.setBorder(null);
        btn_logout2.setOpaque(false);
        btn_logout2.setPreferredSize(new java.awt.Dimension(110, 25));
        btn_logout2.setSelected(true);
        btn_logout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logout2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logout2MouseExited(evt);
            }
        });
        btn_logout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logout2ActionPerformed(evt);
            }
        });
        pnl_hmsHome.add(btn_logout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 120, 50));

        emp_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MainBackForAll.jpg"))); // NOI18N
        emp_background.setPreferredSize(new java.awt.Dimension(1190, 570));
        pnl_hmsHome.add(emp_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 580));

        getContentPane().add(pnl_hmsHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        PnlMenu.setPreferredSize(new java.awt.Dimension(1200, 100));
        PnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MenuBar_Back_Main_Hotel.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1190, 75));
        jLabel1.setMinimumSize(new java.awt.Dimension(1190, 75));
        jLabel1.setPreferredSize(new java.awt.Dimension(1190, 75));
        PnlMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_custBookingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_custBookingMouseEntered
        this.btn_custBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/Customers_Large.png")));
    }//GEN-LAST:event_btn_custBookingMouseEntered

    private void btn_custBookingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_custBookingMouseExited
        this.btn_custBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/Customers_Small.png")));
    }//GEN-LAST:event_btn_custBookingMouseExited

    private void btn_financeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_financeMouseEntered
        this.btn_finance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/Finance_Large.png")));
    }//GEN-LAST:event_btn_financeMouseEntered

    private void btn_financeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_financeMouseExited
        this.btn_finance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/Finance_Small.png")));
    }//GEN-LAST:event_btn_financeMouseExited

    private void btn_stockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_stockMouseEntered
        this.btn_stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/Stock_Large.png")));
    }//GEN-LAST:event_btn_stockMouseEntered

    private void btn_stockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_stockMouseExited
        this.btn_stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/Stock_Small.png")));
    }//GEN-LAST:event_btn_stockMouseExited

    private void btn_hrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hrMouseEntered
        this.btn_hr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/HR_Large(low).png")));
    }//GEN-LAST:event_btn_hrMouseEntered

    private void btn_hrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hrMouseExited
        this.btn_hr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/HR_Small(low).png")));
    }//GEN-LAST:event_btn_hrMouseExited

    private void btn_hrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hrActionPerformed
        UserManagement um = new UserManagement();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(um).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_hrActionPerformed

    private void btn_financeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_financeActionPerformed
        FMS_Home1 f = new FMS_Home1();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(f).setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_financeActionPerformed

    private void btn_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stockActionPerformed
        Food f = new Food();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(f).setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_stockActionPerformed

    private void btn_custBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_custBookingActionPerformed
        frmHome fh = new frmHome();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(fh).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_custBookingActionPerformed

    private void btn_home2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_home2MouseEntered
        hrm.MouseEnterEvent(btn_home2);
    }//GEN-LAST:event_btn_home2MouseEntered

    private void btn_home2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_home2MouseExited
        hrm.MouseExitEvent(btn_home2, blueColor);
    }//GEN-LAST:event_btn_home2MouseExited

    private void btn_home2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home2ActionPerformed
        MHome m = new MHome();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(m).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_home2ActionPerformed

    private void btn_logout2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logout2MouseEntered
        hrm.MouseEnterEvent(btn_logout2);
    }//GEN-LAST:event_btn_logout2MouseEntered

    private void btn_logout2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logout2MouseExited
        hrm.MouseExitEvent(btn_logout2, blueColor);
    }//GEN-LAST:event_btn_logout2MouseExited

    private void btn_logout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logout2ActionPerformed
        String ObjButtons[] = {"Yes", "No"};
        int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to Logout?", "Logout Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
        if (PromptResult == JOptionPane.YES_OPTION) {
            MainLogin lg = new MainLogin();
            JDesktopPane desktopPane = getDesktopPane();
            desktopPane.add(lg).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_logout2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlMenu;
    public javax.swing.JButton btn_custBooking;
    public javax.swing.JButton btn_finance;
    private javax.swing.JButton btn_home2;
    public javax.swing.JButton btn_hr;
    private javax.swing.JButton btn_logout2;
    public javax.swing.JButton btn_stock;
    private javax.swing.JLabel emp_background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnl_hmsHome;
    // End of variables declaration//GEN-END:variables
}
