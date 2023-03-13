package model;

import javafx.collections.ObservableList;

import java.time.ZoneId;

public class Customer extends User{

    private ObservableList associatedAppointments;
    private String name;
    private String street;
    private String state;
    private String country;
    private int postalCode;
    private String phoneNumber;

    public ObservableList getAssociatedAppointments() {
        return associatedAppointments;
    }

    public void setAssociatedAppointments(ObservableList associatedAppointments) {
        this.associatedAppointments = associatedAppointments;
    }

    public Customer(int id, String userName, String password,
                    ZoneId timeZone,
                    ObservableList associatedAppointments,
                    String name, String street, String state,
                    String country, int postalCode, String phoneNumber) {
        super(id, userName, password, timeZone);
        this.name = name;
        this.street = street;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
