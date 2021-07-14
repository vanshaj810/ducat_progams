/* join(): It will put the current thread on wait until the thread on which it is called is dead. If thread is interrupted then it will throw InterruptedException. 
types of join:
join()
join(int ms)
*/
 class Join1
{
    public static void main (String[] args)throws Exception
    {
        ThreadJoining t1 = new ThreadJoining();
        ThreadJoining t2 = new ThreadJoining();
        t1.start();
		t1.join();
		//t1.join(2000);
        t2.start();         
    }
}

class ThreadJoining extends Thread
{
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            try
            {
                sleep(1000);
                System.out.println("Run Current Thread: "+currentThread().getName());
            }
            catch(Exception ex)
            {}
		} 
    }
}
