package com.example.springapp.service;

import com.example.springapp.model.Employee;
import com.example.springapp.repository.EmployeeRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiService {
   
    @Autowired
   public EmployeeRepo employeeRepo;

    // Create a new employee
    public boolean createEmployee(Employee employee){
        return employeeRepo.save(employee) !=null?true:false;
    }

    // Retrieve all employees
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }
   
}
