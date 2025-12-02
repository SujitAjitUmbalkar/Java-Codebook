// Thread subclass
class MyThreadYield extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread class running: " + i);
            Thread.yield(); // suggest scheduler to give chance to others
        }
        System.out.println("Thread class finished.");
    }
}

// Runnable implementation
class MyRunnableYield implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable running: " + i);
            Thread.yield(); // suggest scheduler to give chance to others
        }
        System.out.println("Runnable finished.");
    }
}

 class ThreadDemo_0022
  {
    public static void main(String[] args) {
        System.out.println("=== Using Thread subclass ===");
        MyThreadYield t1 = new MyThreadYield();
        t1.start();

        System.out.println("=== Using Runnable implementation ===");
        Thread t2 = new Thread(new MyRunnableYield());
        t2.start();

        // Main thread also prints
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread running: " + i);
            Thread.yield();
        }
        System.out.println("Main thread finished.");
    }
}
