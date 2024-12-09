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
public class OrganProcurement extends WorkRequest{
    private OrganRequest organRequest;
    private Date requestDate;
    private Enterprise organBank;
    private boolean processed;

    public OrganProcurement( OrganRequest organRequest) {
        this.organRequest = organRequest;
        requestDate = new Date();
        Date currentDate = new Date();
        requestDate = currentDate;
    }
    
    public OrganRequest getOrganRequest() {
        return organRequest;
    }

    public void setOrganRequest(OrganRequest organRequest) {
        this.organRequest = organRequest;
    }

    @Override
    public boolean isIsRejected() {
        return organRequest.isIsRejected();
    }

    @Override
    public void setIsRejected(boolean isRejected) {
        this.organRequest.setIsRejected(isRejected);
    }
    
    @Override
    public String getStatus() {
        return organRequest.getStatus();
    }

    @Override
    public void setStatus(String status) {
        organRequest.setStatus(status);
    }

    @Override
    public Date getRequestDate() {
        return requestDate;
    }

    @Override
    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Enterprise getOrganBank() {
        return organBank;
    }

    public void setOrganBank(Enterprise organBank) {
        this.organBank = organBank;
    }

    public Enterprise getHospital() {
        return organRequest.getHospital();
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }
    
    
    

    
    @Override()
    public String toString(){
       return this.organRequest.getPatient().getName();
    }
}
