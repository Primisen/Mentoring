package com.epam.nadia.files.task1.service;

import com.epam.nadia.files.task1.entity.Position;
import com.epam.nadia.files.task1.service.interfeces.PositionService;

public class PositionServiceImpl implements PositionService {

    public Position create() {
        return new Position();
    }
}
