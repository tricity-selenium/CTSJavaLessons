package lesson_14_HasMap;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {

       String book = "letuslearnjavaandselenium";
       
       HashMap<Character, Integer> map = new HashMap<>();
       
       for(int i = 0; i < book.length(); i++)
       {
    	   char ch = book.charAt(i);
    	   
    	   if(map.containsKey(ch))
    	   {
    		   int val = map.get(ch);
    		   map.put(ch, val+1);
    	   }
    	   else
    	   {
    		   map.put(ch, 1);
    	   }
    	   
       }
       
       System.out.println(map);

	}

}
