package Module2;

public class SearchProductChild extends HierarchalLevelInheritance {
	
	
	void calculateamountotpay(int priceperproduct,int numberofproduct)
	{
		double pricetopay=numberofproduct*priceperproduct;
		System.out.println("you have to pay a total of"+pricetopay);
	}
	

}
