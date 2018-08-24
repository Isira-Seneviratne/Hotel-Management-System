package HRMS_Interface;

import HMS_Home.MHome;
import HMS_Database.MyDBConnection;
import HMS_Home.HMS_Methods;
import HRMS_Codes.Hotel;
import HRMS_Codes.HR_Methods;
import HRMS_Codes.ValidationHRMS;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.HeadlessException;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Prabas Gayadeeptha
 */
public class InterviewManagement extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    Hotel c = new Hotel();

    HR_Methods hrm = new HR_Methods();
    java.util.Date date;
    Color blueColor = new Color(0, 174, 239);
    String sql = "";

    public InterviewManagement() {
        initComponents();
        this.panelVisible(false, true, false);
        HMS_Methods hm = new HMS_Methods();
        hm.unmovableInternal(this);

        HR_Methods.loadTable(tbl_candidate, "candidate", "candidateID");
        conn = (Connection) MyDBConnection.connectDB();

    }

    public void setCandidate() {
        c.setCandidateID(txt_canID.getText());
        c.setFullname(txt_fname.getText());
        c.setInitialname(txt_initialName.getText());
        c.setGender(txt_gender.getText());
        c.setNic(txt_nic.getText());
        c.setDob(dc_dob.getText());
        c.setAddress(txtA_address.getText());
        c.setHomeNo(txt_hno.getText());
        c.setMobileNo(txt_mno.getText());
        c.setMail(txt_mail.getText());
        c.setApplicantDate(((JTextField) dc_aplicantDate.getDateEditor().getUiComponent()).getText());
        c.setDepartment(cmb_department.getSelectedItem().toString());
        c.setDesignation(cmb_designation.getSelectedItem().toString());
        c.setQulification(txtA_qualification.getText());
        c.setDegree(txt_degree.getText());
        c.setExperience(txt_exp.getText());
    }

    public void setInterviewSchedule() {
        c.setInterviewID(txt_interID.getText());
        c.setFullname(txt_c_name.getText());
        c.setJobName(txt_jobName.getText());
        c.setInterviewType(cmb_itype.getSelectedItem().toString());
        c.setInterviewDate(((JTextField) dc_idate.getDateEditor().getUiComponent()).getText());
        c.setStartTime(((JTextField) tc_iTime.getTimeField()).getText());
    }

    public void AddCandidate() {
        this.setCandidate();
        //check the fields are empty or not
        if (c.getDesignation().equals("Select Role") || c.getAddress().isEmpty() || c.getFullname().isEmpty()
                || c.getInitialname().isEmpty() || c.getMail().isEmpty() || c.getNic().isEmpty()
                || c.getApplicantDate().isEmpty() || c.getDepartment().equals("Select Department") || c.getDob().isEmpty()
                || c.getDegree().isEmpty() || c.getExperience().isEmpty() || c.getQulification().isEmpty()
                || c.getHomeNo().isEmpty() || c.getMobileNo().isEmpty() || c.getGender().isEmpty()) {

            this.lbl_canadduppres.setText("**All the fields must be filled");
        } else {
            try {
                //insert data to database
                boolean status = HR_Methods.InsertCandidateToDB(c.getCandidateID(), c.getFullname(), c.getInitialname(),
                        c.getGender(), c.getNic(), c.getDob(), c.getAddress(), c.getHomeNo(), c.getMobileNo(), c.getMail(),
                        c.getApplicantDate(), c.getDepartment(), c.getDesignation(), c.getQulification(), c.getDegree(), c.getExperience());
                if (status = true) {
                    this.lbl_canadduppres.setText(null);

                    JOptionPane.showMessageDialog(null, "Candidate Record Seved Successfully");
                    this.canEmptyForm();
                    this.canEnableTxt(false);
                    this.canEmptyVal_lbl();
                    this.buttonEnable(btn_canadd, false, btn_canupdate, false, btn_canreset, false);
                    this.panelVisible(false, true, false);
                    HR_Methods.loadTable(tbl_candidate, "candidate", "candidateID");
                } else {
                    JOptionPane.showMessageDialog(null, "Candidate Record cant save");
                }
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Can't save record..Check fields and try again");
            }
        }
    }

    public void UpdateCandidate() {
        this.setCandidate();
        if (c.getDesignation().equals("Select Role") || c.getAddress().isEmpty() || c.getFullname().isEmpty()
                || c.getInitialname().isEmpty() || c.getMail().isEmpty() || c.getNic().isEmpty()
                || c.getApplicantDate().isEmpty() || c.getDepartment().equals("Select Department") || c.getDob().isEmpty()
                || c.getDegree().isEmpty() || c.getExperience().isEmpty() || c.getQulification().isEmpty()
                || c.getHomeNo().isEmpty() || c.getMobileNo().isEmpty() || c.getGender().isEmpty()) {

            this.lbl_canadduppres.setText("**All the fields must be filled");
        } else {

            this.canEmptyVal_lbl();
            try {
                boolean status = HR_Methods.UpdateCandidateInDB(c.getCandidateID(), c.getFullname(), c.getInitialname(),
                        c.getGender(), c.getNic(), c.getDob(), c.getAddress(), c.getHomeNo(), c.getMobileNo(), c.getMail(),
                        c.getApplicantDate(), c.getDepartment(), c.getDesignation(), c.getQulification(), c.getDegree(), c.getExperience());

                if (status = true) {
                    this.lbl_canadduppres.setText(null);

                    JOptionPane.showMessageDialog(null, "Candidate Record Updated Successfully");
                    this.canEmptyForm();
                    this.canEnableTxt(false);
                    this.canEmptyVal_lbl();
                    this.buttonEnable(btn_canadd, false, btn_canupdate, false, btn_canreset, false);
                    this.panelVisible(false, true, false);
                    HR_Methods.loadTable(tbl_candidate, "candidate", "candidateID");
                } else {
                    JOptionPane.showMessageDialog(null, "Candidate Record cant Update");
                }
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Cant update Candidate record... " + e);
            }
        }
    }

    public void AddInterviewSchedule() {
        this.setInterviewSchedule();
        if (c.getInterviewID().isEmpty() || c.getFullname().isEmpty() || c.getJobName().isEmpty()
                || c.getInterviewType().equals("Select Type") || c.getInterviewDate().isEmpty() || c.getStartTime().equals("  :  :  ")) {
            this.lbl_buttonvalidate.setText("All field must be filled");
        } else {
            try {
                //insert data to database
                boolean status = HR_Methods.InsertInterviewScheduleToDB(c.getInterviewID(), lbl_CANDID.getText(), c.getFullname(), c.getJobName(),
                        c.getInterviewType(), c.getInterviewDate(), c.getStartTime());
                if (status = true) {
                    this.lbl_buttonvalidate.setText(null);

                    JOptionPane.showMessageDialog(null, "interview schedule added Successfully");
                    this.scheduleEmptyForm();
                    this.scheduleEmptyVal_lbl();
                    HR_Methods.loadTable(tbl_interview_schedule, "interview_schedule", "interID");
                    hrm.AutoGeneratePrimaryKey(lbl_iidVal, txt_interID, 'I', "interview_schedule", "interID");
                } else {
                    JOptionPane.showMessageDialog(null, "interview schedule cant add");
                }
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Can't save record..Check fields and try again");
            }
        }
    }

    public void UpdateInterviewSchedule() {
        this.setInterviewSchedule();
        if (c.getInterviewID().isEmpty() || c.getFullname().isEmpty() || c.getJobName().isEmpty()
                || c.getInterviewType().equals("Select Type") || c.getInterviewDate().isEmpty() || c.getStartTime().equals("  :  :  ")) {
            this.lbl_buttonvalidate.setText("All field must be filled");
        } else {
            try {
                //insert data to database
                boolean status = HR_Methods.UpdateInterviewScheduleInDB(c.getInterviewID(), lbl_CANDID.getText(), c.getFullname(), c.getJobName(),
                        c.getInterviewType(), c.getInterviewDate(), c.getStartTime());
                if (status = true) {
                    this.lbl_buttonvalidate.setText(null);

                    JOptionPane.showMessageDialog(null, "interview schedule updated Successfully");
                    this.scheduleEmptyForm();
                    this.scheduleEmptyVal_lbl();
                    HR_Methods.loadTable(tbl_interview_schedule, "interview_schedule", "date");
                    hrm.AutoGeneratePrimaryKey(lbl_iidVal, txt_interID, 'I', "interview_schedule", "interID");
                } else {
                    JOptionPane.showMessageDialog(null, "interview schedule cant update");
                }
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Can't save record..Check fields and try again");
            }
        }
    }

    public void UpdateStatus() {
        this.setInterviewSchedule();
        if (txt_nameSU.getText().isEmpty() || cmb_status.getSelectedItem().toString().equals("Select Status")
                || cmb_intBy.getSelectedItem().toString().equals("Select Interviewer")) {
            this.lbl_scheduleTblVali.setText("All field must be filled");
        } else {
            try {
                //insert data to database
                boolean status = HR_Methods.UpdateInterviewScheduleStatus(txt_nameSU.getText(), cmb_intBy.getSelectedItem().toString(), cmb_status.getSelectedItem().toString());
                if (status = true) {
                    this.lbl_scheduleTblVali.setText(null);

                    JOptionPane.showMessageDialog(null, "interview schedule updated Successfully");
                    this.txt_nameSU.setText(null);
                    this.cmb_intBy.setSelectedItem("Select Interviewer");
                    this.cmb_status.setSelectedItem("Select Status");
                    this.cmb_intBy.setEnabled(false);
                    this.cmb_status.setEnabled(false);
                    btn_updateStatus.setEnabled(false);
                    HR_Methods.loadTable(tbl_interview_schedule, "interview_schedule", "date");
                    hrm.AutoGeneratePrimaryKey(lbl_iidVal, txt_interID, 'I', "interview_schedule", "interID");
                } else {
                    JOptionPane.showMessageDialog(null, "interview schedule cant update");
                }
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Can't save record..Check fields and try again");
            }
        }
    }

    public void buttonEnable(JButton addB, boolean add, JButton updateB, boolean update, JButton resetB, boolean reset) {
        addB.setEnabled(add);
        updateB.setEnabled(update);
        resetB.setEnabled(reset);
    }

    public final void panelVisible(boolean candidate, boolean cnView, boolean schedule) {
        this.pnl_Candidate.setVisible(candidate);
        this.pnl_viewCandidate.setVisible(cnView);
        this.pnl_interschedule.setVisible(schedule);
    }

    public void canEmptyForm() {
        HR_Methods hm = new HR_Methods();
        txt_canID.setText(null);
        txt_fname.setText(null);
        txt_initialName.setText(null);
        txt_nic.setText(null);
        txt_gender.setText(null);
        dc_dob.setText(null);
        txtA_address.setText(null);
        txt_hno.setText(null);
        txt_mno.setText(null);
        txt_mail.setText(null);
        cmb_department.setSelectedItem("Select Department");
        cmb_designation.setSelectedItem("Select Role");
        dc_aplicantDate.setDate(null);
        txtA_qualification.setText(null);
        txt_degree.setText(null);
        txt_exp.setText(null);
    }

    public void scheduleEmptyForm() {
        txt_c_name.setText(null);
        txt_jobName.setText(null);
        ((JTextField) tc_iTime.getTimeField()).setText(null);
        dc_idate.setDate(null);
        cmb_itype.setSelectedItem("Select Type");
        lbl_CANDID.setText(null);
    }

    public void canEnableTxt(boolean status) {
        txt_fname.setEnabled(status);
        txt_initialName.setEnabled(status);
        txt_nic.setEnabled(status);
        txt_gender.setEnabled(status);
        dc_dob.setEnabled(status);
        txtA_address.setEnabled(status);
        txt_hno.setEnabled(status);
        txt_mno.setEnabled(status);
        txt_mail.setEnabled(status);
        dc_aplicantDate.setEnabled(status);
        cmb_department.setEnabled(status);
        cmb_designation.setEnabled(status);
        txtA_qualification.setEnabled(status);
        txt_degree.setEnabled(status);
        txt_exp.setEnabled(status);
    }

    public void canEmptyVal_lbl() {
        lbl_canID.setText(null);
        lbl_canfname.setText(null);
        lbl_canname.setText(null);
        lbl_canNIC.setText(null);
        lbl_candob.setText(null);
        lbl_cangender.setText(null);
        lbl_canaddress.setText(null);
        lbl_canHno.setText(null);
        lbl_canmno.setText(null);
        lbl_canmail1.setText(null);
        lbl_candepartment.setText(null);
        lbl_canrole.setText(null);
        lbl_canQul.setText(null);
        lbl_canDgr.setText(null);
        lbl_canExp.setText(null);
    }

    public void scheduleEmptyVal_lbl() {
        lbl_iidVal.setText(null);
        lbl_itypeVal.setText(null);
        lbl_idateVal.setText(null);
        lbl_istimeVal.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_viewCandidate = new javax.swing.JPanel();
        btn_canEdit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_candidate = new javax.swing.JTable();
        btn_canSearch = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_csearch = new javax.swing.JTextField();
        cmb_search = new javax.swing.JComboBox<>();
        lbl_SearchValidate = new javax.swing.JLabel();
        btn_canSetInterview = new javax.swing.JButton();
        btn_canremove = new javax.swing.JButton();
        btn_ViewCand = new javax.swing.JButton();
        btn_candidate1 = new javax.swing.JButton();
        btn_intSched1 = new javax.swing.JButton();
        btn_home1 = new javax.swing.JButton();
        btn_logout1 = new javax.swing.JButton();
        lbl_btntblvalidate = new javax.swing.JLabel();
        emp_background4 = new javax.swing.JLabel();
        pnl_interschedule = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_interview_schedule = new javax.swing.JTable();
        btn_candSearchSchedule = new javax.swing.JButton();
        txt_candSearchSchedule = new javax.swing.JTextField();
        jButton26 = new javax.swing.JButton();
        lbl_cansrchSchedVal = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txt_interID = new javax.swing.JTextField();
        txt_c_name = new javax.swing.JTextField();
        txt_jobName = new javax.swing.JTextField();
        cmb_itype = new javax.swing.JComboBox<>();
        dc_idate = new com.toedter.calendar.JDateChooser();
        tc_iTime = new lu.tudor.santec.jtimechooser.JTimeChooser();
        jLabel27 = new javax.swing.JLabel();
        lbl_istimeVal = new javax.swing.JLabel();
        lbl_iidVal = new javax.swing.JLabel();
        lbl_itypeVal = new javax.swing.JLabel();
        lbl_idateVal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btn_removeSchedule = new javax.swing.JButton();
        lbl_CANDID = new javax.swing.JLabel();
        btn_setIntDetails = new javax.swing.JButton();
        btn_editSchedule = new javax.swing.JButton();
        btn_candidate2 = new javax.swing.JButton();
        btn_intSched2 = new javax.swing.JButton();
        btn_home2 = new javax.swing.JButton();
        btn_setContract = new javax.swing.JButton();
        btn_logout2 = new javax.swing.JButton();
        btn_updateStatus = new javax.swing.JButton();
        btn_scheduleAdd = new javax.swing.JButton();
        btn_scheduleUpdate = new javax.swing.JButton();
        btn_scheduleReset = new javax.swing.JButton();
        pnl_IntDetails = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_nameSU = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmb_status = new javax.swing.JComboBox<>();
        cmb_intBy = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        lbl_scheduleTblVali = new javax.swing.JLabel();
        lbl_buttonvalidate = new javax.swing.JLabel();
        emp_background6 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        pnl_Candidate = new javax.swing.JPanel();
        btn_canadd = new javax.swing.JButton();
        btn_canupdate = new javax.swing.JButton();
        btn_canreset = new javax.swing.JButton();
        btn_intSched = new javax.swing.JButton();
        btn_candidate = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_degree = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        lbl_fname = new javax.swing.JLabel();
        dc_dob = new javax.swing.JTextField();
        txt_fname = new javax.swing.JTextField();
        lbl_initialName = new javax.swing.JLabel();
        txt_initialName = new javax.swing.JTextField();
        txt_gender = new javax.swing.JTextField();
        lbl_nic = new javax.swing.JLabel();
        txt_nic = new javax.swing.JTextField();
        lbl_gender = new javax.swing.JLabel();
        lbl_dob = new javax.swing.JLabel();
        lbl_mail = new javax.swing.JLabel();
        lbl_mno = new javax.swing.JLabel();
        lbl_hno = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        jScrollPaneAddress = new javax.swing.JScrollPane();
        txtA_address = new javax.swing.JTextArea();
        txt_hno = new javax.swing.JTextField();
        txt_mno = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_canID = new javax.swing.JTextField();
        lbl_employeeID = new javax.swing.JLabel();
        txt_exp = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        cmb_designation = new javax.swing.JComboBox<>();
        cmb_department = new javax.swing.JComboBox<>();
        lbl_department1 = new javax.swing.JLabel();
        lbl_designation1 = new javax.swing.JLabel();
        lbl_canID = new javax.swing.JLabel();
        lbl_canfname = new javax.swing.JLabel();
        lbl_canname = new javax.swing.JLabel();
        lbl_canNIC = new javax.swing.JLabel();
        lbl_cangender = new javax.swing.JLabel();
        lbl_candob = new javax.swing.JLabel();
        lbl_canaddress = new javax.swing.JLabel();
        lbl_canHno = new javax.swing.JLabel();
        lbl_canmno = new javax.swing.JLabel();
        lbl_candepartment = new javax.swing.JLabel();
        lbl_canrole = new javax.swing.JLabel();
        lbl_canDgr = new javax.swing.JLabel();
        lbl_canExp = new javax.swing.JLabel();
        lbl_canQul = new javax.swing.JLabel();
        lbl_canmail1 = new javax.swing.JLabel();
        dc_aplicantDate = new com.toedter.calendar.JDateChooser();
        txtA_qualification = new javax.swing.JTextField();
        lbl_candepartment1 = new javax.swing.JLabel();
        lbl_department2 = new javax.swing.JLabel();
        lbl_canborder = new javax.swing.JLabel();
        lbl_border1 = new javax.swing.JLabel();
        lbl_border = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbl_canadduppres = new javax.swing.JLabel();
        lbl_subhome = new javax.swing.JLabel();
        PnlMenu = new javax.swing.JPanel();
        btn_UserMain = new javax.swing.JButton();
        btn_interviewMain = new javax.swing.JButton();
        btn_EmployeeMain = new javax.swing.JButton();
        btn_attendeceMain = new javax.swing.JButton();
        btn_payrollMain = new javax.swing.JButton();
        btn_jobMain = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1200, 680));
        setPreferredSize(new java.awt.Dimension(1200, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_viewCandidate.setMinimumSize(new java.awt.Dimension(1190, 580));
        pnl_viewCandidate.setPreferredSize(new java.awt.Dimension(1190, 580));
        pnl_viewCandidate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_canEdit.setBackground(new java.awt.Color(255, 255, 255));
        btn_canEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_canEdit.setText("Edit Candidate");
        btn_canEdit.setBorder(null);
        btn_canEdit.setSelected(true);
        btn_canEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_canEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_canEditMouseExited(evt);
            }
        });
        btn_canEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_canEditActionPerformed(evt);
            }
        });
        pnl_viewCandidate.add(btn_canEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 120, 40));
        pnl_viewCandidate.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1190, 20));

        jPanel1.setBackground(new java.awt.Color(247, 249, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "View Candidates", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_candidate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CID", "FullName", "InitialName", "Gender", "NIC", "DoB", "Address", "HomePhone", "MobilePhone", "Email", "Department", "Designation", "Qualifications", "Degree", "Experience"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_candidate);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1150, 310));

        btn_canSearch.setBackground(new java.awt.Color(255, 255, 255));
        btn_canSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_canSearch.setText("Search");
        btn_canSearch.setBorder(null);
        btn_canSearch.setSelected(true);
        btn_canSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_canSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_canSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 80, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("View All Candidates");
        jButton2.setBorder(null);
        jButton2.setSelected(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 40, 130, 40));

        txt_csearch.setForeground(new java.awt.Color(153, 153, 153));
        txt_csearch.setText("Candidate ID");
        txt_csearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_csearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_csearchMouseClicked(evt);
            }
        });
        jPanel1.add(txt_csearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 130, 30));

        cmb_search.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        cmb_search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by ID", "Search by Name" }));
        cmb_search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        cmb_search.setPreferredSize(new java.awt.Dimension(113, 30));
        cmb_search.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_searchItemStateChanged(evt);
            }
        });
        jPanel1.add(cmb_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 120, -1));

        lbl_SearchValidate.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lbl_SearchValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 250, 20));

        pnl_viewCandidate.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1170, 410));

        btn_canSetInterview.setBackground(new java.awt.Color(255, 255, 255));
        btn_canSetInterview.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_canSetInterview.setText("Set Interview");
        btn_canSetInterview.setBorder(null);
        btn_canSetInterview.setSelected(true);
        btn_canSetInterview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_canSetInterviewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_canSetInterviewMouseExited(evt);
            }
        });
        btn_canSetInterview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_canSetInterviewActionPerformed(evt);
            }
        });
        pnl_viewCandidate.add(btn_canSetInterview, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 130, 40));

        btn_canremove.setBackground(new java.awt.Color(255, 255, 255));
        btn_canremove.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_canremove.setText("Remove Candidate");
        btn_canremove.setBorder(null);
        btn_canremove.setSelected(true);
        btn_canremove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_canremoveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_canremoveMouseExited(evt);
            }
        });
        btn_canremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_canremoveActionPerformed(evt);
            }
        });
        pnl_viewCandidate.add(btn_canremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 130, 40));

        btn_ViewCand.setBackground(new java.awt.Color(255, 255, 255));
        btn_ViewCand.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_ViewCand.setText("Add New Candidate");
        btn_ViewCand.setBorder(null);
        btn_ViewCand.setSelected(true);
        btn_ViewCand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ViewCandMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ViewCandMouseExited(evt);
            }
        });
        btn_ViewCand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ViewCandActionPerformed(evt);
            }
        });
        pnl_viewCandidate.add(btn_ViewCand, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 480, 130, 40));

        btn_candidate1.setBackground(new java.awt.Color(255, 255, 255));
        btn_candidate1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_candidate1.setForeground(new java.awt.Color(0, 174, 239));
        btn_candidate1.setText("Candidates");
        btn_candidate1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_candidate1.setSelected(true);
        btn_candidate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_candidate1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_candidate1MouseExited(evt);
            }
        });
        btn_candidate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_candidate1ActionPerformed(evt);
            }
        });
        pnl_viewCandidate.add(btn_candidate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

        btn_intSched1.setBackground(new java.awt.Color(255, 255, 255));
        btn_intSched1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_intSched1.setForeground(new java.awt.Color(0, 174, 239));
        btn_intSched1.setText("Interview Schedule");
        btn_intSched1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_intSched1.setSelected(true);
        btn_intSched1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_intSched1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_intSched1MouseExited(evt);
            }
        });
        btn_intSched1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_intSched1ActionPerformed(evt);
            }
        });
        pnl_viewCandidate.add(btn_intSched1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 180, 50));

        btn_home1.setBackground(new java.awt.Color(255, 255, 255));
        btn_home1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_home1.setForeground(new java.awt.Color(0, 174, 239));
        btn_home1.setText("Home");
        btn_home1.setBorder(null);
        btn_home1.setOpaque(false);
        btn_home1.setPreferredSize(new java.awt.Dimension(110, 25));
        btn_home1.setSelected(true);
        btn_home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_home1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_home1MouseExited(evt);
            }
        });
        btn_home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home1ActionPerformed(evt);
            }
        });
        pnl_viewCandidate.add(btn_home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 120, 50));

        btn_logout1.setBackground(new java.awt.Color(255, 255, 255));
        btn_logout1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_logout1.setForeground(new java.awt.Color(0, 174, 239));
        btn_logout1.setText("Logout");
        btn_logout1.setBorder(null);
        btn_logout1.setOpaque(false);
        btn_logout1.setPreferredSize(new java.awt.Dimension(110, 25));
        btn_logout1.setSelected(true);
        btn_logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logout1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logout1MouseExited(evt);
            }
        });
        btn_logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logout1ActionPerformed(evt);
            }
        });
        pnl_viewCandidate.add(btn_logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 120, 50));

        lbl_btntblvalidate.setForeground(new java.awt.Color(255, 0, 51));
        pnl_viewCandidate.add(lbl_btntblvalidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 540, 20));

        emp_background4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MainBackForAll.jpg"))); // NOI18N
        emp_background4.setPreferredSize(new java.awt.Dimension(1190, 570));
        pnl_viewCandidate.add(emp_background4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 580));

        getContentPane().add(pnl_viewCandidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        pnl_interschedule.setToolTipText("");
        pnl_interschedule.setMinimumSize(new java.awt.Dimension(1190, 580));
        pnl_interschedule.setPreferredSize(new java.awt.Dimension(1190, 580));
        pnl_interschedule.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(247, 249, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Interview Schedule", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_interview_schedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "InterviewID", "cID", "cName", "jobName", "type", "date", "time", "InterviewBy", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_interview_schedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_interview_scheduleMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_interview_schedule);

        jPanel12.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 690, 160));

        btn_candSearchSchedule.setBackground(new java.awt.Color(255, 255, 255));
        btn_candSearchSchedule.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_candSearchSchedule.setText("Search");
        btn_candSearchSchedule.setBorder(null);
        btn_candSearchSchedule.setOpaque(false);
        btn_candSearchSchedule.setPreferredSize(new java.awt.Dimension(80, 30));
        btn_candSearchSchedule.setSelected(true);
        btn_candSearchSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_candSearchScheduleActionPerformed(evt);
            }
        });
        jPanel12.add(btn_candSearchSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        txt_candSearchSchedule.setForeground(new java.awt.Color(153, 153, 153));
        txt_candSearchSchedule.setText("Candidate Name");
        txt_candSearchSchedule.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_candSearchSchedule.setPreferredSize(new java.awt.Dimension(140, 30));
        txt_candSearchSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_candSearchScheduleMouseClicked(evt);
            }
        });
        jPanel12.add(txt_candSearchSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 140, -1));

        jButton26.setBackground(new java.awt.Color(255, 255, 255));
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton26.setText("View All Schedule");
        jButton26.setBorder(null);
        jButton26.setOpaque(false);
        jButton26.setSelected(true);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 120, 40));

        lbl_cansrchSchedVal.setForeground(new java.awt.Color(255, 0, 0));
        lbl_cansrchSchedVal.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel12.add(lbl_cansrchSchedVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 240, -1));

        pnl_interschedule.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 710, 290));

        jPanel13.setBackground(new java.awt.Color(247, 249, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setText("Interview ID");
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel13.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 100, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Candidate Name");
        jPanel13.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 100, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Job Name");
        jPanel13.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 100, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Interview Type");
        jPanel13.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 100, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("Date");
        jPanel13.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 100, 30));

        txt_interID.setEditable(false);
        txt_interID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel13.add(txt_interID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 200, 30));

        txt_c_name.setEditable(false);
        txt_c_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_c_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_c_nameActionPerformed(evt);
            }
        });
        jPanel13.add(txt_c_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 200, 30));

        txt_jobName.setEditable(false);
        txt_jobName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_jobName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jobNameActionPerformed(evt);
            }
        });
        jPanel13.add(txt_jobName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 200, 30));

        cmb_itype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Panel Interview", "Video Conference Interview" }));
        cmb_itype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel13.add(cmb_itype, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 200, 30));

        dc_idate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        dc_idate.setDateFormatString("yyyy-MM-dd");
        jPanel13.add(dc_idate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 200, 30));

        tc_iTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel13.add(tc_iTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 80, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("Start Time ");
        jPanel13.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 100, 30));

        lbl_istimeVal.setForeground(new java.awt.Color(255, 0, 0));
        lbl_istimeVal.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel13.add(lbl_istimeVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 210, 20));

        lbl_iidVal.setForeground(new java.awt.Color(255, 0, 0));
        lbl_iidVal.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel13.add(lbl_iidVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 210, 20));

        lbl_itypeVal.setForeground(new java.awt.Color(255, 0, 0));
        lbl_itypeVal.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel13.add(lbl_itypeVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 210, 20));

        lbl_idateVal.setForeground(new java.awt.Color(255, 0, 0));
        lbl_idateVal.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel13.add(lbl_idateVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 210, 20));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Add/Update Interview Schedule"));
        jPanel13.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 370, 390));

        pnl_interschedule.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 420, 430));
        pnl_interschedule.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1190, 20));

        btn_removeSchedule.setBackground(new java.awt.Color(255, 255, 255));
        btn_removeSchedule.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_removeSchedule.setText("Remove Schedule");
        btn_removeSchedule.setBorder(null);
        btn_removeSchedule.setOpaque(false);
        btn_removeSchedule.setSelected(true);
        btn_removeSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_removeScheduleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_removeScheduleMouseExited(evt);
            }
        });
        btn_removeSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeScheduleActionPerformed(evt);
            }
        });
        pnl_interschedule.add(btn_removeSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 360, 130, 40));
        pnl_interschedule.add(lbl_CANDID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, 10));

        btn_setIntDetails.setBackground(new java.awt.Color(255, 255, 255));
        btn_setIntDetails.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_setIntDetails.setText("Set InterviewDetails");
        btn_setIntDetails.setBorder(null);
        btn_setIntDetails.setEnabled(false);
        btn_setIntDetails.setOpaque(false);
        btn_setIntDetails.setSelected(true);
        btn_setIntDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_setIntDetailsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_setIntDetailsMouseExited(evt);
            }
        });
        btn_setIntDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setIntDetailsActionPerformed(evt);
            }
        });
        pnl_interschedule.add(btn_setIntDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, 130, 40));

        btn_editSchedule.setBackground(new java.awt.Color(255, 255, 255));
        btn_editSchedule.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_editSchedule.setText("Edit Schedule");
        btn_editSchedule.setBorder(null);
        btn_editSchedule.setOpaque(false);
        btn_editSchedule.setSelected(true);
        btn_editSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_editScheduleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_editScheduleMouseExited(evt);
            }
        });
        btn_editSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editScheduleActionPerformed(evt);
            }
        });
        pnl_interschedule.add(btn_editSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 360, 130, 40));

        btn_candidate2.setBackground(new java.awt.Color(255, 255, 255));
        btn_candidate2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_candidate2.setForeground(new java.awt.Color(0, 174, 239));
        btn_candidate2.setText("Candidates");
        btn_candidate2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_candidate2.setSelected(true);
        btn_candidate2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_candidate2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_candidate2MouseExited(evt);
            }
        });
        btn_candidate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_candidate2ActionPerformed(evt);
            }
        });
        pnl_interschedule.add(btn_candidate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

        btn_intSched2.setBackground(new java.awt.Color(255, 255, 255));
        btn_intSched2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_intSched2.setForeground(new java.awt.Color(0, 174, 239));
        btn_intSched2.setText("Interview Schedule");
        btn_intSched2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_intSched2.setSelected(true);
        btn_intSched2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_intSched2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_intSched2MouseExited(evt);
            }
        });
        btn_intSched2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_intSched2ActionPerformed(evt);
            }
        });
        pnl_interschedule.add(btn_intSched2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 180, 50));

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
        pnl_interschedule.add(btn_home2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 120, 50));

        btn_setContract.setBackground(new java.awt.Color(255, 255, 255));
        btn_setContract.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_setContract.setText("Set Contract");
        btn_setContract.setBorder(null);
        btn_setContract.setEnabled(false);
        btn_setContract.setOpaque(false);
        btn_setContract.setSelected(true);
        btn_setContract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_setContractMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_setContractMouseExited(evt);
            }
        });
        btn_setContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setContractActionPerformed(evt);
            }
        });
        pnl_interschedule.add(btn_setContract, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 130, 40));

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
        pnl_interschedule.add(btn_logout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 120, 50));

        btn_updateStatus.setBackground(new java.awt.Color(255, 255, 255));
        btn_updateStatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_updateStatus.setText("Update Status");
        btn_updateStatus.setBorder(null);
        btn_updateStatus.setEnabled(false);
        btn_updateStatus.setSelected(true);
        btn_updateStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_updateStatusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_updateStatusMouseExited(evt);
            }
        });
        btn_updateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateStatusActionPerformed(evt);
            }
        });
        pnl_interschedule.add(btn_updateStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 500, 140, 30));

        btn_scheduleAdd.setBackground(new java.awt.Color(255, 255, 255));
        btn_scheduleAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_scheduleAdd.setText("Add");
        btn_scheduleAdd.setBorder(null);
        btn_scheduleAdd.setEnabled(false);
        btn_scheduleAdd.setSelected(true);
        btn_scheduleAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_scheduleAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_scheduleAddMouseExited(evt);
            }
        });
        btn_scheduleAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_scheduleAddActionPerformed(evt);
            }
        });
        pnl_interschedule.add(btn_scheduleAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 70, 30));

        btn_scheduleUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btn_scheduleUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_scheduleUpdate.setText("Update");
        btn_scheduleUpdate.setBorder(null);
        btn_scheduleUpdate.setEnabled(false);
        btn_scheduleUpdate.setSelected(true);
        btn_scheduleUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_scheduleUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_scheduleUpdateMouseExited(evt);
            }
        });
        btn_scheduleUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_scheduleUpdateActionPerformed(evt);
            }
        });
        pnl_interschedule.add(btn_scheduleUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 70, 30));

        btn_scheduleReset.setBackground(new java.awt.Color(255, 255, 255));
        btn_scheduleReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_scheduleReset.setText("Reset");
        btn_scheduleReset.setBorder(null);
        btn_scheduleReset.setEnabled(false);
        btn_scheduleReset.setSelected(true);
        btn_scheduleReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_scheduleResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_scheduleResetMouseExited(evt);
            }
        });
        btn_scheduleReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_scheduleResetActionPerformed(evt);
            }
        });
        pnl_interschedule.add(btn_scheduleReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 70, 30));

        pnl_IntDetails.setBackground(new java.awt.Color(247, 249, 255));
        pnl_IntDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Interview_Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        pnl_IntDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Interview By");
        pnl_IntDetails.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 80, 30));

        txt_nameSU.setEditable(false);
        txt_nameSU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_nameSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameSUActionPerformed(evt);
            }
        });
        pnl_IntDetails.add(txt_nameSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 140, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Candidate Name");
        pnl_IntDetails.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 30));

        cmb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Status", "Not Participated", "Qualified", "Not Qualified" }));
        cmb_status.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        cmb_status.setEnabled(false);
        pnl_IntDetails.add(cmb_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 140, 30));

        cmb_intBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Interviewer", "Samintha Thuduhena", "Prabas Gayadeeptha", "Erandha Janith" }));
        cmb_intBy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        cmb_intBy.setEnabled(false);
        pnl_IntDetails.add(cmb_intBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 140, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Status");
        pnl_IntDetails.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 50, 30));

        pnl_interschedule.add(pnl_IntDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 710, 80));

        lbl_scheduleTblVali.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_scheduleTblVali.setForeground(new java.awt.Color(255, 0, 0));
        lbl_scheduleTblVali.setPreferredSize(new java.awt.Dimension(0, 20));
        pnl_interschedule.add(lbl_scheduleTblVali, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 530, 270, -1));

        lbl_buttonvalidate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_buttonvalidate.setForeground(new java.awt.Color(255, 0, 0));
        lbl_buttonvalidate.setPreferredSize(new java.awt.Dimension(0, 20));
        pnl_interschedule.add(lbl_buttonvalidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 210, 30));

        emp_background6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MainBackForAll.jpg"))); // NOI18N
        emp_background6.setPreferredSize(new java.awt.Dimension(1190, 570));
        pnl_interschedule.add(emp_background6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 580));

        jLabel6.setText("jLabel6");
        pnl_interschedule.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, 20));

        jTextField1.setText("jTextField1");
        pnl_interschedule.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, 20));

        getContentPane().add(pnl_interschedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        pnl_Candidate.setMinimumSize(new java.awt.Dimension(1190, 580));
        pnl_Candidate.setPreferredSize(new java.awt.Dimension(1190, 580));
        pnl_Candidate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_canadd.setBackground(new java.awt.Color(255, 255, 255));
        btn_canadd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_canadd.setForeground(new java.awt.Color(0, 174, 239));
        btn_canadd.setText("Add");
        btn_canadd.setBorder(null);
        btn_canadd.setEnabled(false);
        btn_canadd.setPreferredSize(new java.awt.Dimension(70, 30));
        btn_canadd.setSelected(true);
        btn_canadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_canaddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_canaddMouseExited(evt);
            }
        });
        btn_canadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_canaddActionPerformed(evt);
            }
        });
        pnl_Candidate.add(btn_canadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 500, 110, 40));

        btn_canupdate.setBackground(new java.awt.Color(255, 255, 255));
        btn_canupdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_canupdate.setForeground(new java.awt.Color(0, 174, 239));
        btn_canupdate.setText("Update");
        btn_canupdate.setBorder(null);
        btn_canupdate.setEnabled(false);
        btn_canupdate.setPreferredSize(new java.awt.Dimension(70, 30));
        btn_canupdate.setSelected(true);
        btn_canupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_canupdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_canupdateMouseExited(evt);
            }
        });
        btn_canupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_canupdateActionPerformed(evt);
            }
        });
        pnl_Candidate.add(btn_canupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 500, 110, 40));

        btn_canreset.setBackground(new java.awt.Color(255, 255, 255));
        btn_canreset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_canreset.setForeground(new java.awt.Color(0, 174, 239));
        btn_canreset.setText("Reset");
        btn_canreset.setBorder(null);
        btn_canreset.setEnabled(false);
        btn_canreset.setPreferredSize(new java.awt.Dimension(70, 30));
        btn_canreset.setSelected(true);
        btn_canreset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_canresetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_canresetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_canresetMouseExited(evt);
            }
        });
        btn_canreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_canresetActionPerformed(evt);
            }
        });
        pnl_Candidate.add(btn_canreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 500, 110, 40));

        btn_intSched.setBackground(new java.awt.Color(255, 255, 255));
        btn_intSched.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_intSched.setForeground(new java.awt.Color(0, 174, 239));
        btn_intSched.setText("Interview Schedule");
        btn_intSched.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_intSched.setSelected(true);
        btn_intSched.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_intSchedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_intSchedMouseExited(evt);
            }
        });
        btn_intSched.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_intSchedActionPerformed(evt);
            }
        });
        pnl_Candidate.add(btn_intSched, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 180, 50));

        btn_candidate.setBackground(new java.awt.Color(255, 255, 255));
        btn_candidate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_candidate.setForeground(new java.awt.Color(0, 174, 239));
        btn_candidate.setText("Candidates");
        btn_candidate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_candidate.setSelected(true);
        btn_candidate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_candidateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_candidateMouseExited(evt);
            }
        });
        btn_candidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_candidateActionPerformed(evt);
            }
        });
        pnl_Candidate.add(btn_candidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

        btn_home.setBackground(new java.awt.Color(255, 255, 255));
        btn_home.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_home.setForeground(new java.awt.Color(0, 174, 239));
        btn_home.setText("Home");
        btn_home.setBorder(null);
        btn_home.setOpaque(false);
        btn_home.setPreferredSize(new java.awt.Dimension(110, 25));
        btn_home.setSelected(true);
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_homeMouseExited(evt);
            }
        });
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        pnl_Candidate.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 120, 50));

        btn_logout.setBackground(new java.awt.Color(255, 255, 255));
        btn_logout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(0, 174, 239));
        btn_logout.setText("Logout");
        btn_logout.setBorder(null);
        btn_logout.setOpaque(false);
        btn_logout.setPreferredSize(new java.awt.Dimension(110, 25));
        btn_logout.setSelected(true);
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logoutMouseExited(evt);
            }
        });
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        pnl_Candidate.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 120, 50));

        jPanel2.setBackground(new java.awt.Color(247, 249, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Add/Update Candidate", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Qualifications  :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, 90, 30));

        txt_degree.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_degree.setEnabled(false);
        jPanel2.add(txt_degree, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 300, 210, 30));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setText("Degree             :");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, 90, 30));

        lbl_fname.setText("Full Name               :");
        lbl_fname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_fname.setPreferredSize(new java.awt.Dimension(110, 30));
        jPanel2.add(lbl_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 110, 30));

        dc_dob.setEditable(false);
        dc_dob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        dc_dob.setEnabled(false);
        dc_dob.setPreferredSize(new java.awt.Dimension(210, 30));
        dc_dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dc_dobActionPerformed(evt);
            }
        });
        jPanel2.add(dc_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 210, 30));

        txt_fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_fname.setEnabled(false);
        txt_fname.setPreferredSize(new java.awt.Dimension(210, 30));
        txt_fname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_fnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_fnameFocusLost(evt);
            }
        });
        txt_fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fnameKeyTyped(evt);
            }
        });
        jPanel2.add(txt_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 210, 30));

        lbl_initialName.setText("Name with Initial  :");
        lbl_initialName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_initialName.setPreferredSize(new java.awt.Dimension(110, 30));
        jPanel2.add(lbl_initialName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 110, 30));

        txt_initialName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_initialName.setEnabled(false);
        txt_initialName.setPreferredSize(new java.awt.Dimension(210, 30));
        txt_initialName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_initialNameFocusLost(evt);
            }
        });
        jPanel2.add(txt_initialName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 210, 30));

        txt_gender.setEditable(false);
        txt_gender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_gender.setEnabled(false);
        txt_gender.setPreferredSize(new java.awt.Dimension(210, 30));
        txt_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_genderActionPerformed(evt);
            }
        });
        jPanel2.add(txt_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 210, 30));

        lbl_nic.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_nic.setText("NIC                           :");
        lbl_nic.setPreferredSize(new java.awt.Dimension(110, 30));
        jPanel2.add(lbl_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 110, 30));

        txt_nic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_nic.setEnabled(false);
        txt_nic.setPreferredSize(new java.awt.Dimension(210, 30));
        txt_nic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nicFocusLost(evt);
            }
        });
        txt_nic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nicActionPerformed(evt);
            }
        });
        txt_nic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nicKeyTyped(evt);
            }
        });
        jPanel2.add(txt_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 210, 30));

        lbl_gender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_gender.setText("Gender                   :");
        lbl_gender.setPreferredSize(new java.awt.Dimension(110, 30));
        jPanel2.add(lbl_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 110, 30));

        lbl_dob.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_dob.setText("Birth Day               :");
        lbl_dob.setPreferredSize(new java.awt.Dimension(110, 30));
        jPanel2.add(lbl_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 110, 30));

        lbl_mail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_mail.setText("Email                     :");
        lbl_mail.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel2.add(lbl_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 100, 30));

        lbl_mno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_mno.setText("Mobile Number   :");
        lbl_mno.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel2.add(lbl_mno, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 100, 30));

        lbl_hno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_hno.setText("Home Number    :");
        lbl_hno.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel2.add(lbl_hno, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 100, 30));

        lbl_address.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_address.setText("Address               :");
        lbl_address.setPreferredSize(new java.awt.Dimension(100, 140));
        jPanel2.add(lbl_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 100, 140));

        jScrollPaneAddress.setPreferredSize(new java.awt.Dimension(210, 140));

        txtA_address.setColumns(20);
        txtA_address.setRows(5);
        txtA_address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txtA_address.setEnabled(false);
        txtA_address.setPreferredSize(new java.awt.Dimension(210, 140));
        jScrollPaneAddress.setViewportView(txtA_address);

        jPanel2.add(jScrollPaneAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        txt_hno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_hno.setEnabled(false);
        txt_hno.setPreferredSize(new java.awt.Dimension(210, 30));
        jPanel2.add(txt_hno, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        txt_mno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_mno.setEnabled(false);
        txt_mno.setPreferredSize(new java.awt.Dimension(210, 30));
        jPanel2.add(txt_mno, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        txt_mail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_mail.setEnabled(false);
        txt_mail.setPreferredSize(new java.awt.Dimension(210, 30));
        jPanel2.add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, -1));

        txt_canID.setEditable(false);
        txt_canID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_canID.setPreferredSize(new java.awt.Dimension(210, 30));
        txt_canID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_canIDActionPerformed(evt);
            }
        });
        jPanel2.add(txt_canID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 210, 30));

        lbl_employeeID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_employeeID.setText("Candidate ID         :");
        lbl_employeeID.setPreferredSize(new java.awt.Dimension(110, 30));
        jPanel2.add(lbl_employeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 110, 30));

        txt_exp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txt_exp.setEnabled(false);
        jPanel2.add(txt_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, 210, 30));

        jLabel36.setText("Experience      :");
        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, 90, 30));

        cmb_designation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Role" }));
        cmb_designation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        cmb_designation.setEnabled(false);
        cmb_designation.setPreferredSize(new java.awt.Dimension(210, 30));
        jPanel2.add(cmb_designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, -1, -1));

        cmb_department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department", "HR Department", "Finance Department", "Stock Department", "Restaurant Department", "Beverage Department", "Front Office Department", "Transport Department", "Event Department" }));
        cmb_department.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        cmb_department.setEnabled(false);
        cmb_department.setPreferredSize(new java.awt.Dimension(210, 30));
        cmb_department.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_departmentItemStateChanged(evt);
            }
        });
        jPanel2.add(cmb_department, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 120, -1, -1));

        lbl_department1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_department1.setText("Department    :");
        lbl_department1.setToolTipText("");
        lbl_department1.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel2.add(lbl_department1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 90, 30));

        lbl_designation1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_designation1.setText("Designation     :");
        lbl_designation1.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel2.add(lbl_designation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, 90, 30));

        lbl_canID.setForeground(new java.awt.Color(255, 0, 0));
        lbl_canID.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(lbl_canID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 210, 20));

        lbl_canfname.setForeground(new java.awt.Color(255, 0, 0));
        lbl_canfname.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(lbl_canfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 210, 20));

        lbl_canname.setForeground(new java.awt.Color(255, 0, 0));
        lbl_canname.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(lbl_canname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 210, 20));

        lbl_canNIC.setForeground(new java.awt.Color(255, 0, 0));
        lbl_canNIC.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(lbl_canNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 210, 20));

        lbl_cangender.setForeground(new java.awt.Color(255, 0, 0));
        lbl_cangender.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(lbl_cangender, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 210, 20));

        lbl_candob.setForeground(new java.awt.Color(255, 0, 0));
        lbl_candob.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(lbl_candob, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 210, 20));

        lbl_canaddress.setForeground(new java.awt.Color(255, 0, 0));
        lbl_canaddress.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(lbl_canaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 210, 20));

        lbl_canHno.setForeground(new java.awt.Color(255, 0, 0));
        lbl_canHno.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(lbl_canHno, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 210, 20));

        lbl_canmno.setForeground(new java.awt.Color(255, 0, 0));
        lbl_canmno.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(lbl_canmno, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 210, 20));

        lbl_candepartment.setForeground(new java.awt.Color(255, 0, 0));
        lbl_candepartment.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(lbl_candepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 150, 210, 20));

        lbl_canrole.setForeground(new java.awt.Color(255, 0, 0));
        lbl_canrole.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(lbl_canrole, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 210, 210, 20));

        lbl_canDgr.setForeground(new java.awt.Color(255, 0, 0));
        lbl_canDgr.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(lbl_canDgr, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, 210, 20));

        lbl_canExp.setForeground(new java.awt.Color(255, 0, 0));
        lbl_canExp.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(lbl_canExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, 210, 20));

        lbl_canQul.setForeground(new java.awt.Color(255, 0, 0));
        lbl_canQul.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(lbl_canQul, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, 210, 20));

        lbl_canmail1.setForeground(new java.awt.Color(255, 0, 0));
        lbl_canmail1.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(lbl_canmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 210, 20));

        dc_aplicantDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        dc_aplicantDate.setDateFormatString("yyyy-MM-dd");
        dc_aplicantDate.setEnabled(false);
        dc_aplicantDate.setPreferredSize(new java.awt.Dimension(210, 30));
        jPanel2.add(dc_aplicantDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, 210, 30));

        txtA_qualification.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txtA_qualification.setEnabled(false);
        txtA_qualification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtA_qualificationActionPerformed(evt);
            }
        });
        jPanel2.add(txtA_qualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 240, 210, 30));

        lbl_candepartment1.setForeground(new java.awt.Color(255, 0, 0));
        lbl_candepartment1.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(lbl_candepartment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, 210, 20));

        lbl_department2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_department2.setText("Aplicant Date  :");
        lbl_department2.setToolTipText("");
        lbl_department2.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel2.add(lbl_department2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 90, 30));

        lbl_canborder.setBorder(javax.swing.BorderFactory.createTitledBorder("Aplicant Details"));
        lbl_canborder.setPreferredSize(new java.awt.Dimension(1120, 370));
        jPanel2.add(lbl_canborder, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 350, 380));

        lbl_border1.setBorder(javax.swing.BorderFactory.createTitledBorder("Personal Details"));
        lbl_border1.setPreferredSize(new java.awt.Dimension(1120, 370));
        jPanel2.add(lbl_border1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 380, 380));

        lbl_border.setBorder(javax.swing.BorderFactory.createTitledBorder("Contact Details"));
        lbl_border.setPreferredSize(new java.awt.Dimension(1120, 370));
        jPanel2.add(lbl_border, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 360, 380));

        pnl_Candidate.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 1140, 420));
        pnl_Candidate.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1190, 10));

        lbl_canadduppres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_canadduppres.setForeground(new java.awt.Color(255, 0, 0));
        lbl_canadduppres.setPreferredSize(new java.awt.Dimension(0, 20));
        pnl_Candidate.add(lbl_canadduppres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 810, 40));

        lbl_subhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MainBackForAll.jpg"))); // NOI18N
        lbl_subhome.setPreferredSize(new java.awt.Dimension(1190, 570));
        pnl_Candidate.add(lbl_subhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 580));

        getContentPane().add(pnl_Candidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        PnlMenu.setPreferredSize(new java.awt.Dimension(1200, 100));
        PnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_UserMain.setBackground(new java.awt.Color(255, 255, 255));
        btn_UserMain.setForeground(new java.awt.Color(0, 174, 239));
        btn_UserMain.setText("User");
        btn_UserMain.setBorder(null);
        btn_UserMain.setContentAreaFilled(false);
        btn_UserMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_UserMain.setOpaque(true);
        btn_UserMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UserMainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UserMainMouseExited(evt);
            }
        });
        btn_UserMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UserMainActionPerformed(evt);
            }
        });
        PnlMenu.add(btn_UserMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 30));

        btn_interviewMain.setBackground(new java.awt.Color(255, 255, 255));
        btn_interviewMain.setForeground(new java.awt.Color(0, 174, 239));
        btn_interviewMain.setText("Interview & Candidate");
        btn_interviewMain.setBorder(null);
        btn_interviewMain.setContentAreaFilled(false);
        btn_interviewMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_interviewMain.setOpaque(true);
        btn_interviewMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_interviewMainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_interviewMainMouseExited(evt);
            }
        });
        btn_interviewMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_interviewMainActionPerformed(evt);
            }
        });
        PnlMenu.add(btn_interviewMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 190, 30));

        btn_EmployeeMain.setBackground(new java.awt.Color(255, 255, 255));
        btn_EmployeeMain.setForeground(new java.awt.Color(0, 174, 239));
        btn_EmployeeMain.setText("Employee");
        btn_EmployeeMain.setBorder(null);
        btn_EmployeeMain.setContentAreaFilled(false);
        btn_EmployeeMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_EmployeeMain.setOpaque(true);
        btn_EmployeeMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_EmployeeMainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_EmployeeMainMouseExited(evt);
            }
        });
        btn_EmployeeMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EmployeeMainActionPerformed(evt);
            }
        });
        PnlMenu.add(btn_EmployeeMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 190, 30));

        btn_attendeceMain.setBackground(new java.awt.Color(255, 255, 255));
        btn_attendeceMain.setForeground(new java.awt.Color(0, 174, 239));
        btn_attendeceMain.setText("Attendence");
        btn_attendeceMain.setBorder(null);
        btn_attendeceMain.setContentAreaFilled(false);
        btn_attendeceMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_attendeceMain.setOpaque(true);
        btn_attendeceMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_attendeceMainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_attendeceMainMouseExited(evt);
            }
        });
        btn_attendeceMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_attendeceMainActionPerformed(evt);
            }
        });
        PnlMenu.add(btn_attendeceMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 190, 30));

        btn_payrollMain.setBackground(new java.awt.Color(255, 255, 255));
        btn_payrollMain.setForeground(new java.awt.Color(0, 174, 239));
        btn_payrollMain.setText("Payroll");
        btn_payrollMain.setBorder(null);
        btn_payrollMain.setContentAreaFilled(false);
        btn_payrollMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_payrollMain.setOpaque(true);
        btn_payrollMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_payrollMainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_payrollMainMouseExited(evt);
            }
        });
        btn_payrollMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payrollMainActionPerformed(evt);
            }
        });
        PnlMenu.add(btn_payrollMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 190, 30));

        btn_jobMain.setBackground(new java.awt.Color(255, 255, 255));
        btn_jobMain.setForeground(new java.awt.Color(0, 174, 239));
        btn_jobMain.setText("Job Analysis");
        btn_jobMain.setBorder(null);
        btn_jobMain.setContentAreaFilled(false);
        btn_jobMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_jobMain.setOpaque(true);
        btn_jobMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_jobMainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_jobMainMouseExited(evt);
            }
        });
        btn_jobMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jobMainActionPerformed(evt);
            }
        });
        PnlMenu.add(btn_jobMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 40, 190, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRMS_Images/MenuBar_Back_Main_HR.jpg"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(1190, 75));
        jLabel8.setMinimumSize(new java.awt.Dimension(1190, 75));
        jLabel8.setPreferredSize(new java.awt.Dimension(1190, 75));
        PnlMenu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_jobNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jobNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jobNameActionPerformed

    private void btn_canEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_canEditActionPerformed
        HR_Methods hm = new HR_Methods();
        hm.LoadCandidateTableToForm(tbl_candidate, lbl_btntblvalidate, txt_canID, txt_fname, txt_initialName, txt_gender, txt_nic, dc_dob, txtA_address, txt_hno, txt_mno, txt_mail, dc_aplicantDate, cmb_department, cmb_designation, txtA_qualification, txt_degree, txt_exp);
        this.canEmptyVal_lbl();
        this.canEnableTxt(true);
        this.buttonEnable(btn_canadd, false, btn_canupdate, true, btn_canreset, true);
        this.panelVisible(true, false, false);
    }//GEN-LAST:event_btn_canEditActionPerformed

    private void btn_intSchedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_intSchedActionPerformed
        // load the interview schedule panel
        this.panelVisible(false, false, true);
    }//GEN-LAST:event_btn_intSchedActionPerformed

    private void btn_candidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_candidateActionPerformed
        // load the view candidate panel
        canEmptyForm();
        this.canEnableTxt(false);
        canEmptyVal_lbl();
        this.panelVisible(false, true, false);
        this.buttonEnable(btn_canadd, false, btn_canupdate, false, btn_canreset, false);
    }//GEN-LAST:event_btn_candidateActionPerformed

    private void txt_canIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_canIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_canIDActionPerformed

    private void cmb_departmentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_departmentItemStateChanged
        // TODO add your handling code here:
        String select = cmb_department.getSelectedItem().toString();
        //cmb_designation.addItem("Select Role");
        if (select.equals("Select Department")) {
            cmb_designation.removeAllItems();
            cmb_designation.addItem("Select Role");
        } else {
            cmb_designation.removeAllItems();
            cmb_designation.addItem("Select Role");
            try {
                String sql = "select j.jName\n"
                        + "from job j, department d\n"
                        + "where j.depID=d.Did and d.Dname='" + select + "'\n"
                        + "order by j.jobid";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                while (rs.next()) {
                    cmb_designation.addItem(rs.getString("jName"));
                }

            } catch (SQLException e) {
            }
        }
    }//GEN-LAST:event_cmb_departmentItemStateChanged

    private void btn_ViewCandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ViewCandActionPerformed
        // TODO add your handling code here:
        this.panelVisible(true, false, false);

        canEmptyForm();
        this.canEnableTxt(true);
        canEmptyVal_lbl();

        this.buttonEnable(btn_canadd, true, btn_canupdate, false, btn_canreset, true);
        HR_Methods hm = new HR_Methods();
        hm.AutoGeneratePrimaryKey(lbl_canID, txt_canID, 'C', "candidate", "candidateID");
    }//GEN-LAST:event_btn_ViewCandActionPerformed

    private void txt_candSearchScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_candSearchScheduleMouseClicked
        txt_candSearchSchedule.setText(null);
        txt_candSearchSchedule.setForeground(Color.BLACK);
    }//GEN-LAST:event_txt_candSearchScheduleMouseClicked

    private void btn_candSearchScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_candSearchScheduleActionPerformed
        String sql = "select * from interview_schedule where can_name LIKE '" + txt_candSearchSchedule.getText() + "%'";
        hrm.SearchData(tbl_interview_schedule, txt_candSearchSchedule, lbl_cansrchSchedVal, sql, "", "Candidate Name");
    }//GEN-LAST:event_btn_candSearchScheduleActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        HR_Methods.loadTable(tbl_candidate, "candidate", "candidateID");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_canaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_canaddActionPerformed
        this.AddCandidate();

    }//GEN-LAST:event_btn_canaddActionPerformed

    private void btn_canupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_canupdateActionPerformed
        this.UpdateCandidate();
    }//GEN-LAST:event_btn_canupdateActionPerformed

    private void btn_canresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_canresetActionPerformed
        // reset the form fields
        this.canEmptyForm();
        HR_Methods hm = new HR_Methods();
        hm.AutoGeneratePrimaryKey(lbl_canID, txt_canID, 'C', "candidate", "candidateID");
        this.buttonEnable(btn_canadd, true, btn_canupdate, false, btn_canreset, true);
    }//GEN-LAST:event_btn_canresetActionPerformed

    private void btn_canSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_canSearchActionPerformed
        // TODO add your handling code here:
        HR_Methods hm1 = new HR_Methods();
        String select = cmb_search.getSelectedItem().toString();
        if (select.equals("Search by ID")) {
            sql = "select * from candidate where candidateID LIKE '" + txt_csearch.getText() + "%'";
            hm1.SearchData(tbl_candidate, txt_csearch, lbl_SearchValidate, sql, "", "Candidate ID");
        } else if (select.equals("Search by Name")) {
            sql = "select * from candidate where full_name LIKE '" + txt_csearch.getText() + "%'";
            hm1.SearchData(tbl_candidate, txt_csearch, lbl_SearchValidate, sql, "", "Candidate Name");
        }


    }//GEN-LAST:event_btn_canSearchActionPerformed

    private void txt_csearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_csearchMouseClicked
        // TODO add your handling code here:
        txt_csearch.setText(null);
        txt_csearch.setForeground(Color.BLACK);
    }//GEN-LAST:event_txt_csearchMouseClicked

    private void cmb_searchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_searchItemStateChanged
        // TODO add your handling code here:
        String select = cmb_search.getSelectedItem().toString();
        //cmb_designation.addItem("Select Role");
        if (select.equals("Search by ID")) {
            txt_csearch.setText("Candidate ID");
            Color grayColor = new Color(153, 153, 153);
            txt_csearch.setForeground(grayColor);
        } else {
            txt_csearch.setText("Candidate Name");
            Color grayColor = new Color(153, 153, 153);
            txt_csearch.setForeground(grayColor);
        }
    }//GEN-LAST:event_cmb_searchItemStateChanged

    private void btn_canremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_canremoveActionPerformed
        // TODO add your handling code here:
        HR_Methods hm = new HR_Methods();
        hm.RemoveData(tbl_candidate, lbl_btntblvalidate, "candidate", "candidateID");
        HR_Methods.loadTable(tbl_candidate, "candidate", "candidateID");
    }//GEN-LAST:event_btn_canremoveActionPerformed

    private void txt_c_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_c_nameActionPerformed

        try {
            String search = txt_c_name.getText();
            String sql = "select c.candidateID,j.jobid from job j,candidate c where c.designation=j.jName AND candidateID LIKE '%" + search + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (!rs.isBeforeFirst()) {
            } else {
                while (rs.next()) {
                    String jid = rs.getString("j.jobid");
                    txt_jobName.setText(jid);
                }
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_txt_c_nameActionPerformed

    private void btn_editScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editScheduleActionPerformed
        hrm.LoadScheduleTableToSetInterview(tbl_interview_schedule, lbl_scheduleTblVali, txt_interID, lbl_CANDID, txt_c_name, txt_jobName, cmb_itype, dc_idate, tc_iTime);
        this.buttonEnable(btn_scheduleAdd, false, btn_scheduleUpdate, true, btn_scheduleReset, true);
    }//GEN-LAST:event_btn_editScheduleActionPerformed

    private void btn_removeScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeScheduleActionPerformed
        hrm.RemoveData(tbl_interview_schedule, lbl_scheduleTblVali, "interview_schedule", "interID");
        HR_Methods.loadTable(tbl_interview_schedule, "interview_schedule", "date");
    }//GEN-LAST:event_btn_removeScheduleActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        HR_Methods.loadTable(tbl_interview_schedule, "interview_schedule", "date");
    }//GEN-LAST:event_jButton26ActionPerformed

    private void txtA_qualificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtA_qualificationActionPerformed

    }//GEN-LAST:event_txtA_qualificationActionPerformed

    private void txt_nicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nicActionPerformed

    }//GEN-LAST:event_txt_nicActionPerformed

    private void dc_dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dc_dobActionPerformed

    }//GEN-LAST:event_dc_dobActionPerformed

    private void txt_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_genderActionPerformed

    }//GEN-LAST:event_txt_genderActionPerformed

    private void txt_fnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_fnameFocusLost
        boolean nvalid = ValidationHRMS.isLetter(txt_fname.getText());
        if (txt_fname.getText().isEmpty()) {
            lbl_canfname.setText("**name field cannot be empty");
        } else if (nvalid) {
            lbl_canfname.setText(null);
            txt_fname.setForeground(Color.BLACK);
        } else {
            lbl_canfname.setText("**Enter valid name");
            txt_fname.setForeground(Color.RED);
        }
    }//GEN-LAST:event_txt_fnameFocusLost

    private void txt_fnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_fnameFocusGained

    }//GEN-LAST:event_txt_fnameFocusGained

    private void txt_fnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fnameKeyTyped

    }//GEN-LAST:event_txt_fnameKeyTyped

    private void txt_initialNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_initialNameFocusLost

        boolean nvalid = ValidationHRMS.isLetter(txt_fname.getText());
        if (txt_initialName.getText().isEmpty()) {
            lbl_canname.setText("**name field cannot be empty");
        } else if (nvalid) {
            lbl_canname.setText(null);
            txt_initialName.setForeground(Color.BLACK);
        } else {
            lbl_canname.setText("**Enter valid name");
            txt_initialName.setForeground(Color.RED);
        }
    }//GEN-LAST:event_txt_initialNameFocusLost

    private void btn_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseEntered
        hrm.MouseEnterEvent(btn_logout);
    }//GEN-LAST:event_btn_logoutMouseEntered

    private void btn_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseExited
        hrm.MouseExitEvent(btn_logout, blueColor);
    }//GEN-LAST:event_btn_logoutMouseExited

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        String ObjButtons[] = {"Yes", "No"};
        int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to Logout?", "Logout Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
        if (PromptResult == JOptionPane.YES_OPTION) {
            MainLogin lg = new MainLogin();
            JDesktopPane desktopPane = getDesktopPane();
            desktopPane.add(lg).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseEntered
        hrm.MouseEnterEvent(btn_home);
    }//GEN-LAST:event_btn_homeMouseEntered

    private void btn_homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseExited
        hrm.MouseExitEvent(btn_home, blueColor);
    }//GEN-LAST:event_btn_homeMouseExited

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        MHome m = new MHome();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(m).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_canaddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_canaddMouseEntered
        hrm.MouseEnterEvent(btn_canadd);
    }//GEN-LAST:event_btn_canaddMouseEntered

    private void btn_canaddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_canaddMouseExited
        hrm.MouseExitEvent(btn_canadd, Color.black);
    }//GEN-LAST:event_btn_canaddMouseExited

    private void btn_canupdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_canupdateMouseEntered
        hrm.MouseEnterEvent(btn_canupdate);
    }//GEN-LAST:event_btn_canupdateMouseEntered

    private void btn_canupdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_canupdateMouseExited
        hrm.MouseExitEvent(btn_canupdate, Color.black);
    }//GEN-LAST:event_btn_canupdateMouseExited

    private void btn_canresetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_canresetMouseClicked

    }//GEN-LAST:event_btn_canresetMouseClicked

    private void btn_canresetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_canresetMouseEntered
        hrm.MouseEnterEvent(btn_canreset);
    }//GEN-LAST:event_btn_canresetMouseEntered

    private void btn_canresetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_canresetMouseExited
        hrm.MouseExitEvent(btn_canreset, Color.black);
    }//GEN-LAST:event_btn_canresetMouseExited

    private void txt_nicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nicFocusLost

    }//GEN-LAST:event_txt_nicFocusLost

    private void txt_nicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nicKeyTyped
        boolean max = txt_nic.getText().length() > 9;
        if (max) {
            evt.consume();
        }
        if (txt_nic.getText().length() != 10) {
            lbl_canNIC.setText("Enter Valid nic Number");
        } else {
            if (txt_nic.getText().matches("^[0-9]{9}[Vv]")) {
                lbl_canNIC.setText(null);

                String nicYear = txt_nic.getText().substring(0, 2);
                int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                String nicDays = txt_nic.getText().substring(2, 5);
                int days = Integer.parseInt(nicDays);

                if (days >= 001 && days <= 366) {
                    lbl_canNIC.setText(null);
                    txt_gender.setText("Male");
                    int i = 0;
                    while (days > months[i]) {
                        days = days - months[i];
                        i++;
                    }
                    int month = i + 1;
                    String B_month = Integer.toString(month);
                    String B_day = Integer.toString(days);
                    dc_dob.setText("19" + nicYear + "-" + B_month + "-" + B_day + "");

                } else if (days >= 501 && days <= 866) {
                    lbl_canNIC.setText(null);
                    txt_gender.setText("Female");
                    days = days - 500;
                    int i = 0;
                    while (days > months[i]) {
                        days = days - months[i];
                        i++;
                    }
                    int month = i + 1;
                    String B_month = Integer.toString(month);
                    String B_day = Integer.toString(days);

                    dc_dob.setText("19" + nicYear + "-" + B_month + "-" + B_day + "");
                } else {
                    lbl_canNIC.setText("Enter Valid nic Number");
                }
            } else {
                lbl_canNIC.setText("Enter Valid nic Number");
            }

        }
    }//GEN-LAST:event_txt_nicKeyTyped

    private void btn_candidateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_candidateMouseEntered
        hrm.MouseEnterEvent(btn_candidate);
    }//GEN-LAST:event_btn_candidateMouseEntered

    private void btn_candidateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_candidateMouseExited
        hrm.MouseExitEvent(btn_candidate, blueColor);
    }//GEN-LAST:event_btn_candidateMouseExited

    private void btn_canSetInterviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_canSetInterviewActionPerformed
        HR_Methods hm = new HR_Methods();
        hm.LoadCandidateTableToSetInterview(tbl_candidate, lbl_btntblvalidate, lbl_CANDID, txt_c_name, txt_jobName);
        hm.AutoGeneratePrimaryKey(lbl_iidVal, txt_interID, 'I', "interview_schedule", "interID");
        this.panelVisible(false, false, true);
        this.buttonEnable(btn_scheduleAdd, true, btn_scheduleUpdate, false, btn_scheduleReset, true);
    }//GEN-LAST:event_btn_canSetInterviewActionPerformed

    private void btn_intSchedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_intSchedMouseEntered
        hrm.MouseEnterEvent(btn_intSched);
    }//GEN-LAST:event_btn_intSchedMouseEntered

    private void btn_intSchedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_intSchedMouseExited
        hrm.MouseExitEvent(btn_intSched, blueColor);
    }//GEN-LAST:event_btn_intSchedMouseExited

    private void btn_candidate1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_candidate1MouseEntered
        hrm.MouseEnterEvent(btn_candidate1);
    }//GEN-LAST:event_btn_candidate1MouseEntered

    private void btn_candidate1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_candidate1MouseExited
        hrm.MouseExitEvent(btn_candidate1, blueColor);
    }//GEN-LAST:event_btn_candidate1MouseExited

    private void btn_candidate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_candidate1ActionPerformed
        canEmptyForm();
        this.canEnableTxt(false);
        canEmptyVal_lbl();
        this.panelVisible(false, true, false);
        this.buttonEnable(btn_canadd, false, btn_canupdate, false, btn_canreset, false);
        HR_Methods.loadTable(tbl_candidate, "candidate", "candidateID");
    }//GEN-LAST:event_btn_candidate1ActionPerformed

    private void btn_intSched1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_intSched1MouseEntered
        hrm.MouseEnterEvent(btn_intSched1);
    }//GEN-LAST:event_btn_intSched1MouseEntered

    private void btn_intSched1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_intSched1MouseExited
        hrm.MouseExitEvent(btn_intSched1, blueColor);
    }//GEN-LAST:event_btn_intSched1MouseExited

    private void btn_intSched1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_intSched1ActionPerformed
        HR_Methods hm = new HR_Methods();
        hm.AutoGeneratePrimaryKey(lbl_iidVal, txt_interID, 'I', "interview_schedule", "interID");
        HR_Methods.loadTable(tbl_interview_schedule, "interview_schedule", "date");
        this.panelVisible(false, false, true);
        this.scheduleEmptyForm();
        this.scheduleEmptyVal_lbl();
        this.buttonEnable(btn_scheduleAdd, false, btn_scheduleUpdate, false, btn_scheduleReset, false);
    }//GEN-LAST:event_btn_intSched1ActionPerformed

    private void btn_home1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_home1MouseEntered
        hrm.MouseEnterEvent(btn_home1);
    }//GEN-LAST:event_btn_home1MouseEntered

    private void btn_home1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_home1MouseExited
        hrm.MouseExitEvent(btn_home1, blueColor);
    }//GEN-LAST:event_btn_home1MouseExited

    private void btn_home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home1ActionPerformed
        MHome m = new MHome();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(m).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_home1ActionPerformed

    private void btn_logout1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logout1MouseEntered
        hrm.MouseEnterEvent(btn_logout1);
    }//GEN-LAST:event_btn_logout1MouseEntered

    private void btn_logout1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logout1MouseExited
        hrm.MouseExitEvent(btn_logout1, blueColor);
    }//GEN-LAST:event_btn_logout1MouseExited

    private void btn_logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logout1ActionPerformed
        String ObjButtons[] = {"Yes", "No"};
        int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to Logout?", "Logout Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
        if (PromptResult == JOptionPane.YES_OPTION) {
            MainLogin lg = new MainLogin();
            JDesktopPane desktopPane = getDesktopPane();
            desktopPane.add(lg).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_logout1ActionPerformed

    private void btn_canEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_canEditMouseEntered
        hrm.MouseEnterEvent(btn_canEdit);
    }//GEN-LAST:event_btn_canEditMouseEntered

    private void btn_canEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_canEditMouseExited
        hrm.MouseExitEvent(btn_canEdit, Color.black);
    }//GEN-LAST:event_btn_canEditMouseExited

    private void btn_canSetInterviewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_canSetInterviewMouseEntered
        hrm.MouseEnterEvent(btn_canSetInterview);
    }//GEN-LAST:event_btn_canSetInterviewMouseEntered

    private void btn_canSetInterviewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_canSetInterviewMouseExited
        hrm.MouseExitEvent(btn_canSetInterview, Color.black);
    }//GEN-LAST:event_btn_canSetInterviewMouseExited

    private void btn_canremoveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_canremoveMouseEntered
        hrm.MouseEnterEvent(btn_canremove);
    }//GEN-LAST:event_btn_canremoveMouseEntered

    private void btn_canremoveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_canremoveMouseExited
        hrm.MouseExitEvent(btn_canremove, Color.black);
    }//GEN-LAST:event_btn_canremoveMouseExited

    private void btn_ViewCandMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ViewCandMouseEntered
        hrm.MouseEnterEvent(btn_ViewCand);
    }//GEN-LAST:event_btn_ViewCandMouseEntered

    private void btn_ViewCandMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ViewCandMouseExited
        hrm.MouseExitEvent(btn_ViewCand, Color.black);
    }//GEN-LAST:event_btn_ViewCandMouseExited

    private void btn_scheduleResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_scheduleResetActionPerformed
        this.scheduleEmptyForm();
        this.scheduleEmptyVal_lbl();
        HR_Methods hm = new HR_Methods();
        hm.AutoGeneratePrimaryKey(lbl_iidVal, txt_interID, 'I', "interview_schedule", "interID");
        this.buttonEnable(btn_scheduleAdd, false, btn_scheduleUpdate, false, btn_scheduleReset, false);
    }//GEN-LAST:event_btn_scheduleResetActionPerformed

    private void btn_scheduleUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_scheduleUpdateActionPerformed
        this.UpdateInterviewSchedule();
    }//GEN-LAST:event_btn_scheduleUpdateActionPerformed

    private void btn_scheduleAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_scheduleAddActionPerformed
        this.AddInterviewSchedule();
    }//GEN-LAST:event_btn_scheduleAddActionPerformed

    private void btn_candidate2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_candidate2MouseEntered
        hrm.MouseEnterEvent(btn_candidate2);
    }//GEN-LAST:event_btn_candidate2MouseEntered

    private void btn_candidate2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_candidate2MouseExited
        hrm.MouseExitEvent(btn_candidate2, blueColor);
    }//GEN-LAST:event_btn_candidate2MouseExited

    private void btn_candidate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_candidate2ActionPerformed
        canEmptyForm();
        this.canEnableTxt(false);
        canEmptyVal_lbl();
        this.panelVisible(false, true, false);
        this.buttonEnable(btn_canadd, false, btn_canupdate, false, btn_canreset, false);
        HR_Methods.loadTable(tbl_candidate, "candidate", "candidateID");
    }//GEN-LAST:event_btn_candidate2ActionPerformed

    private void btn_intSched2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_intSched2MouseEntered
        hrm.MouseEnterEvent(btn_intSched2);
    }//GEN-LAST:event_btn_intSched2MouseEntered

    private void btn_intSched2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_intSched2MouseExited
        hrm.MouseExitEvent(btn_intSched2, blueColor);
    }//GEN-LAST:event_btn_intSched2MouseExited

    private void btn_intSched2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_intSched2ActionPerformed
        HR_Methods hm = new HR_Methods();
        hm.AutoGeneratePrimaryKey(lbl_iidVal, txt_interID, 'I', "interview_schedule", "interID");
        HR_Methods.loadTable(tbl_interview_schedule, "interview_schedule", "date");
        this.panelVisible(false, false, true);
        this.scheduleEmptyForm();
        this.scheduleEmptyVal_lbl();
        this.buttonEnable(btn_scheduleAdd, false, btn_scheduleUpdate, false, btn_scheduleReset, false);
    }//GEN-LAST:event_btn_intSched2ActionPerformed

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

    private void btn_editScheduleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editScheduleMouseEntered
        hrm.MouseEnterEvent(btn_editSchedule);
    }//GEN-LAST:event_btn_editScheduleMouseEntered

    private void btn_editScheduleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editScheduleMouseExited
        hrm.MouseExitEvent(btn_editSchedule, Color.black);
    }//GEN-LAST:event_btn_editScheduleMouseExited

    private void btn_removeScheduleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeScheduleMouseEntered
        hrm.MouseEnterEvent(btn_removeSchedule);
    }//GEN-LAST:event_btn_removeScheduleMouseEntered

    private void btn_removeScheduleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeScheduleMouseExited
        hrm.MouseExitEvent(btn_removeSchedule, Color.black);
    }//GEN-LAST:event_btn_removeScheduleMouseExited

    private void btn_scheduleResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_scheduleResetMouseEntered
        hrm.MouseEnterEvent(btn_scheduleReset);
    }//GEN-LAST:event_btn_scheduleResetMouseEntered

    private void btn_scheduleResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_scheduleResetMouseExited
        hrm.MouseExitEvent(btn_scheduleReset, Color.black);
    }//GEN-LAST:event_btn_scheduleResetMouseExited

    private void btn_scheduleUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_scheduleUpdateMouseEntered
        hrm.MouseEnterEvent(btn_scheduleUpdate);
    }//GEN-LAST:event_btn_scheduleUpdateMouseEntered

    private void btn_scheduleUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_scheduleUpdateMouseExited
        hrm.MouseExitEvent(btn_scheduleUpdate, Color.black);
    }//GEN-LAST:event_btn_scheduleUpdateMouseExited

    private void btn_scheduleAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_scheduleAddMouseEntered
        hrm.MouseEnterEvent(btn_scheduleAdd);
    }//GEN-LAST:event_btn_scheduleAddMouseEntered

    private void btn_scheduleAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_scheduleAddMouseExited
        hrm.MouseExitEvent(btn_scheduleAdd, Color.black);
    }//GEN-LAST:event_btn_scheduleAddMouseExited

    private void btn_setIntDetailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_setIntDetailsMouseEntered
        hrm.MouseEnterEvent(btn_setIntDetails);
    }//GEN-LAST:event_btn_setIntDetailsMouseEntered

    private void btn_setIntDetailsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_setIntDetailsMouseExited
        hrm.MouseExitEvent(btn_setIntDetails, Color.black);
    }//GEN-LAST:event_btn_setIntDetailsMouseExited

    private void btn_setIntDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setIntDetailsActionPerformed
        hrm.LoadScheduleTableToStatusUpdate(tbl_interview_schedule, lbl_scheduleTblVali, txt_nameSU, cmb_intBy, cmb_status, btn_updateStatus);
    }//GEN-LAST:event_btn_setIntDetailsActionPerformed

    private void btn_updateStatusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateStatusMouseEntered
        hrm.MouseEnterEvent(btn_updateStatus);
    }//GEN-LAST:event_btn_updateStatusMouseEntered

    private void btn_updateStatusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateStatusMouseExited
        hrm.MouseExitEvent(btn_updateStatus, Color.black);
    }//GEN-LAST:event_btn_updateStatusMouseExited

    private void btn_updateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateStatusActionPerformed
        this.UpdateStatus();
    }//GEN-LAST:event_btn_updateStatusActionPerformed

    private void btn_setContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setContractActionPerformed
        hrm.LoadCandidateTableToEmployeeForm(tbl_interview_schedule, lbl_scheduleTblVali);
        btn_setContract.setEnabled(false);
    }//GEN-LAST:event_btn_setContractActionPerformed

    private void btn_setContractMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_setContractMouseExited
        hrm.MouseExitEvent(btn_setContract, Color.black);
    }//GEN-LAST:event_btn_setContractMouseExited

    private void btn_setContractMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_setContractMouseEntered
        hrm.MouseEnterEvent(btn_setContract);
    }//GEN-LAST:event_btn_setContractMouseEntered

    private void tbl_interview_scheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_interview_scheduleMouseClicked
        hrm.CompareDate(tbl_interview_schedule, btn_setIntDetails);
        hrm.InterScheduleCheckStatus(tbl_interview_schedule, btn_setContract);
    }//GEN-LAST:event_tbl_interview_scheduleMouseClicked

    private void txt_nameSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameSUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameSUActionPerformed

    private void btn_UserMainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserMainMouseEntered
        // TODO add your handling code here:
        Color blueColor = new Color(0, 174, 239);
        btn_UserMain.setBackground(blueColor);
        btn_UserMain.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_UserMainMouseEntered

    private void btn_UserMainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserMainMouseExited
        // TODO add your handling code here:
        Color whColor = new Color(255, 255, 255);
        Color blueColor = new Color(0, 174, 239);
        btn_UserMain.setBackground(whColor);
        btn_UserMain.setForeground(blueColor);
    }//GEN-LAST:event_btn_UserMainMouseExited

    private void btn_UserMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UserMainActionPerformed
        // TODO add your handling code here:
        UserManagement um = new UserManagement();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(um).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_UserMainActionPerformed

    private void btn_interviewMainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_interviewMainMouseEntered
        // TODO add your handling code here:
        Color blueColor = new Color(0, 174, 239);
        btn_interviewMain.setBackground(blueColor);
        btn_interviewMain.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_interviewMainMouseEntered

    private void btn_interviewMainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_interviewMainMouseExited
        // TODO add your handling code here:
        Color whColor = new Color(255, 255, 255);
        Color blueColor = new Color(0, 174, 239);
        btn_interviewMain.setBackground(whColor);
        btn_interviewMain.setForeground(blueColor);
    }//GEN-LAST:event_btn_interviewMainMouseExited

    private void btn_interviewMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_interviewMainActionPerformed
        // TODO add your handling code here:
        InterviewManagement im = new InterviewManagement();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(im).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_interviewMainActionPerformed

    private void btn_EmployeeMainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EmployeeMainMouseEntered
        // TODO add your handling code here:
        Color blueColor = new Color(0, 174, 239);
        btn_EmployeeMain.setBackground(blueColor);
        btn_EmployeeMain.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_EmployeeMainMouseEntered

    private void btn_EmployeeMainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EmployeeMainMouseExited
        // TODO add your handling code here:
        Color whColor = new Color(255, 255, 255);
        Color blueColor = new Color(0, 174, 239);
        btn_EmployeeMain.setBackground(whColor);
        btn_EmployeeMain.setForeground(blueColor);
    }//GEN-LAST:event_btn_EmployeeMainMouseExited

    private void btn_EmployeeMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EmployeeMainActionPerformed
        // TODO add your handling code here:
        EmployeeManagement em = new EmployeeManagement();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(em).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_EmployeeMainActionPerformed

    private void btn_attendeceMainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_attendeceMainMouseEntered
        // TODO add your handling code here:
        Color blueColor = new Color(0, 174, 239);
        btn_attendeceMain.setBackground(blueColor);
        btn_attendeceMain.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_attendeceMainMouseEntered

    private void btn_attendeceMainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_attendeceMainMouseExited
        // TODO add your handling code here:
        Color whColor = new Color(255, 255, 255);
        Color blueColor = new Color(0, 174, 239);
        btn_attendeceMain.setBackground(whColor);
        btn_attendeceMain.setForeground(blueColor);
    }//GEN-LAST:event_btn_attendeceMainMouseExited

    private void btn_attendeceMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_attendeceMainActionPerformed
        // TODO add your handling code here:
        AttendanceManagement am = new AttendanceManagement();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(am).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_attendeceMainActionPerformed

    private void btn_payrollMainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_payrollMainMouseEntered
        // TODO add your handling code here:
        Color blueColor = new Color(0, 174, 239);
        btn_payrollMain.setBackground(blueColor);
        btn_payrollMain.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_payrollMainMouseEntered

    private void btn_payrollMainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_payrollMainMouseExited
        // TODO add your handling code here:
        Color whColor = new Color(255, 255, 255);
        Color blueColor = new Color(0, 174, 239);
        btn_payrollMain.setBackground(whColor);
        btn_payrollMain.setForeground(blueColor);
    }//GEN-LAST:event_btn_payrollMainMouseExited

    private void btn_payrollMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payrollMainActionPerformed
        // TODO add your handling code here:
        Payroll pr = new Payroll();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(pr).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_payrollMainActionPerformed

    private void btn_jobMainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jobMainMouseEntered
        // TODO add your handling code here:
        Color blueColor = new Color(0, 174, 239);
        btn_jobMain.setBackground(blueColor);
        btn_jobMain.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_jobMainMouseEntered

    private void btn_jobMainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jobMainMouseExited
        // TODO add your handling code here:
        Color whColor = new Color(255, 255, 255);
        Color blueColor = new Color(0, 174, 239);
        btn_jobMain.setBackground(whColor);
        btn_jobMain.setForeground(blueColor);
    }//GEN-LAST:event_btn_jobMainMouseExited

    private void btn_jobMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jobMainActionPerformed
        // TODO add your handling code here:
        JobAnalysis ja = new JobAnalysis();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(ja).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_jobMainActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PnlMenu;
    private javax.swing.JButton btn_EmployeeMain;
    private javax.swing.JButton btn_UserMain;
    private javax.swing.JButton btn_ViewCand;
    private javax.swing.JButton btn_attendeceMain;
    private javax.swing.JButton btn_canEdit;
    private javax.swing.JButton btn_canSearch;
    private javax.swing.JButton btn_canSetInterview;
    public javax.swing.JButton btn_canadd;
    private javax.swing.JButton btn_candSearchSchedule;
    private javax.swing.JButton btn_candidate;
    private javax.swing.JButton btn_candidate1;
    private javax.swing.JButton btn_candidate2;
    private javax.swing.JButton btn_canremove;
    public javax.swing.JButton btn_canreset;
    public javax.swing.JButton btn_canupdate;
    private javax.swing.JButton btn_editSchedule;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_home1;
    private javax.swing.JButton btn_home2;
    private javax.swing.JButton btn_intSched;
    private javax.swing.JButton btn_intSched1;
    private javax.swing.JButton btn_intSched2;
    private javax.swing.JButton btn_interviewMain;
    private javax.swing.JButton btn_jobMain;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_logout1;
    private javax.swing.JButton btn_logout2;
    private javax.swing.JButton btn_payrollMain;
    private javax.swing.JButton btn_removeSchedule;
    private javax.swing.JButton btn_scheduleAdd;
    private javax.swing.JButton btn_scheduleReset;
    private javax.swing.JButton btn_scheduleUpdate;
    private javax.swing.JButton btn_setContract;
    private javax.swing.JButton btn_setIntDetails;
    private javax.swing.JButton btn_updateStatus;
    public javax.swing.JComboBox<String> cmb_department;
    public javax.swing.JComboBox<String> cmb_designation;
    private javax.swing.JComboBox<String> cmb_intBy;
    private javax.swing.JComboBox<String> cmb_itype;
    private javax.swing.JComboBox<String> cmb_search;
    private javax.swing.JComboBox<String> cmb_status;
    public com.toedter.calendar.JDateChooser dc_aplicantDate;
    public javax.swing.JTextField dc_dob;
    private com.toedter.calendar.JDateChooser dc_idate;
    private javax.swing.JLabel emp_background4;
    private javax.swing.JLabel emp_background6;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton26;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPaneAddress;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_CANDID;
    private javax.swing.JLabel lbl_SearchValidate;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_border;
    private javax.swing.JLabel lbl_border1;
    private javax.swing.JLabel lbl_btntblvalidate;
    private javax.swing.JLabel lbl_buttonvalidate;
    public javax.swing.JLabel lbl_canDgr;
    public javax.swing.JLabel lbl_canExp;
    public javax.swing.JLabel lbl_canHno;
    public javax.swing.JLabel lbl_canID;
    public javax.swing.JLabel lbl_canNIC;
    public javax.swing.JLabel lbl_canQul;
    public javax.swing.JLabel lbl_canaddress;
    private javax.swing.JLabel lbl_canadduppres;
    private javax.swing.JLabel lbl_canborder;
    public javax.swing.JLabel lbl_candepartment;
    public javax.swing.JLabel lbl_candepartment1;
    public javax.swing.JLabel lbl_candob;
    public javax.swing.JLabel lbl_canfname;
    public javax.swing.JLabel lbl_cangender;
    public javax.swing.JLabel lbl_canmail1;
    public javax.swing.JLabel lbl_canmno;
    public javax.swing.JLabel lbl_canname;
    public javax.swing.JLabel lbl_canrole;
    private javax.swing.JLabel lbl_cansrchSchedVal;
    private javax.swing.JLabel lbl_department1;
    private javax.swing.JLabel lbl_department2;
    private javax.swing.JLabel lbl_designation1;
    private javax.swing.JLabel lbl_dob;
    private javax.swing.JLabel lbl_employeeID;
    private javax.swing.JLabel lbl_fname;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_hno;
    private javax.swing.JLabel lbl_idateVal;
    private javax.swing.JLabel lbl_iidVal;
    private javax.swing.JLabel lbl_initialName;
    private javax.swing.JLabel lbl_istimeVal;
    private javax.swing.JLabel lbl_itypeVal;
    private javax.swing.JLabel lbl_mail;
    private javax.swing.JLabel lbl_mno;
    private javax.swing.JLabel lbl_nic;
    public javax.swing.JLabel lbl_scheduleTblVali;
    private javax.swing.JLabel lbl_subhome;
    public javax.swing.JPanel pnl_Candidate;
    private javax.swing.JPanel pnl_IntDetails;
    public javax.swing.JPanel pnl_interschedule;
    public javax.swing.JPanel pnl_viewCandidate;
    public javax.swing.JTable tbl_candidate;
    public javax.swing.JTable tbl_interview_schedule;
    private lu.tudor.santec.jtimechooser.JTimeChooser tc_iTime;
    public javax.swing.JTextArea txtA_address;
    public javax.swing.JTextField txtA_qualification;
    private javax.swing.JTextField txt_c_name;
    public javax.swing.JTextField txt_canID;
    private javax.swing.JTextField txt_candSearchSchedule;
    private javax.swing.JTextField txt_csearch;
    public javax.swing.JTextField txt_degree;
    public javax.swing.JTextField txt_exp;
    public javax.swing.JTextField txt_fname;
    public javax.swing.JTextField txt_gender;
    public javax.swing.JTextField txt_hno;
    public javax.swing.JTextField txt_initialName;
    private javax.swing.JTextField txt_interID;
    private javax.swing.JTextField txt_jobName;
    public javax.swing.JTextField txt_mail;
    public javax.swing.JTextField txt_mno;
    private javax.swing.JTextField txt_nameSU;
    public javax.swing.JTextField txt_nic;
    // End of variables declaration//GEN-END:variables
}
