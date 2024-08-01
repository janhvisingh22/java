//exception
import java.util.*;
public class trctch 
{
    public static void main(String[]args)
    {
        int marks[]=new int[3];
        marks[0]=92;
        marks[1]=91;
        marks[2]=89;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array index");
        int ind=sc.nextInt();
        System.out.println("enter number you want to divide value with...");
        int n=sc.nextInt();
        try
        {
            System.out.println("Enter value at array index entered"+marks[ind]);
            System.out.println("Enter value of array"+marks[n]);
        }
        catch(Exception e)
        {
            System.out.println("Some exception occured");
            System.out.println(e);
        }
        sc.close();
    }
}
