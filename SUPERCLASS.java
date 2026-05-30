package Module2;

public class SUPERCLASS {
	public static void Areaofcircle(int r) 
	{
		double areaofcircle=Math.PI*r*r;
		System.out.println("areaofcircle  "+String.format("%.2f",areaofcircle));
	}
	public void Circumference(int r)
	{
		
		double circumferenceofcircle=2*Math.PI*r;
		System.out.println("circumferenceofcircle  "+String.format("%.2f",circumferenceofcircle));
	}

}
