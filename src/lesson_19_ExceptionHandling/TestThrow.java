package lesson_19_ExceptionHandling;

public class TestThrow {

	public static void main(String[] args) {
		
		int age = 17;
		 
		  try {
			if(age < 18)
			{
				throw new ArithmeticException("Age must be greater than 18");
			}
			
			else {
				System.out.println("Eligible to Vote");	
				}
		  }
		  
		  catch(Exception e)
		  {
			  System.out.println(e.getMessage());	
		  }
			
		
		
		
	}

}
