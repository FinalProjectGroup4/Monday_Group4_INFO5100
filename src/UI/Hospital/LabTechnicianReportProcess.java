/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Hospital;


import Model.EcoSystem;
import Model.EmailUtil.EmailUtil;
import Model.Enterprises.Hospital;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.PathologyTestRequest;
import Model.storage.Patient;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nihardabhi
 */
public class LabTechnicianReportProcess extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Hospital hospitalEnterprise;
    UserAccount userAccount;
    EcoSystem system;
    Patient patient;
    PathologyTestRequest pathologyTestRequest;
    /**
     * Creates new form LabTechnicianReportProcess
     */
    public LabTechnicianReportProcess(JPanel panel, EcoSystem system ,Patient patient, Hospital enterprise,UserAccount details,PathologyTestRequest ptr) {
        initComponents();
        this.userProcessContainer = panel;
        this.hospitalEnterprise = enterprise;
        this.system =system;
        this.patient = patient;
        this.userAccount = details;
        this.pathologyTestRequest = ptr;
        disableAll();
        populateField();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblBG = new javax.swing.JLabel();
        txtBG = new javax.swing.JTextField();
        lblTT = new javax.swing.JLabel();
        txtTT = new javax.swing.JTextField();
        lblResult = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        btnProcess = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDoctor = new javax.swing.JTextField();
        btnBack3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        lblID.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblID.setText("PatientID");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("PatientName");

        lblBG.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblBG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBG.setText("BloodGroup");

        lblTT.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblTT.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTT.setText("TestType");

        lblResult.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblResult.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblResult.setText("Result");

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Doctor");

        btnBack3.setText(" Back");
        btnBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-report_card.png"))); // NOI18N
        jLabel2.setText("Pathology Test Results");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProcess))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblBG))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBG, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTT)
                            .addComponent(lblResult)
                            .addComponent(jLabel1))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTT, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, lblBG, lblID, lblName, lblResult, lblTT});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBG, txtDoctor, txtID, txtName, txtResult, txtTT});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblID)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBG)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblResult))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack3)
                    .addComponent(btnProcess))
                .addContainerGap(236, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here: 
        String result = txtResult.getText();
        if(pathologyTestRequest.isIsProcessed()){
            JOptionPane.showMessageDialog(
            null,
            "This report has already been processed!",
            "Report Processed",
            JOptionPane.WARNING_MESSAGE
            );
            return;
        }
        if (result.isEmpty()) {
            JOptionPane.showMessageDialog(
                null,
                "Result field cannot be empty!",
                "Input Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }
       pathologyTestRequest.setResults(result);
       pathologyTestRequest.setStatus("Complete");
       pathologyTestRequest.setIsProcessed(true);
       EmailUtil.sendEmail(pathologyTestRequest.getPatient().getEmail(), 
                "Pathology Test Results Available", 
                  "Dear User,\n\nYour pathology test results are now available.\n\nPlease log in to your account to view the details.\n\nBest regards,\nThe Pathology Team"
                );
       JOptionPane.showMessageDialog((this), "Results Submitted Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnBack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack3ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabTechnicianPendingReport pswajp = (LabTechnicianPendingReport) component;
        pswajp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack3;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBG;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblTT;
    private javax.swing.JTextField txtBG;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtTT;
    // End of variables declaration//GEN-END:variables

    private void populateField() {
        txtID.setText(String.valueOf(pathologyTestRequest.getPatient().getId()));
        txtName.setText(String.valueOf(pathologyTestRequest.getPatient().getName()));
        txtBG.setText(String.valueOf(pathologyTestRequest.getBloodType()));
        txtTT.setText(String.valueOf(pathologyTestRequest.getTestName()));
        txtDoctor.setText(String.valueOf(pathologyTestRequest.getSender()));
        
        txtID.setEnabled(false);
        txtName.setEnabled(false);
        txtBG.setEnabled(false);
        txtTT.setEnabled(false);
        txtDoctor.setEnabled(false);
    }

    private void disableAll() {
        txtID.setEnabled(false);
        txtBG.setEditable(false);
        txtDoctor.setEnabled(false);
        txtName.setEnabled(false);
        txtTT.setEnabled(false);
    }
}
