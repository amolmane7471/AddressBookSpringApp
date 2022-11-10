package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.PersonDTO;
import lombok.Data;


public @Data class AddressBookData {
    private int personId;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String pin;
    private String contact;
    private String email;

    public AddressBookData(){ }
    public AddressBookData(int personId, PersonDTO personDTO) {
    this.personId = personId;
    this.firstName = personDTO.firstName;
    this.lastName = personDTO.lastName;
    this.city = personDTO.city;
    this.state = personDTO.state;
    this.pin = personDTO.pin;
    this.address = personDTO.address;
    this.contact = personDTO.contact;
    this.email = personDTO.email;
    }
}
