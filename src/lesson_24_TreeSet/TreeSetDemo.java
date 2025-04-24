package lesson_24_TreeSet;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> locations = new TreeSet<>();

        // Adding elements
		locations.add("Banglore");
		locations.add("Assam");
		locations.add("Mumbai");
		locations.add("Delhi");

        // Attempting to add duplicate
		locations.add("Banglore"); // Will be ignored

        // Displaying sorted set
        System.out.println("Sorted Locations: " + locations);

        // Accessing first and last elements
        System.out.println("First: " + locations.first());
        System.out.println("Last: " + locations.last());

        // Removing an element
        locations.remove("Delhi");
        System.out.println("After removal: " + locations);

	}

}
