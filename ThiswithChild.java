package Module2;

public class ThiswithChild extends ThiswithParent {
	ThiswithChild(int x,int y,int z)
	{
		super(50,60,70);
		double average=(x+y+z)/3;
		System.out.println("The average of the three numbers are "+average);
	}
	ThiswithChild(int a)
{
		this(10, 20, 30);
		
		System.out.println(15);
}
void areaofsquare(int a)
{
	
double area=a*a;
System.out.println("area of square is "+area);
}
public static void main(String[]args)
{
	ThiswithChild tc=new ThiswithChild(11,22,33);
 tc.areaofsquare(22);
 
}
}

