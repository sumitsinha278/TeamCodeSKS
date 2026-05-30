package Module1;

public class SecondClassAccessingAnotherClassConstructor {
public static void main(String[]args)
{
	AccessSpecifierwithConstructor asc=new AccessSpecifierwithConstructor(10);
	AccessSpecifierwithConstructor asc3=new AccessSpecifierwithConstructor("Another Class accessing first class constructor");//protected accessible
	//AccessSpecifierwithConstructor asc1=new AccessSpecifierwithConstructor(8.2);//private constructor not accessible outside class
	AccessSpecifierwithConstructor asc2=new AccessSpecifierwithConstructor();//Default
	
	
}
}
