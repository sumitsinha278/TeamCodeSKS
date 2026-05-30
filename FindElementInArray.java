package Module1;

public class FindElementInArray {
public static void main(String[]args)
{
int input[]=new int[4];
input[0]=12;
input[1]=100;
input[2]=40;
input[3]=65;
int checkNumber=100;
for(int i=0;i<input.length;i++)
{
if(input[i]==checkNumber)
{
	System.out.println("This array is present in the array at index position "+i);
}
}
}
}
