package Module2;

public class PrintFirstCharacterInVerticalFormat {
public static void main(String[]args)
{
String s="Manish Kumar Tiwari";
String arr[]=s.split(" ");
for(String word:arr)
{
System.out.println(word.charAt(0));	
}
}
}
