package lesson_19_ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedThrows {

	public void dowork() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("note.txt");
		String s = "qa";
		System.out.println(s.toLowerCase());
	}

}
