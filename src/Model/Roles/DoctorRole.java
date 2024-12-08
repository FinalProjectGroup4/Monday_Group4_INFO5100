/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Roles;

import Model.EcoSystem;
import Model.Enterprises.Enterprise;
import Model.Enterprises.Hospital;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import Model.storage.PatientDirectory;
import UI.Hospital.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author apple
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, PatientDirectory patientDirectory) {
        return new DoctorWorkAreaJPanel(userProcessContainer, (Hospital) enterprise,account, system);
    }
    
}
