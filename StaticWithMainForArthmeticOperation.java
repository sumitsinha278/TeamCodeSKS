package Module1;

public class StaticWithMainForArthmeticOperation {
	public static void Add(int a,int b)
	{
		
		System.out.println("Addition of Numbers are "+Math.addExact(a,b));
	}
	public static void Sub(int c,int d)
	{
		
		System.out.println("Substraction of two numbers "+Math.subtractExact(c, d));
	}
	public static void Mul(double a,double c)
	{
		System.out.println("Multiplication of Two numbers are "+(a*c));
	}
	public static void Div(double a,double b)
	{
		System.out.println("Division of two numbers "+(a/b));
	}
	public static void Mod(double a,double b)
	{
		System.out.println("Modulus of two numbers "+a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Add(10,11);
Mul(11.0,12.2);
Div(1331,121);
Mod(1331,121);
Sub(110,50);
	}

}
