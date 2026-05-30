package Module2;

import Module1.AccessSpecifiers;

public class CreatingSubClassCallAnotherClassMethods extends AccessSpecifiers {
public static void main(String[]args)
{
add();
//sub();private not accessible outside package even after becoming subclass
mul();
//div();//Default method not accessible outside package even after becoming subclass

}
}
