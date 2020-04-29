package epam.nadia.spring_core_4.main.task1.entity.person;

import epam.nadia.spring_core_4.main.task1.entity.Cat;

public class Person {

    private String name;
    private Cat cat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void changeTheNameOfTheCat(String name){
        if(isNotNull(cat)){
            cat.setName(name);
        }
    }

    private boolean isNull(Cat cat){
        return cat == null;
    }

    private boolean isNotNull(Cat cat){
        return !isNull(cat);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", cat=").append(cat);
        sb.append('}');
        return sb.toString();
    }
}
