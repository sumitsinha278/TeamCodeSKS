package Module1;

public class Class3NonStaticMethodWithSingleReferenceVariable {
	//int a=10;
	//int b=20;
	void add(int a,int b)
	{
	int c=a+b;
	System.out.println("value of c is"+c);
	}
	void sub(int a,int b)
	{
	int d=a-b;
	System.out.println("value of d is "+d);
	}
	void mul(int a,int b)
	{
	int f=a*b;
	System.out.println("Value of f is "+f);
	}
	public static void main(String[]args)
	{
	Class3NonStaticMethodWithSingleReferenceVariable ns=new Class3NonStaticMethodWithSingleReferenceVariable();
	ns.add(10,20);
	ns.sub(20,30);
	ns.mul(11,22);
	}
	}

