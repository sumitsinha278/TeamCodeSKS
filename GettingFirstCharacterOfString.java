package Module2;

public class GettingFirstCharacterOfString {
public static void main(String[]args)
{
String s="Manish Kumar Tiwari";
String arr[]=s.split(" ");
for(String word:arr)
{
System.out.print(word.charAt(0));	
}
}
}
