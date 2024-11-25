package Dayfour;
import java.util.Scanner;
public class SimpleCalculator 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:");
		System.out.println("Enter 0 for Addition:");
		System.out.println("Enter 1 for Subtraction:");
		System.out.println("Enter 2 for Multiplication:");
		System.out.println("Enter 3 for Division:");
		System.out.println("Enter 4 for Modulus:");
		int key=sc.nextInt();
//		if(key==0)
//		{
//			System.out.println("Enter the first number:");
//			int firstNum=sc.nextInt();
//			System.out.println("Enter the second number:");
//			int secondNum=sc.nextInt();
//			int total=firstNum+secondNum;
//			System.out.println("Addition:"+total);
//		}
//		else if(key==1)
//		{
//			System.out.println("Enter the first number:");
//			int firstNum=sc.nextInt();
//			System.out.println("Enter the second number:");
//			int secondNum=sc.nextInt();
//			int total=firstNum-secondNum;
//			System.out.println("Subtraction:"+total);
//		}
//		else if(key==2)
//		{
//			System.out.println("Enter the first number:");
//			int firstNum=sc.nextInt();
//			System.out.println("Enter the second number:");
//			int secondNum=sc.nextInt();
//			int total=firstNum*secondNum;
//			System.out.println("Multiplication:"+total);
//		}
//		else if(key==3)
//		{
//			System.out.println("Enter the first number:");
//			int firstNum=sc.nextInt();
//			System.out.println("Enter the second number:");
//			int secondNum=sc.nextInt();
//			int total=firstNum/secondNum;
//			System.out.println("Division:"+total);
//		}
//		else if(key==4)
//		{
//			System.out.println("Enter the first number:");
//			int firstNum=sc.nextInt();
//			System.out.println("Enter the second number:");
//			int secondNum=sc.nextInt();
//			int total=firstNum%secondNum;
//			System.out.println("Modulus:"+total);
//		}
//		else
//		{
//			System.out.println("Enter the correct choice");
//		}
		switch(key)
		{
		case 0:
		{
			System.out.println("Enter the first number:");
			int firstNum=sc.nextInt();
			System.out.println("Enter the second number:");
			int secondNum=sc.nextInt();
			int total=firstNum+secondNum;
			System.out.println("Addition:"+total);
			break;
		}
		case 1:
		{
			System.out.println("Enter the first number:");
			int firstNum=sc.nextInt();
			System.out.println("Enter the second number:");
			int secondNum=sc.nextInt();
			int total=firstNum-secondNum;
			System.out.println("Subtraction:"+total);
			break;
		}
		case 2:
		{
			System.out.println("Enter the first number:");
			int firstNum=sc.nextInt();
			System.out.println("Enter the second number:");
			int secondNum=sc.nextInt();
			int total=firstNum*secondNum;
			System.out.println("Multiplication:"+total);
			break;
		}
		case 3:
		{
			System.out.println("Enter the first number:");
			int firstNum=sc.nextInt();
			System.out.println("Enter the second number:");
			int secondNum=sc.nextInt();
			int total=firstNum/secondNum;
			System.out.println("Division:"+total);
			break;
		}
		case 4:
		{
			System.out.println("Enter the first number:");
			int firstNum=sc.nextInt();
			System.out.println("Enter the second number:");
			int secondNum=sc.nextInt();
			int total=firstNum%secondNum;
			System.out.println("Modulus:"+total);
			break;
		}
		default:
		{
			System.out.println("Enter the correct choice:");
		}
		}
		
	}
}
