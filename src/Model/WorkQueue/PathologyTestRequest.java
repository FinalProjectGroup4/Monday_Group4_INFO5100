/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

/**
 *
 * @author apple
 */
public class PathologyTestRequest extends WorkRequest{
    private int patientId;
    private String bloodType;
    private String testName;
    private Double results;

    
    public PathologyTestRequest(){
        results = 0.0;
    }
    
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
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
