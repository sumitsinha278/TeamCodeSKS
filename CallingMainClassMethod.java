package Module1;

public class CallingMainClassMethod 
{
public static void Add(int a,int b)
{
int c=a+b;
System.out.println("The value of C is "+c);
}
}

 class SecondaryClass
{
public static void main(String[]args)
{
	CallingMainClassMethod c=new CallingMainClassMethod();
	c.Add(20,25);
}
}
