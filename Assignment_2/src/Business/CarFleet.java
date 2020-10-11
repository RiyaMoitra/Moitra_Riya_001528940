/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author riyamoitra
 */
public class CarFleet {
    
    private ArrayList <Car> carFleet;
    private LocalDateTime lastUpdated;
    
    
     

    public CarFleet() {
        this.carFleet = new ArrayList <Car>();
        Car car1 = new Car("AB123", "Ferrari", "2019", true,2, 6, "Boston", true, 1);
        Car car2 = new Car("CD345", "BMW", "2019",false,2, 8,"New York", true, 2);
        Car car3 = new Car("EF567", "Toyota", "2018",false,4, 8,"Boston", true, 3);
        Car car4 = new Car("GH789", "GM", "2018",false,4, 6, "New York", true, 4);
        Car car5 = new Car("IJ910", "Toyota", "2017",false,2, 10, "New Jersey", false, 5);
        Car car6 = new Car("KL101","GM", "2017",false,4, 6,  "New Jersey", true, 6);
        Car car7 = new Car("MN112", "Ferrari", "2016",true, 4, 7, "California", true, 7);
        Car car8 = new Car("OP123","BMW","2016",false,4, 8, "California", true, 8);
        Car car9 = new Car("QR134", "Toyota", "2019",true,4, 9, "Houston", false, 9);
        Car car10 = new Car("ST141", "GM", "2019",true, 4, 10, "Houston", true, 10);
        
        
       carFleet.add(car1);
        carFleet.add(car2);
        carFleet.add(car3);
        carFleet.add(car4);
        carFleet.add(car5);
        carFleet.add(car6);
        carFleet.add(car7);
        carFleet.add(car8);
        carFleet.add(car9);
        carFleet.add(car10);
        this.setLastUpdated(LocalDateTime.now());

        
        
    }
    
    public ArrayList<Car> getCarFleet() {
        return carFleet;
    }

    public void setcarFleet(ArrayList<Car> carFleet) {
        this.carFleet = carFleet;
    }
    
    
    public void removeCar(Car car){
        carFleet.remove(car);
    }
    
    
    public int countAvail() {
        int avai = 0;
        for (Car c : carFleet) {
            if (c.isAvailable()) {
                avai = avai + 1;
            }
        }
        return avai;
    }

    public int countUnAvail() {
        int unavai = 0;
        for (Car c : carFleet) {
            if (!c.isAvailable()) {
                unavai = unavai + 1;
            }
        }
        return unavai;
    }
    
    public Car searchCar(int serialNumber){
        
        for(Car car : carFleet ){
        
             if(serialNumber == car.getSerialNumber()) {
            
            return car;
            }
    }
        return null;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    
    
    
    
    
}
