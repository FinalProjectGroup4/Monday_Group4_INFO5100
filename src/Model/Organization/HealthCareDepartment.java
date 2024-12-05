/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author nihardabhi
 */
public class HealthCareDepartment extends Organization{

    public HealthCareDepartment(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
