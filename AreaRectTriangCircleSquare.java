package Module1;

public class AreaRectTriangCircleSquare {
	static void AreaOfRectangle(int l,int b)
	{
		int AreaOfRectangle=l*b;
		int PerimeterOfRectangle=2*(l+b);
		System.out.println("Area of Rectangle "+AreaOfRectangle);
		System.out.println("Perimeter of Rectangle "+PerimeterOfRectangle);
		
	}
	static void AreaOfCircle(double Pi,int r)
	{
		double AreaOfCircle=Pi*r*r;
		double CircumferenceOfCircle=2*Pi*r;
		System.out.println("Area of circle "+AreaOfCircle);
		System.out.println("Circumference of circle "+CircumferenceOfCircle);
	}
	static void AreaOfSquare(int a)
	{
		int AreaOfSquare=a*a;
		int PerimeterOfSquare=4*a;
		System.out.println("Area of Square "+AreaOfSquare);
		System.out.println("Perimeter of Square "+PerimeterOfSquare);
	}
	static void AreaOfTriangle(int b,int h)
	{
		double AreaOfTriangle=0.5*b*h;
		double hypotenuse=Math.sqrt(b*b+h*h);
		double PerimeterOfTriangle=b+h+hypotenuse;
		System.out.println("Area of Triangle "+AreaOfTriangle);
		System.out.println("PerimeterOfTriangle=%.2f"+PerimeterOfTriangle);
		
	}
	public static void main(String[]args)
	{
		AreaOfRectangle(11,22);
		AreaOfCircle(3.14,2);
		AreaOfTriangle(12,4);
		AreaOfSquare(15);
		
	}
}
