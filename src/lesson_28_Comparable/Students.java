package lesson_28_Comparable;

public class Students implements Comparable<Students>{
	
	int rollNo;
	String Name;
	
	@Override
	public int compareTo(Students o) {
		
		return this.rollNo - o.rollNo;
	}
	
	@Override
	public String toString()
	{
		return rollNo + "  " + Name;
		
	}
	
	public Students(int rollNo, String Name)
	{
		this.rollNo = rollNo;
		this.Name = Name;
	}

	
	
	

}
