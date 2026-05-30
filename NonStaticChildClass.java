package Module1;

public class NonStaticChildClass extends NonStaticParentClass {
void addtwostring(String name,String surname)
{
	
	System.out.println(name+" "+surname);
	
}
public static void main(String[]args)
{
	NonStaticChildClass ns=new NonStaticChildClass();
	ns.display();
	ns.addtwostring("sumit","sinha");
}
}
