package com.epam.nadia.spring_core_1.entity;

public class Employee {

    private String name;
    private Position position;
    private String skill;
    private int skillLevel;

    public Employee() {
    }

    public Employee(String name, String skill, int skillLevel) {
        this.name = name;
        this.skill = skill;
        this.skillLevel = skillLevel;
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

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

}
