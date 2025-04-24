package lesson_19_ExceptionHandling;

public class TestThrow {

	public static void main(String[] args) {
		
		int age = 20;
		
		try
		{
			if(age < 18)
			{
				throw new IllegalArgumentException("Age must be greater than 18");
			}
			
			System.out.println("Eligible to Vote");	
		}
		
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
