package firstCodingAssignment.math.copy;

public class Square extends Polygon {
	public Square(int area, float sideSize) {
		super(area, sideSize);
	}
	
	public float calculateArea() {
		return this.sideSize * sideSize;
	}
}
