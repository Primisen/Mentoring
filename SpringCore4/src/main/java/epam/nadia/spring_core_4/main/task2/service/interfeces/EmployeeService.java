package epam.nadia.spring_core_4.main.task2.service.interfeces;

import com.epam.nadia.spring_core_1.entity.Employee;
import com.epam.nadia.spring_core_1.entity.Position;

public interface EmployeeService {

    void hire(Employee employee, Position position);
    void fire(Employee employee);
}
