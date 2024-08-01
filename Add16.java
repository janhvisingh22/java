//Inter Thread Communication
class Customer
{
    int amount=10000;    
    synchronized void withdraw(int amount)
    {
        System.out.println("going to withdraw...");
        if(this.amount<amount)
        {    
            System.out.println("Less balance; waiting for deposit...");    
            try
            {
                wait();
            }
            catch(Exception e)
            {
                System.out.println("error");
            }    
        }
        System.out.println("take your cash"+amount);
        this.amount-=amount; 
        System.out.println("withdraw completed...");
        System.out.println("remaining balance="+this.amount);    
    }    
    synchronized void deposit(int amount)
    {    
        System.out.println("going to deposit...");    
        this.amount+=amount;    
        System.out.println("deposit completed... "); 
        System.out.println("after deposit balance="+this.amount);
        notifyAll();    
    }    
}    
    
public class Add16
{
    public static void main(String args[])
    {
        final Customer c=new Customer();    
        new Thread()
        {    
            public void run()
            {
                c.withdraw(15000);
            }    
        }
        .start();    
        new Thread()
        {    
            public void run()
            {
                c.deposit(10000);
            }    
        }
        .start();    
    }
}   
