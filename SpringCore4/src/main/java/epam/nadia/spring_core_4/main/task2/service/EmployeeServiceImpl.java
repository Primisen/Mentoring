package epam.nadia.spring_core_4.main.task2.service;

import epam.nadia.spring_core_4.main.task2.entity.Employee;
import epam.nadia.spring_core_4.main.task2.entity.Position;
import epam.nadia.spring_core_4.main.task2.service.interfeces.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

    public void hire(Employee employee, Position position){
        employee.setPosition(position);
    }

    public void fire(Employee employee){
        employee.setPosition(null);
    }

}
