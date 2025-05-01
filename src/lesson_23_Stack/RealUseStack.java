package lesson_23_Stack;

import java.util.Stack;

public class RealUseStack {

	public static void main(String[] args) {
	
		Stack<String> actions = new Stack<>();
		
		actions.push("Type: Hello");
		actions.push("Bold: Hello");
		actions.push("Typed: World");
		
		System.out.println(actions);
		
		actions.pop();
		actions.pop();
		
		System.out.println(actions);
		
		
		
		
		
		
		
		

	}

}
