package com.epam.nadia.files.task1;

import com.epam.nadia.files.task1.entity.Employee;
import com.epam.nadia.files.task1.entity.Position;
import com.epam.nadia.files.task1.entity.Salary;
import com.epam.nadia.files.task1.util.Deserialization;
import com.epam.nadia.files.task1.util.Serialization;

public class ClientCode {

    private static final String FILE_NAME = "file.ser";

    public static void main(String[] args) {

        Salary salary = new Salary(3500);
        Position position = new Position("Manager", salary);
        Employee employee = new Employee("Лера", position);

        Serialization.serialize(FILE_NAME, employee);

        Employee employee1 = Deserialization.deserialize(FILE_NAME);

        print(employee1);
    }

    private static void print(Object object) {
        System.out.println(object);
    }
}
