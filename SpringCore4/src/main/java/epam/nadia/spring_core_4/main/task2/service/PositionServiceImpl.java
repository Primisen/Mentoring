package epam.nadia.spring_core_4.main.task2.service;

import com.epam.nadia.spring_core_1.entity.Position;
import com.epam.nadia.spring_core_1.service.interfeces.PositionService;

public class PositionServiceImpl implements PositionService {

    @Override
    public Position create() {
        return new Position();
    }
}
