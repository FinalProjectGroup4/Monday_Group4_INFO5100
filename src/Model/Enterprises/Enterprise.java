/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprises;

import Model.Organization.Organization;
import Model.Organization.OrganizationDirectory;
import java.util.HashMap;

/**
 *
 * @author apple
 */
public abstract class Enterprise extends Model.Organization.Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private HashMap<EnterpriseType,Organization.Type[]> enterpriseOrganizationMap = new HashMap<>();
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
        enterpriseOrganizationMap();
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"), Government("Governement"), NGO("NGO"),
        OrganBank("Organ Bank"), Transport("Transport");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
            public String toString(){
            return value;
        }
    }
    
    private Object enterpriseOrganizationMap(){
        this.enterpriseOrganizationMap.put(EnterpriseType.Hospital, new Organization.Type[]{Organization.Type.Doctor,Organization.Type.Lab,
            Organization.Type.PatientService});
        enterpriseOrganizationMap.put(EnterpriseType.NGO, new Organization.Type[]{Organization.Type.RequestFullfillment});
        enterpriseOrganizationMap.put(EnterpriseType.OrganBank, new Organization.Type[]{Organization.Type.OrganProcurement});
        enterpriseOrganizationMap.put(EnterpriseType.Transport, new Organization.Type[]{Organization.Type.Fleet,Organization.Type.Driver});
        enterpriseOrganizationMap.put(EnterpriseType.Government, new Organization.Type[]{Organization.Type.Government});
        
        return enterpriseOrganizationMap;
    }
    
    public void createDefaultOrganization(){
            for (Organization.Type type : enterpriseOrganizationMap.get(enterpriseType)){
                organizationDirectory.createOrganization(type.getValue(), type);
            }
    }
    
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
}
