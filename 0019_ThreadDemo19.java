
 // Thread subclass
class MyThread3 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread class running... " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Thread class sleep interrupted!");
                break;
            }
            // Check isInterrupted() inside thread
            System.out.println("Thread class isInterrupted()? " + this.isInterrupted());
        }

        // Check Thread.interrupted() inside thread (resets flag)
        System.out.println("Thread class Thread.interrupted()? " + Thread.interrupted());
        System.out.println("Thread class finished.");
    }
}

// Runnable implementation
class MyRunnable3 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable running... " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Runnable sleep interrupted!");
                break;
            }
            // Check isInterrupted() inside thread
            System.out.println("Runnable isInterrupted()? " + Thread.currentThread().isInterrupted());
        }

        // Check Thread.interrupted() inside thread (resets flag)
        System.out.println("Runnable Thread.interrupted()? " + Thread.interrupted());
        System.out.println("Runnable finished.");
    }
}

public class 0019_ThreadDemo19 {
    public static void main(String[] args) throws Exception {
        System.out.println("=== Using Thread subclass ===");
        MyThread3 t1 = new MyThread3();
        t1.start();

        Thread.sleep(700);
        t1.interrupt(); // interrupt the thread

        System.out.println("Main checking t1.isInterrupted(): " + t1.isInterrupted()); // true
        System.out.println("Main checking Thread.interrupted(): " + Thread.interrupted()); // false (main thread)
        t1.join();

        System.out.println("\n=== Using Runnable implementation ===");
        Thread t2 = new Thread(new MyRunnable3());
        t2.start();

        Thread.sleep(700);
        t2.interrupt(); // interrupt the Runnable thread

        System.out.println("Main checking t2.isInterrupted(): " + t2.isInterrupted()); // true
        System.out.println("Main checking Thread.interrupted(): " + Thread.interrupted()); // false (main thread)
        t2.join();

        System.out.println("\nDemo complete.");
    }
}

