package com.roverspace.command;

import com.roverspace.rover.Rover;

public class RightCommand implements Command {

    public void execute(Rover rover) {
        rover.Right();
    }

}
