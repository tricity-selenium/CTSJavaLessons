package lesson_28_Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortObjects {

	public static void main(String[] args) {
		
		ArrayList<Students> marks = new ArrayList<>();
		marks.add(new Students(345, "Pawan"));
		marks.add(new Students(239, "Rakesh"));
		marks.add(new Students(456, "Mohit"));
		
		System.out.println(marks.toString());
		Collections.sort(marks);
		System.out.println(marks.toString());

	}

}
