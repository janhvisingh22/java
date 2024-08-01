// Write a Java Program to implement Synchronization.
import java.util.*;
class Table
{
	 void printTable(int n) 
	{
		for(int i = 1; i <= 10; i++)
		System.out.println(n + " * " + i + " = " + i*n);
System.out.println("------------------------------------------------>");	
}
}

class MyThread_1 extends Thread
{0
	Table table = new Table(); 
	int number;
	MyThread_1(Table table, int number)
{
		this.table = table;
		this.number = number;
	}
	public void run() 
	{
		table.printTable(number);		
	}
}

class MyThread_2 extends Thread
{

	Table table = new Table();
	int number;
	MyThread_2(Table table, int number)
	{
		this.table = table;
		this.number = number;
	}
	public void run() 
	{
		table.printTable(number);			
	}
}
public class Add15
{

	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.println("enter any two numbers");
        n1=sc.nextInt();
 		n2=sc.nextInt();
		Table table = new Table();
		MyThread_1 t1 = new MyThread_1(table, n1);
		MyThread_2 t2 = new MyThread_2(table, n2);
		t1.start();
		t2.start();
        sc.close();
	}
}
