package day15;
import java.util.Scanner;
public class UserInterface {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value;");
		int a=sc.nextInt();
		System.out.println("Enter the b value;");
		int b=sc.nextInt();
		Calculator calc=new Calculator();
		calc.add(a,b);
		calc.sub(a,b);
		calc.mul(a,b);
		calc.div(a,b);
		calc.mod(a,b);
		sc.close();
	}
}
