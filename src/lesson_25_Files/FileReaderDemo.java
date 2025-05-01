package lesson_25_Files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader reader = new FileReader("sample.txt");
		int charascicode;
		
		try {
			while((charascicode = reader.read()) != -1)
			{
				System.out.print((char) charascicode);
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
