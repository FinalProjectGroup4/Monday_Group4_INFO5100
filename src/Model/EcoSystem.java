package Model;

import Model.Networks.Network;
import Model.Organization.Organization;
import Model.Roles.Role;
import Model.Roles.SystemAdminRole;
import Model.storage.PatientDirectory;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author apple
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private PatientDirectory patientDirectory;
    
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
        patientDirectory = new PatientDirectory();
//        unosManagerDirectory = new UNOSmanagerDirectory();
//        airEmployeeDirectory = new AirEmployeeDirectory();
//        organCompanyStaffDirectory = new OrganCompanyStaffDirectory();
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
//    private UNOSmanagerDirectory unosManagerDirectory;
//    private AirEmployeeDirectory airEmployeeDirectory;
//    private OrganCompanyStaffDirectory organCompanyStaffDirectory;

//    public OrganCompanyStaffDirectory getOrganCompanyStaffDirectory() {
//        return organCompanyStaffDirectory;
//    }
//
//    public void setOrganCompanyStaffDirectory(OrganCompanyStaffDirectory organCompanyStaffDirectory) {
//        this.organCompanyStaffDirectory = organCompanyStaffDirectory;
//    }
    
    

//    public AirEmployeeDirectory getAirEmployeeDirectory() {
//        return airEmployeeDirectory;
//    }
//
//    public void setAirEmployeeDirectory(AirEmployeeDirectory airEmployeeDirectory) {
//        this.airEmployeeDirectory = airEmployeeDirectory;
//    }
//    
//
//    public UNOSmanagerDirectory getUnosManagerDirectory() {
//        return unosManagerDirectory;
//    }
//
//    public void setUnosManagerDirectory(UNOSmanagerDirectory unosManagerDirectory) {
//        this.unosManagerDirectory = unosManagerDirectory;
//    }
    
    

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        
        for(Network network:networkList){
            
        }
        return true;
    }
    
}
