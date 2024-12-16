package day16;

public class Bird implements IAnimalBehavior {
	@Override
	public void move() {
		System.out.println("The Birds flies in the sky");
	}
	@Override
	public String speak() {
		return "The Dog says:Chirp Chirp!";
	}

}
