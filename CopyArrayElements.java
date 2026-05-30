package Module1;

import java.util.Arrays;

public class CopyArrayElements {
public static void main (String[]args)
{
	int input[]=new int[6];
	input[0]=25;
	input[1]=30;
	input[3]=55;
	input[4]=40;
	input[5]=70;
	int output[]=new int[input.length];
	for(int i=0;i<input.length;i++)
	{
		output[i]=input[i];
		
	}
	System.out.println("Input Array is "+Arrays.toString(input));
	System.out.println("Output Array is"+Arrays.toString(output));
}
}
