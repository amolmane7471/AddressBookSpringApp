package com.bridgelabz.addressbookapp.services;

import com.bridgelabz.addressbookapp.dto.PersonDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    @Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData> addressBookDataList = new ArrayList<>();
        addressBookDataList.add(new AddressBookData(1, new PersonDTO("Rohit", "rohit11@gmail.com","Gandhi Nagar", "7845454544")));
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int personId) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, new PersonDTO("Rohit", "rohit11@gmail.com","Gandhi Nagar", "7845454544"));
        return addressBookData;
    }

    @Override
    public AddressBookData createAddressBookData(PersonDTO personDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, personDTO);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(PersonDTO personDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, personDTO);
        return addressBookData;
    }

    @Override
    public void deleteAddressBookData(int personId) {

    }
}

