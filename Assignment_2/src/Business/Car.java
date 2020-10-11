/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDateTime;

/**
 *
 * @author riyamoitra
 */
public class Car {
    
    private String modelNumber;
    private String brandName;
    private String yearOfManufacturing;
    private boolean available;
    private int min_seats;
    private int max_seats;
    
    private int serialNumber;
    
    private boolean maintenenceCerticateExpiry;
    private String city;
    
    private LocalDateTime updatedOn;

    
    public Car(String modelNumber, String brandName, String yearOfManufacturing, boolean available,
            int min_seats, int max_seats, 
            String city, boolean maintenenceCerticateExpiry, int serialNumber){
        
        
        this.modelNumber = modelNumber;
        this.brandName = brandName;
        this.yearOfManufacturing = yearOfManufacturing;
        this.available = available;
        
        this.min_seats = min_seats;
        this.max_seats = max_seats;
        this.city = city;
        
        this.updatedOn = LocalDateTime.now();
        this.maintenenceCerticateExpiry = maintenenceCerticateExpiry;
        
        this.serialNumber = serialNumber; 
        
    }
    
    
    public int getSerialNumber() {
        return serialNumber;
    }

    public int getMin_seats() {
        return min_seats;
    }

    public void setMin_seats(int min_seats) {
        this.min_seats = min_seats;
    }

    public int getMax_seats() {
        return max_seats;
    }

    public void setMax_seats(int max_seats) {
        this.max_seats = max_seats;
    }

    public String getYearOfManufacturing() {
        return yearOfManufacturing;
    }

    public void setYearOfManufacturing(String yearOfManufacturing) {
        this.yearOfManufacturing = yearOfManufacturing;
    }

    public LocalDateTime getUpdatedOn() {
        return this.updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = LocalDateTime.now();
    }
    
    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isMaintenenceCerticateExpiry() {
        return maintenenceCerticateExpiry;
    }

    public void setMaintenenceCerticateExpiry(boolean maintenenceCerticateExpiry) {
        this.maintenenceCerticateExpiry = maintenenceCerticateExpiry;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    
}
