package com.bridgelabz.addressbookapp.services;

import com.bridgelabz.addressbookapp.dto.PersonDTO;
import com.bridgelabz.addressbookapp.exceptions.AddressBookException;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {
    @Autowired
    private AddressBookRepository addressBookRepository;
    private  List<AddressBookData> addressBookDataList = new ArrayList<>();
    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int personId) {
        return addressBookDataList.stream()
                .filter(addressBookData -> addressBookData.getPersonId() == personId)
                .findFirst().orElseThrow(() ->new AddressBookException("Person Not Found"));
    }

    @Override
    public AddressBookData createAddressBookData(PersonDTO personDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(addressBookDataList.size()+1, personDTO);
        addressBookDataList.add(addressBookData);
        return addressBookRepository.save(addressBookData);
    }

    @Override
    public AddressBookData updateAddressBookData(int personId,PersonDTO personDTO) {
        AddressBookData addressBookData = this.getAddressBookDataById(personId);
        addressBookData.setFirstName(personDTO.firstName);
        addressBookData.setLastName(personDTO.lastName);
        addressBookData.setEmail(personDTO.email);
        addressBookData.setAddress(personDTO.address);
        addressBookData.setContact(personDTO.contact);
        return addressBookData;
    }

    @Override
    public void deleteAddressBookData(int personId) {
        addressBookDataList.remove(personId-1);
    }
}

