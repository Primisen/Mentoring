package com.epam.nadia.spring_core_1.entity;

public class Salary {

    private double salary;

    public Salary(){}

    public Salary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
