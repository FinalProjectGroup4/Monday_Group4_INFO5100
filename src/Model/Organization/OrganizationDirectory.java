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
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization(name);
        }
        else if (type.getValue().equals(Type.PatientService.getValue())){
            organization = new PatientServiceOrganization(name);
        }
        else if (type.getValue().equals((Type.Fleet.getValue()))){
            organization = new FleetOrganization(name);
        }
        else if (type.getValue().equals(Type.RequestFullfillment.getValue())){
            organization = new RequestFullfillmentOrganization(name);
        }
        else if (type.getValue().equals(Type.OrganProcurement.getValue())){
            organization = new OrganProcurementOrganization(name);
        }
        else if (type.getValue().equals(Type.Fleet.getValue())){
            organization = new FleetOrganization(name);
        }
        else if (type.getValue().equals(Type.Driver.getValue())){
            organization = new DriverOrganization(name);
        }
        else if (type.getValue().equals(Type.Government.getValue())){
            organization = new GovernmentOrganization(name);
        }
        else{
            return null;
        }
        organizationList.add(organization);
        return organization;
    }
    
}
