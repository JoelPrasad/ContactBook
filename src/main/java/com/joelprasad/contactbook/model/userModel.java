package com.joelprasad.contactbook.model;

import javax.persistence.*;
@Entity
@Table(name="user")
public class userModel{
    private int id;
    private String firstName;
    private String lastName;
    private String telNumber;

    public userModel() {

    }

    public userModel(int id, String firstName, String lastName, String telNumber){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNumber = telNumber;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber){
        this.telNumber = telNumber;
    }
}