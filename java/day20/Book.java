package day20;

public class Book {
	private String name;
	private double price;
	private String author;
	private int year;
	public Book() {
		super();
	}
	
	public Book(String name, double price, String author, int year) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
		this.year = year;
	}

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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", author=" + author + ", year=" + year + "]";
	}
	

}
