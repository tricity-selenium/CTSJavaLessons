package lesson_04_Constructor;

public class Employee {
	
	int EmpId;
	String EmpName;
	String EmpDept;
	
	public void printEmpInfo()
	{
		System.out.println("Employee ID is = " + EmpId);
		System.out.println("Employee name is = " + EmpName);
		System.out.println("Employee Department is = " + EmpDept);
	}
	
	public Employee()
	{
		System.out.println("I am in Defult Constructor");
	}
	
	public Employee(int eid, String name)
	{
		EmpId = eid;
		EmpName = name;
		System.out.println("Employee ID is = " + EmpId);
		System.out.println("Employee name is = " + EmpName);
		System.out.println("Employee Department is = " + EmpDept);
	}
	
	public Employee(int eid, String name, String dept)
	{
		EmpId = eid;
		EmpName = name;
		EmpDept = dept;
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		//e1.printEmpInfo();
		
		Employee e2 = new Employee(20251, "Amit");
		//e2.printEmpInfo();
		
		Employee e3 = new Employee(20252, "Sumit");
		//e3.printEmpInfo();
		
		Employee e4 = new Employee(20253, "Anil", "QA");
		//e4.printEmpInfo();
		
		
		
		
		
		

	}

}
