package day17;

public class WrapperClass {
	public static void main(String[] args) {
		//AutoBoxing
		int num=10;
		Integer wrapInt=num;
		System.out.println(wrapInt);
		byte num1=20;
		Byte wrapByte=num1;
		System.out.println(wrapByte);
		long num2=100000;
		Long wrapLong=num2;
		System.out.println(wrapLong);
		short num3=56;
		Short wrapShort=num3;
		System.out.println(wrapShort);
		double num8=12.896;
		Double wrapDouble=num8;
		System.out.println(wrapDouble);
		float num10=17.867f;
		Float wrapFloat=num10;
		System.out.println(wrapFloat);
		//UnBoxing
		int num4=wrapInt;
		System.out.println(num4);
		byte num5=wrapByte;
		System.out.println(num5);
		long num6=wrapLong;
		System.out.println(num6);
		short num7=wrapShort;
		System.out.println(num7);
		double num9=wrapDouble;
		System.out.println(num9);
		float num11=wrapFloat;
		System.out.println(num11);
	}

}
