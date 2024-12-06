/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.storage;

import java.util.ArrayList;

/**
 *
 * @author nihardabhi
 */
public class PatientDirectory {
    private ArrayList<Patient>PatientDirectory;

    public PatientDirectory() {
        PatientDirectory = new ArrayList();
    }
    
       public ArrayList<Patient> getPatientDirectory() {
        return PatientDirectory;
    }

    public Patient addPatient() {
        Patient patient = new Patient();
        PatientDirectory.add(patient);
        return patient;
    }

    public void removeAirplane(Patient patient) {
        PatientDirectory.remove(patient);
    }

    public Patient searchAirplane(String keyWord) {
        for (Patient patient : PatientDirectory) {
            if (keyWord.equals(patient.getName())) {
                return patient;
            }
        }
        return null;
    }
}