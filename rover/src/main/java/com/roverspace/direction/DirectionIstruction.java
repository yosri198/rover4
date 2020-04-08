package com.roverspace.direction;


public enum DirectionIstruction {
	

	    N (new North()),

	    E (new East()),

	    S (new South()),

	    W (new West());

	    private final Direction direction;

	    DirectionIstruction(Direction direction) {
	        this.direction = direction;
	    }

	    public Direction getDirection() {
	        return direction;
	    }
	}


