package com.example.module309.controller;

import com.example.module309.database.dao.CustomerDAO;
import com.example.module309.database.dao.EmployeeDAO;
import com.example.module309.database.entity.Customer;
import com.example.module309.database.entity.Employee;
import com.example.module309.form.CreateCustomerFormBean;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

@Slf4j
@Controller
public class CustomerController {
//    private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerDAO customerDAO;
    @Autowired
    private EmployeeDAO employeeDAO;

    @GetMapping("/customer/ajaxExample")
    public ModelAndView ajaxExample() {
        ModelAndView modelAndView = new ModelAndView("ajaxExample");
            modelAndView.setViewName("customer/ajaxExample");
        return modelAndView;
    }

    @GetMapping("/customer/search")
    public ModelAndView search(@RequestParam(required = false) String firstName) {
//        int x = 10/ 0;
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
        ModelAndView response = new ModelAndView();
        List<Employee> employees = employeeDAO.findAllEmployees();
        response.addObject("employeesKey", employees);

        log.debug("employeesKey: " + employees);
        log.info("employeesKey: " + employees);

        return response;
    }
    @PostMapping("/customer/createCustomer")
    public ModelAndView createCustomerSubmit(@Valid CreateCustomerFormBean form, BindingResult bindingResult) throws IOException {
        // this is called when the user clicks the submit button on the form
        ModelAndView response = new ModelAndView();

        List<Employee> employees = employeeDAO.findAllEmployees();
        response.addObject("employeesKey", employees);


        if (bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                log.debug(error.toString());
            }
            response.setViewName("customer/create");
            response.addObject("bindingResult", bindingResult);
            response.addObject("form", form);
        }else{
            Customer customer = customerDAO.findById(form.getCustomerId());
            if ( customer == null ) {
                customer = new Customer();
            }
            customer.setCustomerName(form.getCompanyName());
            customer.setContactFirstname(form.getFirstName());
            customer.setContactLastname(form.getLastName());
            customer.setPhone(form.getPhone());
            customer.setAddressLine1(form.getAddressLine1());
            customer.setCity(form.getCity());
            customer.setCountry(form.getCountry());

            // here we are going to deal with saving the upload file to the disk
            log.debug("uploaded filename = " + form.getUpload().getOriginalFilename() + " size = " + form.getUpload().getSize());
            // create a new file object that represents the location to save the upload to
            // we know that intellij always assumes the current working directory is the root of the project so we are making
            // a relative URL To the images folder within our project
            String pathToSave = "./src/main/webapp/pub/images/" + form.getUpload().getOriginalFilename()  ;

            // this is a java utility that will read the file from the upload and write it to the file we created above
            // will not take the entire file into memory
            Files.copy(form.getUpload().getInputStream(),  Paths.get(pathToSave), StandardCopyOption.REPLACE_EXISTING);

            // this is the url that we will use to display the image in the browser
            // it is an absolute URL based on the webapp folder as it would be used in the html
            String url = "/pub/images/" + form.getUpload().getOriginalFilename();
            customer.setImageUrl(url);

            customer.setEmployee(employeeDAO.getEmployeeById(form.getEmployeeId()));

            customerDAO.save(customer);

            response.setViewName("redirect:/customer/edit/" + customer.getId());

        }



        return response;
    }
    @GetMapping("/customer/edit/{customerId}")
    public ModelAndView editCustomer(@PathVariable Integer customerId) {
        ModelAndView response = new ModelAndView();
        response.setViewName("customer/create");


        Customer customer = customerDAO.findById(customerId);
        log.info("----" + customer.toString());
        CreateCustomerFormBean form = new CreateCustomerFormBean();

        form.setCustomerId(customer.getId());
        form.setCompanyName(customer.getCustomerName());
        form.setFirstName(customer.getContactFirstname());
        form.setLastName(customer.getContactLastname());
        form.setPhone(customer.getPhone());
        form.setAddressLine1(customer.getAddressLine1());
        form.setCity(customer.getCity());
        form.setCountry(customer.getCountry());
        form.setEmployeeId((customer.getSalesRepEmployeeId()));

        List<Employee> employees = employeeDAO.findAllEmployees();
        response.addObject("employeesKey", employees);

        response.addObject("form", form);
        return response;
    }
}
