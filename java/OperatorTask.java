import java.util.Scanner;
public class OperatorTask
{
public static void main(String args[])
{
int a,b,c,d;
Scanner s=new Scanner(System.in);
System.out.println("Enter the first number:");
a=s.nextInt();
System.out.println("Enter the second number:");
b=s.nextInt();
System.out.println(" ");
System.out.println("Arithmetic operations:");
System.out.println("Addition:"+(a+b));
System.out.println("Subtraction:"+(a-b));
System.out.println("Multiplication:"+(a*b));
System.out.println("Division:"+(a/b));
System.out.println("Modulus:"+(a%b));
System.out.println(" ");
System.out.println("Relational operations:");
System.out.println(a+">"+b+":"+(a>b));
System.out.println(a+"<"+b+":"+(a<b));
System.out.println(a+">="+b+":"+(a>=b));
System.out.println(a+"<="+b+":"+(a<=b));
System.out.println(a+"=="+b+":"+(a==b));
System.out.println(a+"!="+b+":"+(a!=b));
System.out.println(" ");
System.out.println("Logical operations:");
System.out.println("("+a+">"+"10"+" "+"AND"+b+"<"+"50)"+":"+(a>10 && b<50));
System.out.println("("+a+"<"+"5"+" "+"OR"+b+">"+"100)"+":"+(a<5 || b>100));
System.out.println(" ");
System.out.println("Assignment operations:");
c=10;
System.out.println("Initial Value:"+c);
System.out.println("After"+" "+"+="+":"+(c+=a));
System.out.println("After"+" "+"-="+":"+(c-=a));
System.out.println("After"+" "+"*="+":"+(c*=a));
System.out.println("After"+" "+"/="+":"+(c/=10));
System.out.println("After"+" "+"%="+":"+(c%=a));
System.out.println(" ");
System.out.println("Unary operations:");
d=12;
System.out.println("Initial value:"+d);
System.out.println("After"+" "+"increment:"+(++d));
d=--d;
System.out.println("After"+" "+"decrement:"+(--d));
System.out.println(" ");
System.out.println("Conditional operations:");
if(a%2==0)
{
System.out.println(a+" "+"is"+" "+"Even");
}
}
}