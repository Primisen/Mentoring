package com.epam.nadia.spring_core_1.entity;

public class Position {

    private Salary salary;
    private int numberOfWorkDays;
    private double ante;
    private int level;

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public int getNumberOfWorkDays() {
        return numberOfWorkDays;
    }

    public void setNumberOfWorkDays(int numberOfWorkDays) {
        this.numberOfWorkDays = numberOfWorkDays;
    }

    public double getAnte() {
        return ante;
    }

    public void setAnte(double ante) {
        this.ante = ante;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Position{");
        sb.append("salary=").append(salary);
        sb.append(", numberOfWorkDays=").append(numberOfWorkDays);
        sb.append(", ante=").append(ante);
        sb.append(", level=").append(level);
        sb.append('}');
        return sb.toString();
    }
}
