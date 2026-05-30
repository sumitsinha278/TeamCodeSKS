package Module1;

public class NonStatic {

	
		void add(int a, int b)
		{
		int c=a + b;
		System.out.println("The value of C is"+c);
		}
		public static void main(String[]args)
		{
			NonStatic ns=new NonStatic();
		
			ns.add(10,15);
		}


}
