package com.roverspace.rover.test;

import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.roverspace.command.LeftCommand;
import com.roverspace.direction.North;
import com.roverspace.direction.West;
import com.roverspace.rover.Rover;


public class TestLeft  extends AppTest{
	@Before
	 public void initialiseLeft() throws Exception {
        direction = new North();
        rover = new Rover(grid, xCoordinate, yCoordinate, direction);
        command = new LeftCommand();
    }
  
    @Test
    public void whenSpinLeftCommandIsExecutedRoverTurnToLeft() throws Exception {
        command.execute(rover);
        assertEquals(West.class, rover.getDirection().getClass());
    }

}
