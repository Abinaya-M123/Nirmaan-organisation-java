package Day8;
import java.util.Scanner;
public class VaaranamAayiram {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the status of Megana:");
		String megana=sc.next();
		String str=new String("Dead");
		if(megana .equals(str)){
			System.out.println("Suriya weds Ramya");
		}
		else {
			System.out.println("Suriya weds Megana");
		}
		sc.close();
	}

}
