package Module2;

public class ReversingArray {
public static void main(String[]args)
{
int number[] = {10,20,30,40,50,60};
System.out.print("The original array is " );
for(int i=0;i<=number.length-1;i++)
{
System.out.print(number[i]+" ");	
}
System.out.println();
System.out.print("Now the reversed array is ");
for(int i=number.length-1;i>=0;i--)
{
System.out.print(number[i]+" ");	
}

}
}
