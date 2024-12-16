package com.example.module309.controller;

import com.example.module309.database.dao.EmployeeDAO;
import com.example.module309.database.entity.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeDAO employeeDAO;

    @GetMapping("/employee/search")
    public ModelAndView getEmployee(@RequestParam(required = false) Integer id) {
        ModelAndView modelAndView = new ModelAndView("employee");
        modelAndView.setViewName("employee/search");
        if(id != null) {
            Employee employee = employeeDAO.getEmployeeById(id);
            modelAndView.addObject("employee", employee);
            System.out.println(employee.toString());
        }

        return modelAndView;
    }
}
