package lesson_23_Stack;

import java.util.Stack;

public class TestStackDemo {

	public static void main(String[] args) {
		
		Stack<String> codinglangs = new Stack<>();
		
		System.out.println(codinglangs.isEmpty());
		
		codinglangs.push("Java");
		codinglangs.push("Python");
		codinglangs.push("PHP");
		
		System.out.println(codinglangs);
		
		System.out.println(codinglangs.peek());
		
		codinglangs.pop();
		
		System.out.println("After pop = " +  codinglangs);
		
		

	}

}
