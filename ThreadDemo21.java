// Thread subclass
class MyThreadJoin extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread class working... " + i);
            try {
                Thread.sleep(500); // simulate some work
            } catch (InterruptedException e) {
                System.out.println("Thread class interrupted during sleep!");
            }
        }
        System.out.println("Thread class finished.");
    }
}

// Runnable implementation
class MyRunnableJoin implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable working... " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Runnable interrupted during sleep!");
            }
        }
        System.out.println("Runnable finished.");
    }
}

public class ThreadDemo21 {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("=== Using Thread subclass ===");
        MyThreadJoin t1 = new MyThreadJoin();
        t1.start();

        // main waits until t1 finishes
        System.out.println("Main waiting for t1 using join()...");
        t1.join();
        System.out.println("Main continues after t1 finished.");

        System.out.println("\n=== Using Runnable implementation ===");
        Thread t2 = new Thread(new MyRunnableJoin());
        t2.start();

        // main waits only for 1 second, even if t2 is still running
        System.out.println("Main waiting for t2 using join(1000)...");
        t2.join(1000);
        System.out.println("Main continues after join(1000) timeout (t2 may still be running).");

        // wait fully to ensure t2 completes before main exits
        t2.join();
        System.out.println("Main thread finished.");
    }
}
