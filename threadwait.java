/* wait()-It tells the calling thread to give up the lock and go to sleep until some other thread enters the same monitor and calls notify().
notify()-It wakes up one single thread that called wait() on the same object. It should be noted that calling notify() does not actually give up a lock on a resource.
notifyAll()-It wakes up all the threads that called wait() on the same object.
 */
 
import java.util.Scanner;
public class threadwait
{
    public static void main(String[] args)
                           throws InterruptedException
    {
        final PC pc = new PC();
 
        Thread t1 = new Thread(new Runnable()
        {
            public void run()
            {
                try
                {
                    pc.produce();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
 
        Thread t2 = new Thread(new Runnable()
        {
            public void run()
            {
                try
                {
                    pc.consume();
                }
               catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
    public static class PC
    {
        public void produce()throws InterruptedException
        {
            synchronized(this)
            {
                System.out.println("producer thread running ");  //1
                wait();
                System.out.println("Resumed");  //4
            }
        }
        public void consume()throws InterruptedException
        {
            Thread.sleep(1000);
            Scanner s = new Scanner(System.in);
            synchronized(this)
            {
                System.out.println("Waiting for return key.");  //2
                s.nextLine();
                System.out.println("Return key pressed");  //3
				notify();
                Thread.sleep(2000);
            }
        }
    }
}
