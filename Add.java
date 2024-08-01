public class Add
{
    int a,b;
    Add()
    {
        a=b=0;
    }
    Add(int len)
    {
        a=b=len;
    }
    // constructor used when all dimensions specified
    Add(int x,int y)
    {
        a=x;
        b=y;
    }
    // compute and return sum
    int sum()
    {
        return a+b;
    }
    public static void main(String args[])
    {
        Add obj1=new Add();
        Add obj2=new Add(5);
        Add obj3=new Add(5,10);
        int result;
        // get sum of object 1
        result=obj1.sum();
        System.out.println("sum of values of object1="+result);
        //get sum of object2
        result=obj2.sum();
        System.out.println("sum of values of object2="+result);
        //get sum of object3
        result=obj3.sum();
        System.out.println("sum of values of object3="+result);

    }
}
