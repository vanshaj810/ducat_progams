class ByteEx
{
	public static void main(String []g)
	{
		//String g= "ducat";		 	
		byte  b[] = g[0].getBytes();
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print((char)b[j]+" "); //print byte type 
			System.out.println();
		}
	}
}
/*    		 
--1
-12
123

ducatacud
duca acud
duc   cud
du     ud
d       d
du     ud
duc   cud
duca acud
ducatacud

	t
   ata
  catac
 ucatacu
ducatacud
 ucatacu 
  catac
   ata
    t
	    */