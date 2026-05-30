package Module2;
import java.util.Scanner;
public class MultilevelInheritanceChild extends MultilevelInheritanceSuper {
String Gender;
MultilevelInheritanceChild()
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the gender of the candidate");
	 Gender=s1.next();
this.checkGender();	
}

void checkGender()
{
	if(Gender.equals("Male"))
	{
		System.out.println("Field JOB");
	}
	else
	{
		{
			System.out.println("Office JOB");
		}
	}
}
public static void main(String[]args)
{
	MultilevelInheritanceChild ml=new MultilevelInheritanceChild();
}
}
