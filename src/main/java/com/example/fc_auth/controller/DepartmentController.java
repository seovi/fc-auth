package com.example.fc_auth.controller;

import com.example.fc_auth.model.Department;
import com.example.fc_auth.model.Employee;
import com.example.fc_auth.service.DepartmentService;
import com.example.fc_auth.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;

    @GetMapping(value = "/department",
    produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Department>> listAll() {

        List<Department> departmentList = departmentService.listDepartment();
        return new ResponseEntity<>(departmentList, HttpStatus.OK);
    }
}
