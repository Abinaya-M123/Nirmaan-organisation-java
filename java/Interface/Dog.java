package day16;

public class Dog implements IAnimalBehavior {
	@Override
	public void move() {
		System.out.println("The dog runs on four legs");
	}
	@Override
	public String speak() {
		return "The Dog says:Woof Woof!";
	}

}

