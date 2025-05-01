package lesson_14_HasMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapIterator {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(201, "Anit");
		map.put(245, "Mohit");
		map.put(301, "Praveen");
		
		Iterator<Entry<Integer, String>> it = map.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer, String> entry = it.next();
			System.out.println("Key = " + entry.getKey());
			System.out.println("Value = " + entry.getValue());
					
		}
		
		
 
	}

}
