package lesson_23_Stack;

import java.util.Stack;

public class UndoFeature {

	public static void main(String[] args) {
		
		Stack<String> actions = new Stack<>();

        actions.push("Typed: Hello");
        actions.push("Bold: Hello");
        actions.push("Typed: World");

        System.out.println("Undo: " + actions.pop());
        System.out.println("Undo: " + actions.pop());
        System.out.println("Current state: " + actions.peek());

	}

}
