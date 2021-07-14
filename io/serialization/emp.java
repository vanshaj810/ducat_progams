import java.io.*;
class emp implements Serializable
{
	transient int a;
	static int b;
	String name;
	int age;
	int z;
	emp(String name,int age,int a,int b,int z)
	{
		this.name=name;
		this.age=age;
		this.a=a;
		this.b=b;
		this.z=z;	
	}	
}