/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Roles.OrganBankStaffRole;
import Model.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author nihardabhi
 */
public class OrganProcurementOrganization extends Organization{

    public OrganProcurementOrganization(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new OrganBankStaffRole());
        return roles;    
    }
    
}
