package Module1;

public class ClassImplementsInterface  implements InterfaceS1,InterfaceS2
{
public void h1()
{
	System.out.println("This is First Method");
}
public void h2()
{
	System.out.println("This is Second Method");
}
public void h3()
{
	System.out.println("This is Third Method ");
}
public void h4()
{
	System.out.println("This is Forth Method");
}
void display()
{
System.out.println("Class implements and display are four method of interface");	
}
public static void main(String[]args)
{
ClassImplementsInterface ci=new ClassImplementsInterface();
ci.h1();
ci.h2();
ci.h3();
ci.h4();
ci.display();
}
}
