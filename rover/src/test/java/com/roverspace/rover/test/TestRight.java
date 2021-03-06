package com.roverspace.rover.test;

import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.roverspace.command.RightCommand;
import com.roverspace.direction.North;
import com.roverspace.direction.East;
import com.roverspace.rover.Rover;


public class TestRight extends AppTest {
	
	@Before
	 public void initialiseRight() throws Exception {
       direction = new North();
       rover = new Rover(grid, xCoordinate, yCoordinate, direction);
       command = new RightCommand();
   }
 
	
	  @Test
	    public void whenSpinRightCommandIsExecutedRoverTurnToRight() throws Exception {
	        command.execute(rover);
	        assertEquals(East.class, rover.getDirection().getClass());
	    }

}
