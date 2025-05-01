package lesson_27_LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHahsMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        // Inserting elements
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "Tom");

        // Updating a value
        students.put(102, "Bobby");

        // Display all key-value pairs
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
		

	}

}
