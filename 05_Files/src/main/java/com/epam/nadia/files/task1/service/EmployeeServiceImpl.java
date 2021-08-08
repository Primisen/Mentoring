package com.epam.nadia.files.task1.service;

import com.epam.nadia.files.task1.entity.Employee;
import com.epam.nadia.files.task1.entity.Position;
import com.epam.nadia.files.task1.service.interfeces.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

    public void hire(Employee employee, Position position){
        employee.setPosition(position);
    }

    public void fire(Employee employee){
        employee.setPosition(null);
    }

}
