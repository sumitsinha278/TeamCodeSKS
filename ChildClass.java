package Module1;
import java.util.Scanner;
class ParentClass {
	
static void Area(int r)
{
	
double AreaofCircle=Math.PI*r*r;
System.out.println("Area of circle is "+String.format("%.2f", AreaofCircle));
}}
public class ChildClass extends ParentClass
{
	static void circumferenceofcircle(int r)
	{
		
	double CircumferenceofCircle=2*Math.PI*r;	
	System.out.println("Circumference of circle is "+String.format("%.2f", CircumferenceofCircle));
	
	}

public static void main(String[]args) {
ParentClass p1=new ParentClass();
ParentClass.Area(18);
ChildClass.circumferenceofcircle(12);
}
}
