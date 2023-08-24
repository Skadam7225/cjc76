package statickey;
public class TestStaticMethod{  
	public static void main(String args[]){  
		//Student.change(); //-----------------1st location
		 Student s1 = new Student(111,"Karan");  
	s1.display();  
	//Student.change();//-----------------2nd location
		Student s2 = new Student(222,"Aryan"); 
	s2.display();   
		Student s3 = new Student(333,"Sonoo"); 
		s3.display();  
	}  
}
