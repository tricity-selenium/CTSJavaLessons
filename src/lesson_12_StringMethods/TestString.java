package lesson_12_StringMethods;

public class TestString {

	public static void main(String[] args) {
		
		String subject = "javaseleniumtesting";
		
		int strlength = subject.length();
		System.out.println(strlength);
		
		char charat = subject.charAt(2);
		System.out.println(charat);
		
		int index = subject.indexOf('s');
		System.out.println(index);
		
		int lastindex =subject.lastIndexOf('s');
		System.out.println(lastindex);
		
		boolean iscontained = subject.contains("sel");
		System.out.println(iscontained);
		
		boolean isequal = subject.equals("javaseleniumtesting");
		System.out.println(isequal);
		
		boolean isequalIgnore = subject.equalsIgnoreCase("JAVAseleniumtesting");
		System.out.println(isequalIgnore);
		
		
	}

}
