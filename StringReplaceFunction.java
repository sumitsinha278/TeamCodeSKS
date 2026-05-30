package Module2;

public class StringReplaceFunction {
public static void main(String[]args)
{
String s="Automation Testing";
System.out.println(s.replace('A', 'k'));
System.out.println(s.replaceFirst("Automation", "Manual"));
System.out.println(s.replace("Testing", "Done"));
System.out.println(s.replaceAll(" ", " using  "));
}
}
