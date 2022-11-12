package com.bridgelabz.addressbookapp.dto;
import lombok.Data;
import lombok.ToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public @ToString class PersonDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "First name Invalid")
    @NotNull(message = "Should Not be Empty")
    public String firstName;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Last name Invalid")
    @NotNull(message = "Should Not be Empty")
    public String lastName;
    @NotNull(message = "Should Not be Empty")
    public String address;
    @NotNull(message = "Should Not be Empty")
    public String city;
    @NotNull(message = "Should Not be Empty")
    public String state;
    @Pattern(regexp = "^[0-9]{6}$",message = "Pin must be 6 digit")
    @NotNull(message = "Should Not be Empty")
    public String pin;
    @Pattern(regexp = "^[0-9]{2}[\\s][0-9]{10}$",message = "Invalid Mobile Number")
    @NotNull(message = "Should Not be Empty")
    public String contact;
    @Pattern(regexp = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$", message = "Email is Not Valid")
    @NotNull(message = "Should Not be Empty")
    public String email;

}
