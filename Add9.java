//write a java program to implement the concept of threading by implementing Runnable interface
public class Add9 implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Thread has ended");
    }
    public static void main(String[] args)
    {
        Add9 obj=new Add9();
        Thread t1=new Thread(obj);
        t1.start();
        System.out.println("Hi");
    }
}
