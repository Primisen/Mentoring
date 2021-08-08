package com.epam.nadia.files.task1.entity;

import java.io.Serializable;

public class Position implements Serializable {

    private static final long serialVersionUID = 9875456764353465L;

    private String name;
    private Salary salary;

    public Position(){}

    public Position(String name, Salary salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Position{");
        sb.append("name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
