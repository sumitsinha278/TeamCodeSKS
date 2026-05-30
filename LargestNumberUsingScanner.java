package Module1;
import java.util.Scanner;
public class LargestNumberUsingScanner {
public static void main (String[]args)
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter value of A");
	double A=s1.nextDouble();
	System.out.println("Enter value of B");
	double B=s1.nextDouble();
	if(A>B)
	{
		
		System.out.println("A is the largest number");
	}
	else if(A==B)
	{
		System.out.println("Both A and B are equal");
	}
	else
	{
		
		System.out.println("B is the largest number");
	}
}
}
