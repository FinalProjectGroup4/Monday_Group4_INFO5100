/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Roles;

import Model.EcoSystem;
import Model.Enterprises.Enterprise;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.PathologyTestRequest;
import Model.storage.PatientDirectory;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author apple
 */
public class LabTechnicianRole extends Role{
    private ArrayList<PathologyTestRequest> testRequst;
    
    public LabTechnicianRole(ArrayList<PathologyTestRequest> testRequst){
        this.testRequst = testRequst;
    }
    
    public LabTechnicianRole(){}
    // to show all related test pending for specific lab technicians.
    public ArrayList<PathologyTestRequest> getTestRequst() {
        return testRequst;
    }
    
    // lab technician will assign test results
    public void setTestReport(PathologyTestRequest test, double value){
        try{
            test.setResults(value);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, PatientDirectory patientDirectory) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
