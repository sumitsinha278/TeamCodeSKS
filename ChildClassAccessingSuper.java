package Module1;

public class ChildClassAccessingSuper extends Superimplementation {
ChildClassAccessingSuper ()
{
super(1);
System.out.println("ChildClass");

}
ChildClassAccessingSuper(String name)
{
	super("sumit");
	System.out.println("implementing the parent class constructor from child");
}
public static void main(String []args)
{
	ChildClassAccessingSuper cs=new ChildClassAccessingSuper();	
	ChildClassAccessingSuper cs1=new ChildClassAccessingSuper("sumit kumar sinha");	
}

}
