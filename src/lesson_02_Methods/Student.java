package lesson_02_Methods;

public class Student {
	
	String studentName = "Amit";
	int studentId = 123456;
	
	//AccessModifier  ReturnType MethodName()
	private void printStudentInfo()
	{
		System.out.println("Name of Student = " + studentName);
		System.out.println("StudentId is = " + studentId);		
	}
	
	public int getTrainingFee()
	{
		return 5000;
		
	}
	
	public String getDepartment()
	{
		return "Software Testing";
		
	}
	
	public double getPercentage()
	{
		return 75.8;
	}

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.printStudentInfo();
		
		int fees = s1.getTrainingFee();
		System.out.println("Student Fees is = " + fees);
		
		String dept = s1.getDepartment();
		System.out.println("Student is of department = " + dept);
		
		double percentage = s1.getPercentage();
		System.out.println("Student Percentage is = " + percentage);

	}

}
