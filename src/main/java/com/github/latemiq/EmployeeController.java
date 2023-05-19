package com.github.latemiq;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
    public class EmployeeController {

    @Autowired
    private EmployeeManager employeeManager;

    @GetMapping
    public List<Employee> listAllEmployees(){
        return employeeManager.listAllEmployees();
    }


    public Employee searchEmployeeByID(@PathVariable("id") int id) {
        return employeeManager.searchEmployeeByID(id);
    }
}
