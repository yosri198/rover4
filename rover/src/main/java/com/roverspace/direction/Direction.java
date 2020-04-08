package com.roverspace.direction;

import com.roverspace.rover.Rover;

public interface Direction {
	
	public abstract Direction Right();

    public abstract Direction Left();
    
    public abstract void move(Rover rover);

 

}
