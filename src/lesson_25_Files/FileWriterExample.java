package lesson_25_Files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		
		 try {
	            FileWriter writer = new FileWriter("writeexample.txt"); // overwrite mode
	            
	            
	            writer.append("Append1");
	           

	            writer.close(); // Always close to save changes
	            System.out.println("Successfully wrote to the file.");
	        }
		    catch (IOException e) {
	            System.out.println("An error occurred while writing to the file.");
	            e.printStackTrace();
	        }

	}

}
