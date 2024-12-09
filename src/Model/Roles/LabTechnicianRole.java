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
import Model.WorkQueue.PathologyTestRequest;
import Model.storage.Patient;
import Model.storage.PatientDirectory;
import UI.Hospital.LabTechnicianPendingReport;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author apple
 */
public class LabTechnicianRole extends Role{
    private ArrayList<PathologyTestRequest> testRequst;
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public LabTechnicianRole(ArrayList<PathologyTestRequest> testRequst){
        this.testRequst = testRequst;
    }
    
    public LabTechnicianRole(){}
    // to show all related test pending for specific lab technicians.
    public ArrayList<PathologyTestRequest> getTestRequst() {
        return testRequst;
    }
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, PatientDirectory patientDirectory) {
        return new LabTechnicianPendingReport(userProcessContainer,  system ,(Hospital)enterprise);

    }
}
