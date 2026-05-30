package Module2;

public class ChildClassConstructor extends ConstructorInheritance 
{
	ChildClassConstructor()
	{
		
		super(10);
		System.out.println("This is child class constructor");
	}
	public static void main(String[]args)
	{		
	new ChildClassConstructor();
	}
}
