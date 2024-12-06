/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprises;

import Model.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author nihardabhi
 */
public class Hospital extends Enterprise{
    
    public Hospital(String name, EnterpriseType type) {
        super(name, type);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return  null;
    }
    
    

   
    
}
