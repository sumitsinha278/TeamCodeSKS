package Module1;

public class CallingInNonParametrizedWay {
	static void display()
	{
	String name ="sumit kumar sinha";
	System.out.println("The name of the candidate is "+name);
	}
	void add()
	{
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
	}
	CallingInNonParametrizedWay()
	{
	String msgg="This is a constructor";
	System.out.println(msgg);
	}
	public static void main(String[]args)
	{
		display();
		CallingInNonParametrizedWay cw=new CallingInNonParametrizedWay();
		cw.add();
		
	}
	}

