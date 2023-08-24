package parameterreturn;

import java.util.Scanner;

public class Sumit 
{
public int m1(int a ,int b)
{
 int c=a+b;
 return c;

}
public float m2(float x, float y)
{
	float c=x+y;
	return c;
}

public long m3(long l, long m)
{
 long c=l+m;
 return c;

}	
public double m4(double a ,double b)
{
	double c=a+b;
	return c;
}	
public char m5(char c)
{
	System.out.println(c);

	return c;


}
public boolean m6(boolean flag)
{
	System.out.println(flag);
	return flag;
}

public static void main(String [] args)
{
	Sumit s=new Sumit();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first int");
	int x=sc.nextInt();
	System.out.println("enter second int");
	int y=sc.nextInt();
	int r=s.m1(x,y);
	System.out.println(r);
	System.out.println("enter first float");
	float p=sc.nextFloat();
	System.out.println("enter second float");
	float l=sc.nextFloat();
	float e=s.m2(p, l);
	System.out.println(e);
	System.out.println("enter first long");
	long g=sc.nextLong();
	System.out.println("eneter second long");
	long m=sc.nextLong();
	long e1=s.m3(g,m);
	System.out.println("enetr character=");
	char t=sc.next().charAt(0);
	char k=s.m5(t);
	System.out.println(k);
	
	System.out.println("eneter boolean value");
	boolean d=sc.nextBoolean();
	boolean o=s.m6(d);
	System.out.println(o);
	









}
	
	
}
