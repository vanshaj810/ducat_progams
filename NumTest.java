public class NumTest
{
    public static void main(String[] args) 
    {
        Double d = new Double("234336.9685123412");
        byte b = d.byteValue(); 
        short s = d.shortValue(); 
        int i = d.intValue(); 
        long l = d.longValue(); 
        float f = d.floatValue(); 
        double d1 = d.doubleValue(); 
             
        System.out.println("value of d after converting it to byte : " + b);
        System.out.println("value of d after converting it to short : " + s);
        System.out.println("value of d after converting it to int : " + i);
        System.out.println("value of d after converting it to long : " + l);
        System.out.println("value of d after converting it to float : " + f);
        System.out.println("value of d after converting it to double : " + d1);
    }
}
