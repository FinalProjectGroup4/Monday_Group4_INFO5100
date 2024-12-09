/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

import Model.Enterprises.Hospital;
import Model.Enterprises.OrganBank;

/**
 *
 * @author nihardabhi
 */
public class ConsignmentRequest extends WorkRequest {
    private GovernmentOrganApproveRequest governmentOrganApproveRequest;
    private Hospital hospital;
    private OrganBank organBank;
    String hosLocation;
    String ogLocation;
    private String status;

    public ConsignmentRequest( GovernmentOrganApproveRequest governmentOrganApproveRequest ,Hospital hospital) {
        this.governmentOrganApproveRequest = governmentOrganApproveRequest;
        this.hospital = hospital;
        hosLocation = hospital.getCity() + " ," +hospital.getCountry();
        ogLocation = organBank.getCity() + " ," + organBank.getCountry();
        status = "create consignment";
    }

   
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    

   
    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    public OrganBank getOrganBank() {
        return organBank;
    }

    public void setOrganBank(OrganBank organBank) {
        this.organBank = organBank;
    }

    public String getHosLocation() {
        return hosLocation;
    }

    public void setHosLocation(String hosLocation) {
        this.hosLocation = hosLocation;
    }

    public String getOgLocation() {
        return ogLocation;
    }

    public void setOgLocation(String ogLocation) {
        this.ogLocation = ogLocation;
    }

@Override()
    public String toString(){
       return this.governmentOrganApproveRequest.getOrganProcurement().getOrganRequest().getPatient().getName();
    }
}
