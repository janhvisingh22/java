import arithmetic.Arithmetic;
public class Add8 
{
    public static void main(String[] args)
    {
        Arithmetic a1=new Arithmetic();
        int add=a1.add(10,20);
        System.out.println(add);
        int sub=a1.sub(10,20);
        System.out.println(sub);
        int mul=a1.mul(10,20);
        System.out.println(mul);
        int div=a1.div(10,20);
        System.out.println(div);      
    }
}

