package Module2;
import java.util.Scanner;
public class HierarchalLevelInheritance {
	public static void main(String[]args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter username");
		String username=s1.nextLine();
		System.out.println("Please enter Password");
		String Password=s1.nextLine();
		if(username.equals("sumit sinha") && Password.equals("979484"))
		{
		System.out.println("Welcome to Flipkart");
		HierarchalLevelInheritance hl=new HierarchalLevelInheritance();
		SearchProductChild sp=new SearchProductChild();
		Searchproduct sr=new Searchproduct();
		sr.search("Headphone");
		sp.calculateamountotpay(2, 200);
		}
		else
		{
			System.out.println("please enter a valid login ID and password");
		}
			
	}
	

}
