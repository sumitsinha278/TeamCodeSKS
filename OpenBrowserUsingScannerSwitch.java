package Module1;
import java.util.Scanner;
public class OpenBrowserUsingScannerSwitch {
	public static void main(String[]args)
	{
Scanner s1=new Scanner(System.in);
System.out.println("Enter which browser you want to open");
char op=s1.next().charAt(0);
switch(op)
{
case 'A':
	System.out.println("Launchsing Chrome Browser");
	break;
case 'B':
	System.out.println("Launching Edge Browser");
	break;
	case 'C':
		System.out.println("Launching Mozilla Browser");
	break;
	
}
	}
}
