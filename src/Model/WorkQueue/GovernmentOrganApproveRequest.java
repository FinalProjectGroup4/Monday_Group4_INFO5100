/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

/**
 *
 * @author nihardabhi
 */
public class GovernmentOrganApproveRequest {
    OrganProcurement organProcurement;
    String status;

    public GovernmentOrganApproveRequest(OrganProcurement organProcurement) {
        organProcurement = organProcurement;
        status = "WAITING";
        
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OrganProcurement getOrganProcurement() {
        return organProcurement;
    }

    public void setOrganProcurement(OrganProcurement organProcurement) {
        this.organProcurement = organProcurement;
    }
    
    
    
    
    
    @Override()
    public String toString(){
        return organProcurement.getOrganRequest().getPatient().getName();
    }
}
