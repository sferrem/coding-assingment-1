package firstCodingAssignment.store;

public class Product {
	public String productType;
	public float price;
	
	public Product(String productType, float price) {
	this.productType = productType;
	this.price = price;
	}

	public float getPrice() {
		return this.price;
	}
}