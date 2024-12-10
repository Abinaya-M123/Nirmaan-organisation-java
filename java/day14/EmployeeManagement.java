package day14;

import java.util.Scanner;
public class EmployeeManagement {
	public static void main(String[] args) {
		EmployeeDetails ed=null;
	
		Scanner sc=new Scanner(System.in);
		boolean isTrue=true;
		while(isTrue) {
		System.out.println("Enter your choice:");
		System.out.println("Enter 1 for Add Employee Details");
		System.out.println("Enter 2 for Update Employee Details");
		System.out.println("Enter 3 for Display Employee Details");
		System.out.println("Enter 0 for Exit");
		int key=sc.nextInt();
		sc.nextLine();
		switch(key){
			case 1:
			{
				System.out.println("Enter the Employee Id:");
				int empId=sc.nextInt();
				
				sc.nextLine();
				System.out.println("Enter the Employee Name:");
				String empName=sc.nextLine();
				
				System.out.println("Enter the Employee Department:");
				String empDept=sc.nextLine();
				
				System.out.println("Enter the Employee Salary");
				double salary=sc.nextDouble();
			
				ed = new EmployeeDetails(empId, empName, empDept, salary);
				break;
			}
			case 2:
			{
				System.out.println("Enter the Employee Id:");
				int empId=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the Employee Name:");
				String empName=sc.nextLine();
				System.out.println("Enter the Employee Department:");
				String empDept=sc.nextLine();
				System.out.println("Enter the Employee Salary");
				double salary=sc.nextDouble();
			    ed=new EmployeeDetails(empId,empName,empDept,salary);
				ed.setEmpId(empId);
				ed.setEmpName(empName);
				ed.setEmpDept(empDept);
				ed.setSalary(salary); 
				System.out.println(ed);
				break;
			}
			case 3:
			{
				System.out.println(ed);
				System.out.println();
				break;
			}
			case 0:
			{
				isTrue=false;
				System.out.println("Thank you");
				break;
			}
			default:
			{
				System.out.println("Enter the valid choice");
				break;
			}
			
		}
	}
		sc.close();

}
}
