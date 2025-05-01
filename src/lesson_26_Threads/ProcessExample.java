package lesson_26_Threads;

import java.io.IOException;

public class ProcessExample {

	public static void main(String[] args) {
		
		 try {
	            System.out.println("Main Program Running in: " + Thread.currentThread().getName());

	            // Launch a new process (e.g., Notepad on Windows)
	            Process p = Runtime.getRuntime().exec("notepad");

	            System.out.println("New Process Started: Notepad");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
