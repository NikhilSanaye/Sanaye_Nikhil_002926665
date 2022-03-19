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
public class Patient extends Person {
    
    List<VitalSignRecord> vitalSignsHistory;    
        public List<VitalSignRecord> getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(List<VitalSignRecord> vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }
    
    public VitalSignRecord addNewVitalSigns(){
        VitalSignRecord vitalSigns= new VitalSignRecord();
        vitalSignsHistory.add(vitalSigns);
        return vitalSigns;
    }
}
