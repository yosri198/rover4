package com.roverspace.rover;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.roverspace.command.Command;
import com.roverspace.direction.Direction;
import com.roverspace.direction.DirectionIstruction;
import com.roverspace.command.CommandInstruction;
import com.roverspace.rover.Rover;
import com.roverspace.rover.Grid;


     public class InputTxt {
	 public static ArrayList<String> parseInputFromFile(InputStream fileLocation) throws IOException {
	        ArrayList<String> inputsFromFile = new ArrayList<String>();
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileLocation));
	        String fileLine;

	        while ((fileLine = bufferedReader.readLine()) != null)
	            inputsFromFile.add(fileLine);

	        bufferedReader.close();
	        return inputsFromFile;
	    }

	    public static Grid parseGridInput(String gridInput) {
	        String[] inputArray = gridInput.split(" ");
	        int gridUpperCoordinateX = Integer.parseInt(inputArray[0]);
	        int gridUpperCoordinateY = Integer.parseInt(inputArray[1]);
	        return new Grid(gridUpperCoordinateX, gridUpperCoordinateY);
	    }

	    public static Rover parsePositionInput(String positionInput, Grid grid) throws Exception{
	    	String[] inputArray = positionInput.split(" ") ;
	        int LandingCoordinateX = Integer.parseInt(inputArray[0]);
	        int LandingCoordinateY = Integer.parseInt(inputArray[1]);
	        Direction direction = DirectionIstruction.valueOf(inputArray[2]).getDirection();
	        return new Rover(grid, LandingCoordinateX, LandingCoordinateY, direction);
	    }

	    public static ArrayList<Command> parseCommandInput(String command) {
	        char[] inputArray = command.toCharArray();
	        ArrayList<Command> commandArrayList = new ArrayList<Command>();

	        for (char c : inputArray) {

	        	Command currentCommand = CommandInstruction.valueOf(Character.toString(c)).getCommand();
	            commandArrayList.add(currentCommand);
	        }

	        return commandArrayList;
	    }

}
