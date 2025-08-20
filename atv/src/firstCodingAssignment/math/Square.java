package firstCodingAssignment.math;

public class Square extends Polygon {
	public Square(int area, float sideSize) {
		super(area, sideSize);
	}
	
	public float calculateArea() {
		return this.sideSize * sideSize;
	}
}
