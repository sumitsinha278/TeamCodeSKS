package Module2;

public class ParentConstructor {
	ParentConstructor()
	{
		this("Sumit");
	System.out.println("This is 1st Constructor");	
	}
ParentConstructor (String name)
{
	this(120);
System.out.println("This is Parent Constructor "+name);	
}
ParentConstructor(int BP)
{
	super();
	System.out.println("The BP of the patient is "+BP);
}
public static void main(String[]args)
{
ParentConstructor pc=new ParentConstructor();	
}
}
