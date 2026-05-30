package Module2;

public class ParameterizedSubClass extends ParameterizedSuper 
{
	  ParameterizedSubClass() 
	  {
	        super(100);  
	  }
	void Areaofcircle(int r)
	{ 
	double Area=Math.PI*r*r;
	System.out.println("Area of circle is "+ Area);
    }
public static void main (String[]args)
{
	ParameterizedSubClass ps=new ParameterizedSubClass();
	ps.Areaofcircle(12);
}
}
