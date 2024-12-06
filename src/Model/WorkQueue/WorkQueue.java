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
    private ArrayList<WorkRequest> organRequestList;
    private ArrayList<WorkRequest> organReportList;
    private ArrayList<WorkRequest> distributionList;
    private ArrayList<WorkRequest> artificialOrganRequestlist;
    
    private ArrayList<WorkRequest> organReportDocList;
    private ArrayList<WorkRequest> organReportHosList;
    
    // Our code
    private  ArrayList<WorkRequest> pathologyTestRequests;
    private  ArrayList<WorkRequest> medicalVisitRequests;

    public WorkQueue() {
        workRequestList = new ArrayList();
        organRequestList = new ArrayList();
        organReportList = new ArrayList();
        distributionList = new ArrayList();
        artificialOrganRequestlist = new ArrayList();
        organReportDocList = new ArrayList();
        organReportHosList = new ArrayList();
        
        // Our code
        pathologyTestRequests = new ArrayList();
        medicalVisitRequests = new ArrayList();
    }

    public ArrayList<WorkRequest> getOrganReportHosList() {
        return organReportHosList;
    }
    
    

    public ArrayList<WorkRequest> getOrganReportDocList() {
        return organReportDocList;
    }
    
    public ArrayList<WorkRequest> getArtificialOrganRequestlist() {
        return artificialOrganRequestlist;
    }

    public ArrayList<WorkRequest> getDistributionList() {
        return distributionList;
    }

    public ArrayList<WorkRequest> getOrganReportList() {
        return organReportList;
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public ArrayList<WorkRequest> getOrganRequestList() {
        return organRequestList;
    }

    @Override
    public String toString() {
        return "WorkQueue{" + "workRequestList=" + workRequestList + ", organRequestList=" + organRequestList + ", organReportList=" + organReportList + ", distributionList=" + distributionList + ", artificialOrganRequestlist=" + artificialOrganRequestlist + ", organReportDocList=" + organReportDocList + ", organReportHosList=" + organReportHosList + '}';
    }


    
    
    public WorkRequest searchDocReport(String keyword,String keyword2){
        for(WorkRequest request: organReportDocList){
            if(keyword.equals(request.getOrgan()) && keyword2.equals(request.getMessage())){
                return request;
            }
        }
        return null;
    }


    public WorkRequest search(String keyword, String keyword2) {
        for (WorkRequest request : organRequestList) {
            if (keyword.equals(request.getMessage()) && keyword2.equals(request.getOrgan())) {
                return request;
            }
        }
        return null;
    }
    


    public WorkRequest searchReport(String keyword) {
        for (WorkRequest request : organReportList) {
            if (keyword.equals(request.getMessage())) {
                return request;
            }
        }
        return null;
    }

    public WorkRequest searchDistribution(String keyword, String keyword2) {
        for (WorkRequest request : distributionList) {
            if (keyword.equals(request.getMessage()) && keyword2.equals(request.getOrgan())) {
                return request;
            }
        }
        return null;
    }

    public WorkRequest searchArtificial(String keyword, String keyword2) {
        for (WorkRequest request : artificialOrganRequestlist) {
            if (keyword.equals(request.getMessage()) && keyword2.equals(request.getOrgan())) {
                return request;
            }
        }
        return null;
    }

    public void removeLabRequest(WorkRequest workRequest) {
        PathologyTestRequest r = (PathologyTestRequest)workRequest;  
        workRequestList.remove(r);
    }

    public void removeOrganRequest(WorkRequest workRequest) {
        organRequestList.remove(workRequest);
    }

    public void removeOrganReport(WorkRequest workRequest) {
        organReportList.remove(workRequest);
    }
    
    public void removeDistributionList(WorkRequest workRequest) {
        distributionList.remove(workRequest);
    }
    
    public void removeartificialOrganRequest(WorkRequest workRequest) {
        artificialOrganRequestlist.remove(workRequest);
    } 
    
    
    // Our code
    
    public ArrayList<WorkRequest> getPathologyTestRequests(int patientId, boolean isPending) {
        
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
    
    public void removePathologyTestRequest(WorkRequest workRequest) {
        pathologyTestRequests.remove(workRequest);
    }
    
    public ArrayList<WorkRequest> getMedicalVisitRequests() {
        return medicalVisitRequests;
    }
    
    public void removeMedicalVisitRequest(WorkRequest workRequest) {
        medicalVisitRequests.remove(workRequest);
    }
    
    

}
