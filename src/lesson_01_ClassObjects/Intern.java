package lesson_01_ClassObjects;

public class Intern {
	
	String internName = "Amit";
	int internId = 123456;
	
	public void printInternInfo()
	{
		System.out.println("Name of intern = " + internName);
		System.out.println("InternId is = " + internId);		
	}

	public static void main(String[] args) {
		
		//className objectName = new classname();
		Intern ob1 = new Intern();		
		ob1.printInternInfo();
		
		Intern ob2 = new Intern();
		ob2.printInternInfo();
		
		

	}

}
