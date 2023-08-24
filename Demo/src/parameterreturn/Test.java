package parameterreturn;

import java.util.Scanner;
	public class Test
	{
	
		public double add()
		{	A a=new A();
		a.x=100;
		a.y=200;
			double c=a.x+a.y;
			System.out.println(c);
			return c;
			
		}
		
		public static void main(String [] args)
		{
		 Test test=new Test();
		test.add();
		
		}
		
		
	}

	
