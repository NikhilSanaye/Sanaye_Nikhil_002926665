/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Nikhil
 */
public class ServiceRecordsHistory {
    
    private ArrayList<ServiceRecords> history;
    
    public ServiceRecordsHistory(){
        this.history= new ArrayList<ServiceRecords>();
    }

    public ArrayList<ServiceRecords> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<ServiceRecords> history) {
        this.history = history;
    }
    
    public ServiceRecords addNewServiceRecord(){
        ServiceRecords serviceRecords= new ServiceRecords();
        history.add(serviceRecords);
        return serviceRecords;
    }
}
