package com.epam.nadia.spring_core_1.entity;

public class Position {

    private Salary salary;

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Position{");
        sb.append("salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
