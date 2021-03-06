package entities;

public class Product {

//ATTRIBUTES
	private String name;
	private double price;
	
//CONSTRUCTOR
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
//GETS & SETS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
