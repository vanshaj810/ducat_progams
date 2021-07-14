import java.io.*;
class poutput implements Runnable
{
	PipedWriter pout;
	poutput(PipedWriter pout)
	{
		this.pout=pout;
	}
	public void run()
	{
		for(int i=65;i<=91;i++)
		{
			try
			{
				pout.write(i);
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}
	}
}
class pinput implements Runnable
{
	PipedReader pin;
	 pinput(PipedReader pin)
	{
		this.pin=pin;
	}
	public void run()
	{	
		int z=0;
		for(int i=65;i<=90;i++)
		{
			try
			{
				z=pin.read();
				Thread.sleep(1000);
			}
			catch(Exception e){}
			System.out.println((char)z);
		}
	}
}
class PRun
{
	public static void main(String...qq)throws Exception
	{
		PipedWriter pout= new PipedWriter();
		PipedReader pin= new PipedReader();
		pout.connect(pin);
		poutput po= new poutput(pout);
		pinput pi= new pinput(pin);
		Thread t1= new Thread(po);
		Thread t2= new Thread(pi);
		t1.start();
		t2.start();
	}
}