package Day5;
import java.util.Scanner;
public class ForLoop {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
//		for(int i=1;i<=10;i++)
//		{
//		System.out.println("Number is:"+i);
//		}
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("5x"+i+"="+i*5);
//		}
		System.out.println("Enter the table value:");
		int table=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(table+"x"+i+"="+i*table);
		}
	}
 
}
