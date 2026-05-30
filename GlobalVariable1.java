package Module1;

public class GlobalVariable1 {
 double length=10;
 double breadth=12;
 void AreaOfRectangle()
{

double Area=length*breadth;
System.out.println("Area of Rectangle is "+Area);
}
 void PerimeterOfRectangle() 
 {
	 double PerimeterOfRectanlge=2*(length+breadth);
	 System.out.println("Area of Rectangle is "+PerimeterOfRectanlge);
 }
 public static void main (String[]args)
 {
	 GlobalVariable1 G1=new GlobalVariable1();
	 G1.AreaOfRectangle();
	 G1.PerimeterOfRectangle();
 }
}
