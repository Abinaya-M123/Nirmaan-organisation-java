package day20;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book book=new Book();
		ArrayList<Book> al=new ArrayList<Book>();
		boolean isWork=true;
		while(isWork) {
			System.out.println("Enter the choice:");
			System.out.println("Enter 1 for add book ");
			System.out.println("Enter 2 for update book ");
			System.out.println("Enter 3 for show books ");
			System.out.println("Enter 4 for remove book ");
			System.out.println("Enter 0 for Exit ");
			int key=sc.nextInt();
			sc.nextLine();
			if(key==1) {
				System.out.println("Enter the book name:");
				String bname=sc.nextLine();
				System.out.println("Enter the book price:");
				double bprice=sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter the book author:");
				String bauthor=sc.nextLine();
				System.out.println("Enter the book year:");
				int byear=sc.nextInt();
				sc.nextLine();
				al.add(book=new Book(bname, bprice, bauthor, byear));
			}
			else if(key==2) {
				System.out.println("Enter the book name:");
				String name=sc.nextLine();
				boolean isThere=false;
				for(Book book1:al) {
					if(name.equalsIgnoreCase(book1.getName())) {
						isThere=true;
						System.out.println("Rename the book:");
						String rname=sc.nextLine();
						book1.setName(rname);
						System.out.println("Enter the price:");
						double rprice=sc.nextDouble();
						sc.nextLine();
						book1.setPrice(rprice);
						System.out.println("Enter the Author:");
						String rauthor=sc.nextLine();
						book1.setAuthor(rauthor);
						System.out.println("Enter the year:");
						int ryear=sc.nextInt();
						sc.nextLine();
						book1.setYear(ryear);
					}
				}
				if(!isThere) {
					System.out.println("The book is Not Here");
				}
			}
			else if(key==3) {
				System.out.println(al);
			}
			else if(key==4) {
				System.out.println("Enter the book name:");
				String name=sc.nextLine();
				for(Book book1:al) {
					if(name.equalsIgnoreCase(book1.getName())) {
						al.remove(book1);
						System.out.println("Book removed");
						break;
						}
					}
				
			}
			else if(key==0) {
				System.out.println("(Thank you");
				isWork=false;
			}
			
		}
		sc.close();
	}
	

}
