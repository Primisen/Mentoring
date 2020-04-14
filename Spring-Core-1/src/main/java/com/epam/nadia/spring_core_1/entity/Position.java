package com.epam.nadia.spring_core_1.entity;

public class Position {

    private Salary salary;

    public Position() {
    }

    public Position(Salary salary) {
        this.salary = salary;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
}
