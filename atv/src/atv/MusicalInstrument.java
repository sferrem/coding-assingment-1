package atv;

public abstract class MusicalInstrument {
	public String instrumentType;
	public String brand;
	
	public MusicalInstrument(String instrumentType, String brand) {
		this.instrumentType = instrumentType;
		this.brand = brand;
	}
	public abstract void play();
}
