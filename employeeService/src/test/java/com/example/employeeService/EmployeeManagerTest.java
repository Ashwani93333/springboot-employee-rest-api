package com.example.employeeService;

import static org.junit.jupiter.api.Assertions.*;

import com.example.employeeService.model.Employee;
import com.example.employeeService.service.EmployeeManager;
import org.junit.jupiter.api.Test;


public class EmployeeManagerTest {

    @Test
    public void testAddEmployee() {

        EmployeeManager manager = new EmployeeManager();

        Employee emp = new Employee();
        emp.setEmployee_id("E100");
        emp.setFirst_name("Test");
        emp.setLast_name("User");
        emp.setEmail("test@test.com");
        emp.setTitle("Developer");

        manager.addEmployee(emp);

        assertNotNull(manager.getEmployees());
        assertTrue(manager.getEmployees().getEmployees().size() > 0);
    }
}