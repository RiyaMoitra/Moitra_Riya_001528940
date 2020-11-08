/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.awt.image.BufferedImage;

/**
 *
 * @author harold
 */
public class Restaurant {
    
    private String restaurantId;
    private String name;
    private String phoneNo;
    private String address;
    private BufferedImage photo;
    private String managerName;
    private String licenseNo;

    public Restaurant(String restaurantId,String managerName,String name,String phoneNo, String address, BufferedImage photo,String licenseNo){
        this.managerName = managerName;
        this.restaurantId =restaurantId;
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
        this.photo = photo;
        this.licenseNo = licenseNo;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BufferedImage getPhoto() {
        return photo;
    }

    public void setPhoto(BufferedImage photo) {
        this.photo = photo;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }
    
    
    
}
