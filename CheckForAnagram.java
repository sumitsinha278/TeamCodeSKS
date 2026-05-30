package Module2;

import java.util.Arrays;

public class CheckForAnagram {
	public static void main(String[]args)
	{
String s1="race";
String s2="care";
char []c1=s1.toCharArray();
char[]c2=s2.toCharArray();
Arrays.sort(c1);
Arrays.sort(c2);
if(Arrays.equals(c1,c2))
{
System.out.println("s1 and s2 are anagrams");	
}
else
{
System.out.println("s1 and s2 are not anagrams");	
}
	}
}
