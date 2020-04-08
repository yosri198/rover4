package com.roverspace.command;

import com.roverspace.rover.Rover;

public class MoveCommand implements Command {

    public void execute(Rover rover) {
        rover.move();
    }
}
