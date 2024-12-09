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
public class OrganRequest extends WorkRequest{
    private Patient patient;
    private String bloodType;
    private String organName;
    private String status;    

    public OrganRequest(Patient patient, String bloodType, String organName) {
        this.patient = patient;
        this.bloodType = bloodType;
        this.organName = organName;
        status = "Request sent to NGO";
    }
    
    public OrganRequest(Patient patient){
        this.patient = patient;
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

    public Patient getPatient() {
        return patient;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    @Override()
    public String toString(){
       return this.getPatient().getName();
    }
}
