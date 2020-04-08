package com.roverspace.rover.test;

import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.roverspace.command.MoveCommand;
import com.roverspace.direction.North;
import com.roverspace.rover.Rover;

public class TestMove extends AppTest{
	
	@Before
	 public void initialiseMove() throws Exception {
      direction = new North();
      rover = new Rover(grid, xCoordinate, yCoordinate, direction);
      command = new MoveCommand();
  }
	
	@Test
    public void whenMoveForwardCommandIsExecutedRoverMovesForward() throws Exception {
        command.execute(rover);
        assertEquals(++yCoordinate, rover.getCoordinateY());
    }
}
