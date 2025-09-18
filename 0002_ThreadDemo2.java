class Demo extends Thread
{
    public void run()               // overriding 
    {
        System.out.println("Thread is running");
    }
}

class 0002_ThreadDemo2
{
    public static void main(String A[])
    {
        System.out.println("Inside main thread");

        Demo dobj = new Demo();
        dobj.start();

        // Thread tobj = new Thread(dobj);     // Not compulsory 
        
        // tobj.start();

        // You can directly call start method from dobj when you extend Thred
        // dobj.start();
        
        
    }
}



/*
 *  Thread = represents the execution mechanism (the actual worker).

    Runnable = represents the task/code to be executed.
 * 
 *  If you extend Thread, your object is already a Thread. 

    If you implement Runnable, you must wrap it inside a Thread object,
    because a plain Runnable is just a task, not an actual thread.
 * 
 * 
 * means , when we extends Thread Class our child class became new Thread using which we can call start() method directly ,
 *  but if we implement runnable interface our child class will be a tast to be executed ,so we cannot call start() method directly 
 *  Threrefore in this casae we have to create new Thread Class and pass parameter of object of child class 
 */

 /*
  * Calling run() directly will not start a new thread,
   it will just execute like a normal method inside the main thread. 
  Only start() creates a new thread of execution
  */
