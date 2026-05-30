package Module1;
import java.util.Scanner;
public class ScannerClassVoter {
public static void main(String[]args)
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Please enter the age of the candidate");
	int age=s1.nextInt();
	if(age>18)
	{
		
		System.out.println("You are eligible for voter ID card");
	}
	else
	{
		
		System.out.println("you are not allowed to vote");
	}
}
}
