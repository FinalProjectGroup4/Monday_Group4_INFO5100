/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author apple
 */
public class WorkQueue {
    private ArrayList<WorkRequest> workRequestList;
    private  ArrayList<WorkRequest> pathologyTestRequests;
    private  ArrayList<WorkRequest> medicalVisitRequests;
    private  ArrayList<OrganRequest> organRequests;
    private ArrayList<GovernmentOrganApproveRequest> governmentOrganApproveRequests;
    private ArrayList<OrganProcurement> organProcurementRequest;

    public ArrayList<OrganProcurement> getOrganProcurementRequest() {
        return organProcurementRequest;
    }

    public void setOrganProcurementRequest(ArrayList<OrganProcurement> organProcurementRequest) {
        this.organProcurementRequest = organProcurementRequest;
    }

    public WorkQueue() {
        workRequestList = new ArrayList();
        pathologyTestRequests = new ArrayList();
        medicalVisitRequests = new ArrayList();
        organRequests = new ArrayList();
        governmentOrganApproveRequests = new ArrayList();
        organProcurementRequest = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

//    @Override
//    public String toString() {
//        return "WorkQueue{" + "workRequestList=" + workRequestList + ", organRequestList=" + organRequestList + ", organReportList=" + organReportList + ", distributionList=" + distributionList + ", artificialOrganRequestlist=" + artificialOrganRequestlist + ", organReportDocList=" + organReportDocList + ", organReportHosList=" + organReportHosList + '}';
//    }
    
    public ArrayList<WorkRequest> getPathologyTestRequests() {
        return pathologyTestRequests;
    }
    
     public ArrayList<OrganRequest> getOrganRequests() {
        return organRequests;
    }
    
    public ArrayList<WorkRequest> getPathologyTestRequestsForAPatient(int patientId){
        ArrayList<WorkRequest> filterResult = new ArrayList<>();
        
        for(WorkRequest w : pathologyTestRequests){
            PathologyTestRequest p = (PathologyTestRequest) w;
            if(p.getPatient().getId() == patientId){
                WorkRequest filterPatient = (WorkRequest) p;
                filterResult.add(filterPatient);
            }
            
        }
        return filterResult;
    } 

    public ArrayList<GovernmentOrganApproveRequest> getGovernmentOrganApproveRequests(){
        return governmentOrganApproveRequests;
    }
    
    public void setPathologyTestRequests(ArrayList<WorkRequest> pathologyTestRequests) {
        this.pathologyTestRequests = pathologyTestRequests;
    }
    
    
    public void removePathologyTestRequest(WorkRequest workRequest) {
        pathologyTestRequests.remove(workRequest);
    }
    
    public ArrayList<WorkRequest> getMedicalVisitRequests(int patientId, boolean isPending) {
        
        ArrayList<WorkRequest> filterResult = new ArrayList<>();
        
        for(WorkRequest w : medicalVisitRequests){
            MedicalVisitRequest p = (MedicalVisitRequest) w;
            if(p.getPatient().getId() == patientId){
                WorkRequest filterPatient = (WorkRequest) p;
                filterResult.add(filterPatient);
            }
            
        }
        return filterResult;
    }
    
    public ArrayList<OrganRequest> getOrganRequests(int patientId, boolean isPending) {
        
        ArrayList<OrganRequest> filterResult = new ArrayList<>();
        
        for(WorkRequest w : organRequests){
            OrganRequest p = (OrganRequest) w;
            if(p.getPatient().getId() == patientId){
                OrganRequest filterPatient = (OrganRequest) p;
                filterResult.add(filterPatient);
            }
            
        }
        return filterResult;
    }
    
    
    
    public void removeOrganRequest(WorkRequest workRequest) {
        organRequests.remove(workRequest);
    }
}
