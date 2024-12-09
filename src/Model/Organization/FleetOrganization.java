/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Roles.DoctorRole;
import Model.Roles.Role;
import Model.Roles.TransportAdminRole;
import java.util.ArrayList;

/**
 *
 * @author nihardabhi
 */
public class FleetOrganization extends Organization{

    public FleetOrganization(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TransportAdminRole());
        return roles;
    }
    
}
