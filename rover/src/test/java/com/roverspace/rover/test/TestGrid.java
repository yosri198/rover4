package com.roverspace.rover.test;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class TestGrid extends AppTest{


	@Test
	    public void whenPlateauIsConstructedLowerLeftCoordinatesAreZeroZero() throws Exception {
	        assertEquals(0, grid.getLowerCoordinateX());
	        assertEquals(0, grid.getLowerCoordinateY());
	    }

}
