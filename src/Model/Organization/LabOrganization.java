/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Roles.Role;
import Model.WorkQueue.WorkRequest;
import Model.storage.Patient;
import java.util.ArrayList;

/**
 *
 * @author nihardabhi
 */
public class LabOrganization extends Organization{

    public LabOrganization(String name) {
        super(name);
    }
    
    public ArrayList<WorkRequest> getPathologyTestRequests(Patient patient){
        return this.getWorkQueue().getPathologyTestRequests(patient.getId(),false);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
