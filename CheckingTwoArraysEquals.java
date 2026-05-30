package Module1;

import java.util.Arrays;

public class CheckingTwoArraysEquals 
{
	public static void main(String[]args) {
int input[]=new int[5];
input[0]=90;
input[1]=65;
input[2]=30;
input[3]=50;
input[4]=80;
int output[]=new int[input.length];
for(int i=0;i<input.length;i++)
{
output[i]=input[i];
}
System.out.println("First array is "+Arrays.toString(input));
System.out.println("Second array is "+Arrays.toString(output));
boolean b1=Arrays.equals(input, output);
System.out.println(b1);
if(Arrays.equals(input,output)==true)
{
	System.out.println("Both the array are equals");
}
else
{
System.out.println("Array input and output are not equals");	
}
}
}
