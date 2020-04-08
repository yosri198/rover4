package com.roverspace.rover.test;

import com.roverspace.command.Command;
import com.roverspace.direction.Direction;
import com.roverspace.rover.Grid;
import com.roverspace.rover.Rover;

public abstract class AppTest {

    protected final Grid grid = new Grid(5, 5);
    protected int xCoordinate = 0;
    protected int yCoordinate = 0;
    protected Direction direction;
    protected Rover rover;
    protected Command command;
}