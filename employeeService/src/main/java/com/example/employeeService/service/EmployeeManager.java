package com.example.employeeService.service;
import com.example.employeeService.model.Employee;
import com.example.employeeService.model.Employees;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeManager {

    // BUSINESS LOGIC
    public static Employees employees = new Employees();

    static {
        List<Employee> employeeList = new ArrayList<>();

        //Adding HardCode EMPLOYEES
        employeeList.add(new Employee("7382","Ashwani", "Rajput","aadeshi@gmail.com", "RAJPUTANA"));
        employeeList.add(new Employee("7382","Ashwani", "Rajput","aadeshi@gmail.com", "RAJPUTANA"));
        employeeList.add(new Employee("7382","Ashwani", "Rajput","aadeshi@gmail.com", "RAJPUTANA"));
        employeeList.add(new Employee("1","John","Doe","john.doe@email.com","Software Engineer"));
        employeeList.add(new Employee("2","Jane","Smith","jane.smith@email.com","Product Manager"));
        employeeList.add(new Employee("3","Michael","Brown","michael.brown@email.com","DevOps Engineer"));
        employeeList.add(new Employee("4","Emma","Wilson","emma.wilson@email.com","QA Engineer"));

        employees.setEmployees(employeeList);
    }
    public Employees getEmployees(){
        return employees;
    }


}
