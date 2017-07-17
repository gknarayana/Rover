package com.mars.rover;

public class PlateauFlinth {
	private int xLimit;
	private int yLimit;
	
	public PlateauFlinth(int xLimit, int yLimit){
		this.xLimit = xLimit;
		this.yLimit = yLimit;
	}

	public int getxLimit() {
		return xLimit;
	}

	public void setxLimit(int xLimit) {
		this.xLimit = xLimit;
	}

	public int getyLimit() {
		return yLimit;
	}

	public void setyLimit(int yLimit) {
		this.yLimit = yLimit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + xLimit;
		result = prime * result + yLimit;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlateauFlinth other = (PlateauFlinth) obj;
		if (xLimit != other.xLimit)
			return false;
		if (yLimit != other.yLimit)
			return false;
		return true;
	}
	
	
}
