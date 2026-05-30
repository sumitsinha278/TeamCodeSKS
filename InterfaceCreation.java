package Module1;

public class InterfaceCreation implements Interfaceimplement 
{
public void add()
{
	System.out.println("This is abstract method add");
}
public void mul()
{
System.out.println("This is abstract method mul");	
}
public static void print()
{
System.out.println("This is concrete method");	
}
public static void main(String []args)
{
InterfaceCreation ic=new InterfaceCreation();
ic.add();
ic.mul();
print();
}
}
