package Module2;

import Module1.ParentClass1;

public class ChildClass1 extends ParentClass1 {
static void Display(String message)
{
	System.out.println("Welcome to the Portal");
}
public static void main(String []args)
{
ChildClass1 cc=new ChildClass1();
cc.Login(123456);
cc.Display("Thank you");
//cc.Login();//not letting us access due to declared as final
}
}
