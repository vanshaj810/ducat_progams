import java.text.SimpleDateFormat; 
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Pool
{
    public static void main(String[] args)
    {
        Runnable r1 = new Task("Polymorphism");
        Runnable r2 = new Task("Encapsulation");
        Runnable r3 = new Task("Inheritance");
        Runnable r4 = new Task("Abstraction");
        Runnable r5 = new Task("Array");      
        ExecutorService pool = Executors.newFixedThreadPool(3);  
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5); 
        pool.shutdown();    
    }
}

class Task implements Runnable   
{
    private String name;
    public Task(String s)
    {
        name = s;
    }
    public void run()
    {
        try
        {
            for (int i = 0; i<=5; i++)
            {
                if (i==0)
                {
                    Date d = new Date();
                    System.out.println("Initialization Time for"
                            + " task name - "+ name +" = " +d);   
                }
                else
                {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Executing Time for task name - "+
                            name +" = " +ft.format(d));   
                }
                Thread.sleep(1000);
            }
            System.out.println(name+" completed");
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
