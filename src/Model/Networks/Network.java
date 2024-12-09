/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Networks;

import Model.Enterprises.EnterpriseDirectory;
import Model.WorkQueue.WorkQueue;

/**
 *
 * @author nihardabhi
 */
public class Network {
 
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private WorkQueue workqueue;
//    private UNOS unos;
//    private OrganCompany organcompany;
//    private AirAmbulenceDistribution ad;

//    public OrganCompany getOrgancompany() {
//        return organcompany;
//    }
//
//    public void setOrgancompany(OrganCompany organcompany) {
//        this.organcompany = organcompany;
//    }
//
//    public AirAmbulenceDistribution getAd() {
//        return ad;
//    }
//
//    public void setAd(AirAmbulenceDistribution ad) {
//        this.ad = ad;
//    }
    
    

//    public void setUnos(UNOS unos) {
//        this.unos = unos;
//    }
    
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
        workqueue = new WorkQueue();
//        unos = UNOS.getInstance();
//        organcompany = OrganCompany.getInstance();
//        ad = AirAmbulenceDistribution.getInstance();
    }

//    public UNOS getUnos() {
//        return unos;
//    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }
    
    
    @Override
    public String toString(){
        return name;
    }
    
}
