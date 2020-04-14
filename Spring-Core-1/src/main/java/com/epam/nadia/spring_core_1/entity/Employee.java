package com.epam.nadia.spring_core_1.entity;

public class Employee {

    private String name;
    private Position position;

    public Employee(){}

    public Employee(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
