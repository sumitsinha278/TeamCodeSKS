package Module2;

import Module1.AccessSpecifiers;

public class AccessAnotherPackageGlobalVariable extends AccessSpecifiers {
public static void main(String[]args)
{
System.out.println(a);
//System.out.println(b);//private global variable can not be accessed either inside or outside the package
System.out.println(c);
//System.out.println(d);//package or default global variable cannot be accessed outside package
}
}
