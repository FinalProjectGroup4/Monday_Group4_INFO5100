/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;
import Model.Roles.DoctorRole;
import Model.Roles.Role;
import Model.WorkQueue.OrganRequest;
import Model.WorkQueue.WorkRequest;
import Model.storage.Patient;
import Model.storage.PatientDirectory;
import java.util.ArrayList;

/**
 *
 * @author nihardabhi
 */
public class DoctorOrganization extends Organization{

    private PatientDirectory patientDirectory;
    
    
    public DoctorOrganization(String name) {
        super(name);
        patientDirectory = new PatientDirectory();
    }
    
    public ArrayList<WorkRequest> getMedicalVisits(Patient patient){
        return this.getWorkQueue().getMedicalVisitRequests(patient.getId(),false);
    }
    
    public ArrayList<OrganRequest> getOrganRequests(Patient patient){
        return this.getWorkQueue().getOrganRequests(patient.getId(),false);
    }
    
    public void removeOrganRequest(WorkRequest workRequest){
        this.getWorkQueue().removeOrganRequest(workRequest);
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }
    
    
}
