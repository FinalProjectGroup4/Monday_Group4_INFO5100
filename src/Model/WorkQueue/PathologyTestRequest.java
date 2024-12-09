/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

import Model.storage.Patient;

/**
 *
 * @author apple
 */
public class PathologyTestRequest extends WorkRequest{
    private Patient patient;
    private String bloodType;
    private String testName;
    private String results;
    private boolean isProcessed;
    
    public Patient getPatient() {
        return patient;
    }
    
    public PathologyTestRequest(Patient patient){
        this.patient = patient;
        results = null;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }
    
    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public boolean isIsProcessed() {
        return isProcessed;
    }

    public void setIsProcessed(boolean isProcessed) {
        this.isProcessed = isProcessed;
    }
    
    
    @Override
    public String toString(){
        return patient.getName();
    }
}
