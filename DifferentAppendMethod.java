package Module2;

public class DifferentAppendMethod {
	public static void main(String[]args)
	{
StringBuffer s1=new StringBuffer("Welcome");
StringBuffer s2=new StringBuffer(" to delhi");
char ch[]= {'J','A','V','A'};
System.out.println(s1.append(false));
System.out.println(s1.append(5));
System.out.println(s1.append(11.2));
System.out.println(s1.append(s2));
System.out.println(s1.append("abc"));
System.out.println(s1.append(ch, 1, 2));
System.out.println(s1.append(s2, 6, 8));
System.out.println(s1.appendCodePoint(65));

	}
}
