package firstCodingAssignment.shopping.copy;

public abstract class Store {
	public String name;
	public int unities;
	
	public Store(String name, int unities) {
		this.name = name;
		this.unities = unities;
	}
	
	public void sell(String item) {
		System.out.println(item + "sold");
	}
}