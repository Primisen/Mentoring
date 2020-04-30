package epam.nadia.spring_core_4.main.task2;

import epam.nadia.spring_core_4.main.task2.entity.Employee;
import epam.nadia.spring_core_4.main.task2.entity.Position;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContextFactoryMethod.xml");

        Employee ilya = (Employee) applicationContext.getBean("Ilya");
        print(ilya);

    }

    private static void print(Object object){
        System.out.println(object);
    }
}
