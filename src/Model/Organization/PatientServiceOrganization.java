/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Roles.PatientServiceStaffRole;
import Model.Roles.Role;
import Model.storage.PatientDirectory;
import java.util.ArrayList;

/**
 *
 * @author nihardabhi
 */
public class PatientServiceOrganization extends Organization{
    
    private PatientDirectory patientDirectory;


    public PatientServiceOrganization(String name) {
        super(name);
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PatientServiceStaffRole());
        return roles;
    }
    
}
