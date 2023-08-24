package statickey;
public class Student{  
 	int rollno;  
 	String name;  
 	static String college = "Poly"; 

	public  static void change(){  
 		college = "Eng";  
 	}  
	
	public  void display(){
	System.out.println(rollno+" "+name+" "+college);
	}  
}


