package epam.nadia.spring_core_4.main.task1.entity;

public class BeanLifeCycleDemonstration {

    public void init(){
        System.out.println("This is init method.");
    }

    public void destroy(){
        System.out.println("This is destroy method.");
    }
}
