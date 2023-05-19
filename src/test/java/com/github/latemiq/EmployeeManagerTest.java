package com.github.latemiq;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeManagerTest {

    @Test
    void addEmployee() {
        EmployeeManager employeeManager = new EmployeeManager();
        int before = employeeManager.size();

        Employee employee = new Employee("John", "Nowak", "Marketing", 30000);
        employeeManager.addEmployee(employee);

        int after = employeeManager.size();
        Assert.assertEquals(before + 1, after);
    }

    @Test
    void removeEmployee() {
    }

    @Test
    void updateEmployee() {
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