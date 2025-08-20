package atv;

public class Square extends Polygons {
	public Square(int area, float sideSize) {
		super(area, sideSize);
	}
	
	public float calculateArea() {
		return this.sideSize * sideSize;
	}
}
