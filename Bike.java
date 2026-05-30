package Module2;
import java.util.Scanner;
public class Bike extends Car{
void BikeDetails(int horsepower,String type,String VehicleType)
{
	System.out.println("Power of the bike is"+horsepower);
	System.out.println("Type of bike is"+type);
}
public static void main(String[]args)
{
	Bike b=new Bike();
Scanner s1=new Scanner(System.in);
System.out.println("Enter type of Vehicle"+VehicleType);
String VehicleType=s1.next();
	if(VehicleType.equals("Car"))
	{
		
		b.cardetails("V8","Ford","Diesel",1000);
	
	}
	else
	{
		
		b.BikeDetails(600,"Petrol","Petrol");
	}
}
}
