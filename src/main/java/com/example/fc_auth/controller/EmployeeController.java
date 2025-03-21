package com.example.fc_auth.controller;

import com.example.fc_auth.model.Employee;
import com.example.fc_auth.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> listAll() {

        List<Employee> employeeList = employeeService.listEmployee();
        return employeeList;
    }
}
