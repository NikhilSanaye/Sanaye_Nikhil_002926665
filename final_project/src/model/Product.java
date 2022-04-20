/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author archil
 */
public class Product {
    
    private String productId;
    private String prodName;
    private String price;
    private String Description;
    private ArrayList<String> rating;
    private String supplier;
    private String Category;
    private String dimension;
    private String discount;
    private ArrayList<String> productReviews;
    //data type for posting questions & answers

    @Override
    public String toString() {
        return prodName; //To change body of generated methods, choose Tools | Templates.
    }

    public Product() {
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

}
