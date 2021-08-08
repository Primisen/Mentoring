package com.epam.nadia.files.task1.entity;

import java.io.Serializable;

public class Salary implements Serializable {

    private static final long serialVersionUID = 3423677565345322423L;
    transient private double salary;

    public Salary(){}

    public Salary(double salary){
        this.salary = salary;
    }

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
