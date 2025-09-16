
//Extends Thread
class MyThread1 extends Thread 
{
    public void run()
    {
        System.out.println("Thread From ThreadClass is : "+ getName());
    }
}

// Implements Runnable 
class MyThread2 implements Runnable
{
    public void run()
    {
        System.out.println("Thread From Runnable is : "+Thread.currentThread().getName());
    }
}

public class ThreadDemo9
{
    public static void main(String Arg[])
    {
        System.out.println("Starting of main Thread : \n");

        MyThread1 Mobj1 = new MyThread1();
        
        MyThread2 Mobj2 = new MyThread2();
        Thread Tobj = new Thread(Mobj2);

        Mobj1.start();
        Tobj.start();

    }
}


// JVM internally set names to threads as .. Thread-0 , Thread-1...
// it may vary 