package day12;

public class Book {
	private String bookName;
	private double bookPrice;
	private String bookAuthor;
	private int noOfCopies;
	Book(){}
	public String getBookName() {
		return bookName;
	}
  	public double getBookPrice() {
		return bookPrice;
	}
  	public String getBookAuthor() {
		return bookAuthor;
	}
  	public int getNoOfCopies() {
		return noOfCopies;
	}
  	public void setBookName(String bookName) {
		this.bookName=bookName;
	}
  	public void setBookPrice(double bookPrice) {
		this.bookPrice=bookPrice;
	}
  	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor=bookAuthor;
	}
  	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies=noOfCopies;
	}
  	public String toString() {
		return "BOOK NAME IS: "+bookName+"\nBOOK AUTHOR IS: "+bookAuthor+"\nBOOK PRICE IS: "+bookPrice+"\nTOTAL NO OF COPIES IS: "+noOfCopies;
	}
	

}
