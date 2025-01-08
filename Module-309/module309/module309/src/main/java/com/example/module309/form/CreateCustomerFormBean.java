package com.example.module309.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@ToString
public class CreateCustomerFormBean {

    private Integer customerId;

    @NotEmpty(message = "Company name is required")
//    @Pattern(regexp = "[A-Za-z0-9\\s]+", message = "company name can only contain letters and numbers")
    @Length(max = 50, min = 2, message = "Company name must be less than 50 characters")
    private String companyName;

    @NotEmpty(message = "First name is required")
    @Length(max = 50, message = "First name must be less than 50 characters")
    private String firstName;

    @NotEmpty(message = "Last name is required")
    @Length(max = 50, message = "Last name must be less than 50 characters")
    private String lastName;

    @NotEmpty(message = "phone number is required")
    @Length(max = 50, message = "Phone must be less than 50 characters")
    private String phone;

    @NotEmpty(message = "Address line 1 is required")
    @Length(max = 50, message = "Address Line 1 must be less than 50 characters")
    private String addressLine1;

    @NotEmpty(message = "City is required")
    @Length(max = 50, message = "City name must be less than 50 characters")
    private String city;

    @NotEmpty(message = "Country name is required")
    @Length(max = 50, message = "Country must be less than 50 characters")
    private String country;

    private MultipartFile upload;

    private Integer employeeId;

}
