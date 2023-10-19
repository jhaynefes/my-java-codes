package threads;
import java.util.Scanner;

// author @sollano_jhaynefe

public class Threads {

    public static void main(String[] args) throws InterruptedException {
        Scanner jgs = new Scanner(System.in);

        // Ask the user to name the threads
        System.out.print("Name your first thread: ");
        String threadName1 = jgs.nextLine();
        System.out.print("Name your second thread: ");
        String threadName2 = jgs.nextLine();

        Thread thread1 = new Task(threadName1);
        Thread thread2 = new Task(threadName2);

        // Show the names and states of the threads
        System.out.println(" ");
        System.out.println(thread1.getName() + " is " + thread1.getState());
        System.out.println(thread2.getName() + " is " + thread2.getState());

        // Start the threads
        System.out.println(" ");
        System.out.println("Starting the threads...");
        thread1.start();
        thread2.start();

        // Have the threads sleep for half a second
        Thread.sleep(500);
        
        // Show the names and states of the threads again
        System.out.println(" ");
        System.out.println("After sleep...");
        System.out.println(thread1.getName() + " is " + thread1.getState());
        System.out.println(thread2.getName() + " is " + thread2.getState());
    }
}

class Task extends Thread {
    public Task(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is "
                           + Thread.currentThread().getState());
    }
}
