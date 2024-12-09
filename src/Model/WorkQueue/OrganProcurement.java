/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

/**
 *
 * @author nihardabhi
 */
public class OrganProcurement extends WorkRequest{
    private OrganRequest organRequest;
    private String status;

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

    public OrganProcurement( OrganRequest organRequest) {
        this.organRequest = organRequest;
        status = "PENDING";
    }

@Override()
    public String toString(){
       return this.organRequest.getPatient().getName();
    }
}
