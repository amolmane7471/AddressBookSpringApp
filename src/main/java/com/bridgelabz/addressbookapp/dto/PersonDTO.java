package com.bridgelabz.addressbookapp.dto;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PersonDTO {

    public String Name;
    public String email;
    public String address;
    public long contact;

}
