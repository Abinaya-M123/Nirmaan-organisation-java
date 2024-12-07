package day12;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Book book=new Book();
		Scanner sc=new Scanner(System.in);
		boolean isTrue=true;
		while(isTrue) {
		System.out.println("Enter your choice:");
		System.out.println("Enter 1 for Add or Update Book Details");
		System.out.println("Enter 2 for Display Book Details");
		System.out.println("Enter 0 for Exit");
		int key=sc.nextInt();
		sc.nextLine();
		switch(key){
			case 1:
			{
				System.out.println("Enter the book name:");
				String bookname=sc.next();
				book.setBookName(bookname);
				System.out.println("Enter the book author:");
				String bookauthor=sc.next();
				book.setBookAuthor(bookauthor);
				System.out.println("Enter the price of book:");
				double bookprice=sc.nextDouble();
				book.setBookPrice(bookprice);
				System.out.println("Enter the no of copies want:");
				int noofcopies=sc.nextInt();
				book.setNoOfCopies(noofcopies); 
				break;
			}
			case 2:
			{
				System.out.println(book);
				System.out.println();
				break;
			}
			case 0:
			{
				isTrue=false;
				System.out.println("Thank you");
				break;
			}
			default:
			{
				System.out.println("Enter the valid choice");
				break;
			}
			
		}
	}
		sc.close();

}
}
