package Module2;

public class DifferentStringBufferMethod {
public static void main(String[]args)
{
	StringBuffer s1=new StringBuffer("Welcome to the future");
	StringBuffer s2=new StringBuffer("Welcome to the AI world");
	System.out.println(s1.append(" Sumit "));
	System.out.println(s1.insert(7, false));
	System.out.println(s1.replace(15, 21, "Chatgpt"));
	System.out.println(s1.delete(8, 13));
	System.out.println(s1.reverse());
	System.out.println(s1.capacity());
	System.out.println(s1.charAt(0));
	System.out.println(s1.length());
	System.out.println(s1.substring(8));
	System.out.println(s1.substring(0, 6));
	
	
}
}
