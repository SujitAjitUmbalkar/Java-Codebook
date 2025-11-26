

class MyThread1 extends Thread 
{
    public void run()
    { 
        System.out.println("ID of FirstThread: " + getId()); 
    }
}

class MyRunnable2 implements Runnable 
{
    public void run() 
    { 
        System.out.println("ID of SecondThread  " + Thread.currentThread().getId()); 
    }
}

 class ThreadDemo11_0011
{
    public static void main(String[] args) 
    {
        MyThread1 Mobj = new MyThread1();
        Mobj.start();

        MyRunnable2 Mobj2 = new MyRunnable2();
        Thread tobj = new Thread(Mobj2);

        tobj.start();
    }
}
