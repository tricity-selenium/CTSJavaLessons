package lesson_26_Threads;

class MyThreadMethods extends Thread {
    public void run() {
        System.out.println(getName() + " started.");
        try {
            Thread.sleep(2000);  // Pauses for 2 seconds
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }
        System.out.println(getName() + " finished.");
    }
}

public class ThreadMethodsExample {

	public static void main(String[] args) throws InterruptedException {
		
		MyThreadMethods t1 = new MyThreadMethods();
		t1.setName("Worker-1");

        System.out.println("Is " + t1.getName() + " alive? " + t1.isAlive());  // false

        t1.start();  // Starts the thread

        System.out.println("Is " + t1.getName() + " alive after start()? " + t1.isAlive());  // true

        t1.join();  // Main thread waits for t1 to finish

        System.out.println("Is " + t1.getName() + " alive after join()? " + t1.isAlive());  // false
        System.out.println("Main thread finished.");

	}

}
