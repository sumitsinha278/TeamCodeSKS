package Module1;

public class NonStaticMethod {
public void add()
{
	System.out.println("NonStatic public method");
}

private void mul()
{
	System.out.println("NonStatic private method ");
}
protected void div() 
{
System.out.println("NonStatic protected method");	
}
void sub()
{
	System.out.println("NonStatic Defalt method");
}
public static void main(String[]args)
{
	NonStaticMethod ns=new NonStaticMethod();
	ns.add();
	ns.mul();
	ns.div();
	ns.sub();
}
}
