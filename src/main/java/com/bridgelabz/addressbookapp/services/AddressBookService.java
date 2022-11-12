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
    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookRepository.findAll();
    }

    @Override
    public AddressBookData getAddressBookDataById(int personId) {
        return addressBookRepository.findById(personId)
                .orElseThrow(() ->new AddressBookException("person with id:"+personId+ "  Not Found...!!"));
    }

    @Override
    public AddressBookData createAddressBookData(PersonDTO personDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(personDTO);
        log.debug("Contact Data: "+addressBookData.toString());
        return addressBookRepository.save(addressBookData);
    }

    @Override
    public AddressBookData updateAddressBookData(int personId,PersonDTO personDTO) {
        AddressBookData addressBookData = this.getAddressBookDataById(personId);
        addressBookData.updateAddressBookData(personDTO);
        return addressBookRepository.save(addressBookData);
    }

    @Override
    public void deleteAddressBookData(int personId) {
    AddressBookData addressBookData = this.getAddressBookDataById(personId);
        addressBookRepository.delete(addressBookData);
    }

    @Override
    public List<AddressBookData> sortContactsBycity() {
        return addressBookRepository.sortByCity();
    }

    @Override
    public List<AddressBookData> sortContactsByState() {
        return addressBookRepository.sortByState();
    }
}

