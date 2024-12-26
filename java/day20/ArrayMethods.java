package day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayMethods {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(70);
		al.add(92);
		al.add(7);
		al.add(22);
		System.out.println("Before sorting: "+al);
		Collections.sort(al);
		System.out.println("Ascending order");
		System.out.println("After sorting: "+al);
		System.out.println("Descending order");
		Collections.sort(al,Comparator.reverseOrder());
		System.out.println(al);
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(120);
		al2.add(50);
		al2.add(86);
		al2.add(17);
		al2.add(42);
		al2.addAll(al);
		System.out.println(al2);
		Collections.sort(al2);
		System.out.println("Ascending order"+al2);
		Collections.sort(al2,Comparator.reverseOrder());
		System.out.println("Descending order"+al2);
		al2.size();
		System.out.println(al2.size());
		
	}

}
