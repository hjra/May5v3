package net.may5.dto;

public class Point {

	private int pointCode;
	private double pointRate;
	
	public int getPointCode() {
		return pointCode;
	}
	public void setPointCode(int pointCode) {
		this.pointCode = pointCode;
	}
	public double getPointRate() {
		return pointRate;
	}
	public void setPointRate(double pointRate) {
		this.pointRate = pointRate;
	}
	@Override
	public String toString() {
		return "Point [pointCode=" + pointCode + ", pointRate=" + pointRate
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pointCode;
		long temp;
		temp = Double.doubleToLongBits(pointRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Point other = (Point) obj;
		if (pointCode != other.pointCode)
			return false;
		if (Double.doubleToLongBits(pointRate) != Double
				.doubleToLongBits(other.pointRate))
			return false;
		return true;
	}
}
