
public class Threads2 implements Runnable {
    public static int amount = 0;
    public static void main(String[] args) {
        Threads2 obj = new Threads2();
        // obj.run();
        Thread thread = new Thread(obj);
        thread.start();

        
        // --- Concurrency Problems
        // Because threads run at the smae time as other parts of the program, 
        // there is no way to know in which order the code will run. When the threads and main program are reading and writing the same variables,
        // the values are unpredictable. The problems that result from this are called concurrency problems.

        // To avoid concurrenct problems, it is best to share as few attributes between threads as possible
        // If attributes need to be shared, one possible solution is to use the isAlive() method of the thread to check whether the threads has finished running before using any attributes that the thread can change

        // Wait for the thread to finish
        while (thread.isAlive()) {
            System.out.println("Waiting...");
        }
        System.out.println("This code is running outside a thread");
        System.out.println("main: " + amount);
        amount++;
        System.out.println("main: " + amount);
    }
    public void run() {
        System.out.println("This code is running in a thread");
        amount++;
        System.out.println("thread: " + amount);
    }
    
}