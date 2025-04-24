package lesson_25_Files;

import java.io.File;
import java.io.IOException;

public class FileClassDemo2 {

	public static void main(String[] args) {
		
		File newfile = new File("example.txt");
		
		try 
		{
			if(newfile.createNewFile())
			{
				System.out.println("File created: " + newfile.getName());
			}
			else {
                System.out.println("File already exists.");
            }
			
		}
		
		catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
		
		

	}

}
