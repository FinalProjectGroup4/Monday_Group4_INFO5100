/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprises;

import Model.Organization.OrganizationDirectory;

/**
 *
 * @author apple
 */
public abstract class Enterprise extends Model.Organization.Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    public Enterprise(String name,EnterpriseType type){
        super();
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
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
}
