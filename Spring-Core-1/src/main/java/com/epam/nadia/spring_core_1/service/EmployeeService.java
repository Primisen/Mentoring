package com.epam.nadia.spring_core_1.service;

import com.epam.nadia.spring_core_1.entity.Employee;
import com.epam.nadia.spring_core_1.entity.Position;

public class EmployeeService {

    public void hire(Employee employee, Position position){//Ki$a, разберись с исключениями!
//        if()
        employee.setPosition(position);
    }

    public void fire(Employee employee){
        employee.setPosition(null);//норм?
    }

}
