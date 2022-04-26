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
public class SupplierDirectory {

    private List<Supplier> supplierList;

    public SupplierDirectory() {
        supplierList = new ArrayList<Supplier>();
    }

    public List<Supplier> getSupplierlist() {
        return supplierList;
    }

    public User addSupplier() {
        Supplier newSupplier = new Supplier();
        supplierList.add(newSupplier);
        return newSupplier;
    }

    public void removeSupplier(User s) {
        supplierList.remove(s);
    }
    
    public User searchSupplier(String supplierName) {
        for (User supplier : supplierList) {
            //if (supplier.getUserId().equals(supplierName)) {
            //    return supplier;
            //}
        }
        return null;
    }
}
