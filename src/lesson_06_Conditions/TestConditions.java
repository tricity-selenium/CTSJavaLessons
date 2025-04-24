package lesson_06_Conditions;

public class TestConditions {

	public static void main(String[] args) {
		
		int age = 17;
		
		if(age >= 21)
		{
			System.out.println("Eligible to Vote");
		}
		
		else if(age >= 18)
		{
			System.out.println("You can enroll to Vote");
		}
		else
		{
			System.out.println("Wait few years");
		}

	}

}
