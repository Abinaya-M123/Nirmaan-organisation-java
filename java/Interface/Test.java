package day16;

public class Test {
	public static void main(String[] args) {
		Dog d=new Dog();
		System.out.println(IAnimalBehavior.isMammal("Dog"));
		System.out.println(IAnimalBehavior.Catogory);
		d.move();
		System.out.println(d.speak());
		Bird b=new Bird();
		System.out.println(IAnimalBehavior.isMammal("Cat"));
		System.out.println(IAnimalBehavior.Catogory);
		b.move();
		System.out.println(b.speak());
	}

}
