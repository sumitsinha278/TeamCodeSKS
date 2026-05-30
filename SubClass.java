package Module1;
class Higher
{
void AreaofSquare(int a)
{
	double AreaOfSquare=a*a;
	System.out.println("Area of square is "+AreaOfSquare);
}
}
 public class SubClass extends Higher
{
void PerimeterOfSquare(int a)
{
double PerimeterOfSquare=4*a;
System.out.println("Perimeter of Square is "+PerimeterOfSquare);
}
public static void main(String[]args)
{
	SubClass s1=new SubClass();
	s1.AreaofSquare(11);
	s1.PerimeterOfSquare(15);
}
}

