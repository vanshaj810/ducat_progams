class TestSynchronization
{  
public static void main(String args[])
{  
Table obj = new Table();
MyThread1 t0=new MyThread1(obj);  
MyThread2 t1=new MyThread2(obj);  
t0.start();  
t1.start();  
}  
}  
class Table{  
    synchronized void printTable(int n,String t)
	{  
		for(int i=1;i<=10;i++)
		{  
			System.out.println(t+" : "+n*i);  
			try{  
				Thread.sleep(1000);  
			}catch(Exception e){System.out.println(e);}  
		}  
	}  
} 
class MyThread1 extends Thread
{  
	Table t;  
	MyThread1(Table t)
	{  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(5,"Thread0");  
	}  
}  
class MyThread2 extends Thread{  
Table t;  
MyThread2(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(10,"Thread1");  
}  
}    