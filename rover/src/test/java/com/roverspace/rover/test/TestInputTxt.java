package com.roverspace.rover.test;

import static junit.framework.TestCase.assertEquals;

import java.io.InputStream;
import java.util.ArrayList;

import org.junit.Test;

import com.roverspace.command.Command;
import com.roverspace.command.LeftCommand;
import com.roverspace.command.MoveCommand;
import com.roverspace.command.RightCommand;
import com.roverspace.direction.North;
import com.roverspace.rover.Grid;
import com.roverspace.rover.InputTxt;
import com.roverspace.rover.Rover;



public class TestInputTxt extends AppTest{
	

	@Test
	    public void inputStringsCanBeParsedFromFile() throws Exception {
	        InputStream testFileInputStream = getClass().getResourceAsStream("/testinput.txt");
	        String expectedInputStringOne = "5 5";
	        String expectedInputStringTwo = "1 2 N";
	        String expectedInputStringThree = "LMLMLMLMM";
	        String expectedInputStringFour = "3 3 E";
	        String expectedInputStringFive = "MMRMMRMRRM";
	        ArrayList<String> testFileLines = InputTxt.parseInputFromFile(testFileInputStream);

	        assertEquals(5, testFileLines.size());
	        assertEquals(expectedInputStringOne, testFileLines.get(0));
	        assertEquals(expectedInputStringTwo, testFileLines.get(1));
	        assertEquals(expectedInputStringThree, testFileLines.get(2));
	        assertEquals(expectedInputStringFour, testFileLines.get(3));
	        assertEquals(expectedInputStringFive, testFileLines.get(4));
	    }

	    @Test
	    public void whenPlateauInputIsParsedPlateauIsConstructed() throws Exception {
	        String gridInput = "5 5";
	        Grid gridOutput = InputTxt.parseGridInput(gridInput);

	        assertEquals(0, gridOutput.getLowerCoordinateX());
	        assertEquals(0, gridOutput.getLowerCoordinateY());
	        assertEquals(5, gridOutput.getUpperCoordinateX());
	        assertEquals(5, gridOutput.getUpperCoordinateY());
	    }

	    @Test
	    public void whenPositionInputIsParsedRoverIsConstructed() throws Exception {
	        String positionInput = "1 2 N";
	        Rover roverOutput = InputTxt.parsePositionInput(positionInput, grid );

	        assertEquals(1, roverOutput.getCoordinateX());
	        assertEquals(2, roverOutput.getCoordinateY());
	        assertEquals(North.class, roverOutput.getDirection().getClass());
	    }

	    @Test
	    public void whenRCommandIsParsedRightCommandIsConstructed() throws Exception {
	        String rCommandInput = "R";
	        ArrayList<Command> commandOutput = InputTxt.parseCommandInput(rCommandInput);

	        assertEquals(rCommandInput.length(), commandOutput.size());
	        assertEquals(RightCommand.class, commandOutput.get(0).getClass());
	    }

	    @Test
	    public void whenLCommandIsParsedLeftCommandIsConstructed() throws Exception {
	        String lCommandInput = "L";
	        ArrayList<Command> commandOutput = InputTxt.parseCommandInput(lCommandInput);

	        assertEquals(lCommandInput.length(), commandOutput.size());
	        assertEquals(LeftCommand.class, commandOutput.get(0).getClass());
	    }

	    @Test
	    public void whenMCommandIsParsedMoveForwardCommandIsConstructed() throws Exception {
	        String mCommandInput = "M";
	        ArrayList<Command> commandOutput = InputTxt.parseCommandInput(mCommandInput);

	        assertEquals(mCommandInput.length(), commandOutput.size());
	        assertEquals(MoveCommand.class, commandOutput.get(0).getClass());
	    }


	    @Test
	    public void whenMultipleCommandsAreParsedCommandListIsConstructed() throws Exception {
	        String multiCommandInput = "RLM";
	        ArrayList<Command> commandOutput = InputTxt.parseCommandInput(multiCommandInput);

	        assertEquals(multiCommandInput.length(), commandOutput.size());
	        assertEquals(RightCommand.class, commandOutput.get(0).getClass());
	        assertEquals(LeftCommand.class, commandOutput.get(1).getClass());
	        assertEquals(MoveCommand.class, commandOutput.get(2).getClass());
	    }

}
