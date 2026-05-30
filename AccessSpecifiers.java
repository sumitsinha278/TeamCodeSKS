package Module1;

public class AccessSpecifiers {
public static int a=10;
private static int b=20;
protected static int c=30;
static int d=40; //default or package

public static void add()
{
	System.out.println("Method 1 public");
	
}
protected static void mul() 
{
	
	System.out.println("Method 2 protected");
}
private static void sub() 
{
	System.out.println("Method 3 private");
}
static void div()
{
	System.out.println("Method 4 Default");
}
public static void main(String[]args)
{
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
add();
mul();
sub();
div();
}

}
