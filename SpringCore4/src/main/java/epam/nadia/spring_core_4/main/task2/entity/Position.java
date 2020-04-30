package epam.nadia.spring_core_4.main.task2.entity;

import java.util.HashSet;
import java.util.Set;

public class Position {

    private Salary salary;
    private Set<Skill> skills;

    public Position(){
        skills = new HashSet<>();
    }

    public Position(Salary salary){
        this();
        this.salary = salary;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public void addSkill(Skill skill){
        skills.add(skill);
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Position{");
        sb.append("salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
