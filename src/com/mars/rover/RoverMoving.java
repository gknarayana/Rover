package com.mars.rover;

import java.util.HashMap;
import java.util.Map;

public class RoverMoving {

	int noOfRovers = 10;

	PlateauFlinth upperCoordinates = new PlateauFlinth(5, 5);
	PlateauFlinth lowerCoordinates = new PlateauFlinth(0, 0);

	Map<Integer, RoverMovingDirections> map = new HashMap<Integer, RoverMovingDirections>();

	public void setNoOfRovers(int noOfRovers) {
		for (int i = 1; i <= noOfRovers; i++) {
			map.put(i, new RoverMovingDirections());

		}
	}

	public void setUpperCoordinates(int xCoordinate, int yCoordinate) {
		upperCoordinates = new PlateauFlinth(xCoordinate, yCoordinate);
	}

	public void setRoverPosition(int roverId, int xCoordinate, int yCoordinate, String direction) {
		RoverMovingDirections roverMovingDirections = map.get(roverId);
		roverMovingDirections.setRoverLocationInput(new PlateauFlinth(xCoordinate, yCoordinate));
		roverMovingDirections.setRoverDirectionInput(direction);
		roverMovingDirections.setRoverCurrentDirection(Direction.getDirection(direction));
		roverMovingDirections.setRoverCurrentLocation(new PlateauFlinth(xCoordinate, yCoordinate));
	}

	public RoverMovingDirections moveRover(int roverId, String instructions) {
		
		String[] roverInstructions = instructions.split("");
		
		RoverMovingDirections roverMovingDirections = map.get(roverId);
		
		roverMovingDirections.setRoverInstructions(roverInstructions);

		System.out.println("-----------------------------------");
		System.out.println("Given Input for Rover " + roverId  + ": "+roverMovingDirections.getRoverLocationInput().getxLimit()+","+roverMovingDirections.getRoverLocationInput().getyLimit()+","+roverMovingDirections.getRoverDirectionInput());
		System.out.println("Instructions are :"+instructions);
		System.out.println("-----------------------------------");

		for (int i = 0; i < roverInstructions.length; i++) {
			
			switch (roverInstructions[i]) {
			case "L":
				roverMovingDirections = turnLeft(roverMovingDirections);
				
				break;

			case "R":
				roverMovingDirections = turnRight(roverMovingDirections);
				break;

			case "M":
				roverMovingDirections = MoveAhead(roverMovingDirections);
				break;
			}
		}
		
		System.out.println("Rover Position after the Instructions " + roverId  + ": "+roverMovingDirections.getRoverCurrentLocation().getxLimit()+","+roverMovingDirections.getRoverCurrentLocation().getyLimit()+","+roverMovingDirections.getRoverCurrentDirection().getFacing());
		return roverMovingDirections;
	}

	private RoverMovingDirections MoveAhead(RoverMovingDirections roverMovingDirections) {
		PlateauFlinth plateauFlinth = roverMovingDirections.getRoverCurrentLocation();
		int x = plateauFlinth.getxLimit();
		int y = plateauFlinth.getyLimit();

		switch (roverMovingDirections.getRoverCurrentDirection().getFacing()) {

		case "N":
			plateauFlinth.setyLimit(y + 1);break;

		case "S":
			plateauFlinth.setyLimit(y - 1);
			break;

		case "W":
			plateauFlinth.setxLimit(x - 1);
			break;
		case "E":
			plateauFlinth.setxLimit(x + 1);
			break;
		}
		roverMovingDirections.setRoverCurrentLocation(plateauFlinth);

		return roverMovingDirections;

	}

	private RoverMovingDirections turnLeft(RoverMovingDirections roverMovingDirections) {
		switch (roverMovingDirections.getRoverCurrentDirection().getFacing()) {
		case "N":
			roverMovingDirections.setRoverCurrentDirection(Direction.WEST);
			break;

		case "S":
			roverMovingDirections.setRoverCurrentDirection(Direction.EAST);
			break;

		case "W":
			roverMovingDirections.setRoverCurrentDirection(Direction.SOUTH);
			break;
		case "E":
			roverMovingDirections.setRoverCurrentDirection(Direction.NORTH);
			break;
		}

		return roverMovingDirections;

	}

	private RoverMovingDirections turnRight(RoverMovingDirections roverMovingDirections) {
		switch (roverMovingDirections.getRoverCurrentDirection().getFacing()) {
		case "N":
			roverMovingDirections.setRoverCurrentDirection(Direction.EAST);
			break;

		case "S":
			roverMovingDirections.setRoverCurrentDirection(Direction.WEST);
			break;

		case "W":
			roverMovingDirections.setRoverCurrentDirection(Direction.NORTH);
			break;
		case "E":
			roverMovingDirections.setRoverCurrentDirection(Direction.SOUTH);
			break;
		}
		return roverMovingDirections;
	}
}
