package statickey;

public class C {
	static int x;
	int y;
	
	public  void m1()
	{
		System.out.println(x);
		System.out.println(A.x);
		
		
	}
	public static void main(String[] args) {
		C c=new C();
		c.m1();
	}

}
