package com.roverspace.rover.test;

import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.roverspace.direction.East;
import com.roverspace.rover.Rover;
import com.roverspace.direction.North;
import com.roverspace.direction.South;




public class EastDirectionTest extends AppTest{
	  
	
	//test pour la direction EST a gauche et a droitet.  
	@Before
	    public void initialiseEast() throws Exception {
	        direction = new East();
	        rover = new Rover(grid, xCoordinate, yCoordinate, direction);
	    }
	 @Test
	    public void WhenRoverheadingIsEastAndTurnToRight() throws Exception {
	        assertEquals(South.class, direction.Right().getClass());
	    }
	 @Test
	    public void WhenRoverheadingIsEastAndTurnToLeft() throws Exception {
	        assertEquals(North.class, direction.Left().getClass());
	    }

	
	  
	  
	  
	  
	  
	  
	  
	  


}
