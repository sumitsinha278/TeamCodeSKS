package Module2;

import Module1.NonStaticMethod;

public class AccessNonStaticMethodWithouSubclass {
public static void main(String[]args)
{
	NonStaticMethod ns=new NonStaticMethod();
	ns.add();
	//ns.div();not allowed protected
	//ns.mul();not allowed private
	//ns.sub();not allowed package
}
}
