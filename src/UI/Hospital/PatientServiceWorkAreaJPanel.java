/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Hospital;

import Model.EcoSystem;
import Model.Enterprises.Hospital;
import Model.UserAccount.UserAccount;
import Model.storage.Patient;
import Model.storage.PatientDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author apple
 */
public class PatientServiceWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Hospital hospitalEnterprise;
    UserAccount userAccount;
    EcoSystem system;
    PatientDirectory patientDirectory;
    
    /**
     * Creates new form PatientServiceWorkAreaJPanel
     */
    public PatientServiceWorkAreaJPanel(JPanel userProcessContainer, Hospital enterprise, UserAccount userAccount,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.hospitalEnterprise = enterprise;
        this.userAccount = userAccount;
        this.system = system;
        this.patientDirectory = enterprise.getPatientDirectory();
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblPatientList.getModel();

        model.setRowCount(0);
        for (Patient patient : patientDirectory.getPatientList()) {
                    Object[] row = new Object[5];
                    row[0] = patient.getId();
                    row[1] = patient;
                    row[2] = patient.getGender();
                    row[3] = patient.getAcceptedDate();
                    row[4] = patient.getEmail();
                    model.addRow(row);   
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientList = new javax.swing.JTable();
        btnAddNewPatient = new javax.swing.JButton();

        tblPatientList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Date of Visit", "Email"
            }
        ));
        jScrollPane1.setViewportView(tblPatientList);

        btnAddNewPatient.setText("Add New Patient");
        btnAddNewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddNewPatient)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddNewPatient)
                .addContainerGap(218, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewPatientActionPerformed
        // TODO add your handling code here:
        AddPatientJPanel addPatientJPanel = new AddPatientJPanel(userProcessContainer,patientDirectory,system);
        userProcessContainer.add("Add PAtient",addPatientJPanel);
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddNewPatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewPatient;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPatientList;
    // End of variables declaration//GEN-END:variables
}