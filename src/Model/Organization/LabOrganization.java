/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Roles.LabTechnicianRole;
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
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabTechnicianRole());
        return roles;
    }
    
}
