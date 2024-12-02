public class Calculator{
String add(int a,int b)
{
return "Addition :"+(a+b);}
String sub(int a,int b)
{
return "Subtraction :"+(a-b);}
String mul(int a,int b)
{
return "Multiplication :"+(a*b);}
String div(int a,int b)
{
return "Division :"+(a/b);}
String mod(int a,int b)
{
return "Modulus :"+(a%b);}
public static void main(String args[]){
Calculator calc=new Calculator();
String add=calc.add(2,4);
System.out.println(add);
String sub=calc.sub(6,3);
System.out.println(sub);
String mul=calc.mul(4,5);
System.out.println(mul);
String div=calc.div(8,2);
System.out.println(div);
String mod=calc.mod(7,4);
System.out.println(mod);
}
}