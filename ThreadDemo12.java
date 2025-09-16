
class MyThread extends Thread 
{
    public void run() 
    { 
        System.out.println("Priority of 1st Thread " + getPriority()); 
    }
}

class MyRunnable implements Runnable 
{
    public void run() 
    { 
        System.out.println("Priority of 2nd Thread: " + Thread.currentThread().getPriority()); 
    }
}

class MyRunnable1 implements Runnable
{
    public void run()
    {
        System.out.println("Priority of 3rd(Default priorty ) is : " + Thread.currentThread().getPriority());
    }
}

public class ThreadDemo12 {
    public static void main(String[] args) 
    {
        MyThread Mobj = new MyThread();
        Mobj.setPriority(8);
        Mobj.start();

        MyRunnable Mobj1 = new MyRunnable();
        Thread tobj = new Thread(Mobj1);
        tobj.setPriority(4);
        tobj.start();

        MyRunnable1 Mobj2 = new MyRunnable1();
        Thread tobj1 = new Thread(Mobj2);
        // we didint set priority to that thread 
        tobj1.start();
        
        
    }
}