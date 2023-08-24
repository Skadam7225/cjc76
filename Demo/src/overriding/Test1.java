package overriding;

public class Test1 {
public static void main(String[] args) {
	
	
	grand d=new grand();
	d.hotel();
	child c=new child();
	c.hotel();
	parent p=new parent();
	p.hotel();
	
}
}
