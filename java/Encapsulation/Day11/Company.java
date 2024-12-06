package day11;

public class Company {
	private int empId;
	private String name;
	private int age;
	private String dept;
	Company(){}
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getDept() {
		return dept;
	}
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public String toString() {
		return "Employee id is: "+empId+"\nEmployee Name is: "+name+"\nEmployee age is: "+age+"\nEmployee department is: "+dept;
	}
}
