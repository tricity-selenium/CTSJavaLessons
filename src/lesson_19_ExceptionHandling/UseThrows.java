package lesson_19_ExceptionHandling;

import java.io.FileNotFoundException;

public class UseThrows {

	public static void main(String[] args) {
		
		CheckedThrows c1 = new CheckedThrows();
		try {
			c1.dowork();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
