package Module1;
import java.util.Scanner;
public class UsingNestedIfScannerGrade {
public static void main(String[]args)
{
Scanner s1=new Scanner(System.in);
System.out.println("Enter the marks you have got");
int marks=s1.nextInt();
if(marks>80)
{
System.out.println("Grade A");	
}
else if(marks>60 && marks<=79)
{
System.out.println("Grade B");	
}
else if(marks>33&& marks<=59)
{
	System.out.println("Grade C");
}
else if(marks>0 && marks<=32) {
	
	System.out.println("Fail");
}
else 
{
System.out.println("Invalid Input");	
}
}
}

