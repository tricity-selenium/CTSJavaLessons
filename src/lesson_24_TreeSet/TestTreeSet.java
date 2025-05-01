package lesson_24_TreeSet;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> locations = new TreeSet<>();
		locations.add("Banglore");
		locations.add("Agra");
		locations.add("Delhi");
		locations.add("Chandigarh");
		locations.add("Delhi");
		
		System.out.println("Locations in Sorted order " + locations );
		
		System.out.println(locations.first());
		System.out.println(locations.last());
		
		
		
		

	}

}
