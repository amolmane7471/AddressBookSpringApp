package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.PersonDTO;
import lombok.Data;

@Data
public class AddressBookData {
    private int personId;
    private String name;
    private String email;
    private String address;
    private String contact;

    public AddressBookData(int personId, PersonDTO personDTO) {

    }


}
