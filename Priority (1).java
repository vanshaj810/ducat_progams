public class Priority extends Thread
{
    public static void main(String[] args)
    { 
        Thread t = Thread.currentThread();    
        System.out.println("Current thread: " + t.getName());
        t.setName("ducat");
        System.out.println("After name change: " + t.getName()); 
        System.out.println("Main thread priority: "+ t.getPriority()); 
        t.setPriority(MAX_PRIORITY); 
        System.out.println("Main thread new priority: "+ t.getPriority()); 
        ChildThread ct = new ChildThread();
        System.out.println("Child thread priority: "+ ct.getPriority());
        ct.setPriority(MIN_PRIORITY);
        System.out.println("Child thread new priority: "+ ct.getPriority());
		ChildThread1 ct1 = new ChildThread1();
        System.out.println("Child1 thread priority: "+ ct1.getPriority());
        ct1.setPriority(NORM_PRIORITY);
        System.out.println("Child1 thread new priority: "+ ct1.getPriority());
		System.out.println();
        ct.start();
        ct1.start();
    }
}
class ChildThread extends Thread
{
    public void run() 
    {
        for (int i=1; i<=5; i++)
        {
            System.out.println("Child thread: "+currentThread().getPriority());
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e){}
        }
    }
}
class ChildThread1 extends Thread
{
    public void run() 
    {
        for (int i=1; i<=5; i++)
        {	 
            System.out.println("Child1 thread: "+currentThread().getPriority());
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e){}
        }
    }
}