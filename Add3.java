//write a java program to implement array of objects
import java.util.*;
public class Add3
{
    int a,b;
    Add3()
    {
        a=10;
        b=20;
    }
    Add3(int len)
    {
        a=b=len;
    }
    Add3(int x,int y)
    {
        a=x;
        b=y;
    }
    int sum()
    {
        return a+b;
    }
}
class Test4
{
    public static void main(String args[])
    {
        int result,x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x,y values");
        x=sc.nextInt();
        y=sc.nextInt();
        Add3 obj[]=new Add3[3];
        obj[0]=new Add3();
        obj[1]=new Add3(x);
        obj[2]=new Add3(x,y);
        //get sum of object1
        result=obj[0].sum();
        System.out.println("sum of values of object1="+result);
        //get sum of object2
        result=obj[1].sum();
        System.out.println("sum of values of object2="+result);
        //get sum of object3
        result=obj[2].sum();
        System.out.println("sum of values of object3="+result);
        sc.close();
    }
}
