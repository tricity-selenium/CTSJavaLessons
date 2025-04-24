package lesson_23_Stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        // Peek top element without removing
        System.out.println("Top element: " + stack.peek());

        // Popping elements
        System.out.println("Popped: " + stack.pop());
        System.out.println("After pop, top is: " + stack.peek());

        // Checking if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
		

	}

}
