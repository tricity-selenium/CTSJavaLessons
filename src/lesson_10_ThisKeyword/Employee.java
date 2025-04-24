package lesson_10_ThisKeyword;

public class Employee {
	
	String empName;
	int empId;
	
	public Employee(String empName, int empId) 
	{		
		this.empName = empName;
		this.empId = empId;		
	}
	
	public void printEmpInfo()
	{
		System.out.println("Employee Name is = " + empName );
		System.out.println("Employee ID is = " + empId );
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Amit", 1001);
		e1.printEmpInfo();
		
	}

}
