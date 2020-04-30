package epam.nadia.spring_core_4.main.task2.service;

import epam.nadia.spring_core_4.main.task2.entity.Position;
import epam.nadia.spring_core_4.main.task2.service.interfeces.PositionService;

public class PositionServiceImpl implements PositionService {

    @Override
    public Position create() {
        return new Position();
    }
}
