package com.bootcamphw.hw01;

public class Employee extends Person {
    private int employeeId;
    private double monthlySalary;

    public Employee(int employeeId, String firstName, String lastName,double monthlySalary) {
        super(firstName, lastName);
        this.employeeId= employeeId;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String getFullName() {
        return firstName + ", " + lastName;
    }

    @Override
    public String getGreeting() {
        return "Merhaba";
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
