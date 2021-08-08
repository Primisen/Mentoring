package epam.nadia.spring_core_4.main.task2.entity;

import java.util.Random;

public class Salary {

    private double salary;

    public Salary(){
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
