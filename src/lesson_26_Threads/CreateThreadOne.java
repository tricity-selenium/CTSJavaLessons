package lesson_26_Threads;

class MyThread extends Thread {
    public void run() {
        // Code to run in the new thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Running Thread: " + i);
        }
    }
}

public class CreateThreadOne {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();  //Thread is CREATED here (object of MyThread)
        t1.start();                    //Thread STARTS here (new thread starts, runs run())
		
	}

}
