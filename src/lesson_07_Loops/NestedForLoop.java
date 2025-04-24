package lesson_07_Loops;

public class NestedForLoop {

	public static void main(String[] args) {
		
		for(int a = 1; a <= 5; a++)
		{
			System.out.println("value of a  = " + a );
			
			for(int b=1; b <=5; b++)
			{
				System.out.println("value of b = " + b);
			}
			
		}
	}
}
