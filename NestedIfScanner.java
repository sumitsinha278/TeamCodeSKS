package Module1;
import java.util.Scanner;
public class NestedIfScanner {
	/*a. female having aadhar card - free travel 
	b. female no aadhar card - full price 
	c. male - ful price 
	d. male - senior citizen - 50% price 
	e. kids below 5 years free 
	f. kids between 5 to 10 years 10% price?*/
	public static void main(String[]args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the gender");
		String Gender=s1.next();

		
		if(Gender.equals("female"))
		{
			System.out.println("Id proof");
			String ID=s1.next();
			if(ID.equals("adhaar"))
			{
				System.out.println("Your travel is free");
			}
			else
			{
				System.out.println("You have to pay the full price(female)");
			}
		}
		else if(Gender.equals("male"))
		{		System.out.println("Enter age");
		int age=s1.nextInt();
			//male
			if(age>60)
			{
				System.out.println("You have to pay 50% of the charge");
			}
			else if(age>10 && age<60)
			{
				System.out.println("You have to pay the full price(male)");
			}
			else
			{
				System.out.println("Please enter a valid data");
			}
			
		}
		else if(Gender.equals("kids"))
		{
			System.out.println("Enter age");
			int age=s1.nextInt();
			if(age<5)
			{
				System.out.println("Your travel is free(kids)");
				
			}
			else if(age>=5 && age<=10)
			{
				System.out.println("Your have to pay only 10%");
			}
			else
			{
				System.out.println("You have to pay the full price (kids))");
			}
		}
		else
		{
			System.out.println("Invalid Data");
		}
			
	}

}
