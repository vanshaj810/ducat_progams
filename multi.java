public class multi extends Thread    {

    public void run() {
		for(int i=1;i<=5;i++)
		{
			try
			{
			System.out.println("main: "+i+" "+currentThread().getName());
			sleep(1000);
			}
			catch(Exception e)
			{}	
		}
    }
    public static void main(String args[]) 
	{
		multi t0 = new multi();
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t0.start();
        t1.start(); 
        t2.start();
        
    }
}
class Thread1 extends Thread    
{
    public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
			System.out.println("thread1: "+i+" "+currentThread().getName());
			sleep(1000);
			}
			catch(Exception e)
			{}	
		}
    }
}
class Thread2 extends Thread    
{
    public void run() 
	{
		for(int i=1;i<=15;i++)
		{
			try
			{
			System.out.println("thread2: "+i+" "+currentThread().getName());
			sleep(1000);
			}
			catch(Exception e)
			{}	
		}
    }
}