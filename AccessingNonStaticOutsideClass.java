package Module1;

public class AccessingNonStaticOutsideClass {
public static void main(String[]args)
{
	NonStaticMethod ns=new NonStaticMethod();
	ns.add();
	ns.sub();
	//ns.mul();//private non static method cannot be accessible outside class
	ns.div();
}
}
