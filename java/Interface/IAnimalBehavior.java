package day16;

public interface IAnimalBehavior {
	String Catogory="Living Being";
	static String isMammal(String animalName) {
		if (animalName.equalsIgnoreCase("Cat")||animalName.equalsIgnoreCase("dog")||animalName.equalsIgnoreCase("human")) {
			return "true";
			
		}
		else {
			return "false";
		}
	}
	default String speak() {
		return "Animal is making sound";
	}
	void move();

}
