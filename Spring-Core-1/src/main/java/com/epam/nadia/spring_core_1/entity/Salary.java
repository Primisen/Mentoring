package com.epam.nadia.spring_core_1.entity;

public class Salary {

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Salary{");
        sb.append("salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
