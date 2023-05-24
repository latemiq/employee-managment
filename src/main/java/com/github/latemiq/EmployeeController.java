package com.github.latemiq;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
    public class EmployeeController {

    @Autowired
    private EmployeeManager employeeManager;

    @GetMapping
    public String listAllEmployees(Model model){
        List<Employee> employees = employeeManager.listAllEmployees();
        model.addAttribute("employees", employees);
        return "hello-world";
    }


    public Employee searchEmployeeByID(@PathVariable("id") int id) {
        return employeeManager.searchEmployeeByID(id);
    }
    @PostMapping
    public void addEmployee(@RequestBody Employee employee){
         employeeManager.addEmployee(employee);
    }


}
