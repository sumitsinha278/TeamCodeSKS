package Module1;

public class StaticAndNonStaticParameterizedMethodOverloading {
static void Add(int a,int b)
{
int c= a+ b;	
System.out.println(c);
}
static void Add(double a,double b)
{
double c=a+b;	
System.out.println(c);
}
void multiply(int x,int y)
{
int z=x*y;
System.out.println(z);
}
void multiply(int x,int y,int z)
{
	int p=x*y*z;
	System.out.println(p);
}
public static void main (String []args)
{
	Add(11.5,12.0);
	StaticAndNonStaticParameterizedMethodOverloading sp=new StaticAndNonStaticParameterizedMethodOverloading();
	sp.multiply(11,11,11);
}
}
