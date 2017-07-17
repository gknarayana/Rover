package com.mars.rover;

public class RoverMovingDirections {
	private PlateauFlinth roverLocationInput;
	private PlateauFlinth roverCurrentLocation;
	private String roverDirectionInput;
	private Direction roverCurrentDirection;
	private String[] roverInstructions;

	public PlateauFlinth getRoverLocationInput() {
		return roverLocationInput;
	}

	public void setRoverLocationInput(PlateauFlinth roverLocationInput) {
		this.roverLocationInput = roverLocationInput;
	}

	public PlateauFlinth getRoverCurrentLocation() {
		return roverCurrentLocation;
	}

	public void setRoverCurrentLocation(PlateauFlinth roverCurrentLocation) {
		this.roverCurrentLocation = roverCurrentLocation;
	}

	public String getRoverDirectionInput() {
		return roverDirectionInput;
	}

	public void setRoverDirectionInput(String roverDirectionInput) {
		this.roverDirectionInput = roverDirectionInput;
	}

	public Direction getRoverCurrentDirection() {
		return roverCurrentDirection;
	}

	public void setRoverCurrentDirection(Direction roverCurrentDirection) {
		this.roverCurrentDirection = roverCurrentDirection;
	}

	public String[] getRoverInstructions() {
		return roverInstructions;
	}

	public void setRoverInstructions(String[] roverInstructions) {
		this.roverInstructions = roverInstructions;
	}

}
