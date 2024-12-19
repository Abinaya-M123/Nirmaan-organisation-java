package day19;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=0;
		try {
			System.out.println("Enter the age :");
			age=sc.nextInt();
			sc.close();
			if(age>0) {
				System.out.println("Valid Age");
			}
			else {
				throw new ArithmeticException();
			}
		}
			
		catch(ArithmeticException e) {
			System.out.println("Enter the correct age");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			System.out.println("Hello");
		}
		System.out.println("Your Age is :"+age);
		}
		

}
