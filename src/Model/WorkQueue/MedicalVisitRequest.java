/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

import Model.storage.Patient;
import java.util.Date;

/**
 *
 * @author apple
 */
public class MedicalVisitRequest extends WorkRequest{
    private Patient patient;
    private String bloodType;
    private Date visiDate;
    private  String remarks;

    public MedicalVisitRequest(Patient patient) {
        this.patient = patient;
    }
    
    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public Date getVisiDate() {
        return visiDate;
    }

    public void setVisiDate(Date visiDate) {
        this.visiDate = visiDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    
}
