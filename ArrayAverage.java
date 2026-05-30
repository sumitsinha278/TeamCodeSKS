package Module1;

public class ArrayAverage {
	public static void main(String[]args)
{
int input[]=new int[5];
input[0]=10;
input[1]=15;
input[2]=60;
input[3]=45;
input[4]=25;
double sum=0;
double average=0;
for(int i=0;i<input.length;i++)
{
sum=sum+input[i];

}
System.out.println(sum);
average=sum/input.length;
System.out.println(average);
}
}
