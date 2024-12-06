/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprises;

import java.util.ArrayList;

/**
 *
 * @author apple
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
   
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        
        if (type.getValue().equals(Enterprise.EnterpriseType.Hospital.getValue())){
            enterprise = new Hospital(name, type);
            if(checkIfEnterpriseIsUnique(enterprise.getName())) enterpriseList.add(enterprise);
        }
        
        else if (type.getValue().equals(Enterprise.EnterpriseType.Government.getValue())){
            enterprise = new Government(name, type);
            if(checkIfEnterpriseIsUnique(enterprise.getName())) enterpriseList.add(enterprise);
        }
        
        else if (type.getValue().equals(Enterprise.EnterpriseType.NGO.getValue())){
            enterprise = new NGO(name, type);
            if(checkIfEnterpriseIsUnique(enterprise.getName())) enterpriseList.add(enterprise);
        }
        
        else if (type.getValue().equals(Enterprise.EnterpriseType.OrganBank.getValue())){
            enterprise = new OrganBank(name, type);
            if(checkIfEnterpriseIsUnique(enterprise.getName())) enterpriseList.add(enterprise);
        }  
        
        else{
            enterprise = new Transport(name, type);
            if(checkIfEnterpriseIsUnique(enterprise.getName())) enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
    
    public boolean checkIfEnterpriseIsUnique(String name){
        for(Enterprise e : enterpriseList){
            if(e.getName().equals(name)) return false;
        }
        
        return true;
    }
    
    public void removeEnterprise(int index){
        enterpriseList.remove(index);
    }
    
}
