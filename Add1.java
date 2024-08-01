// write a java program to define  a class,define instance methods for setting and retrieving values of instance variables and instantiate its object
import java.util.*;
class Add1
{
    int a,b,c;
    void getdata(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void putdata()
    {
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        c=a+b;
        System.out.println("a+b:"+c);
    }
}
class Test2
{
    public static void main(String args[])
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x,y values");
        x=sc.nextInt();
        y=sc.nextInt();
        Add1 obj=new Add1();
        obj.getdata(x,y);
        obj.putdata();
        sc.close();
    }
}

