package Module1;
import java.util.Scanner;
public class loginUsingNestedIf {
public static void main(String[]args)
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter Username");
	String username=s1.nextLine();
	System.out.println(username);
	
	if(username.equals("sumit sinha"))
	{
		System.out.println("Enter Password");
		String Password=s1.next();
if(Password.equals("Sumit@123"))
		{
			System.out.println("Successfull Login");
		}
else {
				System.out.println("Incorrect Password");
	}
}
	else
	{
		
		System.out.println("Incorrect username");
	}
}
}
