package Module2;

import Module1.AccessSpecifiers;

public class WithoutBecomingChildAccessGlobalVaribaleOfAnotherPackage {
public static void main(String[]args)
{
System.out.println(AccessSpecifiers.a);
//System.out.prinln(AccessSpecifiers.b);//Not Accessible outside package
//System.out.println(AccessSpecifiers.c);//Not Accessible outside package only possible if you become child class
//Sytem.out.println(AccessSpecifiers.d);//Not Accessible outside package


}
}
