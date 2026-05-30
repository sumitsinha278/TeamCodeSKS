package Module1;

public class MethodAndConstructorOverloading {
static void CircumferenceOfCircle(double Pi,int r)
{
double cr=Pi*r*r;
System.out.println("Circumference of Circle is "+cr);
}
static void CircumferenceOfCircle(int r,double Pi)
{
double cr1=Pi*r*r;
System.out.println("Circumference of circle is "+cr1);
}
MethodAndConstructorOverloading(String s)
{
System.out.println("This is a parameterized constructor");	
}
MethodAndConstructorOverloading(String s,int r)
{
System.out.println(s+"is a software test engineer and he is " +r+" years old");	
}
public static void main(String[]args)
{
CircumferenceOfCircle(10,3.14);
MethodAndConstructorOverloading mc=new MethodAndConstructorOverloading("Sumit kumar Sinha",30);
}
}
