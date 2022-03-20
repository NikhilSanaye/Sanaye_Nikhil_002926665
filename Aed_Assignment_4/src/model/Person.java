/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Nikhil
 */
public class Person {

    private String name;
    private String Address;
    private String City;
    private String age;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    List<VitalSigns> vitalSignsHistory;
    
    public VitalSigns addNewVitalSigns(){
        VitalSigns vitalSigns= new VitalSigns();
        vitalSignsHistory.add(vitalSigns);
        return vitalSigns;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return name;
    }

    public Person() {
    }
    
    //getter & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public List<VitalSigns> getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(List<VitalSigns> vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }    
}
