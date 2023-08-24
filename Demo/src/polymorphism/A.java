package polymorphism;

public class A {

	public void display()
	{
		
		System.out.println("display method");
	}
	
	public int display(int x)
	{
		
		
		return x;
	}
	
	public void  display(String msg)
	{
	System.out.println("message is:"+msg);	
		
	}
	
	public double display(double a ,double b)
	{
		
		return a+b;
		
	}
	
	public static void main(String[] args) {
		
		A a=new A();
		a.display();
		int x=a.display(5);
		System.out.println(x);
		a.display("hi");
		double z=a.display(45.56, 56.2323);
		System.out.println(z);
		
	}
}
