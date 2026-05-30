package Module1;

public class CallingInParametrizedWay 
{
static void display(String name)
{
System.out.println("The name of the candidate is "+name);
}
void add(int a,int b)
{

int c=a+b;
System.out.println(c);
}
CallingInParametrizedWay(String msgg)
{
System.out.println(msgg);
}
public static void main(String[]args)
{
	display("sumit kumar sinha");
	CallingInParametrizedWay cw=new CallingInParametrizedWay("Aarav Sinha");
	cw.add(15,16);
	
}
}


