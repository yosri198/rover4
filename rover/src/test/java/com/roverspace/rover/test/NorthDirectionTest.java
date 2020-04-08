package com.roverspace.rover.test;

import static junit.framework.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.roverspace.rover.Rover;
import com.roverspace.direction.East;
import com.roverspace.direction.North;
import com.roverspace.direction.West;


public class NorthDirectionTest extends AppTest {


	@Before
	    public void initialiseNorth() throws Exception {
	        direction = new North();
	        rover = new Rover(grid, xCoordinate, yCoordinate, direction);
	    }
	 @Test
	    public void WhenRoverheadingIsNorthAndTurnToRight() throws Exception {
	        assertEquals(East.class, direction.Right().getClass());
	    }
	 @Test
	    public void WhenRoverheadingIsNorthAndTurnToLeft() throws Exception {
	        assertEquals(West.class, direction.Left().getClass());
	    }

	

}
