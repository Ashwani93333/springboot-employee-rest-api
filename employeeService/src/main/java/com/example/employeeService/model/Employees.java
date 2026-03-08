package com.example.employeeService.model;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class Employees {

    private List<Employee> employees;

    // CONSTRUCTORS
    public Employees() {};

    public Employees(List<Employee> employees) {
        this.employees = employees;
    }

    //GETTER
    public List<Employee> getEmployees() {
        return  employees;
    }

    //SETTER
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

//    //ADD EMPLOYEE
//    public void addEmployee(@RequestBody Employee employee){
//        employees.add(employee);
//    }
}
