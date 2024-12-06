/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

/**
 *
 * @author apple
 */
public class OrganRequest extends WorkRequest{
    private int patientId;
    private String bloodType;
    private String organName;
    
    public OrganRequest(){
        
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

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String testName) {
        this.organName = testName;
    }
}
