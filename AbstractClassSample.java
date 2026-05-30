package Module1;

abstract class AbstractClassSample 
{
abstract void add() ;
abstract void sub() ;
static void mul(int a,int b)
{
System.out.println("multiplication of the two numbers are "+a*b);	
}
public static void main(String[]args)
{
mul(15,25);

}
}
