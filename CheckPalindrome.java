package Module2;

public class CheckPalindrome {
public static void main(String[]args)
{
String input="madam";
String output="";

for(int i=input.length()-1;i>=0;i--)
{
char a=input.charAt(i);
output=output+a;
}
if(input.equals(output))
{
System.out.println("This is a Palindrome");	
}
else 
	
{
System.out.println("This is not a palindrome");	
}
}
}
