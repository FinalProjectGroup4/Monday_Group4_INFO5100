/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprises;

import Model.Roles.Role;
import Model.storage.PatientDirectory;
import java.util.ArrayList;

/**
 *
 * @author nihardabhi
 */
public class Hospital extends Enterprise{
    
    private PatientDirectory patientDirectory;
    
    public Hospital(String name, EnterpriseType type) {
        super(name, type);
        patientDirectory = new PatientDirectory();
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return  null;
    }
    
    

   
    
}
