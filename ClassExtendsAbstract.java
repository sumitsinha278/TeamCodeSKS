package Module1;

import java.util.Scanner;

public class ClassExtendsAbstract extends AbstractClass1 {
void login()
{
	Scanner s1=new Scanner(System.in);
			System.out.println("please enter username");
	String username=s1.nextLine();
	System.out.println("Please enter password");
	String password=s1.nextLine();
if( username.equals("sumit")&&  password.equals("123456"))	
{
System.out.println("You are sucessfully loggedin");	
}
else
{
System.out.println("username or password entered is not correct");	
}
}
public static void main (String[]args)
{
	ClassExtendsAbstract ca=new ClassExtendsAbstract();
ca.login();	
ca.areaofcircle();
}
}
