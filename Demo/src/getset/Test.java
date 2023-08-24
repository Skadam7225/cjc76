package getset;
import java.util.Scanner;
public class Test {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();
		System.out.println("enter id");
		s1.setId(sc.nextInt());
		System.out.println("enter name");
		s1.setName(sc.next());
		Student s2=new Student();
		System.out.println("enter second id");
		s2.setId(sc.nextInt());
		System.out.println("eneter second name");
		s2.setName(sc.next());
		
		
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s2.getId());
		System.out.println(s2.getName());
		
		
		
	}

}
