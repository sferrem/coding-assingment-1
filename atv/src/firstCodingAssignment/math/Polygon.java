package firstCodingAssignment.math;

public abstract class Polygon {
	public int area;
	public float sideSize;
	
	public Polygon(int area, float sideSize) {
		this.area = area;
		this.sideSize = sideSize;
	}
	
	public abstract float calculateArea();
}