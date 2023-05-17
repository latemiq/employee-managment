package com.github.latemiq;

public class employee {
    private String firstName;
    private String lastName;
    private String position;
    private int employeeID;
    private int salary;

    public employee(String firstName, String lastName, String position, int employeeID, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.employeeID = employeeID;
        this.salary = salary;
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
}


