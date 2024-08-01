// write a java program using generics
class Test<T1,T2>
{
    T1 a;
    T2 b;
    Test(T1 a,T2 b)
    {
        this.a=a;
        this.b=b;
    }
    public void print()
    {
        System.out.print(a+" ");
        System.out.println(b);
    }
}
class Add13
{
    public static void main(String []args)
    {
        Test<Integer,Integer> obj1=new Test<Integer,Integer>(10,15);
        obj1.print();
        Test <Double, Integer> obj2=new Test<Double,Integer>(10.6,15);
        obj2.print();
        Test <Float,String> obj3=new Test<Float,String>(10.6f,"Hello");
        obj3.print();
        Test <Character,String> obj4=new Test<Character,String>('C',"hello");
        obj4.print();
    }
}