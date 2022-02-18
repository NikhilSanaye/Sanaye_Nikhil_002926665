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
public class CarCatalog {

    private List<Car> carCatalog;
    String catalogeUpdatedDateTime;

    public String getCatalogeUpdatedDateTime() {
        return catalogeUpdatedDateTime;
    }

    public void setCatalogeUpdatedDateTime(String catalogeUpdatedDateTime) {
        this.catalogeUpdatedDateTime = catalogeUpdatedDateTime;
    }

    public CarCatalog() {
        carCatalog = new ArrayList<Car>();
    }

    public List<Car> getCarCatalog() {
        return carCatalog;
    }

    public void setCarCatalog(List<Car> carCatalog) {
        this.carCatalog = carCatalog;
    }

    public Car addCar() {
        Car c = new Car();
        carCatalog.add(c);
        return c;
    }

    public void removeProduct(Car p) {
        carCatalog.remove(p);
    }

    public Car searchProduct(String serialNumber) {
        for (Car car : carCatalog) {
            if (car.getSerialNumber().equals(serialNumber)) {
                return car;
            }
        }
        return null;
    }
}
