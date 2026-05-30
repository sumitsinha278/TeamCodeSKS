package Module1;
import java.util.Scanner;
public class CalculateGradeBasedOnMarks {
public static void main(String[]args)
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter marks");
	int marks=s1.nextInt();
	if(marks>90)
	{
		System.out.println("Garda A");
		//90+ = A
				// 75-89 = B
				// 50-74=C
				// Below 50 = Fail

	}
	else if(marks>=75 && marks<=89)
	{
		
		System.out.println("Grade B");
	}
	else if (marks >=50 && marks <=74)
	{
		System.out.println("Grade C");
	}
	else 
	{
		System.out.println("Fail");
	}
}
}
