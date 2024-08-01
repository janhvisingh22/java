interface IT
{
    void Names1(String name1);
    void Job1(String j1);
    void salary1(int sal1);
}
interface NON_IT
{
    void Names2(String name2);
    void Job2(String j2);
    void salary2(int sal2);
}
class Staff implements IT
{
    @Override
    public void Names1(String name1)
    {
        System.out.println("Ramesh");
    }
    public void Job1(String j1)
    {
        System.out.println("IT");
    }
    public void salary1(int sal1)
    {
        System.out.println(1000);
    }
}
class Staff2 implements NON_IT
{
    public void Names2(String name2)
    {
        System.out.println("Rajesh");
    }
    public void Job2(String j2)
    {
        System.out.println("NON IT");
    }
    public void salary2(int sal2)
    {
        System.out.println(3000);
    }
}
public class fat_interfaces1
{
    public static void main(String[]args)
    {
        Staff j=new Staff();
        j.salary1();   
        j.Job1();
        j.Names1();
        Staff2 j1=new Staff2();
        j1.salary2();
        j1.Job2();
        j1.Names2();
    }
}
