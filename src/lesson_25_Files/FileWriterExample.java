package lesson_25_Files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		
		 try {
	            FileWriter writer = new FileWriter("example.txt"); // overwrite mode
	            
	            writer.write("This is written by java class. \n");
	            writer.write("This is second line to write. \n");

	            writer.close(); // Always close to save changes
	            System.out.println("Successfully wrote to the file.");
	        }
		    catch (IOException e) {
	            System.out.println("An error occurred while writing to the file.");
	            e.printStackTrace();
	        }

	}

}
