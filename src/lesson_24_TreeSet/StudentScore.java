package lesson_24_TreeSet;

import java.util.TreeSet;

public class StudentScore {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(98);
		scores.add(69);
		scores.add(84);
		scores.add(72);
		scores.add(88);
		
		System.out.println("Scores in acsecnding order = "  + scores);
		//To find the highest score
		System.out.println("Highest Score " + scores.last());
		//To find lowest score		
		System.out.println("Lowest Score = " + scores.first());

	}

}
