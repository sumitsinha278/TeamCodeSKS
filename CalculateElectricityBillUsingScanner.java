package Module1;
import java.util.Scanner;
public class CalculateElectricityBillUsingScanner {
//If units ≤ 100 → ₹5/unit
	//If units > 100 → ₹10/unit
public static void main(String[]args)
{
Scanner s1=new Scanner(System.in);
System.out.println("Enter the unit consumed");
int units=s1.nextInt();
if(units<=100)
{
	System.out.println("Your bill is "+Math.multiplyExact(units,5));
}
else
{
System.out.println("Your bill is "+Math.multiplyExact(units, 10));
}
}
}
