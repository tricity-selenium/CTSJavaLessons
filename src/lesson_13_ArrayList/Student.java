package lesson_13_ArrayList;

import java.util.ArrayList;

public class Student {

	public static void main(String[] args) {
		
		ArrayList<String> studentlist = new ArrayList<>();
		
		studentlist.add("Pankaj");
		studentlist.add("Sunit");
		studentlist.add("Anil");
		
		System.out.println(studentlist);		
		
		System.out.println(studentlist.get(1));
		
		System.out.println(studentlist.contains("Anil"));
		
		studentlist.add(1, "Mohit");
		
		System.out.println(studentlist);
		
		studentlist.add("Praveen");
		System.out.println(studentlist);
		
		
		System.out.println(studentlist.size());
		
		studentlist.remove(0);
		System.out.println(studentlist);
		
		System.out.println(studentlist.isEmpty());
		
		
	}

}
