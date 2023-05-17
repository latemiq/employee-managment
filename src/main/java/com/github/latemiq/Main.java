package com.github.latemiq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Employee employee1 = new Employee("John", "Doe", "Manager",  75000);
        Employee employee2 = new Employee("Jane", "Smith", "Accountant", 60000);
        Employee employee3 = new Employee("Michael", "Johnson", "Accountant", 55000);
        Employee employee4 = new Employee("Emily", "Jones", "Marketing Specialist", 50000);
        Employee employee5 = new Employee("David", "Brown", "Accountant", 45000);
        Employee employee6 = new Employee("Laura", "Taylor", "Human Resources Manager", 70000);
        Employee employee7 = new Employee("Kevin", "Wilson", "IT Specialist", 60000);
        Employee employee8 = new Employee("Samantha", "Davis", "Customer Service Representative", 40000);

        HashMap<Integer,Employee> employeeHashMap = new HashMap<>();
        EmployeeManager employeeManager = new EmployeeManager(employeeHashMap);
        employeeManager.addEmployee(employee1);
        employeeManager.addEmployee(employee2);
        employeeManager.addEmployee(employee3);
        employeeManager.addEmployee(employee4);
        employeeManager.addEmployee(employee5);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner wejscie = new Scanner(System.in);

        while (true)
        {
            System.out.println("1.Dodaj pracownika");
            System.out.println("2.Usuń pracownika");
            System.out.println("3.Zaktualizuj dane o pracowniku");
            System.out.println("4.Wyszukaj pracownika po ID");
            System.out.println("5.Wyświetl liste wszystkich pracownikow");
            System.out.println("6.Wyszukaj pracownika po nazwisku");
            System.out.println("Inna wartosc zakonczy program");
            int input = Integer.parseInt(bufferedReader.readLine());
            switch (input){
                case 1:
                    System.out.println("Podaj imię, nazwisko, pozycje oraz zarobki pracownika");
                    String imie = wejscie.nextLine();
                    String nazwisko = wejscie.nextLine();
                    String pozycja = wejscie.nextLine();
                    int zarobki = Integer.parseInt(bufferedReader.readLine());
                    Employee newemployee = new Employee(imie, nazwisko, pozycja, zarobki);
                    employeeManager.addEmployee(newemployee);
                    break;
                case 2:
                {
                    int id = Integer.parseInt(bufferedReader.readLine());
                    employeeManager.removeEmployee(employeeManager.searchEmployeeByID(id));
                    break;
                }
                case 3:
                {
//                    int id = Integer.parseInt(bufferedReader.readLine());
//                    Employee employee = employeeManager.searchEmployeeByID(id);
//                    System.out.println(employee);
                    System.out.println("Podaj id pracownika");
                    int id = Integer.parseInt(bufferedReader.readLine());
                    Employee employee = employeeManager.searchEmployeeByID(id);
                    System.out.println(employee);

                    if(employee != null) {

                        System.out.println("Podaj stanowisko oraz kwotę");
                        String position = wejscie.nextLine();

                        int salary = Integer.parseInt(bufferedReader.readLine());

                        employee.setSalary(salary);
                        employee.setPosition(position);
                        employeeManager.updateEmployee(id, employee);
//                        employee.setSalary(10000);
//                        employeeManager.updateEmployee(id,employee);
                    }

                    break;

                }
                case 4:
                {
                    System.out.println("404 - Opcja nie dostępna ");
                    break;
                }
                case 5:
                {
                    employeeManager.listAllEmployees();
                    break;
                }
                case 6:
                {
                    System.out.println("Podaj nazwisko");
                    String lastName = bufferedReader.readLine();
                    HashSet<Employee> employeeHashSet = employeeManager.searchEmployeesByLastName(lastName);
                    for (Employee employee: employeeHashSet
                    ) {
                        System.out.println(employee);
                    }
                    break;

                }
                default:
                    System.exit(0);
            }
        }
    }
}