package com.example.module309.form;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreateCustomerFormBean {
    private String companyName;
    private String firstName;
    private String lastName;
    private String phone;
    private String addressLine1;
    private String city;
    private String country;
}
