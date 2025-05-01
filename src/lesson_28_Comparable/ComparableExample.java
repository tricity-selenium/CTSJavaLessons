package lesson_28_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Rohit", 45000));
		list.add(new Employee("Aman", 30000));
		list.add(new Employee("Mohit", 25000));
		
		Collections.sort(list);
		
		System.out.println("Sorted by Salary " + list);
 
	}

}
