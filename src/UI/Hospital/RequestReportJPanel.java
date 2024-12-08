/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Hospital;

import Model.EcoSystem;
import Model.Enterprises.Hospital;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.PathologyTestRequest;
import Model.WorkQueue.WorkRequest;
import Model.storage.Patient;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author apple
 */
public class RequestReportJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Patient patient;
    Hospital enterpriseHospital;
    UserAccount doctorAccount;
    /**
     * Creates new form RequestReportJPanel
     */
    public RequestReportJPanel(JPanel userProcessContainer, EcoSystem system ,Patient patient, Hospital enterprise, UserAccount doctorAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterpriseHospital = enterprise;
        this.patient = patient;
        this.doctorAccount = doctorAccount;
        fillPatientData();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRaiseRequest = new javax.swing.JButton();
        txtPatientName = new javax.swing.JTextField();
        txtPatientGender = new javax.swing.JTextField();
        txtPatientSickness = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReportDetails = new javax.swing.JTextArea();
        btnBack3 = new javax.swing.JButton();

        jLabel1.setText("Name");

        jLabel2.setText("Gender");

        jLabel3.setText("Sickness");

        jLabel4.setText("Test Details");

        btnRaiseRequest.setText("Raise Request");
        btnRaiseRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaiseRequestActionPerformed(evt);
            }
        });

        txtReportDetails.setColumns(20);
        txtReportDetails.setRows(5);
        jScrollPane1.setViewportView(txtReportDetails);

        btnBack3.setText("Back");
        btnBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(btnRaiseRequest)
                    .addComponent(jLabel4)
                    .addComponent(btnBack3))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPatientSickness, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPatientGender, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPatientSickness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(btnRaiseRequest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRaiseRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaiseRequestActionPerformed
        // TODO add your handling code here:
        PathologyTestRequest pathologyTestRequest = new PathologyTestRequest(patient);
        pathologyTestRequest.setSender(doctorAccount);
        pathologyTestRequest.setStatus("Pending");
        pathologyTestRequest.setMessage(txtReportDetails.getText());
        ArrayList<WorkRequest> existingRequests = enterpriseHospital.getWorkQueue().getPathologyTestRequests(patient.getId(), true);
        existingRequests.add(pathologyTestRequest);
        enterpriseHospital.getWorkQueue().setPathologyTestRequests(existingRequests);
    }//GEN-LAST:event_btnRaiseRequestActionPerformed

    private void btnBack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack3ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack3;
    private javax.swing.JButton btnRaiseRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPatientGender;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPatientSickness;
    private javax.swing.JTextArea txtReportDetails;
    // End of variables declaration//GEN-END:variables

    private void fillPatientData() {
        txtPatientName.setText(patient.getName());
        txtPatientGender.setText(patient.getGender());
        txtPatientSickness.setText(patient.getSickness());
        txtPatientName.setEditable(false);
        txtPatientGender.setEditable(false);
        txtPatientSickness.setEditable(false);
    }
}