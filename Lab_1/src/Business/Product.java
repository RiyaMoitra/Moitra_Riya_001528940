/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author riyamoitra
 */
public class Product {
    
    private String name;
    private String price;
    private String availNum;
    private String description;

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getAvailNum() {
        return availNum;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setAvailNum(String availNum) {
        this.availNum = availNum;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
