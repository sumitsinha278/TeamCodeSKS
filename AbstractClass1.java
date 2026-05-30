package Module1;

import java.util.Scanner;

public abstract class AbstractClass1 implements InterfaceArea {
abstract void login();
public void areaofcircle()
{
Scanner s1=new Scanner(System.in);
System.out.println("Please enter the value of radium");
int r=s1.nextInt();	
double areaofcircle=Math.PI*r*r;
System.out.println("Area of circle is "+areaofcircle);

}
}
