package Module1;

public class CalculateArea {
	public static void AreaOfTriangle(int b, int h,int p)
	{
		double circumference=b+h+p;
		double Area=.5*b*h;
		System.out.println("Area of Triangle "+Area);
		System.out.println("Circumference of Triangle "+circumference);
		
	}
	public static void Square(int a)
	{
		double Area=a*a;
		double Circumference=4*a;
		System.out.println("Area of Square "+Area);
		System.out.println("Circumference of square "+Circumference);
	}
	public static void Rectangle(int L,int W)
	{
		double AreaOfRectangle=L*W;
		double PerimeterOfRectangle=2*(L+W);
		System.out.println("Area of rectangle "+AreaOfRectangle);
		System.out.println("Perimeter of rectangle"+ PerimeterOfRectangle);
	}
	public static void Circle(double r)
	{
		double AreaOfCircle=Math.PI*r*r;
		double CircumferenceOfCircle=2*Math.PI*r;
		System.out.println("Area Of Circle is "+AreaOfCircle);
		System.out.println("Circumference Of Circle is  "+CircumferenceOfCircle);
	}
	
	public static void main(String[] args) {
		//CalculateArea A1=new CalculateArea();
		CalculateArea.AreaOfTriangle(1, 2, 3);
		CalculateArea.Square(10);
		CalculateArea.Rectangle(15, 5);
		CalculateArea.Circle(11);
		// TODO Auto-generated method stub
//Calculate area and circumference of square ,triangle , rectangle , circle
		
	}

}
