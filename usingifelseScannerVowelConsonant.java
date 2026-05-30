package Module1;
import java.util.Scanner;
public class usingifelseScannerVowelConsonant {
public static void main(String[]args)
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Please provide the alphabet ");
	String s=s1.next();
	if(s.equals("a")||s.equals("e")||s.equals("i")||s.equals("o")||s.equals("u"))
		{
		
		System.out.println("This is a vowel");
		}
	else
	{
		System.out.println("This is a consonant");
	}
}
}
