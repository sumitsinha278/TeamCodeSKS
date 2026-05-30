package Module1;

public class CombinationOfStaticParameterizedMethod {
	public static void Add(int a , int b , int c)
	{
	int d=a+b+c;
	System.out.println(d);
	}
	public static void Area(double r)
	{
		
		double d=3.14*r*r;
		System.out.println(d);
	}
	public static void Average(int a,int b,int c,int d)
	{
		double Average =(a+b+c+d)/4;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add(12,15,12);
		Area(10);
		Average(11,12,10,20);

	}

}
