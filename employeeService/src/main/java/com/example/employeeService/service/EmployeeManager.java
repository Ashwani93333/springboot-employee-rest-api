package com.example.employeeService.service;
import com.example.employeeService.model.Employee;
import com.example.employeeService.model.Employees;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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
        employeeList.add(new Employee("100","Punnet", "pal","puneet@gmail.com", "GADARIYAA"));
        employees.setEmployees(employeeList);
    }

    public Employees getEmployees(){
        return employees;
    }

    public  void addEmployee(Employee employee){
        //GETTING LIST OF EMPLOYEES
         List<Employee> employeesList = employees.getEmployees();
         //ADD
         employeesList.add(employee);
    }




}
