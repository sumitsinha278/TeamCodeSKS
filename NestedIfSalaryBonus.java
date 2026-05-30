package Module1;
import java.util.Scanner;
public class NestedIfSalaryBonus {
public static void main(String[]args)
{
Scanner s1=new Scanner(System.in);
System.out.println("Salary of employee");
int salary=s1.nextInt();

if(salary>50000)
{
	System.out.println("Experience of employee");
	int experience=s1.nextInt();
if(experience>5)
{
System.out.println("You are eligible for bonus");	
}
else
{
System.out.println("Your are not eligible for bonus");	
}
}
else
{
System.out.println("Employee having salary less than 50,000 are not eligible for bonus");	
}
}

}
