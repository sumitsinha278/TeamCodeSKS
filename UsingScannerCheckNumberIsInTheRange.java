package Module1;
import java.util.Scanner;
public class UsingScannerCheckNumberIsInTheRange {
public static void main(String[]args)
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=s1.nextInt();
	if(a>10 && a<50)
	{
		System.out.println("The number "+a+" is between 10 and 50");
	}
	else
	{
		System.out.println("The number does not exist with in the given range");
	}
}
	
}
