package lesson_26_Threads;

class MyCustomThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Custom Thread - Count: " + i +
                               " | Running in: " + Thread.currentThread().getName());
        }
    }
}

public class MainAndCustomThread {

	public static void main(String[] args) {
		
		System.out.println("Main Thread starts | Name: " + Thread.currentThread().getName());

        // Create and start custom thread
        MyCustomThread t1 = new MyCustomThread();
        t1.start();

        // Continue executing in main thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread - Count: " + i +
                               " | Running in: " + Thread.currentThread().getName());
        }

        System.out.println("Main Thread ends");
		

	}

}
