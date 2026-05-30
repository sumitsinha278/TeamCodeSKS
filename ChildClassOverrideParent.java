package Module1;

public class ChildClassOverrideParent extends MethodOverridingSampleProgram {
public void add(int password)
{
System.out.println("The password of the candidate is"+password);	
}
public static void main(String []args)
{
ChildClassOverrideParent cp=new ChildClassOverrideParent();
cp.add(123);
}
}
