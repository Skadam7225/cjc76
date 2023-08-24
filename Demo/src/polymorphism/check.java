package polymorphism;

public class check {
	
	public void disp(int a,double b)
	{
		
		
		System.out.println("method a");
	}
	public void disp(int a,double b,double c)
	{
		
		
		System.out.println("method b");
	}
	public void disp(int a, int b)
	{
		
		System.out.println("method c");
	}
	
	public static void main(String[] args) {
		
		
		check c=new check();
		c.disp(100,50.06f);
	}
	
	
	
	
	
	
	
	
	
	

}
