class Demo implements Runnable
{
    public void run()
    {
        System.out.println("Thread is running");
    }

}

class 0003_ThreadDemo3
{
    public static void main(String A[])
    {
        System.out.println("Inside main thread");

        Demo dobj = new Demo();
        Thread tobj = new Thread(dobj);     // compulsory to create thread object here

        tobj.start();
        
    }
}

/*

 *     If you implement Runnable, you must wrap it inside a Thread object,
    because a plain Runnable is just a task, not an actual thread.
 * 
 * 
 * means , when we extends Thread Class our child class became new Thread using which we can call start() method directly ,
 *  but if we implement runnable interface our child class will be a tast to be executed ,so we cannot call start() method directly 
 *  Threrefore in this casae we have to create new Thread Class and pass parameter of object of child class 
 */
