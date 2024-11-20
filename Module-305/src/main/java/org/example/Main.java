package org.example;

import org.example.database.dao.EmployeeDAO;
import org.example.database.entity.Employee;

public class Main {
    static EmployeeDAO employeeDAO = new EmployeeDAO();
    public static void main(String[] args) {
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
    }
}