package parameterreturn;

import java.util.Scanner;

public class B 
{   
	public  double add(double x, double y)
	{ A a=new A();
	a.x=x;
	a.y=y;
	double c=a.x+a.y;
	return c;
		
		
		       
	}
	public static void main (String [] args)
	{
		B b=new B();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no=");
		double z=sc.nextDouble();
		System.out.println("enter no second");
		double r=sc.nextDouble();
		double d=b.add(z,r);
		System.out.println("no of addition is=" +d);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
