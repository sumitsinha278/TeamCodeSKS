package Module1;

public class ClassChild extends ClassParent 
{
	static void AreaOfRectangle(int l,int b)
	{
		int areaofrectangle=l*b;
		System.out.println("Area of rectangle is "+areaofrectangle);
	}
public static void main(String[]args)
{
	Print();
	AreaOfRectangle(11,12);
}
}
