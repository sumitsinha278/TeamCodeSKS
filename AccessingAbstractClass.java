package Module1;

public class AccessingAbstractClass extends AbstractClassSample {
	int a=10;
	int b=20;
	void add() {
		
		// TODO Auto-generated method stub
		System.out.println("The addition of two numbers "+ a+b);
	}
	void sub() {
		int c=a-b;
		// TODO Auto-generated method stub
		System.out.println("The result of a-b is"+c);
	}
	public static void main(String[]args)
	{
		
		AccessingAbstractClass ac=new AccessingAbstractClass();
		ac.add();
		ac.sub();
		ac.mul(10, 25);
	}

}
