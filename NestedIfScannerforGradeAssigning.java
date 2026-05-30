package Module1;
import java.util.Scanner;
public class NestedIfScannerforGradeAssigning {
	/*a. Check if marks are valid (0–100)
	b. marks above 90 then check math and science should above 90 then A+ 
	c. marks above 90 then check if math and science below 90 then A
	d. marks above 80 and below 90 then check math and science should above 90 then B+
	e. marks above 80 and below 90 then check if math and science below 90 then B?
*/
public static void main (String[]args)
{

	Scanner s1=new Scanner(System.in);
	System.out.println("Please enter the marks you have got");
	int marks=s1.nextInt();
	System.out.println("Enter math marks");
	int math=s1.nextInt();
	System.out.println("Enter science marks");
	int science=s1.nextInt();
	if(math>=0 && marks<=100)
	{
		if(marks>90) 
		{
		if(math>90 && science>90)
		{
			System.out.println("You have secured A+ grade");
		}
		}
	
		else if(marks>80 && marks<=90)
	{
			if(math>90 && science>90)
			{
				
				System.out.println("B+");
			}
			else
			{
				System.out.println("B");
			}
		System.out.println("");
	}
		else 
		{
			System.out.println("A");
		}
	}
	else
	{
		System.out.println("The marks is invalid");
	}
}
}
