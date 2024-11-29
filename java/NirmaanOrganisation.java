package Day7;

public class NirmaanOrganisation {
	int empid=0;
	String name="";
	int salary =0;
	String dept="";
	void loginIn(String sign) {
		System.out.println(sign);
	}
	void logOut(String signed) {
		System.out.println(signed);
	}
	public static void main(String args[]) {
//		for(int i=1;i<=200;i++) {
//			if(i==50) {
//				continue;
//			}
//			else if(i==101) {
//				break;
//			}
//			else {
//				System.out.println(i);
//			}
////		}
//		String name="Abinaya";
//		System.out.println(name.toUpperCase());
//		System.out.println(name.toLowerCase());
		NirmaanOrganisation nrg=new NirmaanOrganisation();
		nrg.empid=4563;
		nrg.name="XXX";
		nrg.salary=20000;
		nrg.dept="CSE";
		nrg.loginIn("Welcome");
		System.out.println(nrg.empid);
		System.out.println(nrg.name);
		System.out.println(nrg.salary);
		System.out.println(nrg.dept);
		nrg.logOut("Thank You");
		System.out.println("");
		NirmaanOrganisation nrg1=new NirmaanOrganisation();
		nrg1.empid=4565;
		nrg1.name="YYY";
		nrg1.salary=21000;
		nrg1.dept="IT";
		nrg.loginIn("Welcome");
		System.out.println(nrg1.empid);
		System.out.println(nrg1.name);
		System.out.println(nrg1.salary);
		System.out.println(nrg1.dept);
		nrg.logOut("Thank You");
	}

}
