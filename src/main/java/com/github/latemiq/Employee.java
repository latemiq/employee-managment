package com.github.latemiq;

public class Employee {
    private static int AID = 1;
    private String firstName;
    private String lastName;
    private String position;

    private int employeeID;
    private int salary;

    public Employee(String firstName, String lastName, String position, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.employeeID = AID;
        this.salary = salary;
        AID++;
    }

    public String getPosition() {
        return position;
    }

    public int getEmployeeID() {
        return employeeID;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                '}';
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Object getLastName() {
        return lastName;
    }
}


