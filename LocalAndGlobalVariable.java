package Module1;

public class LocalAndGlobalVariable {
static int a=50;

public static void main (String[]args)
{
	int a=20;
System.out.println(a);
LocalAndGlobalVariable lg=new LocalAndGlobalVariable();
System.out.println(lg.a);

}
}
