package org.example.database.dao;

import org.example.database.entity.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class EmployeeDAOTest {
    private EmployeeDAO employeeDAO = new EmployeeDAO();
    @Test
    public void findEmployeeById() {
        int employeeId = 3;
        Employee employee = employeeDAO.findById(3);
        Assert.assertNotNull(employee);
        Assertions.assertEquals("Larson", employee.getLastname());
    }
    @Test
    public void findEmployeeByFirstname() {
        String fName = "Leslie";
        List<Employee> empList = employeeDAO.findByFirstName(fName);
        Assertions.assertEquals(empList.size(), 2);
    }
    @Test
    public void createEmployee() {
        Employee employee = new Employee();
        employee.setFirstname("awet");
        employee.setLastname("jemal");
        employee.setEmail("aaa@gmail.com");
        employee.setExtension("x3434");
        employee.setOfficeId(4);
        employee.setReportsTo(1143);
        employee.setJobTitle("Sales Rep");
        employee.setVacationHours(50);
        employeeDAO.create(employee);

        //Employee actualEmployee = employeeDAO.findByFirstName("awet");
        Assertions.assertEquals(employee.getFirstname(), "awet");

    }
}
