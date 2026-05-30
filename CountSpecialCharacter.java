package Module2;

public class CountSpecialCharacter {
	public static void main(String[]args) {
String s="Sumit@1238&?";
int count=0;
for (int i=0;i<s.length();i++)
{
	char ch=s.charAt(i);
	if(!Character.isLetter(ch)&&(!Character.isDigit(ch)))
	{
		
		count++;
	}
}
System.out.println("Total number of special characters "+count);
}
}