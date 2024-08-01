//Write a java program to implement inheritance and demonstrate use of method overriding.
class Parent
{
    void showme()
    {
        System.out.println("Base class method");
    }
}
class Child extends Parent
{
    void showme()
    {
        System.out.println("Child class method");
    }
}
class Test6
{
    public static void  main(String a[])
    {
        Child obj=new Child();
        obj.showme();
    }
}