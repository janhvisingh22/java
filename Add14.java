//write java program to implement multi-threading
import java.util.*;
class MultithreadingDemo extends Thread
{
    public void run()
    {
        try
        {
            //Displaying the thread that is running
            System.out.println("Thread"+ Thread.currentThread().getId()+" is running");
        }
        catch (Exception e)
        {
            //Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
public class Add14
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the threads size");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            MultithreadingDemo obj=new MultithreadingDemo();
            obj.start();
        }
        sc.close();
    }
}