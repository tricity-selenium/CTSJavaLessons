package lesson_04_Constructor;

public class Calculation {
	
	int num1;
	String name;
	
	public void printinfo()
	{
		System.out.println("Value of Num1 is = " + num1);
		System.out.println("Value of name is = " + name);
	}

	public static void main(String[] args) {
		
		Calculation c1 = new Calculation();
		c1.printinfo();

	}

}
