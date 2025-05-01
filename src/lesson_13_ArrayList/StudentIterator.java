package lesson_13_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentIterator {

	public static void main(String[] args) {
		
		ArrayList<String> studentlist = new ArrayList<>();
		
		studentlist.add("Pankaj");
		studentlist.add("Sunit");
		studentlist.add("Anil");
		studentlist.add("Pawan");
		
		System.out.println(studentlist);
		
		Iterator<String> it = studentlist.iterator();
		while(it.hasNext())
		{
			String studentName = it.next();
			System.out.println(studentName);
		}
	
		
		/*
		 * Iterator<String> it = studentlist.iterator(); while(it.hasNext()) { String
		 * studentname = it.next(); System.out.println(studentname); }
		 */
	}

}
