
// Extending Thread 
class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Thred From ThreadClass "+ getName());       // Internally ->   this.getName(); 
    }
}

// Implementing Runnable Interface 
class MyThread1 implements Runnable 
{
    public void run()
    {
        System.out.println("Thread From Runnable Interface : "+ Thread.currentThread().getName());
    }
}

public class 0010_ThreadDemo10
{
    public static void main(String Arg[])
    {
        MyThread Mobj = new MyThread();
        Mobj.setName("First Thread ");
        Mobj.start();

        MyThread1 Mobj1 = new MyThread1();
        Thread tobj = new Thread(Mobj1);
        tobj.setName("Scond Thread ");          // Set Name to the Thread Class 
        tobj.start();
    }
} 
