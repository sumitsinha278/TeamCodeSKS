package Module1;

public class ParameterizedMethodOverload

{
static void display(String a)
{
System.out.println("The name is "+a);
}
static void display(int a,int b)
{
int c=a+b;
System.out.println("The value of c is "+c);
}
static void display(double a,double b)
{
double c= a+ b;
System.out.println("The value of c is "+c);
}
static void display(double Pi)
{
Pi=3.14;
System.out.println("the value of Pi is"+Pi);
}
public static void main (String[]args)
{
	display("sumit sinha");
	display(11,15);
	display(10.0,11.0);
	display(3.00);
}
}

