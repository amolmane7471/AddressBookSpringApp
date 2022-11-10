package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.PersonDTO;


public class AddressBookData {
    private int personId;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String contact;

    public AddressBookData(){ }
    public AddressBookData(int personId, PersonDTO personDTO) {
    this.personId = personId;
    this.firstName = personDTO.firstName;
    this.lastName = personDTO.lastName;
    this.email = personDTO.email;
    this.address = personDTO.address;
    this.contact = personDTO.contact;

    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
