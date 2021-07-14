import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MyArrayList<String> al=new MyArrayList<>(5);
		//MyArrayList al=new MyArrayList();
		Iterator i=al.iterator();
		Scanner sc = new Scanner(System.in);
		while(true) 
		{
		System.out.println("1: add");
		System.out.println("2: remove");
		System.out.println("3: display");
		System.out.println("4: exit");
		System.out.println("enter ur choice: ");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1: 
			System.out.println("1: add first");
			System.out.println("2: add last");
			System.out.println("3: add loc");
			System.out.println("enter ur choice: ");
			int ch1 = sc.nextInt();
			switch(ch1)
			{
				case 1: 
					System.out.println("Enter data: ");
					String data = sc.next();
					al.addFirst(data);
					break;
				case 2: 
					System.out.println("Enter data: ");
					al.add(sc.next());
					break;
				case 3:	
					System.out.println("Enter data and location: ");
					al.addLoc(sc.next(),sc.nextInt());
					break;
				default: 
					System.out.println("wrong choice \n");
			}
			break;
		case 3:
			System.out.println(al);
			break;
		case 4: 
			System.exit(0);
		default: 
			System.out.println("wrong choice \n");
		}
		}
		}
		}

class MyArrayList<T>implements Iterator
	{
		int size1;
		Object objects[];
		float growth=.5f;
		int index=-1;
		int next=0;
		public MyArrayList()
		{
			size1=10;
			objects=new Object[size1];		
		}
		public void addLoc(String str, int loc) {	// monu 3
			if(loc<=index)
			{
				index++;
				incSize();
				for(int i=index-1;i>loc-2;i--)	//1>1
					objects[i+1] = objects[i];
				objects[loc-1] = str;
			}
			else
				System.out.println("overflow");
			
		}
		public void addFirst(String data) {
			// TODO Auto-generated method stub
			
		}
		public void addLast(String nextLine) {
			// TODO Auto-generated method stub
			
		}
		public MyArrayList(int size1)
		{
			this.size1=size1;
			objects=new Object[size1];
		}
			public void add(T obj)
			{
			//System.out.println(obj.getClass().getName());	
				incSize();
				objects[++index]=obj;
				System.out.println("success");
				}
			private void incSize() {
				if(index+1==size1)
				{
					int tempsize1 = size1 + (new Float(size1*growth)).intValue();
					Object tempobj[]=new Object[tempsize1];
					size1=tempsize1;
					for(int i=0;i<objects.length;i++)
					{
						tempobj[i]=objects[i];
					}
					objects=tempobj;
				}
				
			}
				public void addAll(T o[])
				{
					for(int i=0;i<o.length;i++)
						add(o[i]);
				}
				public boolean set(int i,T obj)
				{
					if(i<0)
						return false;
					else if(i>index)
					{
						add(obj);
						return true;
					}
	           else	
			   {
				   objects[i]=obj;
				   return true;
			   }	
					
			}
			public String toString()
			{
				String str="[";
			for(int i=0;i<=index;i++)
			{	
				if(i!=0)
					str += " , ";
				str += objects[i];
			}
			str +="]";
			return str;
			}
			public int size1(){return index+1;}
			public void remove(){index --;}
			public boolean isEmpty(){return index==-1;}
			public int capacity(){return objects.length;}
			public Object next()
			{
			return objects[next++];	
			}
			public boolean hasNext()
			{
				if(next>index)
					return false;
				else
					return true;
			}
			Iterator iterator()
			{
				return this;
			}
	}