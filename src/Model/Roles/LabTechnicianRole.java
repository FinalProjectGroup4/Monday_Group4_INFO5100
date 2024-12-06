/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Roles;

import Model.WorkQueue.PathologyTestRequest;
import java.util.ArrayList;

/**
 *
 * @author apple
 */
public class LabTechnicianRole extends Role{
    private ArrayList<PathologyTestRequest> testRequst;
    
    public LabTechnicianRole(ArrayList<PathologyTestRequest> testRequst){
        this.testRequst = testRequst;
    }
    
    // to show all related test pending for specific lab technicians.
    public ArrayList<PathologyTestRequest> getTestRequst() {
        return testRequst;
    }
    
    // lab technician will assign test results
    public void setTestReport(PathologyTestRequest test, double value){
        try{
            test.setResults(value);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
