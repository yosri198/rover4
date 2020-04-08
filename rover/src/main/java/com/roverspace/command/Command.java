package com.roverspace.command;

import com.roverspace.rover.Rover;

public interface Command {
	
	 public abstract void execute(Rover rover);
}