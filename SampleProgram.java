package Module1;

public class SampleProgram {
//write the code using this calling state using constructor overlaoding 
	
	SampleProgram()
	{
		System.out.println("Constructor 1 without parameter");

	}
	SampleProgram(String name)
	{
		this();
		System.out.println("Constructor 2 without parameter "+name);

	}
	public static void main(String []args)
	{
		
		SampleProgram sp=new SampleProgram("sumit");
		
	}
}
