package com.bridgelabz.addressbookapp.services;

import com.bridgelabz.addressbookapp.dto.PersonDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getAddressBookData();

    AddressBookData getAddressBookDataById(int personId);

    AddressBookData createAddressBookData(PersonDTO personDTO);

    AddressBookData updateAddressBookData(int personId,PersonDTO personDTO);

    void deleteAddressBookData(int personId);
    List<AddressBookData> sortContactsBycity();

    List<AddressBookData> sortContactsByState();
}
