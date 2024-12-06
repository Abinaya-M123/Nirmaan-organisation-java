package day11;

public class NirmaaanOrganization {
	public static void main(String args[]) {
		Company com=new Company();
		com.setEmpId(1243);
		com.setName("XXX");
		com.setAge(24);
		com.setDept("CSE");
		System.out.println(com.getEmpId());
		System.out.println(com.getName());
		System.out.println(com.getAge());
		System.out.println(com.getDept());
		System.out.println(com.toString());
		System.out.println();
		Company com1=new Company();
		com1.setEmpId(5634);
		com1.setName("YYY");
		com1.setAge(26);
		com1.setDept("IT");
		System.out.println(com1.getEmpId());
		System.out.println(com1.getName());
		System.out.println(com1.getAge());
		System.out.println(com1.getDept());
		System.out.println(com1.toString());
	}

}
