package Module2;
import java.util.Scanner;
public class ParameterizedThis {
	int AccountBalance;
	Scanner s1=new Scanner(System.in);
void rechargeMobile(int amountRecharge,String mobileNumber)
{
	this.AmountRecharge(100);
	System.out.println("please enter the account balance");
	AccountBalance=s1.nextInt();
	if(AccountBalance>=amountRecharge)
	{
		System.out.println("Mobile recharge");
	}
	else
	{
		System.out.println("your account balance is not enough");
	}
}
void AmountRecharge(int AmountRecharge)
{
	System.out.println("please enter the plan amount");
	AmountRecharge=s1.nextInt();
}
public static void main(String[]args)
{
	ParameterizedThis pt=new ParameterizedThis();
	pt.rechargeMobile(200,"9609890017");
}
}
