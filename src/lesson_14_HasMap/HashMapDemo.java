package lesson_14_HasMap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> student = new HashMap<>();
		
		student.put("Amit", 25);
		student.put("Mohit", 20);
		student.put("Rohit", 22);
		
		System.out.println(student);
		
		System.out.println(student.get("Rohit"));
		
		System.out.println(student.containsKey("Mohit"));
		
		System.out.println(student.containsValue(23));
		
		student.put("Rohit", 24);
		System.out.println(student);
		System.out.println(student.size());
		
		

	}

}
