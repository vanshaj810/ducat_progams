 public class DaemonThread extends Thread
{
    public void run()
    { 
        if(currentThread().isDaemon())
            System.out.println(currentThread().getName()+"  is Daemon thread"); 
        else
            System.out.println(currentThread().getName()+"  is Normal thread"); 
    } 
    public static void main(String[] args)
    { 
        DaemonThread t1 = new DaemonThread();
        DaemonThread t2 = new DaemonThread();
        DaemonThread t3 = new DaemonThread();
        t1.setDaemon(true);
        t1.start(); 
        t2.start(); 
        t3.start();
		//t3.setDaemon(true);	//IllegalThreadStateException 
    } 
}