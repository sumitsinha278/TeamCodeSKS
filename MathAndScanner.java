package Module1;
import java.util.Scanner;
public class MathAndScanner {
//Q53 Write a program to calculate simple interest and check if it is greater than 1000 must use math class and scanner class
public static void main(String[]args)
{
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value of Principle");
double P=s1.nextDouble();
System.out.println("Enter rate of interest");
double R=s1.nextDouble();
System.out.println("Enter Time in years");
double T=s1.nextDouble();
	double SI=(P*R*T)/100;
	System.out.println("The simple interest is"+SI);
	if(SI>1000)
	{
		System.out.println("The SI is greater that 100");
	}
	else
	{
		System.out.println("SI is smaller than 1000");
	}
	s1.close();
}
}
