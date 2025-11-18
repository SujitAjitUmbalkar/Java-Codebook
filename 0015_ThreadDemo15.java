// Extending Thread
class MyThread7 extends Thread {
    public void run() { 
        System.out.println("Daemon (extends Thread)? " + isDaemon()); 
    }
}

// Implementing Runnable
class MyRunnable7 implements Runnable {
    public void run() { 
        System.out.println("Daemon (implements Runnable)? " + Thread.currentThread().isDaemon()); 
    }
}

public class 0015_ThreadDemo15 
{
    public static void main(String[] args) {
        // Using Thread class
        MyThread7 t1 = new MyThread7();
        t1.setDaemon(true);   // Must set before start()
        t1.start();

        // Using Runnable
        MyRunnable7 r = new MyRunnable7();
        Thread t2 = new Thread(r);
        t2.setDaemon(false);  // Default is false, but showing explicitly
        t2.start();
    }
}

