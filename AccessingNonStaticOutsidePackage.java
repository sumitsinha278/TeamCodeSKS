package Module2;

import Module1.NonStaticMethod;

public class AccessingNonStaticOutsidePackage extends NonStaticMethod {
public static void main(String[]args)
{
	AccessingNonStaticOutsidePackage ap=new AccessingNonStaticOutsidePackage();
	ap.add();
	ap.div();
	//ap.mul();private method not accessible
	//ap.sub();default or package not accessible
	
}
}
