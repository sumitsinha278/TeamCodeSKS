package Module1;
import java.util.Scanner;
public class CheckWhetherCenturyYearOrNot {
public static void main(String[]args)
{
	Scanner S1=new Scanner(System.in);
	System.out.println("Enter the Year");
	int year=S1.nextInt();
	if(year%100==0)
	{
		System.out.println("It is a century year");
	}
	else
	{
		System.out.println("This is not century year");
	}
}
}
