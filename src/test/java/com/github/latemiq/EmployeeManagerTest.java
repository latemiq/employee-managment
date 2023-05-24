package com.github.latemiq;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeManagerTest {


    @Test
    void addEmployee() {
        EmployeeManager employeeManager = new EmployeeManager();
        Employee employee = new Employee("John", "Nowak", "Marketing", 30000);
        int before = employeeManager.size();

        employeeManager.addEmployee(employee);

        int after = employeeManager.size();
        Assert.assertEquals(before + 1, after);
    }

    @Test
    void removeEmployee() {
        EmployeeManager employeeManager = new EmployeeManager();
        Employee employee = new Employee("John", "Nowak", "Marketing", 30000);


        int before = employeeManager.size();

        employeeManager.removeEmployee(employee);

        int after = employeeManager.size();
        Assert.assertEquals(before - 1, after);
    }

    @Test
    void searchEmployeeByID() {

    }

    @Test
    void listAllEmployees() {
    }

    @Test
    void searchEmployeesByLastName() {
    }
}