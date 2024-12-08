/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Employee.Employee;
import Model.Roles.EnterpriseAdminRole;
import Model.Roles.GovernmentStaffRole;
import Model.Roles.HospitalAdminRole;
import Model.Roles.NGOStaffRole;
import Model.Roles.OrganBankStaffRole;
import Model.Roles.SystemAdminRole;
import Model.Roles.TransportAdminRole;
import Model.UserAccount.UserAccount;

/**
 *
 * @author apple
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //Create an enterprise
        //Have some employees 
        //Create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("System Admin");
        
        //System Admin
        UserAccount userAccountSys = system.getUserAccountDirectory().createUserAccount("master", "master", employee, new SystemAdminRole());
        
        UserAccount userAccountHospitalAdmin = system.getUserAccountDirectory().createUserAccount("hospital", "hospital", employee, new HospitalAdminRole());

        UserAccount userAccountNGOAdmin = system.getUserAccountDirectory().createUserAccount("ngo", "ngo", employee, new NGOStaffRole());
        
        UserAccount userAccountOrganBankAdmin = system.getUserAccountDirectory().createUserAccount("organ", "organ", employee, new OrganBankStaffRole());
        
        UserAccount userAccountTransportAdmin = system.getUserAccountDirectory().createUserAccount("transport", "transport", employee, new TransportAdminRole());
        
        UserAccount userAccountGovernmentAdmin = system.getUserAccountDirectory().createUserAccount("gov", "gov", employee, new GovernmentStaffRole());
        
        UserAccount userAccountEnterpriseAdminHos = system.getUserAccountDirectory().createUserAccount("hos", "hos", employee, new EnterpriseAdminRole());

        return system;
    }
}
