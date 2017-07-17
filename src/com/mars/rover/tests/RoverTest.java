package com.mars.rover.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mars.rover.PlateauFlinth;
import com.mars.rover.RoverMoving;
import com.mars.rover.RoverMovingDirections;

public class RoverTest {

	RoverMoving roverMoving = new RoverMoving();

	@Test
	public void test() {

		roverMoving.setNoOfRovers(2);
		roverMoving.setUpperCoordinates(5, 5);

		//***********************************************************************************************
		// First Rover Position
		// First parameter representing the roverId and followed by x,y
		// coordinates and direction of rover.
		roverMoving.setRoverPosition(1, 1, 2, "N");

		// Instructions for Rover 1
		RoverMovingDirections roverMovingDirections = roverMoving.moveRover(1, "LMLMLMLMM");
		assertTrue(roverMovingDirections.getRoverCurrentDirection().getFacing().equals("N"));
		assertTrue(roverMovingDirections.getRoverCurrentLocation().equals(new PlateauFlinth(1, 3)));

		//***********************************************************************************************
		// Second Rover Position
		// First parameter representing the roverId and followed by x,y
		// coordinates and direction of rover.
		roverMoving.setRoverPosition(2, 3, 3, "E");

		// Instructions for Rover 2
		roverMovingDirections = roverMoving.moveRover(2, "MMRMMRMRRM");
		assertTrue(roverMovingDirections.getRoverCurrentDirection().getFacing().equals("E"));
		assertTrue(roverMovingDirections.getRoverCurrentLocation().equals(new PlateauFlinth(5, 1)));
	}

}
