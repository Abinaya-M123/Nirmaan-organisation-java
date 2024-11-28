package Day6;
import java.util.Scanner;
public class StringConcept {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name:");
	String name=sc.nextLine();
	System.out.println(name.substring(0,7));
	System.out.println(name.charAt(8));
	sc.close();
	
	}
	

}
