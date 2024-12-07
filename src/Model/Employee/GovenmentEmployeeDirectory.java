/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Employee;

import java.util.ArrayList;

/**
 *
 * @author apple
 */
public class GovenmentEmployeeDirectory {
    private ArrayList<GovernmentEmployee> governmentEmployees;

    public GovenmentEmployeeDirectory() {
        governmentEmployees = new ArrayList();
    }

    public ArrayList<GovernmentEmployee> getEmployeeList() {
        return governmentEmployees;
    }
    
    public GovernmentEmployee createManager(String name){
        GovernmentEmployee employee = new GovernmentEmployee();
        employee.setName(name);
        governmentEmployees.add(employee);
        return employee;
    }
}
