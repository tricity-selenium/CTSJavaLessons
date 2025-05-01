package lesson_29_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Tom", 60000));
		employees.add(new Employee(301, "Jack", 23000));
		employees.add(new Employee(203, "Heath", 16000));
		
		Comparator<Employee> sortByName = new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareTo(e2.name);
            }
        };
        
        Comparator<Employee> sortById = new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e1.id - e2.id;
            }
        };
        
		Collections.sort(employees, sortByName);
		
		for(Employee e : employees)
		{
			System.out.println(e);
		}
		
		Collections.sort(employees, sortById);
		System.out.println(employees);

	}

}
