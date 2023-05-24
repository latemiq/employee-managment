package com.github.latemiq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class EmployeeManager {

        private final static HashMap<Integer,Employee> employees = new HashMap<>();

        // TODO: TO remove after testing
        static {
            Employee employee1 = new Employee("Adam", "Nawalka", "Manager", 50000);
            Employee employee2 = new Employee("Robert", "Kowalski", "Manager", 10000);
            Employee employee3 = new Employee("Krzysztof", "Nowak", "Manager", 20000);
            Employee employee4 = new Employee("Michal", "Szczepanik", "Manager", 30000);

            employees.put(employee1.getEmployeeID(), employee1);
            employees.put(employee2.getEmployeeID(), employee2);
            employees.put(employee3.getEmployeeID(), employee3);
            employees.put(employee4.getEmployeeID(), employee4);
        }

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
    public List<Employee> listAllEmployees(){
        ArrayList<Employee> employeeList = new ArrayList<>(employees.values());
        return employeeList;
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
