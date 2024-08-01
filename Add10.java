// Write a java program to implement the concept of Exception Haandling using predefined exception
import java.util.*;
public class Add10 
{
    public static void main(String args[])
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter 2 values");
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int n3=n1/n2;
            System.out.println("DIVISION VALUE="+n3);
            sc.close();
        }
        catch(ArithmeticException Ae)
        {
            System.out.println("DONT ENTER ZERO FOR DENOMINATOR.....");
        }
        catch(InputMismatchException Nfe)
        {
            System.out.println("PASS ONLY INTEGER VALUES......");
        }
        finally
        {
            System.out.println("I AM FINALLY....");
        }
    }
}
