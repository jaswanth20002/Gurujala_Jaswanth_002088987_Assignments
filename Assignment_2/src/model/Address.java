/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jaswa
 */
public class Address {
    
    private String streetaddress;
    private long unitnumber;
    private String city;
    private String state;
    private float zipcode;
    private double phonenumber;

    public String getStreetaddress() {
        return streetaddress;
    }

    public void setStreetaddress(String streetaddress) {
        this.streetaddress = streetaddress;
    }

    public long getUnitnumber() {
        return unitnumber;
    }

    public void setUnitnumber(long unitnumber) {
        this.unitnumber = unitnumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public float getZipcode() {
        return zipcode;
    }

    public void setZipcode(float zipcode) {
        this.zipcode = zipcode;
    }

    public double getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(double phonenumber) {
        this.phonenumber = phonenumber;
    }
    
}
