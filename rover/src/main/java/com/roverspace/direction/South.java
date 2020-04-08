package com.roverspace.direction;

import com.roverspace.rover.Rover;
import com.roverspace.direction.West;

public class South implements Direction {
	 public Direction Right() {
	        return new West();
	    }

	    public Direction Left() {
	        return new East();
	    }

	  public void move(Rover rover) {
	        rover.setCoordinateY(rover.getCoordinateY() + 1);
	    }

}
