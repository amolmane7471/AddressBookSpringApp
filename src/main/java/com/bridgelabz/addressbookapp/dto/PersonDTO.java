package com.bridgelabz.addressbookapp.dto;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PersonDTO {

    public String name;
    public String email;
    public String address;
    public String contact;
    public PersonDTO(String name, String email, String address, String contact) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.contact = contact;
    }

}
