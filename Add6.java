//Write a java program to demonstrate use of implementing interfaes
import java.util.Scanner;
interface area
{
    public void dimensions();
    public void area1();
}
class Rectangle implements area
{
    int length,breadth,area;
    public void dimensions()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter length:");
        length=s.nextInt();
        System.out.print("Enter breadth:");
        breadth=s.nextInt();
        s.close();
    }
    public void area1()
    {
        area=length*breadth;
        System.out.println("Area of rectangle:"+area);    
    }
}
class Square implements area
{
    int length,area;
    public void dimensions()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter length");
        length=s.nextInt();
        s.close();
    }
    public void area1()
    {
        area=length*length;
        System.out.print("Area of square:"+area);
    }
}
class Add6
{
    public static void main(String[] args)
    {
        Rectangle obj=new Rectangle();
        obj.dimensions();
        obj.area1();
        Square obj2=new Square();
        obj2.dimensions();
        obj2.area1();
    }
}


    

