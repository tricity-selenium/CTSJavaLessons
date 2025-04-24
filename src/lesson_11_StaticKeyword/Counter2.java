package lesson_11_StaticKeyword;

public class Counter2 {
	
	static int count = 1;
	
	public static void increment()
	{
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {		
		
		increment();
		

	}

}
