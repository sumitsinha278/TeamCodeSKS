package Module1;

public class GlobalVariableStaticAndNonStaticMethod {
 static int r=11;
	static void Area()
	{
		double AreaOfCircle=Math.PI*r*r;
		System.out.println("Area of Circle is"+AreaOfCircle);
	}
void Circumference()
{
double CircumferenceOfCircle=2*Math.PI*r;
System.out.println("Circumference of Circle is "+CircumferenceOfCircle);
}
}
