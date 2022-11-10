package com.bridgelabz.addressbookapp.dto;
import lombok.Data;
import lombok.ToString;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
public @ToString class PersonDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "First name Invalid")

    @NotEmpty(message = "Should Not be Empty")
    public String firstName;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Last name Invalid")

    @NotEmpty(message = "Should Not be Empty")
    public String lastName;
    @NotEmpty(message = "Should Not be Empty")
    public String address;
    public String city;

    public String state;

    public String pin;
    @Pattern(regexp = "^[0-9]{2}[\\s][0-9]{10}$",message = "Invalid Mobile Number")
    @NotEmpty(message = "Should Not be Empty")
    public String contact;
    @Pattern(regexp = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$", message = "Email is Not Valid")
    @NotEmpty(message = "Should Not be Empty")
    public String email;
    public PersonDTO(String firstName,String lastName,String address,String city,String state,String pin, String contact,String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.pin = pin;
        this.address = address;
        this.contact = contact;
        this.email = email;
    }

}
