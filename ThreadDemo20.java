
// Example: Using Thread.sleep() in both worker threads and main thread

class MyRunnable implements Runnable 
{
    @Override
    public void run() 
    {
        for (int i = 1; i <= 5; i++) {
            System.out.println("[Runnable] Task running... " + i);
            try 
            {
                Thread.sleep(500); // Sleep inside worker thread
            } catch (InterruptedException e) 
            {
                System.out.println("[Runnable] Sleep interrupted!");
            }
        }
    }
}

class MyThread extends Thread 
{
    @Override
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("[Thread] Task running... " + i);
            try 
            {
                Thread.sleep(500); // Sleep inside worker thread
            } catch (InterruptedException e) 
            {
                System.out.println("[Thread] Sleep interrupted!");
            }
        }
    }
}

public class ThreadDemo20 {
    public static void main(String[] args) 
    {
        MyRunnable Mobj = new MyRunnable();
        Thread tobj1 = new Thread(Mobj);

        MyThread tobj2 = new MyThread();

        tobj1.start();

        try 
        {
            // Main thread sleeps before starting tobj2
            System.out.println("[Main] Waiting 1 second before starting second thread...");
            Thread.sleep(1000); // Sleep in main thread
        } catch (InterruptedException e) 
        {
            System.out.println("[Main] Sleep interrupted!");
        }

        tobj2.start();
    }
    
}


// sleep is static mthod , you always have to use it with class name 