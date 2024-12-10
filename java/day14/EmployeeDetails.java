package day14;

public class EmployeeDetails {
		private int empId;
		private String empName;
		private String empDept;
		private double salary;
		public EmployeeDetails() {
		}
		public EmployeeDetails(int empId,String empName,String empDept,double salary){
			this.empId=empId;
			this.empName=empName;
			this.empDept=empDept;
			this.salary=salary;
		}
		public int getEmpId() {
			return empId;
		}
	  	public String getEmpName() {
			return empName;
		}
	  	public String getEmpDept() {
			return empDept;
		}
	  	public double getSalary() {
			return salary;
		}
	  	public void setEmpId(int empId) {
			this.empId=empId;
		}
	  	public void setEmpName(String empName) {
			this.empName=empName;
		}
	  	public void setEmpDept(String empDept) {
			this.empDept=empDept;
		}
	  	public void setSalary(double salary) {
			this.salary=salary;
		}
	  	public String toString() {
			return "Employee Id Is: "+empId+"\nEmployee Name Is: "+empName+"\nEmployee Department Is: "+empDept+"\nEmployee Salary Is : "+salary;
		}
		

	}


