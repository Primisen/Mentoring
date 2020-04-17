package com.epam.nadia.spring_core_1.service;

import com.epam.nadia.spring_core_1.entity.Position;
import com.epam.nadia.spring_core_1.entity.Salary;

public class SalaryService {

    public static Salary calculate(Position position){
        Salary salary =  new Salary();
        salary.setSalary(calculateSalary(position));
        return salary;
    }

    private static double calculateSalary(Position position){
        return position.getNumberOfWorkDays() * position.getAnte();
    }
}
