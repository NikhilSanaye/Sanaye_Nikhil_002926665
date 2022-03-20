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
public class PersonCatalog {

    private List<Person> personCatalog;


    public PersonCatalog() {
        personCatalog = new ArrayList<Person>();
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

}
