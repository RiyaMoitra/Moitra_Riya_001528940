/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author riyamoitra
 */
public class Person {
    
    String name;
    String geographicData;
    String dateOfBirth;
    
    long faxNumber;
    String emailAddress;
    long socialSecurityNumber;
    long medicalRecordNumber;
    long healthPlanBeneficiaryNumber;
    long bankAccountNumber;
    long licenseNumber;
    String vehicleIdentifier;
    String deviceIdentifier;
    String linkedIn;
    String internetProtocolAddress;
    String biometrics;
    long uniqueIDNumber;
    long telephoneNumber;
    
    // file fullFacePhoto;

    //Scanner inScanner = new Scanner(System.in);
    
    String fullFacePhoto;
   // String inFile = inScanner.next();
          

    

    public String getFullFacePhoto() {
        return fullFacePhoto;
    }

    public void setFullFacePhoto(String fullFacePhoto) {
        this.fullFacePhoto = fullFacePhoto;
    }
    
    public long getUniqueIDNumber() {
        return uniqueIDNumber;
    }

    public void setUniqueIDNumber(long uniqueIDNumber) {
        this.uniqueIDNumber = uniqueIDNumber;
    }
    

    public String getBiometrics() {
        return biometrics;
    }

    public void setBiometrics(String biometrics) {
        this.biometrics = biometrics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeographicData() {
        return geographicData;
    }

    public void setGeographicData(String geographicData) {
        this.geographicData = geographicData;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    

    public long getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(long faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public long getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(long socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public long getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(long medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public long getHealthPlanBeneficiaryNumber() {
        return healthPlanBeneficiaryNumber;
    }

    public void setHealthPlanBeneficiaryNumber(long healthPlanBeneficiaryNumber) {
        this.healthPlanBeneficiaryNumber = healthPlanBeneficiaryNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public long getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(long licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getVehicleIdentifier() {
        return vehicleIdentifier;
    }

    public void setVehicleIdentifier(String vehicleIdentifier) {
        this.vehicleIdentifier = vehicleIdentifier;
    }

    public String getDeviceIdentifier() {
        return deviceIdentifier;
    }

    public void setDeviceIdentifier(String DeviceIdentifier) {
        this.deviceIdentifier = DeviceIdentifier;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getInternetProtocolAddress() {
        return internetProtocolAddress;
    }

    public void setInternetProtocolAddress(String internetProtocolAddress) {
        this.internetProtocolAddress = internetProtocolAddress;
    }

}
    
    
    
    
    
    

