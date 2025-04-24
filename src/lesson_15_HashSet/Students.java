package lesson_15_HashSet;

import java.util.HashSet;

public class Students {

	public static void main(String[] args) {
		
		HashSet<String> student = new HashSet<>();
		
		student.add("Amit");
		student.add("Mohit");
		student.add("Pankaj");
		System.out.println(student);
		student.add("Pankaj");
		System.out.println(student);
		System.out.println(student.size());
		System.out.println(student.contains("Amit"));
		System.out.println(student.isEmpty());
		
		

	}

}
