package Module2;

public class Bonus extends Salary {
public void EmployeeBonus()
{
	if (salary>25000)
	{
	System.out.println("You are eligible for Bonus");
	}
	else
	{
		System.out.println("You are not eligible for Bonus");
	}
}
public static void main(String[]args)
{
	Employeedetails(1);
	Bonus b=new Bonus();
	b.income();
	b.EmployeeBonus();
}
}
