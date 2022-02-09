/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author Nikhil
 */
public class Car {
    
    private String Brand;
    private String Model;
    private String Color;
    private String Year;
    private String EngineNo;
    private String SeatsNumber;
    private String LicensePlates;
    private String OwnerName;
    private String OwnerTelephoneNumbers;       //can be multiple
    private String OwnerEmailAddresses;         //can be multiple
    private String OwnerDriverLicense;
    private String OwnerSocialSecurityNumber;
    private String OwnerAddress;
    private ServiceRecordsHistory serviceRecordsHistory;
    private String WarrantyYear;
    private String jPhoto;    

    public String getjPhoto() {
        return jPhoto;
    }

    public void setjPhoto(String jPhoto) {
        this.jPhoto = jPhoto;
    }
    
    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }
    
        public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getEngineNo() {
        return EngineNo;
    }

    public void setEngineNo(String EngineNo) {
        this.EngineNo = EngineNo;
    }

    public String getSeatsNumber() {
        return SeatsNumber;
    }

    public void setSeatsNumber(String SeatsNumber) {
        this.SeatsNumber = SeatsNumber;
    }

    public String getLicensePlates() {
        return LicensePlates;
    }

    public void setLicensePlates(String LicensePlates) {
        this.LicensePlates = LicensePlates;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    public String getOwnerTelephoneNumbers() {
        return OwnerTelephoneNumbers;
    }

    public void setOwnerTelephoneNumbers(String OwnerTelephoneNumbers) {
        this.OwnerTelephoneNumbers = OwnerTelephoneNumbers;
    }

    public String getOwnerEmailAddresses() {
        return OwnerEmailAddresses;
    }

    public void setOwnerEmailAddresses(String OwnerEmailAddresses) {
        this.OwnerEmailAddresses = OwnerEmailAddresses;
    }

    public String getOwnerDriverLicense() {
        return OwnerDriverLicense;
    }

    public void setOwnerDriverLicense(String OwnerDriverLicense) {
        this.OwnerDriverLicense = OwnerDriverLicense;
    }

    public String getOwnerSocialSecurityNumber() {
        return OwnerSocialSecurityNumber;
    }

    public void setOwnerSocialSecurityNumber(String OwnerSocialSecurityNumber) {
        this.OwnerSocialSecurityNumber = OwnerSocialSecurityNumber;
    }

    public String getOwnerAddress() {
        return OwnerAddress;
    }

    public void setOwnerAddress(String OwnerAddress) {
        this.OwnerAddress = OwnerAddress;
    }

    public ServiceRecordsHistory getServiceRecordsHistory() {
        return serviceRecordsHistory;
    }

    public void setServiceRecordsHistory(ServiceRecordsHistory serviceRecordsHistory) {
        this.serviceRecordsHistory = serviceRecordsHistory;
    }

    public String getWarrantyYear() {
        return WarrantyYear;
    }

    public void setWarrantyYear(String WarrantyYear) {
        this.WarrantyYear = WarrantyYear;
    }
    
}
