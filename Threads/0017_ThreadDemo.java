// Original Thread class
class MyThread1 extends Thread {
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
class MyRunnable1 implements Runnable {
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

 class ThreadDemo_0017
  {
    public static void main(String[] args) throws Exception {
        // Using Thread subclass
        MyThread1 t1 = new MyThread1();
        t1.start();

        Thread.sleep(500);
        t1.interrupt(); // interrupt the thread
        System.out.println("Check using isInterrupted() (Thread class): " + t1.isInterrupted());
        Thread.sleep(500);
        System.out.println("Check again using isInterrupted() (Thread class): " + t1.isInterrupted());

        System.out.println("------------------------------------------------");

        // Using Runnable implementation
        Thread t2 = new Thread(new MyRunnable1());
        t2.start();

        Thread.sleep(500);
        t2.interrupt(); // interrupt the Runnable thread
        System.out.println("Check using isInterrupted() (Runnable): " + t2.isInterrupted());
        Thread.sleep(500);
        System.out.println("Check again using isInterrupted() (Runnable): " + t2.isInterrupted());
    }
}
