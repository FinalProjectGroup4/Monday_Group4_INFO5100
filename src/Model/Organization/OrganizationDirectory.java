/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author apple
 */
public class OrganizationDirectory {
    
   private ArrayList<Organization> organizationList;

   public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

   public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(String name, Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals((Type.Fleet.getValue()))){
            organization = new FleetOrganization(name);
        }
        return organization;
    }
    
}
