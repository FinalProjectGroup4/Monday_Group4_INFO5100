/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.TransportAdmin;

import Model.EcoSystem;
import Model.Enterprises.Enterprise;
import Model.WorkQueue.ConsignmentRequest;
import Model.WorkQueue.OrganProcurement;
import Model.storage.Patient;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aakrutighatole
 */
public class TransportAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form TransportAdminWorkArea
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Enterprise enterprise;
    public TransportAdminWorkArea(JPanel container, EcoSystem system,Enterprise enterprise) {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();

        jLabel1.setText("Upcoming Requests :");

        tblRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Organ Name", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblRequests);

        btnCreate.setText("Create Consignment");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCreate)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCreate)
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        int selectedrow = tblRequests.getSelectedRow();
        
        if(selectedrow < 0){
            JOptionPane.showMessageDialog((this), "Please select valid row");
            return;
        }
        
        ConsignmentRequest cr = (ConsignmentRequest)tblRequests.getValueAt(selectedrow, 0);
        cr.setStatus("SHIPPED");
        cr.getGovernmentOrganApproveRequest().setStatus("SHIPPED");
        cr.getGovernmentOrganApproveRequest().getOrganProcurement().setStatus("SHIPPED");
        cr.getGovernmentOrganApproveRequest().getOrganProcurement().getOrganRequest().setStatus("SHIPPED");
        populateTable();
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequests;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblRequests.getModel();
        model.setRowCount(0);

        // Get the list of OrganRequests
        ArrayList<ConsignmentRequest> wrq = enterprise.getNetwork().getWorkqueue().getConsignmentRequests();

        // Check if the list is null cng empty
        if (wrq == null || wrq.isEmpty()) {
            System.err.println("No Pending Requests found.");
            return;
        }

        // Iterate through the list and add each request to the table
        for (ConsignmentRequest cng : wrq) {
            if (cng != null) {
                Object[] row = new Object[6];
                row[0] = cng;
                row[1] = cng.getGovernmentOrganApproveRequest().getOrganProcurement().getOrganRequest().getOrganName();
                row[5] = cng.getStatus();
                model.addRow(row);
            } else {
                System.err.println("Null Consignments encountered.");
            }
        }
    }
}
