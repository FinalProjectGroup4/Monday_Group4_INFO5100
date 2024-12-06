/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

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

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
