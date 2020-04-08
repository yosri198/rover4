package com.roverspace.direction;

import com.roverspace.rover.Rover;
import com.roverspace.direction.South;

public class East implements Direction {
	
	  public Direction Right() {
	        return new South();
	    }

	    public Direction Left() {
	        return new North();
	    }

	    public void move(Rover rover) {
	        rover.setCoordinateY(rover.getCoordinateY() + 1);
	    }

}
