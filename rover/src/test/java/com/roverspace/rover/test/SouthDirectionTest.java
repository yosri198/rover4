package com.roverspace.rover.test;

import static junit.framework.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.roverspace.rover.Rover;
import com.roverspace.direction.East;
import com.roverspace.direction.South;
import com.roverspace.direction.West;

public class SouthDirectionTest extends AppTest {
	@Before
    public void initialiseSouth() throws Exception {
        direction = new South();
        rover = new Rover(grid, xCoordinate, yCoordinate, direction);
    }
 @Test
    public void WhenRoverheadingIsSouthAndTurnToRight() throws Exception {
        assertEquals(West.class, direction.Right().getClass());
    }
 @Test
    public void WhenRoverheadingIsSouthAndTurnToLeft() throws Exception {
        assertEquals(East.class, direction.Left().getClass());
    }



}
