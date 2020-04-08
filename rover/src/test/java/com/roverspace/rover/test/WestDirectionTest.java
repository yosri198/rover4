package com.roverspace.rover.test;

import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.roverspace.direction.North;
import com.roverspace.direction.South;
import com.roverspace.direction.West;
import com.roverspace.rover.Rover;




public class WestDirectionTest  extends AppTest{
	
	@Before
    public void setUp() throws Exception {
        direction = new West();
        rover = new Rover(grid, xCoordinate, yCoordinate, direction);
    }

    @Test
    public void WhenRoverheadingIsWestAndTurnToRight() throws Exception {
        assertEquals(direction.Right().getClass(), North.class);
    }

    @Test
    public void WhenRoverheadingIsWestAndTurnToLeft() throws Exception {
        assertEquals(direction.Left().getClass(), South.class);
    }


}
