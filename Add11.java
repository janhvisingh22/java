//Write a java program to implement the concept of Exception Handling by creating user defined exceptions
public class Add11 
{
    public static void main(String args[])
    {
        try
        {
            throw new MyException(2);
            //throw is used too create a new exception and throw it.
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
    } 
}
class MyException extends Exception
{
    int a;
    MyException(int b)
    {
        a=b;
    }
    public String toString()
    {
        return("Exception Number="+a);
    }
}
