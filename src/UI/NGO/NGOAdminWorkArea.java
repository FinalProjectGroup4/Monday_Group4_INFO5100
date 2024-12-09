/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.NGO;

import Model.EcoSystem;
import Model.Enterprises.Enterprise;
import Model.WorkQueue.OrganRequest;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aakrutighatole
 */
public class NGOAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form NGOAdminWorkArea
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Enterprise enterprise;
    public NGOAdminWorkArea(JPanel container, EcoSystem system,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=container;
        this.ecosystem=ecosystem;
        this.enterprise = enterprise;
        populateTable();
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
        tblPendingRequests = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnRaiseRequest = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrganBanks = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        tblPendingRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient", "Organ", "Blood Group"
            }
        ));
        jScrollPane1.setViewportView(tblPendingRequests);

        jLabel1.setText("Pending Requests :");

        btnRaiseRequest.setText("Raise Request");
        btnRaiseRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaiseRequestActionPerformed(evt);
            }
        });

        btnComplete.setText("Complete");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        tblOrganBanks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Location"
            }
        ));
        jScrollPane2.setViewportView(tblOrganBanks);

        jLabel2.setText("Available Organ Banks :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(btnRaiseRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 74, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRaiseRequest)
                    .addComponent(btnComplete))
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRaiseRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaiseRequestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRaiseRequestActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCompleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnRaiseRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblOrganBanks;
    private javax.swing.JTable tblPendingRequests;
    // End of variables declaration//GEN-END:variables

   private void populateTable() {
    DefaultTableModel model = (DefaultTableModel) tblPendingRequests.getModel();
    model.setRowCount(0);

    // Get the list of OrganRequests
    ArrayList<OrganRequest> wrq = enterprise.getNetwork().getWorkqueue().getOrganRequests();

    // Check if the list is null or empty
    if (wrq == null || wrq.isEmpty()) {
        System.err.println("No Organ Requests found.");
        return;
    }

    // Iterate through the list and add each request to the table
    for (OrganRequest or : wrq) {
        if (or != null) {
            Object[] row = new Object[3];
            row[0] = or; // Make sure `toString()` is properly overridden in OrganRequest
            System.err.println("Row 0: " + row[0]);
            
            row[1] = or.getOrganName();
            System.err.println("Row 1: " + row[1]);
            
            row[2] = or.getBloodType();
            System.err.println("Row 2: " + row[2]);

            model.addRow(row);
        } else {
            System.err.println("Null OrganRequest encountered.");
        }
    }
}
}
