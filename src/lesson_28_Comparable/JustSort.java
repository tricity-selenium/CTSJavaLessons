package lesson_28_Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class JustSort {

	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(86);
		marks.add(75);
		marks.add(60);
		marks.add(47);
		System.out.println(marks);
		Collections.sort(marks);
		System.out.println(marks);

	}

}
