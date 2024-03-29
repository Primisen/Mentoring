package com.epam.nadia.spring_core_1.service;

import com.epam.nadia.spring_core_1.entity.Employee;
import com.epam.nadia.spring_core_1.entity.Position;
import com.epam.nadia.spring_core_1.service.interfeces.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

    public void hire(Employee employee, Position position){
        employee.setPosition(position);
    }

    public void fire(Employee employee){
        employee.setPosition(null);
    }

}
