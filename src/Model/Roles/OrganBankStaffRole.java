/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Roles;

import Model.EcoSystem;
import Model.Enterprises.Enterprise;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import Model.storage.PatientDirectory;
import UI.OrganBank.OrganBankAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author apple
 */
public class OrganBankStaffRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, PatientDirectory patientDirectory) {
        return new OrganBankAdminWorkArea(userProcessContainer, system);
    }
    
}
