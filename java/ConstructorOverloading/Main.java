package Day10;
public class Main {
	public static void main(String args[]) {
		Car c=new Car();
		System.out.println("Default Constructor");
		c.displayCarDetails();
		Car c1=new Car("maruthi");
		System.out.println("Single Parameter Constructor");
		c1.displayCarDetails();
		Car c2=new Car("Suzuki",2016);
		System.out.println("Double parameter Constructor");
		c2.displayCarDetails();
	}

}
