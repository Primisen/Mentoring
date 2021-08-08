package epam.nadia.spring_core_4.main.task1.entity.person;

import java.lang.reflect.Method;

public class MethodReplacer implements org.springframework.beans.factory.support.MethodReplacer {

    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {

        System.out.println("I will never change my name, meow!");
        return o;
    }
}
