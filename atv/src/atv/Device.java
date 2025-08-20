package atv;

public class Device {
	public float screenSize;
	public String model;
	public int manufactureYear;
	
	public Device(float screenSize, String model, int manufactureYear) {
		this.screenSize = screenSize;
		this.model = model;
		this.manufactureYear = manufactureYear;
	}
	public void turnOn() {
		System.out.println("Turning on...");
		System.out.println("ON!");
	}
}
