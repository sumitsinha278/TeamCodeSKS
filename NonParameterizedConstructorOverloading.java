package Module1;

public class NonParameterizedConstructorOverloading {
NonParameterizedConstructorOverloading()
{
	String s="This is a non-parameterized constructor";
}
NonParameterizedConstructorOverloading(int a,int b)
{
int c=a+b;
System.out.println("The value of "+"C "+""+c);
}
public static void main(String[]args)
{
	NonParameterizedConstructorOverloading npc=new NonParameterizedConstructorOverloading(10,20);
	
}
}
