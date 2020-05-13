package com.epam.nadia.files.task1.service.interfeces;

import com.epam.nadia.files.task1.entity.Employee;
import com.epam.nadia.files.task1.entity.Position;

public interface EmployeeService {

    void hire(Employee employee, Position position);
    void fire(Employee employee);
}
