/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

import Model.Enterprises.Enterprise;
import Model.storage.Patient;
import java.util.Date;

/**
 *
 * @author apple
 */
public class OrganRequest extends WorkRequest{
    private final Patient patient;
    private String bloodType;
    private String organName;
    private Enterprise hospital;
    private Enterprise NGOEnterprise;
    private boolean processed;

    public OrganRequest(Patient patient, String bloodType, String organName, Enterprise hospital) {
        this.patient = patient;
        this.bloodType = bloodType;
        this.organName = organName;
        this.hospital = hospital;
        Date currentDate = new Date();
        setRequestDate(currentDate);        
        status = "NGO - PENDING";
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

    public Enterprise getHospital() {
        return hospital;
    }

    public void setHospital(Enterprise hospital) {
        this.hospital = hospital;
    }

    public Enterprise getNGOEnterprise() {
        return NGOEnterprise;
    }

    public void setNGOEnterprise(Enterprise NGOEnterprise) {
        this.NGOEnterprise = NGOEnterprise;
    }

    public boolean isProcessed() {
        return this.processed;
    }

    public void setProcessed(boolean isProcessed) {
        this.processed = isProcessed;
    }
    
    
    @Override()
    public String toString(){
       return this.getPatient().getName();
    }
}
