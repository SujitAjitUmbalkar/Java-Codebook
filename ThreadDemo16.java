class MyRunnable implements Runnable {
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Working...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted during sleep!");
                break; // exit loop
            }
        }
    }
}

public class ThreadDemo16 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
        
        // Give some time to see the thread working
        try {
            Thread.sleep(2000);         // main thread is waiting 
        } catch (InterruptedException e) {
            
        }
        
        t.interrupt(); // signal the thread to stop
    }
}


/*
        try {
    Thread.sleep(2000);
} catch (InterruptedException e) {
    e.printStackTrace();
}

-----------------------------------------------------

 *     Thread.sleep(2000); → pauses the main thread (the one running main()) for 2000 milliseconds (2 seconds).

During this 2 seconds, the other thread (t) keeps running and printing "Working...".

After 2 seconds, the main thread continues and calls t.interrupt(), signaling t to stop.

Why we need it:

Without this sleep, t.interrupt() could be called immediately, and you might not see "Working..." printed at all because the thread gets interrupted too quickly.

✅ So this sleep is just for demonstration purposes, to let the thread run for a short time before being interrupted.
 * 
 */