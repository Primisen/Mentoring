package epam_training.jdbc.kitty.task1;

public class Main {

    public static void main(String[] args) {

        MyFirstConnection myFirstConnection = new MyFirstConnection();

        print(myFirstConnection.getCats());

        myFirstConnection.setCats(1,"Джерри");

        print(myFirstConnection.getTables());
    }

    private static void print(Object object){
        System.out.println(object);
    }
}
