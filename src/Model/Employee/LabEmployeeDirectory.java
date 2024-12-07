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
public class LabEmployeeDirectory {
    private ArrayList<LabEmployee> labEmployees;

    public LabEmployeeDirectory() {
        labEmployees = new ArrayList();
    }

    public ArrayList<LabEmployee> getEmployeeList() {
        return labEmployees;
    }
    
    public LabEmployee createManager(String name){
        LabEmployee employee = new LabEmployee();
        employee.setName(name);
        labEmployees.add(employee);
        return employee;
    }
}
