package polymorphism;

public class calculator {
	
public void calculate(int num1, int num2)	
{
	
System.out.println("with two no of parametres:"+num1+" "+num2);
}
public void calculate(int num1, int num2, int num3)
{
	System.out.println("with three noof parameters:"+num1+" " +num2+" " +num3);


}
	
public void calculate(float num1,float num2)	
{
	System.out.println("with two no of parameters:"+num1+" " +num2);
}


public void calculate(double num1,double num2)
{
	
System.out.println("with two no of parameters:"+num1+" " +num2);

}
public static void main(String[] args) {
	calculator c=new calculator();
	c.calculate(15, 20);
	c.calculate(56,56,56);
	c.calculate(45.5, 56.56);
	c.calculate(45.5656, 56.5656);
	
	
	
	
}


}
