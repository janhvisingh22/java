// write a java program to define a class, define instance methods and overload them and use them for dynamic method invocation
import java.util.*;
class Add2
{
    void display(int a,int b)
    {
        int c=a+b;
        System.out.println("The sum of"+a+"&"+b+"is"+c);
    }
    void display(double a,double b)
    {
        double c=a+b;
        System.out.println("The sum of"+a+"&"+b+"is"+c);  
    }
    void display(int a,double b)
    {
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        double c=a+b;
        System.out.println("a+b:"+c);
    }
}
class Test3
{
    public static void main(String args[])
    {
        Add2 obj=new Add2();
        int i1,i2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x,y values");
        i1=sc.nextInt();
        i2=sc.nextInt();
        obj.display(i1,i2);
        double d1,d2;
        System.out.println("enter 2 double values");
        d1=sc.nextDouble();
        d2=sc.nextDouble();
        obj.display(d1,d2);
        sc.close();
    }
}
