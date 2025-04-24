package lesson_25_Files;

import java.io.File;
import java.io.IOException;

public class FileClassDemo {

	public static void main(String[] args) {
		
		// Specify the file path
        File myFile = new File("example.txt");

        try {
            // Create a new file if it doesn't exist
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }

            // File information
            System.out.println("Absolute path: " + myFile.getAbsolutePath());
            System.out.println("Writable: " + myFile.canWrite());
            System.out.println("Readable: " + myFile.canRead());
            System.out.println("File size in bytes: " + myFile.length());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}

