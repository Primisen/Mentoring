package epam.nadia.spring_core_4.main.task1.entity;

public class Food {
    private String food;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Food{");
        sb.append("food='").append(food).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
