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
public class GovernmentOrganApproveRequest extends WorkRequest{
    OrganProcurement organProcurement;
    private boolean processed;
    private Date requestDate;


    public GovernmentOrganApproveRequest(OrganProcurement organProcurement) {
        this.organProcurement = organProcurement; 
        Date currentDate = new Date();
        requestDate = currentDate;
    }

    @Override
    public String getStatus() {
        return organProcurement.getStatus();
    }

    @Override
    public void setStatus(String status) {
        organProcurement.setStatus(status);
    }

    @Override
    public boolean isIsRejected() {
        return organProcurement.isIsRejected();
    }

    @Override
    public void setIsRejected(boolean isRejected) {
        this.organProcurement.setIsRejected(isRejected);
    }
    
    public OrganProcurement getOrganProcurement() {
        return this.organProcurement;
    }

    public void setOrganProcurement(OrganProcurement organProcurement) {
        this.organProcurement = organProcurement;
    }
    
    public Enterprise getHospital() {
        return organProcurement.getHospital();
    }
    public Enterprise getOrganBank() {
        return organProcurement.getOrganBank();
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }

    @Override
    public Date getRequestDate() {
        return requestDate;
    }

    @Override
    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }
    
    
    @Override()
    public String toString(){
        return this.organProcurement.getOrganRequest().getPatient().getName();
    }
}
