package Module1;

public class Nonparameterized {
		void modulus()
		{
		int a=10;
		int b=30;
		int c=a*b;
		System.out.println("The value of C is "+c);
		}
		public static void main (String[]args)
		{
		Nonparameterized NP=new Nonparameterized();
		NP.modulus();
		}
}
