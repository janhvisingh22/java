//Write a java program to implement wrapper classes and their methods
public class Add7
{
	public static void main(String[] args)
	{
	    int a=Integer.parseInt(args[0]);
	    float f=Float.parseFloat(args[1]);
	    double d=Double.parseDouble(args[2]);
	    byte b=Byte.parseByte(args[3]);
	    short s=Short.parseShort(args[4]);
	    boolean bo=Boolean.parseBoolean(args[5]);
	    char ch=args[5].charAt(0);
	    System.out.println("a="+a);
	    System.out.println("f="+f);
	    System.out.println("d="+d);
	    System.out.println("b="+b);
	    System.out.println("s="+s);
	    System.out.println("bo="+bo);
	    System.out.println("ch="+ch);
	}
	    
}