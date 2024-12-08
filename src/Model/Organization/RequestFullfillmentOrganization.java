/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Roles.NGOStaffRole;
import Model.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author nihardabhi
 */
public class RequestFullfillmentOrganization extends Organization{

    public RequestFullfillmentOrganization(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOStaffRole());
        return roles;    
    }
}
