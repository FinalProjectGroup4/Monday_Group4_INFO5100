/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.GovernmentBody;

import Model.EcoSystem;
import Model.Networks.Network;
import Model.WorkQueue.GovernmentOrganApproveRequest;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aakrutighatole
 */
public class GovernmentAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form GovernmentAdminWorkArea
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    
    public GovernmentAdminWorkArea(JPanel container, EcoSystem system) {
        initComponents();
        this.userProcessContainer=container;
        this.ecosystem=ecosystem;
    }
    
    private void populateTable() {
    DefaultTableModel model = (DefaultTableModel) tblPendingRequests.getModel();
    model.setRowCount(0);

    // Get the list of OrganRequests
    ArrayList<Network> networkList = ecosystem.getNetworkList();
    
    ArrayList<GovernmentOrganApproveRequest> allNetworkRequests = new ArrayList();

    for(Network network : networkList){
        ArrayList<GovernmentOrganApproveRequest> networkRequestList = network.getWorkqueue().getGovernmentOrganApproveRequests();
        if (networkRequestList != null && !networkRequestList.isEmpty()) {
        allNetworkRequests.addAll(networkRequestList);
        }    
    }

    // Iterate through the list and add each request to the table
    for (GovernmentOrganApproveRequest or : allNetworkRequests) {
        if (or != null) {
            Object[] row = new Object[3];
            row[0] = or;
            row[1] = or.getOrganProcurement().getOrganRequest().getOrganName();
            row[2] = or.getStatus();
            model.addRow(row);
        } else {
            System.err.println("Null OrganRequest encountered.");
        }
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPendingRequests = new javax.swing.JTable();
        btnApporve = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();

        jLabel1.setText("Pending Requests :");

        tblPendingRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Organ Name", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblPendingRequests);

        btnApporve.setText("Approve");
        btnApporve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApporveActionPerformed(evt);
            }
        });

        btnReject.setText("Reject");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(btnApporve, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 132, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApporve)
                    .addComponent(btnReject))
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApporveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApporveActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnApporveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApporve;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPendingRequests;
    // End of variables declaration//GEN-END:variables
}
