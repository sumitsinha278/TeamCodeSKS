package Module2;

import Module1.AccessSpecifierwithConstructor;

public class AccessingConstructorOfAnotherClass extends AccessSpecifierwithConstructor {
	
	AccessingConstructorOfAnotherClass() {
		super(10);
	
		
		// TODO Auto-generated constructor stub
	}
	
	AccessingConstructorOfAnotherClass(String name) {
		
	super(name);
		
		// TODO Auto-generated constructor stub
	}
	public static void main (String[]args)

	{
		AccessingConstructorOfAnotherClass ac = new AccessingConstructorOfAnotherClass();
		AccessingConstructorOfAnotherClass ac1=new AccessingConstructorOfAnotherClass("sumit");
	
		
		
	}// TODO Auto-generated constructor stub
	}