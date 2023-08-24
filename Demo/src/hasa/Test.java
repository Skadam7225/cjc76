package hasa;

public class Test {
public static void main(String[] args) {
	
	Address ad=new Address();
	ad.setCityname("Pune");
	ad.setAreaname("karvengar");
	
	Student s1=new Student();
	s1.setRollno(1);
	s1.setName("Sumit");
	s1.setAddr(ad);
	System.out.println(s1.getRollno());
	System.out.println(s1.getName());
	System.out.println(s1.getAddr().getCityname());
	System.out.println(s1.getAddr().getAreaname());
	
	
	
}
}
