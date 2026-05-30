package Module1;

public class ParameterizedNonStaticMethod {

	void multiply(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum of both the numbers are"+c);
	}
	void Average(int a,int b,int c)
	{
		double Average=(a+b+c)/3;
		System.out.println("Average of all three numbers are"+Average);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedNonStaticMethod P1=new ParameterizedNonStaticMethod();
P1.multiply(10,20);
P1.Average(11, 12, 13);

	}

}
