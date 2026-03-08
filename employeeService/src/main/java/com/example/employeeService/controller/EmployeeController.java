package com.example.employeeService.controller;

import com.example.employeeService.model.Employees;
import com.example.employeeService.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private  EmployeeManager employeeManager;

    @GetMapping("/employees")
    public Employees getEmployees(){
        return employeeManager.getEmployees();
    }


}
