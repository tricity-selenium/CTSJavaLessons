package lesson_19_ExceptionHandling;

public class TestException {

	public static void main(String[] args) {
		
		int num = 15;
		int num2 = 3;
		int result = 0;
		String name = "mohit";
		int age[] = {23, 22, 21, 20};
		
		try
		{
			result = num/num2;
			System.out.println(name.length());
			System.out.println(age[5]);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
								
		System.out.println(result);		
		System.out.println("Rest of the program");
		
	}

}
