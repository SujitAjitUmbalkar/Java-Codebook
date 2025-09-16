class Demo extends Thread
{
    public void run()
    {
        System.out.println("Thread is running with name : " + Thread.currentThread().getName()); 
        try
        {
            for(int i = 0; i < 10; i++)
            {
                System.out.println(Thread.currentThread().getName() + "with ID : "+ i);
                Thread.sleep(500);
            }        
        }
        catch(Exception obj){System.out.println("Exception caught : "+ obj);}
    }
}

class ThreadDemo6
{
    public static void main(String A[])
    {
        System.out.println("Inside main thread : "+Thread.currentThread().getName());
        
        Demo dobj1 = new Demo();
        Thread tobj1 = new Thread(dobj1);
        tobj1.setName("PPA");

        Demo dobj2 = new Demo();
        Thread tobj2 = new Thread(dobj2);
        tobj2.setName("LB");

        Demo dobj3 = new Demo();
        Thread tobj3 = new Thread(dobj3);
        tobj3.setName("Angular");
        
        tobj1.start();
        tobj2.start();
        tobj3.start();
        System.out.println("End of main thread...");
    }
}


/*
 * 
 
    
    sleep() only pauses the current thread.
    You never call start() again after sleep.
    Use sleep() in loops for periodic tasks.
    Multiple threads can sleep independently without affecting each other.
    Always handle InterruptedException when using sleep().

 */