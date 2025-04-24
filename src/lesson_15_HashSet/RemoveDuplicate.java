package lesson_15_HashSet;

import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String students[] = {"Amar", "Amit", "Pankaj", "Amar", "Amit"};
		
		HashSet<String> studentset = new HashSet<>();
		
		for(int i =0; i < students.length; i++)
		{
			studentset.add(students[i]);
		}
		
		System.out.println(studentset);

	}

}
