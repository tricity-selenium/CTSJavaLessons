package lesson_26_Threads;

class MyRunnable implements Runnable
{
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++)
		{
            System.out.println("Running Runnable: " + i);
		}
    }
}

public class CreateThreadTwo {

	public static void main(String[] args) {
		
		MyRunnable r = new MyRunnable();        // Create Runnable object(Task) Not a Thread
        Thread t = new Thread(r);               // Thread is Created here and Wrap it(r) in a Thread object
        t.start();                              // Start the thread
		

	}

}
