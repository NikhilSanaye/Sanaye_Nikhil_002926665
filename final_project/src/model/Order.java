/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nikhil
 */
public class Order {
    public int orderId;
    public String Address;
    public String City;
    public String State;
    public String deliveryState;
    public String orderDate;
    public String RemainingDeliveryDays;
    public String Country;
    public String mailId;
    
    @Override
    public String toString(){
        return String.valueOf(orderId);
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getDeliveryState() {
        return deliveryState;
    }

    public void setDeliveryState(String deliveryState) {
        this.deliveryState = deliveryState;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getRemainingDeliveryDays() {
        return RemainingDeliveryDays;
    }

    public void setRemainingDeliveryDays(String RemainingDeliveryDays) {
        this.RemainingDeliveryDays = RemainingDeliveryDays;
    }
                    
}
