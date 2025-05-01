package lesson_28_Comparable;

public class Employee implements Comparable<Employee> {

	String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    
	@Override
	public int compareTo(Employee o) {
		
		return this.salary - o.salary;
	}
	
	public String toString() {
	       return name + " (" + salary + ")";
	  }

}
