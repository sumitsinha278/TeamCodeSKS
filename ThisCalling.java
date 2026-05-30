package Module1;

public class ThisCalling {
public int id=101;
ThisCalling(int id)
{
	this.id=id;
	
}
void display()
{
System.out.println(this.id);	
}
public static void main(String[]args)
{
ThisCalling cl=new ThisCalling(10000);
cl.display();
}
}
