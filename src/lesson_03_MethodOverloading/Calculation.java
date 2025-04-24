package lesson_03_MethodOverloading;

public class Calculation {
	
	public void Addition(int a, int b)
	{
		System.out.println("Sum of Two Integers is = " + (a+b));
				
	}
	
	public void Addition(int a, int b, int c)
	{
		System.out.println("Sum of Three Integers is = " + (a+b+c));
	}
	
	public void Addition(double d1, double d2)
	{
		System.out.println("Sum of Two Doubles is = " + (d1+d2));
	}

	public static void main(String[] args) {
		
		Calculation c1 = new Calculation();
		c1.Addition(1.4, 2.1);
		c1.Addition(3, 5, 6);
		c1.Addition(4, 5);

	}

}
