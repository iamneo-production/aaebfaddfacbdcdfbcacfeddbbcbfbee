package com.example.springapp.controller;

import com.example.springapp.model.Employee;
import com.example.springapp.service.ApiService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    public ApiService apiService;

     @PostMapping("/employees")
    public boolean createEmployee(@RequestBody Employee employee) {
        return apiService.createEmployee(employee);
    }
    
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return apiService.getAllEmployees();
    }

    
}
