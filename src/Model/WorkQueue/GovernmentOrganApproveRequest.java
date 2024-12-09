/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

import Model.Enterprises.Hospital;
import Model.Enterprises.OrganBank;
import Model.storage.Patient;

/**
 *
 * @author nihardabhi
 */
public class GovernmentOrganApproveRequest {
    private Patient patient;
    private OrganBank organBank;
    private Hospital hospital;

    public GovernmentOrganApproveRequest(Patient patient,OrganBank organBank, Hospital hospital) {
        this.patient = patient;
        this.organBank = organBank;
        this.hospital = hospital;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public OrganBank getOrganBank() {
        return organBank;
    }

    public void setOrganBank(OrganBank organBank) {
        this.organBank = organBank;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    
    
    @Override()
    public String toString(){
       return this.getPatient().getName();
    }
}
