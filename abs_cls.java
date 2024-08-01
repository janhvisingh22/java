//basic abstract class
abstract class Parent2
{
    public Parent2()
    {
        System.out.println("Parent2's constructor");
    }
    public void say_hello()
    {
        System.out.println("Hello");
    }
    abstract public void greet();
}
class child2 extends Parent2
{
    @Override
    public void greet()
    {
        System.out.println("Good Morning");
    }
    public void greet2()
    {
        System.out.println("Namaste");
    }
}
abstract class child3 extends Parent2
{
    public void th()
    {
        System.out.println("I am good");
    }
}
public class abs_cls
{
    public static void main(String[] args)
    {
        //child3 obj=new child3();------error bcz its abstract class
        Parent2 obj=new child2();
        obj.greet();
        
    }
}