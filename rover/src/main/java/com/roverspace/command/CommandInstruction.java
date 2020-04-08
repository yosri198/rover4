package com.roverspace.command;

public enum CommandInstruction {

    R (new RightCommand()),

    L (new LeftCommand()),

    M (new MoveCommand());
    
 
	
	 private final Command command;
  
	CommandInstruction(Command command) {
        this.command = command;
    }
	
    public Command getCommand() {
        return command;
    }

}