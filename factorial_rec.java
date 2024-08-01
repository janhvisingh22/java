import java.util.*;
public class factorial_rec 
{
    public static int factorial(int n) 
    {
        if (n == 0 || n == 1) 
        {
            return 1;
        } 
        else 
        {
            return n * factorial(n - 1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number ");
        int n = sc.nextInt();
        int f= factorial(n);
        System.out.println("Factorial of number "+n+" is: "+f);
        sc.close();
    }
}
