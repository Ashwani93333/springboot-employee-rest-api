package com.example.employeeService.controller;

import com.example.employeeService.model.Employee;
import com.example.employeeService.model.Employees;
import com.example.employeeService.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private  EmployeeManager employeeManager;

    @GetMapping("/employees")
    public Employees getEmployees(){
        return employeeManager.getEmployees();
    }

    //Java object mapping (Jackson)
    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee){
        // ADD TO employeeList
        employeeManager.addEmployee(employee);
    }


}
