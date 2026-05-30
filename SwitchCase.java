package Module1;
import java.util.Scanner;
public class SwitchCase {
	public static void main(String[]args)
	{
Scanner s1=new Scanner(System.in);

System.out.println("ënter the value of a");
int a=s1.nextInt();
System.out.println("ënter the value of b");
int b=s1.nextInt();
System.out.println("Enter what operation you want to Perform");
char op=s1.next().charAt(0);
switch(op)
{
	case '+':
	System.out.println("Result"+(a+b));
	break;
	case '-':
	System.out.println("Result"+(a-b));
	break;
	case'%':
	System.out.println("Result"+(a%b));
	break;
	case '*':
	System.out.println("Result"+(a*b));
	break;
    default:
			System.out.println("Invalid operator");
}
}
}
