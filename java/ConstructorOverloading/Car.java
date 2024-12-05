package Day10;

public class Car {
	String make;
	int year;
	Car(){
		this.make="Unknown";
		this.year=2000;
	}
	Car(String make){
		this.make=make;
		this.year=2000;
	}
	Car(String make,int year){
		this.year=year;
		this.make=make;
	}
	void displayCarDetails() {
		System.out.println("make is:"+make);
		System.out.println("year is:"+year);
	}

}
