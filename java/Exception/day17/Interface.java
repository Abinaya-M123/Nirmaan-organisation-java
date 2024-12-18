package day17;

import java.util.Scanner;

public class Interface implements IExample1,IExample2 {

	@Override
	public void div(int a, int b) {
		System.out.println(a/b);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul(int a, int b) {
		System.out.println(a*b);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int a, int b) {
		System.out.println(a+b);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println(a-b);
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Interface i=new Interface();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=sc.nextInt();
		System.out.println("Enter the b value");
		int b=sc.nextInt();
		i.add(a, b);
		i.sub(a, b);
		try {
		i.div(a, b);}
		catch(Exception e) {
			System.out.println(e);
		}
		i.mul(a, b);
		sc.close();
	}

}
