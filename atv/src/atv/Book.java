package atv;

public class Book extends Product {
	public String title;
	public int pagesNumber;
	
	public Book(String productType, float price, String title, int pagesNumber) {
		super(productType, price);
		this.title = title;
		this.pagesNumber = pagesNumber;
	}
}
