package org.timburns.example.model;

/**
 * Created by Tim on 11/26/2014.
 */
public class Customer {
    private String name;
    private String email;
    private String telephone;
    private String address;
    private String street;
    private String city;
    private String state;
    private String zip;

    public String toString() {
        StringBuffer result= new StringBuffer();
        result.append("{").append( "\"name\":\"" ).append( name ).append( "\",\"address\":\"").append( address ).append( "\"}");
        return result.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
