/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdmin;

import Model.EcoSystem;
import Model.Enterprises.Enterprise;
import Model.Networks.Network;
import java.awt.CardLayout;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aakrutighatole
 */
public class SystemAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkArea
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    HashMap<String, Network> networkMap = new HashMap<>();
    
    public SystemAdminWorkArea(JPanel container, EcoSystem system) {
        initComponents();
        populateComboBox();
        this.userProcessContainer=container;
        this.ecosystem=system; 
        populateNetworkCmb();
        populateTable();
        txtId.setEditable(false);
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(false);
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
        tblDetails = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();
        lblEnterprise = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblNetwork = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbEnterprise = new javax.swing.JComboBox();
        cmbNetwork = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "City", "Country", "Network"
            }
        ));
        jScrollPane1.setViewportView(tblDetails);

        btnViewDetails.setText("View Details");

        btnAddNew.setText("Add New");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });

        lblEnterprise.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Details"));

        jLabel1.setText("Organization ID :");

        jLabel2.setText("Organization Name :");

        jLabel3.setText("City :");

        jLabel4.setText("Country :");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblNetwork.setText("Networks");

        jLabel6.setText("Enterprise");

        cmbEnterprise.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cmbEnterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEnterpriseActionPerformed(evt);
            }
        });

        cmbNetwork.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cmbNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lblEnterpriseLayout = new javax.swing.GroupLayout(lblEnterprise);
        lblEnterprise.setLayout(lblEnterpriseLayout);
        lblEnterpriseLayout.setHorizontalGroup(
            lblEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblEnterpriseLayout.createSequentialGroup()
                .addGroup(lblEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblEnterpriseLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lblEnterpriseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(lblEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(lblEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId)
                            .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(cmbEnterprise, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26)
                .addGroup(lblEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lblEnterpriseLayout.createSequentialGroup()
                        .addGroup(lblEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(lblEnterpriseLayout.createSequentialGroup()
                                .addGroup(lblEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(51, 51, 51))
                            .addGroup(lblEnterpriseLayout.createSequentialGroup()
                                .addComponent(lblNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(62, 62, 62)))
                        .addGroup(lblEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(cmbNetwork, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(35, 35, 35))
        );
        lblEnterpriseLayout.setVerticalGroup(
            lblEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblEnterpriseLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(lblEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(lblEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(lblEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNetwork)
                    .addComponent(jLabel6)
                    .addComponent(cmbEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(lblEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave))
                .addContainerGap())
        );

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(btnAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnBack))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewDetails)
                    .addComponent(btnAddNew))
                .addGap(27, 27, 27)
                .addComponent(lblEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (txtName.getText().isEmpty() || txtCity.getText().isEmpty() || txtCountry.getText().isEmpty() || cmbEnterprise.getSelectedItem() == null || cmbNetwork.getSelectedItem() == null) {
            JOptionPane.showMessageDialog((this), "Please enter all command field");
            return;
        }
        
        String selectedEnterprise = (String) cmbEnterprise.getSelectedItem();
                
      
        String selectedNetworks = (String) cmbNetwork.getSelectedItem();
        
        Network selectedNetwork = networkMap.get(selectedNetworks);

        Enterprise.EnterpriseType enterpriseType = null;
        
        if(selectedEnterprise.equals("Hospital")){
            enterpriseType = Enterprise.EnterpriseType.Hospital;
        } else if(selectedEnterprise.equals("NGO")){
            enterpriseType = Enterprise.EnterpriseType.NGO;
        } else if(selectedEnterprise.equals("Organ Banks")){
            enterpriseType = Enterprise.EnterpriseType.OrganBank;
        } else if(selectedEnterprise.equals("Transport Agencies")){
            enterpriseType = Enterprise.EnterpriseType.Transport;
        } else{
            enterpriseType = Enterprise.EnterpriseType.Government;
        }

        Enterprise newEnterprise = selectedNetwork.getEnterpriseDirectory().createAndAddEnterprise(txtName.getText(),enterpriseType);
        newEnterprise.createDefaultOrganization();
        populateTable();
        
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(false);
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        // TODO add your handling code here:
        btnUpdate.setEnabled(true);
        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnAddNewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        cmbEnterprise.setEnabled(false);
        cmbNetwork.setEnabled(false);
        
        int selectedrow = tblDetails.getSelectedRow();
        
        if(selectedrow < 0){
            JOptionPane.showMessageDialog((this), "Please enter valid");
            return;
        }
        
        Enterprise enterprise = (Enterprise) tblDetails.getValueAt(selectedrow, 1);
        
        if (txtName.getText().isEmpty() || txtCity.getText().isEmpty() || txtCountry.getText().isEmpty()) {
            JOptionPane.showMessageDialog((this), "Please enter all command field");
            return;
        }
        
        
        enterprise.setCity(txtCity.getText());
        enterprise.setCountry(txtCountry.getText());
        enterprise.setName(txtName.getText());

        populateTable();
        
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(false);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void cmbEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEnterpriseActionPerformed

    }//GEN-LAST:event_cmbEnterpriseActionPerformed

    private void cmbNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNetworkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JComboBox cmbEnterprise;
    private javax.swing.JComboBox cmbNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel lblEnterprise;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JTable tblDetails;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void populateComboBox() {
        cmbEnterprise.removeAllItems();
        cmbEnterprise.addItem("Hospitals");
        cmbEnterprise.addItem("NGOs");
        cmbEnterprise.addItem("Organ Banks");
        cmbEnterprise.addItem("Transport Agencies");
        cmbEnterprise.addItem("Government Bodies");
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblDetails.getModel();
        model.setRowCount(0);
        for (Network network : ecosystem.getNetworkList()) {
            for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
                Object[] row = new Object[5];
                row[0] = e.getOrganizationID();
                row[1] = e;
                row[2] = e.getCity();
                row[3] = e.getCountry();
                row[4] = network.getName();
                model.addRow(row);
            }
        }
    }
    
    private void populateNetworkCmb(){
        cmbNetwork.removeAllItems();
        
        for(Network network : ecosystem.getNetworkList()){
            cmbNetwork.addItem(network.toString());
            networkMap.put(network.toString(), network);
        }
    }
    
}
