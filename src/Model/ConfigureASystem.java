/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Employee.Employee;
import Model.Roles.SystemAdminRole;
import Model.UserAccount.UserAccount;

/**
 *
 * @author apple
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        Employee employee = system.getEmployeeDirectory().createEmployee("System Admin");
        
        //System Admin
        UserAccount userAccountSys = system.getUserAccountDirectory().createUserAccount("master", "master", employee, new SystemAdminRole());
       
        return system;
    }
}
