package lesson_20_Stringbuilder;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		/*
		 * String s1 = "Java"; String s2 = s1; s1 = s1 + " Programming";
		 * System.out.println(s1); System.out.println(s2);
		 */
		
		StringBuilder s1 = new StringBuilder("Java");
		StringBuilder s2 = s1;  
		s1 = s1.append("Programming"); 
		System.out.println(s1); 
		System.out.println(s2);

	}

}
