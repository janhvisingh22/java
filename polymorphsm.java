//polymorphism in try catch exception case
public class polymorphsm
{
    public static void main(String[] args)
    {
        int a=6000;
        int b=0;
        try
        {
            int c=a/b;
            System.out.println("Result is:"+c);
        }
        catch(Exception e)
        {
            System.out.println("We failed to divide");
            System.out.println(e);
        }
        System.out.println("end");
    }
}