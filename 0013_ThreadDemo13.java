
class MyThread extends Thread 
{
    public void run() 
    { 
        System.out.println("State inside run of MyThread: " + getState()); 
    }
} 

class MyRunnable implements Runnable 
    {
    public void run() 
    {
        // In Runnable, we cannot call getState() directly
        // So we fetch it from Thread.currentThread()
        System.out.println("State inside run of MyRunnable: " + Thread.currentThread().getState());
    }
}

public class 0013_ThreadDemo13 
{
    public static void main(String[] args) throws InterruptedException 
    {
        MyThread Mobj = new MyThread();
        System.out.println("State before start: " + Mobj.getState());
        Mobj.start();
        System.out.println("State after start: " + Mobj.getState());

        MyRunnable Mobj2 = new MyRunnable();
        Thread tobj = new Thread(Mobj2);
        System.out.println("State before start (in MyRunnable) " + tobj.getState());
        tobj.start();
        System.out.println("State after start: (in MyRunnable) " + tobj.getState());



    }
}
