package com.bridgelabz.addressbookapp.controller;
import com.bridgelabz.addressbookapp.dto.PersonDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1,new PersonDTO("Amol", "amol123@gmail.com","xyz","9898784545"));
        ResponseDTO respDTO = new ResponseDTO("Get Call Success",addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    /**
     * Displaying AddressBook data by id using get method
     */
    @GetMapping("/get/{personId}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("personId") int personId) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, new PersonDTO("Amol", "amol123@gmail.com","xyz","9898784545"));
        ResponseDTO respDTO = new ResponseDTO("Get Call Success",addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    /**
     * Creating employee data using Body by Post mapping
     */
    @PostMapping(path = "/create")
    public ResponseEntity<ResponseDTO> addAddressBookDAta(@RequestBody PersonDTO personDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, personDTO);
        ResponseDTO respDTO = new ResponseDTO("Created AddressBook Data Successfully!", personDTO);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    /**
     * Updating AddressBook data using path variable and request body by put method
     */
    @PutMapping(path = "/update/{personId}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("personId") int personId,
                                                                 @RequestBody PersonDTO personDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(personId, personDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated AddressBook Data Successfully! ", personDTO);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    /**
     * Deleting employee data using path variable by delete method
     */
    @DeleteMapping("/delete/{personId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("personId") int personId) {
        ResponseDTO respDTO = new ResponseDTO("Delete AddressBook Data Successfully! ", personId);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
}
