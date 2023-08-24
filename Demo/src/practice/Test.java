package practice;
import java.util.Scanner;
public class Test 
{
public static void maain(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first number");
	int x=sc.nextInt();
System.out.println("Enter second number");
	int y=sc.nextInt();
	Calculator c=new Calculator ();
	c.addition(x, y);
	c.multiply(x,y);
	c.division(x, y);












}
}

