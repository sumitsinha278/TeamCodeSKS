package Module1;
import java.util.Scanner;
public class EvenOddRuntimeInputIfElse {
public static void main(String[]args)
{
Scanner s1=new Scanner(System.in);	
System.out.println("Enter the number");
int a=s1.nextInt();
if(a%2==0)
{
System.out.println("The provided number is even");	
}
else
{
System.out.println("This number is odd");	
}
}
}
