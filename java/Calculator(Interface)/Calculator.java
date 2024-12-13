package day15;

public class Calculator implements ICalculator {

	@Override
	public void add(int a, int b) {
		System.out.println("Addition:"+(a+b));
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("Subtraction:"+(a-b));
		
	}

	@Override
	public void mul(int a, int b) {
		
		System.out.println("Multiplication:"+(a*b));
	}

	@Override
	public void div(int a, int b) {
		
		System.out.println("Division:"+(a/b));
	}

	@Override
	public void mod(int a, int b) {
		
		System.out.println("Modulus:"+(a%b));
	}
	
}
