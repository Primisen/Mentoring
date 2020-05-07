package com.epam.nadia.spring_core_1.entity;

public class Employee {

    private String name;
    private Position position;

    public Employee() {
    }

    public Employee(String name, String skill, int skillLevel) {
        this.name = name;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", position=").append(position);
        sb.append('}');
        return sb.toString();
    }
}
