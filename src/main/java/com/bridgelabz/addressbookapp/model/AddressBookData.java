package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.PersonDTO;


public class AddressBookData {
    private int personId;
    private String name;
    private String email;
    private String address;
    private String contact;

    public AddressBookData(){ }
    public AddressBookData(int personId, PersonDTO personDTO) {
    this.personId = personId;
    this.name = personDTO.name;
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
