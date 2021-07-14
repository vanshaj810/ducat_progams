class Pattern
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<i;j++)
{
System.out.print(" ");
}
for(int k=i;k<=5;k++)
{
System.out.print(k);
}
for(int l=4;l>=i;l--)
{
	System.out.print(l);
}
System.out.println();
}
for(int l=1;l<=4;l++)
{
	for(int m=4-l;m>=1;m--)
	{
		System.out.print(" ");
    }
    for(int n=5-l;n<=5;n++)
{
	System.out.print(n);
}
for(int k=4;k>4-l;k--)
{
	System.out.print(k);
}
System.out.println();
}
}
}