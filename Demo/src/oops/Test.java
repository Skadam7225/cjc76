package oops;
import java.util.Scanner;
import javax.annotation.processing.AbstractProcessor;

public class Test {
	
	
	public void m1(Student stu)
	{
		System.out.println(stu.rollno);
		System.out.println(stu.name);
		System.out.println(stu.age);
		
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("ente rollno,nameand age");
	Test t=new Test();
	Student s=new Student(sc.nextInt(),sc.next(),sc.nextInt());
	t.m1(s);
}
}
