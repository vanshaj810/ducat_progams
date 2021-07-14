public class TestDeadlockEx {  
  public static void main(String[] args) {  
    final String resource1 = "ram";  
    final String resource2 = "shyam";  
    // t0 tries to lock resource1 then resource2  
    Thread t0 = new Thread() 
	{  
      public void run() 
	  {  
          synchronized (resource1) 
		  {  
			System.out.println("Thread 0: locked resource 1: "+resource1);  
			try 
			{ 
				Thread.sleep(1000);
			} 
			catch (Exception e) {}  
			synchronized (resource2)
			{  
				System.out.println("Thread 0: locked resource 2");  
			}  
         }  
      }  
    };  
    // t1 tries to lock resource2 then resource1  
    Thread t1 = new Thread() {  
      public void run() {  
        synchronized (resource2) {  
          System.out.println("Thread 1: locked resource 2: "+resource2);
          try { Thread.sleep(1000);} catch (Exception e) {}  
          synchronized (resource1) {  
            System.out.println("Thread 1: locked resource 1");  
          }  
        }  
      }  
    };  
    t0.start();  
    t1.start();  
  }  
}  