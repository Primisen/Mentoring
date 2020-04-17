package com.epam.nadia.spring_core_1;

import com.epam.nadia.spring_core_1.entity.Employee;
import com.epam.nadia.spring_core_1.entity.Position;
import com.epam.nadia.spring_core_1.service.SalaryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCode {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Employee egor = (Employee) context.getBean("Egor");
        Employee alex = (Employee) context.getBean("Alex");
        Employee lena = (Employee) context.getBean("Lena");
        Employee max = (Employee) context.getBean("Max");

        Position position = (Position) context.getBean("Java8");
        SalaryService.calculate(position);
        System.out.println(position);
    }
}
