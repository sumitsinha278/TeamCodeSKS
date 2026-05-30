package Module2;

public class Manager extends Employee {
	void print(int ManagerID)
	{
		mobilenumber="9709890906";
		System.out.println("Address of the manager is "+address);
		System.out.println("Id of the manager is "+ManagerID);
		System.out.println("Mobilenumber of the manager is "+mobilenumber);
	}
	public static void main(String[]args)
	{
		Manager md=new Manager();
		md.details();
		displaydetails(3);
		md.print(10);
		
		
	}

}
