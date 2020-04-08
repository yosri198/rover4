package com.roverspace.direction;

import com.roverspace.rover.Rover;
import com.roverspace.direction.West;

public class North implements Direction {

    public Direction Right() {
        return new East();
    }

    public Direction Left() {
        return new West();
    }

    public void move(Rover rover) {
        rover.setCoordinateY(rover.getCoordinateY() + 1);
    }
}