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
public class OrganProcurement extends WorkRequest{
    private OrganRequest organRequest;

    public OrganRequest getOrganRequest() {
        return organRequest;
    }

    public void setOrganRequest(OrganRequest organRequest) {
        this.organRequest = organRequest;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    private Hospital hospital;
    private String status;

    public OrganProcurement( OrganRequest organRequest ,Hospital hospital) {
        this.organRequest = organRequest;
        this.hospital = hospital;
        status = "Waiting";
    }

   
    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

@Override()
    public String toString(){
       return this.organRequest.getOrganName();
    }
}
