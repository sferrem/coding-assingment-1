package atv;

public abstract class Polygons {
	public int area;
	public float sideSize;
	
	public Polygons(int area, float sideSize) {
		this.area = area;
		this.sideSize = sideSize;
	}
	
	public abstract float calculateArea();
}