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
    private String status;

    public ConsignmentRequest( GovernmentOrganApproveRequest governmentOrganApproveRequest) {
        this.governmentOrganApproveRequest = governmentOrganApproveRequest;
        status = "Consignment created";
    }

   
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GovernmentOrganApproveRequest getGovernmentOrganApproveRequest() {
        return governmentOrganApproveRequest;
    }

    public void setGovernmentOrganApproveRequest(GovernmentOrganApproveRequest governmentOrganApproveRequest) {
        this.governmentOrganApproveRequest = governmentOrganApproveRequest;
    }
    
    

@Override()
    public String toString(){
       return this.governmentOrganApproveRequest.getOrganProcurement().getOrganRequest().getPatient().getName();
    }
}
