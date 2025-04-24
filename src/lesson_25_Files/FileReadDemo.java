package lesson_25_Files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) throws IOException {
		
		try {
			FileReader reader = new FileReader("output.txt");
			int character;
			
			while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();
						
		} 
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
