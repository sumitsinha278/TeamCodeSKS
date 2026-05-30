package Module1;

public class ParameterizedConstructorOverloading {
	ParameterizedConstructorOverloading(int a)
	{
		
		a=100;
		System.out.println("The value fo A is"+a);
	}
	ParameterizedConstructorOverloading(double Pi,int r)
	{
		
		double AreaOfCircle=Pi*r*r;
		System.out.println("Area of Circle is "+AreaOfCircle);
		
	}
	public static void main(String[]args)
	{
		ParameterizedConstructorOverloading PCO=new ParameterizedConstructorOverloading(3.14,10);
	}
}
