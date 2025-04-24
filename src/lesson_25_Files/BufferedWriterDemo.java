package lesson_25_Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		
		 try {
	            // true enables append mode, false will overwrite
	            BufferedWriter writer = new BufferedWriter(new FileWriter("note.txt", false));

	            writer.write("Overwrite will be there");
	          //  writer.newLine(); // Adds a new line
	           // writer.write("This line is added using BufferedWriter.");
	           // writer.newLine();
	           // writer.write("This is the third line");
	            
	            writer.close(); // Always close after writing
	            System.out.println("Data written successfully.");
	        } catch (IOException e) {
	            System.out.println("An error occurred while writing the file.");
	            e.printStackTrace();
	        }
		

	}

}
