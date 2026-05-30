package Module1;
import java.util.Scanner;
public class ScannerClass {
	
	
public static void main(String[]args)
{
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value of Radius ");
int r=s1.nextInt();
double AreaOfCircle=Math.PI*r*r;
System.out.println("Area Of Circle is "+AreaOfCircle);
double CircumferenceOfCircle=2*Math.PI*r;
System.out.println("Circumference Of Circle is "+CircumferenceOfCircle);
System.out.println("Enter the value of length ");
int l=s1.nextInt();
System.out.println("Enter the value of breadth ");
int b=s1.nextInt();
double AreaOfRectangle=l*b;
System.out.println("Area Of Rectangle is "+AreaOfRectangle);
double PerimeterOfRectangle=2*(l+b);
System.out.println("Perimeter Of Rectangle is "+PerimeterOfRectangle);
System.out.println("Enter the value of side of square ");
int a=s1.nextInt();
double AreaOfSquare=a*a;
System.out.println("Area Of Square is "+AreaOfSquare);
double PerimeterOfSquare=4*a;
System.out.println("Perimeter Of Square is"+PerimeterOfSquare);
System.out.println("Enter the value of base of Triangle ");
int base=s1.nextInt();
System.out.println("Enter the value of Height of Triangle ");
int height=s1.nextInt();
double hypotaneous=Math.sqrt((base*base)+(height*height));
System.out.println("The value of hypotaneous is "+hypotaneous);
double AreaOfTriangle=0.5*base*height;
System.out.println("Area Of Triangle is"+AreaOfTriangle);
double PerimeterOfTriangle=base+height+hypotaneous;
System.out.println("Perimeter Of Triangle is"+PerimeterOfTriangle);
s1.close();


}
}
