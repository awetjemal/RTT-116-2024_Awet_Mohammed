package com.example.module309.controller;

import com.example.module309.database.dao.CustomerDAO;
import com.example.module309.database.dao.EmployeeDAO;
import com.example.module309.database.entity.Customer;
import com.example.module309.form.CreateCustomerFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerDAO customerDAO;
    @Autowired
    private EmployeeDAO employeeDAO;

    @GetMapping("/customer/search")
    public ModelAndView search(@RequestParam(required = false) String firstName) {
        ModelAndView response = new ModelAndView("customer");
        response.setViewName("customer/search");
        if(firstName != null) {
            List<Customer> customerList = customerDAO.findByFirstName(firstName);
            response.addObject("customerList", customerList);

        }
        return response;
    }

    @GetMapping("/customer/create")
    public ModelAndView createCustomer() {
        ModelAndView response = new ModelAndView("customer/create");

//        System.out.println(": :::" ;
        return response;
    }
    @GetMapping("/customer/createCustomer")
    public ModelAndView createCustomerSubmit(CreateCustomerFormBean form) {
        // this is called when the user clicks the submit button on the form
        ModelAndView response = new ModelAndView();

        response.setViewName("customer/create");

        System.out.println(form);

        Customer customer = new Customer();
        customer.setCustomerName(form.getCompanyName());
        customer.setContactFirstname(form.getFirstName());
        customer.setContactLastname(form.getLastName());
        customer.setPhone(form.getPhone());
        customer.setAddressLine1(form.getAddressLine1());
        customer.setCity(form.getCity());
        customer.setCountry(form.getCountry());

        customer.setEmployee(employeeDAO.getEmployeeById(1056));

        customerDAO.save(customer);


        return response;
    }
}
