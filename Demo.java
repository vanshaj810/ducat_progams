// Wrapping and UnWrapping
class Demo
{
    public static void main(String args[])
    {
        byte a = 1;						//premetive data types
        Byte byteobj = new Byte(a);		//wrapper object
        int b = 10;
        Integer intobj = new Integer(b);
        float c = 18.6f;
        Float floatobj = new Float(c);
        double d = 250.5;
        Double doubleobj = new Double(d);
		char e='a';
        Character charobj=new Character(e);
        System.out.println("Values of Wrapper objects (printing as objects)");
        System.out.println("Byte object byteobj:  " + byteobj);
        System.out.println("Integer object intobj:  " + intobj);
        System.out.println("Float object floatobj:  " + floatobj);
        System.out.println("Double object doubleobj:  " + doubleobj);
        System.out.println("Character object charobj:  " + charobj);
        byte bv = byteobj;
        int iv = intobj;
        float fv = floatobj;
        double dv = doubleobj;
        char cv = charobj;
        System.out.println("Unwrapped values (printing as data types)");
        System.out.println("byte value, bv: " + bv);
        System.out.println("int value, iv: " + iv);
        System.out.println("float value, fv: " + fv);
        System.out.println("double value, dv: " + dv);
        System.out.println("char value, cv: " + cv);
    }
}