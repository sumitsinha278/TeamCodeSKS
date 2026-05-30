package Module1;

public class ParameterizedMethodOverloading {

	void Area(int r,double Pi)
	{
		 double AreaOfCircle=Pi*r*r;
		 System.out.println("Area of Circle"+AreaOfCircle);
	}
	void circumference(double Pi,int r)
	{
	double CircumferenceOfCircle=2*Pi*r;
		System.out.println("Circumference of circle is "+CircumferenceOfCircle);
	}
	void Average(int a,int b, int c)
	{
		double avg=(a+b+c)/3;
		System.out.println("Average of all values is  "+avg);
	}
	public static void main (String[]args)
	{
		ParameterizedMethodOverloading PMO=new ParameterizedMethodOverloading();
		PMO.Area(11, 3.14);
		PMO.circumference(3.14, 10);
		PMO.Average(40, 50, 60);
		
	}

}
