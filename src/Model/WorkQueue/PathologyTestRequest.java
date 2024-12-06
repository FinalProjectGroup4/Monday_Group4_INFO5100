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

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    private String bloodType;
    private String testName;
    private Double results;

    
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
    
    public Double getResults() {
        return results;
    }

    public void setResults(Double results) {
        this.results = results;
    }
}
