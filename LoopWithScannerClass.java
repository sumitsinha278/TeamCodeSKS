package Module1;
import java.util.Scanner;
public class LoopWithScannerClass {
	public static void main(String[]args) {
Scanner s1=new Scanner(System.in);
System.out.println("enter the age of the candidate");
for(int age=s1.nextInt();age<18;age++)
{
System.out.println("Age is "+age);	
}
	}

}
