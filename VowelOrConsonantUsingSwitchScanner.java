package Module1;
import java.util.Scanner;
public class VowelOrConsonantUsingSwitchScanner {
public static void main(String[]args)
{
Scanner s1=new Scanner(System.in);
System.out.println("Enter the alphabet");
char op=s1.next().charAt(0);
switch(op)
{
case 'a','e','i','o','u':
	System.out.println("This is a vowel");
break;
default:
	System.out.println("This is a consonant");
	break;
}
}
}
