package com.example.module309.controller;

import com.example.module309.database.dao.CustomerDAO;
import com.example.module309.database.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private CustomerDAO customerDAO;

    @GetMapping(value = { "/index", "/index123"})
    public ModelAndView index() {
        ModelAndView response = new ModelAndView("index");
        response.setViewName("index");

        List<Customer> customerFirstNames = customerDAO.findByFirstName("Alexander");
        for (Customer customer : customerFirstNames) {
//            System.out.println("Number of customers with that first name are : " + customerFirstNames.size());
//            System.out.println(customer.getCity());
        }
        response.addObject("customerFirstNames", customerFirstNames);

        return response;

    }

    @GetMapping("/courses/{courseId}/external_tools/{toolId}")
    public ModelAndView pathVariable(@PathVariable String courseId, @PathVariable String toolId) {
        ModelAndView response = new ModelAndView();

        System.out.println(courseId + " .... " + toolId);

        response.setViewName("xyz789");

        return response;
    }

}
