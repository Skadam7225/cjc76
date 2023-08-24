package parameterreturn;

import java.util.Scanner;

public class Demo {
	public int add(int x,int y)
	{
		
		int w=  x+ y;
		return w;
		}
	public int sub(int x, int y)
	{ 
	

		int r= x- y;
		return r;
		
	}
	public float div(float a, float b)
	{
	
		float e=a/b;
		return e;
		
		}
	public float multiply(float a,float b)
	{
		
		
		float t=a*b;
		return t;
		
		
	}
	public static void main(String [] args)
	{
		Demo d=new Demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr no for int=");
		int x=sc.nextInt();
		System.out.println("enter no for second int=");
		int y=sc.nextInt();
		int r=d.add(x, y);
		System.out.println(r);
		int m=d.sub(x,y);
	       System.out.println(m);
		System.out.println("enetr no for float =");
		float a=sc.nextFloat();
		System.out.println("enetr no for Second float =");
		float b=sc.nextFloat();
		
       
       float p=d.div(a,b);
       System.out.println(p);
       float t=d.multiply(a, b);
       System.out.println(t);
		
		
		
	}
	
	
	
	
	

}
