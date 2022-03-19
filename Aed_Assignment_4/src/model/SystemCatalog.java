/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author archil
 */
public class SystemCatalog {

    private List<Person> personCatalog;
    private List<Patient> patientCatalog;

    public List<Patient> getPatientCatalog() {
        return patientCatalog;
    }

    public void setPatientCatalog(List<Patient> patientCatalog) {
        this.patientCatalog = patientCatalog;
    }

    public SystemCatalog() {
        personCatalog = new ArrayList<Person>();
        patientCatalog = new ArrayList<Patient>();
    }

    public List<Person> getPersonCatalog() {
        return personCatalog;
    }

    public void setCarCatalog(List<Person> personCatalog) {
        this.personCatalog = personCatalog;
    }

    public Person addPerson() {
        Person p = new Person();
        personCatalog.add(p);
        return p;
    }
    
    public Patient addPatient() {
        Patient p = new Patient();
        patientCatalog.add(p);
        return p;
    }
}
