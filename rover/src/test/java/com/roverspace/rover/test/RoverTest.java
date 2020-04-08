package com.roverspace.rover.test;

import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.roverspace.direction.East;
import com.roverspace.direction.North;
import com.roverspace.direction.West;
import com.roverspace.rover.Rover;





public class RoverTest extends AppTest {

    @Before
    public void initialise() throws Exception {
        direction = new North();
        rover = new Rover(grid, xCoordinate, yCoordinate, direction);
    }

    @Test
    public void whenRequestedRoverCanTurnRight() throws Exception {
        rover.Right();
        assertEquals(East.class, rover.getDirection().getClass());
    }

    @Test
    public void whenRequestedRoverCanTurnLeft() throws Exception {
        rover.Left();
        assertEquals(West.class, rover.getDirection().getClass());
    }

    @Test
    public void whenRequestedRoverCanMoveForward() throws Exception {
        rover.move();
        assertEquals(++yCoordinate, rover.getCoordinateY());
    }

}
