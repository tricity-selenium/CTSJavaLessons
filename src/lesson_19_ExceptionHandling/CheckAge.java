package lesson_19_ExceptionHandling;

public class CheckAge {
	
	static void isvalidage(int age) throws TestCustom
	{
		if(age <18)
		{
			throw new TestCustom("Invalid age, please check again");
		}
		
		else
		{
			System.out.println("valid");
		}
	}

	public static void main(String[] args) {
	
		try {
			isvalidage(15);
		} catch (TestCustom e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
