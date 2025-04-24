package lesson_08_Arrays;

public class TestArray {

	public static void main(String[] args) {
		
		int empIds[] = {101, 234, 610, 355, 555, 444, 666};
		
		System.out.println(empIds[0]);
		System.out.println(empIds[4]);
		
		int totalEmps = empIds.length;
		System.out.println(totalEmps);
		
		for(int i = 0; i < totalEmps; i++ )
		{
			System.out.println(empIds[i]);
		}
		

	}

}
