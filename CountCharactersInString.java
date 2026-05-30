package Module2;

public class CountCharactersInString {
public static void main(String[]args)
{
String s="Automation1129PM";
int count=0;
for(int i=0;i<s.length();i++)
{
if(Character.isDigit(s.charAt(i)))
{
count++;	
}
}
System.out.println("Total number of digit is "+count);
}
}
