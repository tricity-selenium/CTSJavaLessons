package lesson_22_LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		 LinkedList<String> list = new LinkedList<>();

	        // Add elements
	        list.add("Java");
	        list.add("Python");
	        list.add("C++");

	        // Print list
	        System.out.println("LinkedList: " + list);

	        // Remove an element
	        list.remove("Python");
	        System.out.println("After removal: " + list);

	        // Access an element
	        System.out.println("First Element: " + list.get(0));

	}

}
