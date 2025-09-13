package javamatter.ex3;

public class Book {
	private String name;
	private int price;
	
	Book(String name , int price){
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}

}
