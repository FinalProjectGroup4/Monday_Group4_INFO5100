/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

import Model.Enterprises.Enterprise;
import java.util.Date;

/**
 *
 * @author nihardabhi
 */
public class ConsignmentRequest extends WorkRequest {
    private GovernmentOrganApproveRequest governmentOrganApproveRequest;
    boolean processed;
    private Date requestDate;

    public ConsignmentRequest( GovernmentOrganApproveRequest governmentOrganApproveRequest) {
        this.governmentOrganApproveRequest = governmentOrganApproveRequest;
        Date currentDate = new Date();
        requestDate = currentDate;
    }

    @Override
    public String getStatus() {
        return governmentOrganApproveRequest.getStatus();
    }

    @Override
    public void setStatus(String status) {
        governmentOrganApproveRequest.setStatus(status);
    }

    public GovernmentOrganApproveRequest getGovernmentOrganApproveRequest() {
        return governmentOrganApproveRequest;
    }

    public void setGovernmentOrganApproveRequest(GovernmentOrganApproveRequest governmentOrganApproveRequest) {
        this.governmentOrganApproveRequest = governmentOrganApproveRequest;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }
    
    public Enterprise getHospital() {
        return governmentOrganApproveRequest.getHospital();
    }
    
    public Enterprise organBank() {
        return governmentOrganApproveRequest.getOrganBank();
    }

    @Override
    public Date getRequestDate() {
        return requestDate;
    }

    @Override
    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }
    
    
    
    @Override
    public boolean isIsRejected() {
        return governmentOrganApproveRequest.isIsRejected();
    }

    @Override
    public void setIsRejected(boolean isRejected) {
        this.governmentOrganApproveRequest.setIsRejected(isRejected);
    }
    
    @Override()
    public String toString(){
       return this.governmentOrganApproveRequest.getOrganProcurement().getOrganRequest().getPatient().getName();
    }
}
