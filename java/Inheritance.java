package day13;
class Animal{
	void makeSound() {
		System.out.println("The Animal makes sound");
	}
	}
class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("The Dog Barks");
	}
	}
class Cat extends Animal{
	@Override
	void makeSound() {
		System.out.println("The Cat Meows");
	}
}


public class Inheritance {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.makeSound();
		Cat c=new Cat();
		c.makeSound();
	}
}
