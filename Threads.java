public class Threads extends Thread {
    public static void main(String[] args) {
        Threads thread = new Threads();
        thread.run();
        System.out.println("This code is running outside a thread");
        System.out.println("This code is running outside a thread");
        System.out.println("This code is running outside a thread");
        System.out.println("This code is running outside a thread");
    }
    // ----- Java Threads
        // Threads allows a program to operate more efficiently by doing multiple things at the same time
        // Threads can be used to perform complicated tasks in the background without interrupting the main program

        // --- Creating a Thread
        // There are two ways to create a thread
        // 1. It can be created by extending the Thread class and overriding its run() method
    public void run() {
        System.out.println("This code is running in a thread");
    }
    
}