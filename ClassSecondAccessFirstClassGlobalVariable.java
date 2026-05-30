package Module1;

public class ClassSecondAccessFirstClassGlobalVariable {
public static void main(String[]args)
{
System.out.println(AccessSpecifiers.a);
System.out.println(AccessSpecifiers.c);
System.out.println(AccessSpecifiers.d);
//Sytem.out.println(AccessSpecifiers.b);//not possible to access private global variable of one class into another class
}
}
