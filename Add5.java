//Write a java program to multilevel inheritance by applying variant access controls to its class members and methods
import java.util.*;
public class Add5 
{
    private int rollno;
    String name;
    Scanner sc=new Scanner(System.in);
    public void getrollno()
    {
        System.out.println("Enter rollno and name");
        rollno=sc.nextInt();
        name=sc.nextLine();
    }
    void putrollno()
    {
        System.out.println("Roll No="+rollno);
        System.out.println("Name="+name);
    }
}
class Marks extends Add5
{
    protected int m1,m2,m3;
    void getmarks()
    {
        System.out.println("Enter marks:");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
    }
    void putmarks()
    {
        System.out.println("m1="+m1);
        System.out.println("m2="+m2);
        System.out.println("m3="+m3);
    }
}
class Result extends Marks
{
    private float total;
    void compute_display()
    {
        total=m1+m2+m3;
        System.out.println("total="+total);
    }
}
class Test7
{
    public static void main(String arg[])
    {
        Result r=new Result();
        r.getrollno();
        r.getmarks();
        r.putrollno();
        r.putmarks();
        r.compute_display();
    }
}