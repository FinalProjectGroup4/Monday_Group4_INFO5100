/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Roles;

import Model.EcoSystem;
import Model.Enterprises.Enterprise;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.OrganRequest;
import Model.storage.Patient;
import Model.storage.PatientDirectory;
import UI.NGO.NGOAdminWorkArea;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author apple
 */
public class NGOStaffRole extends Role{

    private ArrayList<OrganRequest> testRequest;
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public NGOStaffRole(ArrayList<OrganRequest> testRequest){
        this.testRequest = testRequest;
    }
    
    public NGOStaffRole(){}
    // to show all related test pending for specific lab technicians.
    public ArrayList<OrganRequest> getTestRequest() {
        return testRequest;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, PatientDirectory patientDirectory) {
         return new NGOAdminWorkArea(userProcessContainer, system, enterprise);
    }
    
}
