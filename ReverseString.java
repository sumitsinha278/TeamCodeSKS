package Module2;

public class ReverseString {
public static void main(String[]args)
{
String a="Automation";
String reverse="";
for(int i=a.length()-1;i>=0;i--)
{
	char c1=a.charAt(i);
reverse=reverse+c1;

}
System.out.println(reverse);
}
}
