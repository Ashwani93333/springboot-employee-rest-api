package com.example.employeeService.model;

import lombok.Getter;
import lombok.Setter;

public class Employee {
    @Getter
    @Setter
    private String employee_id;
    @Getter
    @Setter
    private String first_name;
    @Getter
    @Setter
    private String last_name;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String title;

    public Employee() {};

    public Employee(String employee_id, String first_name, String last_name,String email, String title) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.title = title;
    }


}
