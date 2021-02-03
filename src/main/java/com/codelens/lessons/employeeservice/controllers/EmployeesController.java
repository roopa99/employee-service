package com.codelens.lessons.employeeservice.controllers;

import com.codelens.lessons.employeeservice.dto.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class EmployeesController {
    private static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee("Eric", "K", 24));
        employeeList.add(new Employee("Joe", "Biden", 56));
        employeeList.add(new Employee("Jane", "Kio", 24));
        employeeList.add(new Employee("Eva", "L", 24));
    }

    @GetMapping(path = "/", produces = "application/json")
    public List<Employee> getEmployees() {
        return employeeList;
    }
}
