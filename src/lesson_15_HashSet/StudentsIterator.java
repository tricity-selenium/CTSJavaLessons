package lesson_15_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class StudentsIterator {

	public static void main(String[] args) {
		
		HashSet<String> student = new HashSet<>();
		
		student.add("Amit");
		student.add("Mohit");
		student.add("Pankaj");
		student.add("Rakesh");
		student.add("Amar");
		
		System.out.println(student);
		
		Iterator<String> myiterator = student.iterator();
		
		while(myiterator.hasNext())
		{
			String studentName = myiterator.next();
			System.out.println(studentName);
			
		}
		
		
	}

}
