package com.roverspace.direction;

import com.roverspace.rover.Rover;

public class West implements Direction{
	 public Direction Right() {
	        return new North();
	    }

	    public Direction Left() {
	        return new South();
	    }

	  public void move(Rover rover) {
	        rover.setCoordinateY(rover.getCoordinateY() + 1);
	    }


}
