package Module2;

public class ConstructorInheritance  
{
//Write a program for constructor inheritance using the super calling statement with Implicit Invocation?
	ConstructorInheritance()
	{
		System.out.println("SuperClass Constructor");
	}
	ConstructorInheritance(int r)
	{
		this();
		double Area=Math.PI*r*r;
		System.out.println("Area of circle"+Area);
	}
	
}

