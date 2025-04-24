package lesson_09_Inheritance;

public class Maruti extends Car {
	
	public void start()
	{
		System.out.println("Maruti is started");
	}
	
	@Override
	public void run()
	{
		
		System.out.println("Maruti Car is running");
		super.run();
	}

	public static void main(String[] args) {
		
		Maruti m1 = new Maruti();
		m1.start();
		m1.run();
		
		//Car c1 = new Car();
		//c1.run();
		
		
	}

}
