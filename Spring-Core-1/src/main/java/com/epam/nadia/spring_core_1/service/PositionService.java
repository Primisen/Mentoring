package com.epam.nadia.spring_core_1.service;

import com.epam.nadia.spring_core_1.entity.Position;

import java.util.HashSet;
import java.util.Set;

public class PositionService {

    private Set<Position> positions;

    public PositionService() {
        positions = new HashSet<>();
    }

    public PositionService(Set<Position> positions) {
        this.positions = positions;
    }

    public Set<Position> getPositions() {
        return positions;
    }

    public void setPositions(Set<Position> positions) {
        this.positions = positions;
    }

    public void setPosition(Position position) {
        this.positions.add(position);
    }

    public void remove(Position position) {
        positions.remove(position);
    }
}
