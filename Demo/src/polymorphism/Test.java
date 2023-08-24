package polymorphism;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("normal method ");
		Test.main("cjc");
	}
	public static void main(String arg1) {
		
		System.out.println("without array main method:"+arg1);
		Test.main("abc","sumit");
		
	}
public static void main(String arg1,String arg2) {
	
	
	System.out.println(arg1+" "+arg2);
	
}
}
