package Module1;
import java.util.Scanner;
public class SeniorCitizenDiscount {
public static void main(String[]args)
{
Scanner s1=new Scanner(System.in);	
System.out.println("Enter the age of the candidate");
int age=s1.nextInt();
if(age>60)
{
System.out.println("You are eligible for the discount");	
}
else
{
System.out.println("You are not eligible for the discount");	
}
}
}
