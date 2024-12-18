package day18;

import java.util.Scanner;
public class Exception1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0;
			try {
				System.out.println("Enter a value :");
				int a=sc.nextInt();
				System.out.println("Enter b value :");
				int b=sc.nextInt();
				c=a/b;
		} catch (Exception e) {
			System.out.println(e);
		}
			System.out.println("Total "+c);
		sc.close();
	}

}
