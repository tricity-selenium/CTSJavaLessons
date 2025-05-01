package lesson_26_Threads;

public class NoThreadExample {
	
	static void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
    }

    static void printLetters() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Letter: " + c);
        }
    }  

	public static void main(String[] args) {

		printNumbers();
		printLetters();

	}

}
