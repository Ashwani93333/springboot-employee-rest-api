package com.example.employeeService.model;

import lombok.Getter;

public class Employee {
    @Getter
    private String employee_id;
    @Getter
    private String first_name;
    @Getter
    private String last_name;
    @Getter
    private String email;
    @Getter
    private String title;

    public Employee(String employee_id, String first_name, String last_name,String email, String title) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.title = title;
    }


}
