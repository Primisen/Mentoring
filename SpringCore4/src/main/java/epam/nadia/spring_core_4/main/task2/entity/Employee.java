package epam.nadia.spring_core_4.main.task2.entity;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Employee {

    private String name;
    private Position position;

    private static Logger logger = Logger.getLogger(Employee.class.getName());
    private static FileHandler fileHandler;

    static {
        try {
            fileHandler = new FileHandler("Employee.log", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", position=").append(position);
        sb.append('}');
        return sb.toString();
    }

    public void initialize(){
        logSetting();
        logger.info("Initialize.");
    }

    public void destroy(){
        logSetting();
        logger.info("Destroy.");
    }

    private void logSetting(){
        logger.addHandler(fileHandler);
    }
}
