package Module2;

public class ChildConstructor extends Parent {
ChildConstructor(int z)
{
	super(z);
	System.out.println("This is child class constructor"+z);
}
public static void main(String[]args)
{
new ChildConstructor(25);	
}
}
