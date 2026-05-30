package Module2;

public class SplitString {
public static void main(String []args)
{
	String s="Automation Testing";
	String s1="";
	String s2="";
	String arr[]=s.split(" ");
	for(String word :arr)
	{
		
		System.out.println(word);
	}
	
}
}
