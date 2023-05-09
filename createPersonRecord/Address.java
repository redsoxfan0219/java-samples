package edu.cscc;

public class Address {

    private String streetAddress;
    private String city;
    private String state;
    private String zip;

    // Constructor

    public Address(String streetAddress, String city, String state, String zip) {

        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;

    }

    public String getStreetAddress() {
        return this.streetAddress;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}
