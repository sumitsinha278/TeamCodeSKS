package Module1;

public class VariableInsideStaticAndNonStatic {
static void add(int a ,int b)
{
	int c=a+b;
	System.out.println("The value of c is "+c);
}
void sub(int p,int q)
{
int r=p-q;
System.out.println("The value of r is "+r);
}
public static void main(String[]args)
{
	add(10,20);
	VariableInsideStaticAndNonStatic v1=new VariableInsideStaticAndNonStatic();
	v1.sub(50,20);
}
}
