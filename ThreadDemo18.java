
// Original Thread class
class MyThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Running... " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted!");
            }
        }
        System.out.println("Thread finished.");
    }
}

// Runnable implementation
class MyRunnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Running (Runnable)... " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Runnable sleep interrupted!");
            }
        }
        System.out.println("Runnable thread finished.");
    }
}

public class ThreadDemo18 {
    public static void main(String[] args) throws Exception {
        // Using Thread subclass
        MyThread2 t1 = new MyThread2();
        t1.start();

        Thread.sleep(500);
        t1.interrupt(); // interrupt the thread

        // Demonstrate Thread.interrupted() on main thread
        System.out.println("Main thread interrupted? " + Thread.interrupted()); // false
        System.out.println("Main thread interrupted again? " + Thread.interrupted()); // false, still false

        t1.join();

        System.out.println("-----------------------------------");

        // Using Runnable implementation
        Thread t2 = new Thread(new MyRunnable2());
        t2.start();

        Thread.sleep(500);
        t2.interrupt(); // interrupt Runnable thread

        // Demonstrate Thread.interrupted() on main thread again
        System.out.println("Main thread interrupted? " + Thread.interrupted()); // false
        t2.join();

        System.out.println("ThreadDemo18 finished.");
    }
}

