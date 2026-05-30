package Module1;

public class staticNonstaticnonparameterizedmethodoverloading {
static void add()
{
 int a=100;
int b=200;
 int c=a+b;
System.out.println("The sum of a and b is "+c);
}
void sub()
{
int x=250;
int y=75;
int z=x-y;
System.out.println("The value of z is "+z);
}
static void mul()
{
	int a=2;
	int b=9;
	int c=a*b;
	System.out.println("multiplication of a and b is"+c);
}
static void div()
{
	int p=500;
	int q=250;
	int r=p%q;
	System.out.println("the value of r is "+r);
}
static void Area()
{
	int r=10;
	double areaofcircle=Math.PI*r*r;
	System.out.println("area of circle"+areaofcircle);
}
static void mul(int a,int b)
{
	a=20;
	b=30;
	int c=a*b;
	System.out.println("multiplication of a and b is"+c);
}
static void div(int p,int q)
{
	 p=50;
	 q=25;
	int r=p%q;
	System.out.println("the value of r is "+r);
}
static void Area(int r)
{
	 r=10;
	double areaofcircle=Math.PI*r*r;
	System.out.println("area of circle"+areaofcircle);
}
static void add(int age)
{
	System.out.println("The age of the candidate is "+age);
}
void sub(String s)
{
	System.out.println("The name of the candidate is "+s);
}
public static void main(String[]args)
{
	add();
	add(30);
	staticNonstaticnonparameterizedmethodoverloading v1=new staticNonstaticnonparameterizedmethodoverloading();
	v1.sub();
	v1.sub("sumit");
	mul(11,12);
	div(22,33);
    Area(10);
}
}
