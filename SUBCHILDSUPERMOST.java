package Module2;

public class SUBCHILDSUPERMOST extends CHILDOFSUPERMOST {
public void AreaofCircle()
{
double areaofcircle=Math.PI*r*r;
System.out.println("Area of circle is "+String.format("%.2f",areaofcircle));
}
public static void main(String[]args)
{
	areaofcircle();
	SUBCHILDSUPERMOST SUB=new SUBCHILDSUPERMOST();
	SUB.perimeterofrectangle();
	SUB.AreaofCircle();
}
}
