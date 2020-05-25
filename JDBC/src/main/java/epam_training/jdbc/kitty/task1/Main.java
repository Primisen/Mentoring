package epam_training.jdbc.kitty.task1;

public class Main {

    public static void main(String[] args) {

        MyFirstConnection myFirstConnection = new MyFirstConnection();

        print(myFirstConnection.getCats());
    }

    private static void print(Object object){
        System.out.println(object);
    }
}
