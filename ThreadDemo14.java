class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread (which extends Thread) started, going to sleep...");
            Thread.sleep(2000);  // Thread in TIMED_WAITING
            System.out.println("Thread (which extends Thread) woke up, finishing...");
        } catch (Exception e) {}
    }
}

// Runnable version
class MyRunnable implements Runnable {
    public void run() {
        try {
            System.out.println("Thread (which implements Runnable) started, going to sleep...");
            Thread.sleep(2000);  // Thread in TIMED_WAITING
            System.out.println("Thread (which implements Runnable) woke up, finishing...");
        } catch (Exception e) {}
    }
} 

public class ThreadDemo14 {
    public static void main(String[] args) throws Exception {
        // Thread class approach
        MyThread t1 = new MyThread();
        System.out.println("Before start t1: " + t1.isAlive()); // false
        t1.start();
        System.out.println("After start t1: " + t1.isAlive());  // true

        Thread.sleep(500);
        System.out.println("While sleeping t1: " + t1.isAlive()); // true

        // Runnable interface approach
        MyRunnable r = new MyRunnable();
        Thread t2 = new Thread(r);
        System.out.println("Before start t2: " + t2.isAlive()); // false
        t2.start();
        System.out.println("After start t2: " + t2.isAlive());  // true

        Thread.sleep(500);
        System.out.println("While sleeping t2: " + t2.isAlive()); // true

        // Wait for both threads
        t1.join();
        t2.join();

        System.out.println("After join t1: " + t1.isAlive()); // false
        System.out.println("After join t2: " + t2.isAlive()); // false
    }
}
