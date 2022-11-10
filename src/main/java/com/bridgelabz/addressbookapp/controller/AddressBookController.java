package com.bridgelabz.addressbookapp.controller;
import com.bridgelabz.addressbookapp.dto.PersonDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.services.IAddressBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @Autowired
    private IAddressBookService addressBookService;

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        List<AddressBookData> addressBookDataList = addressBookService.getAddressBookData();
        ResponseDTO respDTO = new ResponseDTO("Get Call Success",addressBookDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    /**
     * Displaying AddressBook data by id using get method
     */
    @GetMapping("/get/{personId}")
    public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable("personId") int personId) {
        AddressBookData addressBookData = null;
        addressBookData = addressBookService.getAddressBookDataById(personId);
        ResponseDTO respDTO = new ResponseDTO("Get Call for ID Successful",addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    /**
     * Creating addressbook data using Body by Post mapping
     */
    @PostMapping(path = "/create")
    public ResponseEntity<ResponseDTO> createAddressBookDAta(@Valid @RequestBody PersonDTO personDTO) {
       log.debug("person DTO: "+personDTO.toString());
        AddressBookData addressBookData = null;
        addressBookData = addressBookService.createAddressBookData(personDTO);
        ResponseDTO respDTO = new ResponseDTO("Created AddressBook Data Successfully!", addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    /**
     * Updating AddressBook data using path variable and request body by put method
     */
    @PutMapping(path = "/update/{personId}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("personId") int personId,
                                                              @Valid  @RequestBody PersonDTO personDTO) {
        AddressBookData addressBookData = null;
        addressBookData = addressBookService.updateAddressBookData(personId,personDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated AddressBook Data Successfully! ", addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    /**
     * Deleting AddressBook data using path variable by delete method
     */
    @DeleteMapping("/delete/{personId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("personId") int personId) {
        addressBookService.deleteAddressBookData(personId);
        ResponseDTO respDTO = new ResponseDTO("Delete AddressBook Data Successfully! ","deleted ID: "+personId);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
}
