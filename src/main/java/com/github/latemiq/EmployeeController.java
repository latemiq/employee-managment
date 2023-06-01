package com.github.latemiq;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import java.util.Arrays;
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

//    @GetMapping("/register")
//    public String showForm(Model model) {
//        Employee employee = new Employee();
//        model.addAttribute("employee", employee);
//
//        return "/register";
//    }
    @GetMapping("/add")
    public String addEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "add-employee";
    }

    @GetMapping("/edit")
    public String editEmployee(@PathVariable("id") int id, Model model){
            List<Employee> employee = employeeManager.updateEmployee();
            model.addAttribute("employee", employee);
            return "edit-emploee";
    }

}
