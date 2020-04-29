package epam.nadia.spring_core_4.main.task1;

import epam.nadia.spring_core_4.main.task1.entity.BeanLifeCycleDemonstration;
import epam.nadia.spring_core_4.main.task1.entity.Cat;
import epam.nadia.spring_core_4.main.task1.entity.person.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person person = (Person) applicationContext.getBean("A");
        print(person);

        Cat cat = (Cat) applicationContext.getBean("B");
        print(cat);

        Cat cat1 = (Cat) applicationContext.getBean("C");
        print(cat1);

        Person person1 = (Person) applicationContext.getBean("E");
        person1.changeTheNameOfTheCat("Vassiliy");
    }

    private static void print(Object object){
        System.out.println(object);
    }
}
