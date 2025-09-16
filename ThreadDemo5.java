class Demo extends Thread
{
    public void run()
    {
        System.out.println("Thread is running with name : " + Thread.currentThread().getName()); 
        for(int i = 0; i <= 1000; i++)
        {
            System.out.println(Thread.currentThread().getName() + "with ID : "+ i);
        }
    }
}

class ThreadDemo5
{
    public static void main(String A[])
    {
        System.out.println("Inside main thread : "+Thread.currentThread().getName());
        
        Demo dobj1 = new Demo();
        dobj1.setName("PPA");

        Demo dobj2 = new Demo();
        dobj2.setName("LB");
        
        dobj1.start();
        dobj2.start();

    }
}

/*

    start() does NOT immediately run the thread

    When you call dobj1.start(), it only requests the JVM to create a new thread and schedule it.

    The actual execution time is decided by the Thread Scheduler (part of JVM + OS).

    So dobj1 is "ready to run" but it might not run immediately.



    ThereFore both threads are running concurently 
 * 
 */