package com.mars.rover;

public enum Direction {
	NORTH("N"), SOUTH("S"), EAST("E"), WEST("W");

	private String facing;

	Direction(String facing) {
		this.facing = facing;
	}

	public String getFacing() {
		return facing;
	}
	
	public static Direction getDirection(String facing){
		for(Direction d:Direction.values()){
			if(d.facing.equals(facing)){
				return d;
			}
		}
		return null;
	}
}
