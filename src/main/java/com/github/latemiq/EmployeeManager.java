package com.github.latemiq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class EmployeeManager {
        private final HashMap<Integer,Employee> employees = new HashMap<>();

        public int size() {
            return employees.size();
        }
        public void clear() {
            employees.clear();
        }

        public  void addEmployee(Employee employee){
            Integer keyEmployee = employee.getEmployeeID();
            employees.put(keyEmployee,employee);
        }
        public void removeEmployee(Employee employee){
            if(employees.containsKey(employee.getEmployeeID()))
                employees.remove(employee.getEmployeeID());
            else
                System.out.println("Pracownik o takim ID nie istnieje");
        }
        public void updateEmployee(int employeeID, Employee newEmployee){
            if(employees.containsKey(employeeID))
            {
                employees.put(employeeID,newEmployee);
            }
            else
                System.out.println("Pracownik o takim ID nie istnieje");
        }
        public Employee searchEmployeeByID(int employeeID) {
            if(employees.containsKey(employeeID)){
                return employees.get(employeeID);
            }
            else
                System.out.println("Nie znaleziono pracownika o danym ID");
            return null;
        }
    public void listAllEmployees(){
        ArrayList<Employee> employeeList = new ArrayList<>(employees.values());
        for (Employee employee: employeeList
        ) {
            System.out.println(employee);
        }
    }
//    public HashSet<Employee> searchEmployeesByLastName(String lastName){
//        HashSet<Employee> employeeList = new HashSet<>(employees.values());
//        Iterator<Employee> employeeIterator = employeeList.iterator();
//        while(employeeIterator.hasNext())
//        {
//            Employee employee = employeeIterator.next();
//            if(!employee.getPosition().equals(lastName))
//                employeeIterator.remove();
//        }
//        return employeeList;
//    }
public HashSet<Employee> searchEmployeesByLastName(String lastName) {
    HashSet<Employee> matchingEmployees = new HashSet<>();
    for (Employee employee : employees.values()) {
        if (employee.getLastName().equals(lastName)) {
            matchingEmployees.add(employee);
        }
    }
    return matchingEmployees;
}
    }
