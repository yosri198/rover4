package com.roverspace.command;

import com.roverspace.command.Command;
import com.roverspace.rover.Rover;

	public class LeftCommand implements Command {

	    public void execute(Rover rover) {
	        rover.Left();
	    }

	}
