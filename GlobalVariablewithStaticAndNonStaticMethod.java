package Module1;

public class GlobalVariablewithStaticAndNonStaticMethod {
	static int l=15;
	int b=22;
	static void AreaOfRectangle()
	{
		GlobalVariablewithStaticAndNonStaticMethod G1=new GlobalVariablewithStaticAndNonStaticMethod();
		l=20;
		G1.b=15;
	double areaofrectangle=l*G1.b;
	System.out.println("Area of Rectangle "+ areaofrectangle);
	}
public static void main (String[]args)
{
	AreaOfRectangle();
}
}
