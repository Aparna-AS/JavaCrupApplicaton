package com.crudapplication.emproject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EmpController {
    //List<Employee> employees = new ArrayList<>();
    @Autowired
    EmployeeService employeeService = new EmployeeServiceImpl();
     @GetMapping("employees")
    public List<Employee> getAllEmployees(){

        return employeeService.readEmployees();
    }

    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
        
        employeeService.createEmployee(employee);
        return "save successfully";
    }
    
}
