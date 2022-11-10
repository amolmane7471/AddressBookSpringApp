package com.bridgelabz.addressbookapp.dto;
import lombok.Data;
import lombok.ToString;
import javax.validation.constraints.NotEmpty;

@Data
@ToString
public class PersonDTO {

    @NotEmpty(message = "Should Not be Empty")
    public String firstName;

    @NotEmpty(message = "Should Not be Empty")
    public String lastName;

    @NotEmpty(message = "Should Not be Empty")
    public String email;
    @NotEmpty(message = "Should Not be Empty")
    public String address;
    @NotEmpty(message = "Should Not be Empty")
    public String contact;
    public PersonDTO(String firstName,String lastName, String email, String address, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.contact = contact;
    }

}
