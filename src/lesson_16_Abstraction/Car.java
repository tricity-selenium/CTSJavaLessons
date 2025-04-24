package lesson_16_Abstraction;

public abstract class Car {
	
	abstract void ignition();
	abstract void accelerate();
	abstract void brake();
	
	public void run()
	{
		System.out.println("Car is running");
	}
	

	
}
