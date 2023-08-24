package statickey;

public class B {
	
	static int x=1;
	int y;
	 public void m1()
	 {
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(B.x);
		 B b=new B();
		 System.out.println(b.x);
		 System.out.println(b.y);
		
		 
		 
		 
	 }
	 public static void main (String [] args)
	 {
		 B b=new B();
		 b.m1();
		 
		 
	 }

}
