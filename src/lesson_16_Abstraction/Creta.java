package lesson_16_Abstraction;

public class Creta extends Car{
	
	@Override
	void ignition() {
		
		System.out.println("Ignition for creta");
	}

	@Override
	void accelerate() {
		
		
	}

	@Override
	void brake() {
		
		
	}

	public static void main(String[] args) {
		
		Creta c1 = new Creta();
		c1.ignition();
		c1.run();
		
	}

	
}
