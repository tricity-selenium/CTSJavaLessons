package lesson_11_StaticKeyword;

public class Counter {
	
	static int count = 1;
	
	public void increment()
	{
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {		
		
		Counter c1 = new Counter();
		c1.increment();		
		c1.increment();
		Counter c2 = new Counter();
		c2.increment();	
		c2.increment();	
		c2.increment();	
		//Counter c3 = new Counter();
		//c3.increment();

	}

}
