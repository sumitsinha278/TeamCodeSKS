package Module2;

import java.util.Arrays;

public class CheckAnagram {
public static void main(String[]args)
{
String s1="silent";
String s2="listen";
char a[]=s1.toCharArray();
char b[]=s2.toCharArray();
Arrays.sort(a);
Arrays.sort(b);
if(Arrays.equals(a, b))
{
System.out.println("a and b are Anagram");	
}
else
{
System.out.println("This is not an Anagram");	
}
}
}
