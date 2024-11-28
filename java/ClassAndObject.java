package Day6;
public class ClassAndObject {
	String name=" ";
	int age;
	String dob=" ";
	long rollno;
	public static void main(String args[]) {
		ClassAndObject stud=new ClassAndObject();
		stud.name="xxx";
		stud.age=18;
		stud.dob="01 Jan 2008";
		stud.rollno=1110025376;
		System.out.println(stud.name);
		System.out.println(stud.age);
		System.out.println(stud.dob);
		System.out.println(stud.rollno);
		System.out.println(" ");
		ClassAndObject stud1=new ClassAndObject();
		stud1.name="YYY";
		stud1.age=18;
		stud1.dob="21 Mar 2008";
		stud1.rollno=1600252344;
		System.out.println(stud1.name);
		System.out.println(stud1.age);
		System.out.println(stud1.dob);
		System.out.println(stud1.rollno);
	}

}
