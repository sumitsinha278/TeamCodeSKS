package Module2;

public class StringBuilderSampleProgram {
public static void main(String[]args)
{
	//append, insert, replace, delete, reverse, capacity, charAt, length, substring(int) & substring (start & end index) 
	StringBuilder s1=new StringBuilder("AI Learning");
	StringBuilder s2=new StringBuilder("Chatgpt and Copilot");
	System.out.println(s1.append(" with"));
	System.out.println(s1.insert(16, " the help of"));
	System.out.println(s2.replace(12, 18, " Claude.ai"));
	System.out.println(s1.delete(15, 27));
	System.out.println(s1.reverse());
	System.out.println(s1.capacity());
	System.out.println(s1.charAt(3));
	System.out.println(s1.reverse());
	System.out.println(s1.length());
	System.out.println(s1.append(s2));
	System.out.println(s1.substring(0));
	System.out.println(s1.substring(0, 5));
}
}
