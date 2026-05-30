package Module1;

public class AccessSpecifierwithConstructor {
public  AccessSpecifierwithConstructor(int a)
{
System.out.println(a);
}
private AccessSpecifierwithConstructor(double b)
{
System.out.println(b);	
}
protected AccessSpecifierwithConstructor(String name)
{
System.out.println("my name is "+name);	
}
AccessSpecifierwithConstructor()
{
System.out.println("Without parameter constructor");	
}
public static void main (String []args)
{
	AccessSpecifierwithConstructor ac1=new AccessSpecifierwithConstructor();
	AccessSpecifierwithConstructor ac2=new AccessSpecifierwithConstructor(10);
	AccessSpecifierwithConstructor ac3=new AccessSpecifierwithConstructor(3.42);
	AccessSpecifierwithConstructor ac=new AccessSpecifierwithConstructor("Sumit");
	
	
}
}
