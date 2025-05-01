package lesson_25_Files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("FileToWrite.txt", true);
			writer.write("  This is latest line \n");
			writer.close();
			System.out.println("Write operation done");
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	}

}
