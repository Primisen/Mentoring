package epam.nadia.spring_core_4.main.task2.entity.factory;

import epam.nadia.spring_core_4.main.task2.entity.Position;

public class PositionFactoryMethod {

    private static final Position position = new Position();

    public static Position getPosition(){
        return position;
    }
}
