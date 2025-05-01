package lesson_14_HasMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Students {

	public static void main(String[] args) {
		
		HashMap<Integer, String> students = new HashMap<>();
		System.out.println(students);
		students.put(201, "Anit");
		students.put(245, "Mohit");
		students.put(301, "Praveen");
		System.out.println(students);
		
		System.out.println(students.get(245));		
		System.out.println(students.size());
		students.put(301, "Rakesh");
		System.out.println(students);
		
		System.out.println(students.containsKey(201));
		
		System.out.println(students.containsValue("Praveen"));
		
		Iterator<Map.Entry<Integer, String>> it = students.entrySet().iterator();
		
		while(it.hasNext())
		{
		 Map.Entry<Integer, String>	 entry = it.next();
		 System.out.println(entry.getKey() + "   " + entry.getValue());
		}
		

	}

}
