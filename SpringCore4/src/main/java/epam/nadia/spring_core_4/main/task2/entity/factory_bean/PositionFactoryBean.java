package epam.nadia.spring_core_4.main.task2.entity.factory_bean;

import epam.nadia.spring_core_4.main.task2.entity.Position;
import epam.nadia.spring_core_4.main.task2.entity.Salary;
import org.springframework.beans.factory.FactoryBean;

public class PositionFactoryBean implements FactoryBean<Position> {

    private Salary salary;

    @Override
    public Position getObject() throws Exception {
        return new Position(salary);
    }

    @Override
    public Class<?> getObjectType() {
        return Position.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
}
