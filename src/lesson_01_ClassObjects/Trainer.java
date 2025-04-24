package lesson_01_ClassObjects;

public class Trainer {
	
	String trainerName = "Cognizant";
	int trainerId = 102030;
	
	public void printTrainerInfo()
	{
		System.out.println("Name of Trainer is = " +trainerName );
		System.out.println("Trainer Id is = " +trainerId );
	}

	public static void main(String[] args) {
		
		Trainer t1 = new Trainer();
		t1.printTrainerInfo();
		
		Intern ob1 = new Intern();
		ob1.printInternInfo();

	}

}
