package epam.nadia.spring_core_4.main.task2.service.interfeces;

import epam.nadia.spring_core_4.main.task2.entity.Employee;
import epam.nadia.spring_core_4.main.task2.entity.Position;

public interface EmployeeService {

    void hire(Employee employee, Position position);
    void fire(Employee employee);
}
